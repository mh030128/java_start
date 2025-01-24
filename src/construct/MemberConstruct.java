package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 오버로딩

    public MemberConstruct(String name, int age) {
        this(name, age, 50);    // 변경
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
    생성자 이름은 클래스 이름과 동일하게 생성.
     */
}
