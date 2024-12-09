package practice.practice04;

class Dog extends Animal {
    String color;
    String cry;

    public Dog(String name, int age, String color, String cry) {
        super(name, age);
        this.color = color;
        this.cry = cry;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("毛色：" + color);
        System.out.println("鳴き声：" + cry);
    }
}
