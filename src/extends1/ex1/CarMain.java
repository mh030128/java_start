package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {

        /*
        전기차와 가솔린차는 자동차(Car)의 좀 더 구체적인 개념.
        반대로 자동차(Car)는 전기차와 가솔린차를 포함하는 추상적인 개념.

        그래서 둘의 공통 기능인 move()가 있는데 이럴 때는 상속 관계를 사용하는 것이 효과적임.
         */

        ElectricCar electricCar = new ElectricCar();

        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
