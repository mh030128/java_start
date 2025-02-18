package final1;

public class FieldInit {

    /*
    final 필드를 필드에서 초기화하면 이미 값이 설정됐기 때문에 생성자를 통해 초기화 할 수 없음.
    value 필드 참고.

    static 변수에도 final을 선언할 수 있음.

     */

    static final int CONST_VALUE = 10;
    final int value = 10;

    /*public FieldInit(int value) {
        this.value = value;
    }*/ // compile error
}
