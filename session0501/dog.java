public class Dog extends ex4 {

    public Dog() {
        super("강아지", "댕댕이", 2);
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }

    public void play() {
        super.play();
        System.out.println("강아지는 인형을 갖고 논다.");
    }
}
