package pack;

/*import pack.a.User;
import pack.a.User2;*/

import pack.a.*;    // pack.a의 모든 클래스 사용했을 때.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지 명 생략 가능. (클래스명만 입력)
        User2 user2 = new User2();

    }
}
