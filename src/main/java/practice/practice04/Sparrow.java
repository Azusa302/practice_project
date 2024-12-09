package practice.practice04;

class Sparrow extends Animal {
    boolean canFly;
    String cry;

    public Sparrow(String name, int age, boolean canFly, String cry) {
        super(name, age);
        this.canFly = canFly;
        this.cry = cry;
    }

    public void showInfo() {
        super.showInfo();
        if (canFly){
        	System.out.println("飛べます");
        } else {
        	System.out.println("飛べません");
        };
        
        System.out.println("鳴き声：" + cry);
    }
}
