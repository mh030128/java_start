package pack;

import pack.a.User;

public class packageMain3 {
    public static void main(String[] args) {

        User userA = new User();
        pack.b.User userB = new pack.b.User();

        /*
            다른 패키지의 같은 클래스명이 있으면 둘 중 하나면 import 가능하고,
            다른 패키지의 클래스명은 풀 경로를 적어줘야함.

            둘 다 전체 경로를 적어준다면 import 사용하지 않아도 됨.
         */
    }
}
