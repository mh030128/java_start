package static2.ex;

public class Car {

    private String model;
    private static int totalCars;

    public Car(String model) {
        System.out.println("차량 구입, 이름 : " + model);
        this.model = model;
        totalCars++;
    }


    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
