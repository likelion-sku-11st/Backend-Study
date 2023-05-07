public class ex4 {

    protected String type;
    protected String name;
    protected int age;

    public ex4(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }

    public void play() {
        System.out.println("동물은 무엇을 갖고 놀까?");
    }
}
