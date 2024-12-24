package ref;

public class MethodChange1 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);  // 10
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);  // 10

    }

    static void changePrimitive (int x) {
        x = 20;
    }

    /*
    기본형일 때는 해당 값이 복사되어 전달되므로,
    메서드 내부에서 파라미터의 값을 변경해도, 호출자의 변수 값에는 영향이 없음.
     */
}
