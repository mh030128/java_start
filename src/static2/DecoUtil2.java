package static2;

public class DecoUtil2 {

    /*
    DecoUtil1과 다르게 static이 붙음.
    정적메소드(=클래스메소드)이고, 정적변수처럼 인스턴스 생성없이 클래스명을 통해 바로 호출 가능.
     <-> 인스턴스메소드 : static이 붙지 않은 메소드. 인스턴스 생성해야 호출 가능.
     */

    public static String deco(String str) {

        return "*" + str + "*";
    }
}
