package practice.practice04;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 2, "白", "ワン");
        Sparrow sparrow = new Sparrow("チュン", 1, true, "チュンチュン");

        dog.showInfo();

        System.out.println("---------------------");

        sparrow.showInfo();
    }
}
