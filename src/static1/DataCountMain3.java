package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        /*
        코드를 보면 기존과 달리 count 정적 변수에 접근하는 방법이 다름.
        인스턴스를 통해서 접근하는 것이 아닌 Data3.count와 같이 클래스명에 .(dot)을 사용하는데
        마치 클래스에 직접 접근하는 것 같음
         */

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 (권장하지 않음)
        /*
        클래스를 통한 접근과 다르게 count 변수가 인스턴스 변수라고 오해할 수 있기 때문.
        클래스를 통한 접근은 바로 정적변수로 알 수 있지만 인스턴스를 통한 접근은 그게 아닐 가능성이 큼.
         */
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
