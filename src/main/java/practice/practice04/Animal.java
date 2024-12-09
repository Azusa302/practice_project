package practice.practice04;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("名前：" + name);
        System.out.println("年齢：" + age);
    }
}