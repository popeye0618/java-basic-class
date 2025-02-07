package week5.day10.cat;

public class Cat {
    public String name; // 고양이 이름
    public int age; // 고양이 나이

    // 기본 생성자 (매개 변수 없음)
    public Cat() {
    }

    // 매개 변수가 1개인 생성자
    public Cat(String name) {
        this.name = name;
    }

    // 이름과 나이를 모두 받는 생성자
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 고양이 필드를 이용한 메소드
    public void introduce() {
        System.out.println("제 이름은 " + name + "이고 " + age + "살 이에요~");
    }

    // 반환 값이 있는 메소드 (고양이 이름을 반환하는 메소드)
    public String getName() {
        return name;
    }

    // 매개 변수가 있는 메소드
    public void introduceMaster(String master) {
        System.out.println("제 주인의 이름은 " + master + "이에요!");
    }
}
