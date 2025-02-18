package final1;

public class FinalFieldMain {
    public static void main(String[] args) {

        // final field - 생성자 초기화
        /*
        각 인스턴스마다 final 필드에 다른 값 할당 가능.
        물론 final 사용했기 때문에 생성 이후에 이 값을 변경하는 것은 불가능
         */
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // fianl field - 필드 초기화
        /*
        여기서 FieldInit 인스턴스의 모든 value 값은 10.
        생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값을 미리 저장함.
        모든 인스턴스가 같은 값 사용하기 때문에 결과적으로 메모리 낭비함.
        (이럴 때 사용하면 좋은 것이 바로 static영역.)
         */
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        /*
        상수는 변하지 않고, 항상 일정한 값을 갖는 수.

        특징
          - 대문자 사용하고 구분은 _(언더스코어)로 함.(관례)
          - 필드를 직접 접근해서 사용.
            - 상수는 값을 변경할 수 없으므로 필드에 직접 접근해서 데이터가 변하는 문제 발생하지 않음.
         */
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
