package com.example.demo.animalsAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.service.AnimalService;

// @Controllerアノテーションは、このクラスがWebリクエストを処理するコントローラーであることを示します
@Controller
public class AnimalController {
   // AnimalServiceクラスのインスタンスを保持するフィールドです
   // finalは一度代入したら変更できないことを示します
   private final AnimalService animalService;

   // コンストラクタです。AnimalServiceのインスタンスを受け取って初期化します
   // これはDependency Injection(DI)というパターンで、SpringがAnimalServiceを自動で注入します
   public AnimalController(AnimalService animalService) {
       this.animalService = animalService;
   }

   // @GetMappingは、GETリクエストを処理することを示します
   // "/animal-search"というURLにアクセスがあった時にこのメソッドが実行されます
   @GetMapping("/animal-search")
   public String showSearchPage(Model model) {
       // すべての動物データを取得します
       List<AnimalData> animals = animalService.getAllAnimals();
       // 取得したデータをモデルに追加します
       // これによってテンプレート(HTML)側でデータを使用できるようになります
       model.addAttribute("animals", animals);
       // "animal-search"という名前のテンプレートを表示します
       return "animal-search";
   }

   // @PostMappingは、POSTリクエストを処理することを示します
   // フォームからデータが送信された時などに実行されます
   @PostMapping("/animal-detail")
   public String showAnimalDetail(
       // @RequestParamは、リクエストパラメータを受け取ることを示します
       // フォームやURLのクエリパラメータからidという名前のパラメータを取得します
       @RequestParam int id, 
       Model model) {
       // 指定されたIDの動物データを取得します
       AnimalData animal = animalService.getAnimalById(id);
       // 取得したデータをモデルに追加します
       model.addAttribute("animal", animal);
       // "animal-detail"という名前のテンプレートを表示します
       return "animal-detail";
   }
}