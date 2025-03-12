package com.example.demo.animalsAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;

// @Serviceアノテーションは、このクラスがビジネスロジックを担当するサービスクラスであることを示します
@Service
public class AnimalService {
   private final AnimalRepository repository;

   // コンストラクタです。AnimalRepositoryのインスタンスを受け取って初期化します
   public AnimalService(AnimalRepository repository) {
       this.repository = repository;
   }

   // すべての動物データを取得するメソッドです
   // repositoryのfindAllメソッドを呼び出して結果をそのまま返します
   public List<AnimalData> getAllAnimals() {
       return repository.findAll();
   }

   // 指定されたIDの動物データを取得するメソッドです
   // repositoryのfindByIdメソッドを呼び出して結果をそのまま返します
   public AnimalData getAnimalById(int id) {
       return repository.findById(id);
   }
}