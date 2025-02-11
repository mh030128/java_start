package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        /*
        참조값을 알 수 없기 때문에 불가능.
         */

        //instanceValue++;    // 인스턴스 변수 접근, compile error
        //instanceMethod();   // 인스턴스 메서드 접근, compile error

        staticValue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {

        /*
        참조값을 알 수 있기 때문에 가능.
         */

        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근

        staticValue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
