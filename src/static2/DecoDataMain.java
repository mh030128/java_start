package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        // DecoData.staticCall();   // 이렇게 작성 가능하지만 여러번 호출 할 시 import 사용하는 것이 편리함.

        System.out.println("2, 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근 (권장하지 않음)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();

    }
}
