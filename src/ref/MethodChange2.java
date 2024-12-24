package ref;

public class MethodChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);  // 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);  // 20

    }
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }

    /*
    참조형일 때는 참조값이 복사되어 전달되므로,
    메서드 내부에서 파라미터로 전달된 객체의 맴버변수를 변경하면, 호출자의 객체도 변경됨.
     */
}
