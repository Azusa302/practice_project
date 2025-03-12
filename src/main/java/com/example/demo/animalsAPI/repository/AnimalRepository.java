package com.example.demo.animalsAPI.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.animalsAPI.data.AnimalData;

// @Repositoryアノテーションは、このクラスがデータアクセスを担当するリポジトリであることを示します
@Repository
public class AnimalRepository {
   // APIのベースURLを定数として定義します
   private final String BASE_URL = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";
   
   // RestTemplateは、HTTPリクエストを送信するためのSpringのクラスです
   // これを使ってAPIを呼び出します
   private final RestTemplate restTemplate = new RestTemplate();

   // すべての動物データを取得するメソッドです
   public List<AnimalData> findAll() {
       // getForObjectメソッドでGETリクエストを送信し、結果をAnimalData配列として受け取ります
       AnimalData[] animals = restTemplate.getForObject(BASE_URL, AnimalData[].class);
       // 配列をListに変換して返します
       return Arrays.asList(animals);
   }

   // 指定されたIDの動物データを取得するメソッドです
   public AnimalData findById(int id) {
       // URLにクエリパラメータ(?id=xxx)を付けてリクエストを送信します
       AnimalData[] animalArray = restTemplate.getForObject(BASE_URL + "?id=" + id, AnimalData[].class);
       
       // 取得したデータが存在する場合（配列が空でない場合）
       if (animalArray != null && animalArray.length > 0) {
           // デバッグ用に取得したデータを表示します
           System.out.println("取得した動物データ: " +
                   "ID: " + animalArray[0].getId() + ", " +
                   "英名: " + animalArray[0].getName() + ", " +
                   "和名: " + animalArray[0].getJapanese_name() + ", " +
                   "鳴き声: " + animalArray[0].getCry());
           // 最初の要素を返します（IDで検索なので1件のみのはず）
           return animalArray[0];
       }
       // データが見つからない場合はnullを返します
       return null;
   }
}