package oop1;

public class ValueObject {

    int value;

    // static 키워드 사용하지 않음. (자세한 내용은 추후에)
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
