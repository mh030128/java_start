package static1;

public class DataCountMain1 {
    public static void main(String[] args) {

        /*
        생성된 객체의 수를 세기 위한 코드를 작성했다면 기대한대로 작동하지 않음.
        객체 생성시 Data1 인스턴스는 새로 만들어지면서 인스턴스에 포함된 count 변수도 새로 만들어지기 때문.
        인스턴스에 사용되는 멤버변수 count 값은 인스턴스끼리 서로 공유되지 않음.
        따라서 원하는 답을 구할 수 없음.
        이 문제를 해결하려면 변수를 서로 공유해야 함.
         */

        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data1.count);
    }
}
