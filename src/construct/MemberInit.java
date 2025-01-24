package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    // 추가 (메서드)
    void initMember(String name, int age, int grade) {
        this.name= name;
        this.age = age;
        this.grade = grade;

        /*
        this.name은 자기 자신의 인스턴스를 가리킴.
        즉 MemberInit의 변수를 가리키는 것.
         */
    }
}
