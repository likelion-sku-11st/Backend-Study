public class Cat extends ex4 {

    public Cat() {
        super("고양이", "냥이", 2);
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("야옹");
    }

    public void play() {
        super.play();
        System.out.println("고양이는 공을 갖고 논다.");
    }
}
