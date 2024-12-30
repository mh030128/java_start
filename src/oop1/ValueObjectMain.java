package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        /*
        객체지향 프로그래밍
         */

        ValueObject valueObject = new ValueObject();

        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}
