package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지이면 클래스명 사용.
        pack.a.User user = new pack.a.User();   // 다른 패키지이면 패키지명 + 클래스명 사용. (풀경로 사용)
    }
}
