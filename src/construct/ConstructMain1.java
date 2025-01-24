package construct;

public class ConstructMain1 {
    public static void main(String[] args) {

        /*
        생성자는 인스턴스를 생성하고 나서 즉시 호출.
        호출방법은 new 명령어 다음에 생성자 이름과 매개변수에 맞추어 인수를 전달하면 됨.

        인스턴스 생성 후 즉시 해당 생성자를 호출.
        참고로 new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호()도 포함해야 하는 이유가 바로 생성자 때문.
        객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함.

        생성자 덕분에 매개변수 값을 항상 필수로 입력하게 됨으로써
        아무 정보가 없는 유령 회원이 시스템 내부에 등장할 가능성을 원천 차단할 수 있음.
         */

        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적 : " + member.grade);
        }
    }
}
