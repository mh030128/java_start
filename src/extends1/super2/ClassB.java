package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super();    // 기본생성자. 생략가능(기본생성자인 경우에만.)
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();    // 기본생성자. 생략가능.
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);

    }
}
