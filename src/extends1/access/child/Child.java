package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectValue = 1;   // 상속 관계 or 같은 패키지 (여기서는 패키지는 다르지만 상속관계이므로 해당됨.)
        //defaultValue = 1;   // 다른 패키지 접근 불가. compile error
        //privateValue = 1;   // 접근 불가. compile error

        publicMethod();
        protectedMethod();  // 상속 관계 or 같은 패키지
        //defaultMethod();    // 다른 패키지 접근 불가. compile error
        //privateMethod();    // 접근 불가. compile error

        printParent();  // 접근제어자가 public이기 때문.
    }
}
