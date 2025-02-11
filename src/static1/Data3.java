package static1;

public class Data3 {

    /*
    static이 붙은 정적 변수를 사용한 덕분에 공용 변수를 사용해서 편리하게 문제 해결.
    static이 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않고, 메서드 영역에서 관리.
    메서드 영역에서 관리한다는 것은 공용으로 사용한다라고 이해하면 됨.
     */

    public String name;
    public static int count;    // static변수(= 정적변수, 클래스변수)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
