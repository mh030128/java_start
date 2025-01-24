package construct;

public class MemberThis {

    // 멤버변수
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;

        /*
        이런경우는 this가 생략되어 있는데, 둘의 변수명이 다르기 때문.

        this.nameField를 생략하지 않아도 됨.
        이렇게 this를 사용하면 멤버 변수를 사용한다는 것을 눈으로 쉽게 확인 가능.
        과거에는 많이 사용했지만 최근에는 IDE가 발전함으로써 색상으로 구분해 줄 수 있음.

        따라서 필요한 경우에만 사용해도 충분하다고 생각. (멤버변수와 매개변수명이 같을 경우)
         */
    }
}
