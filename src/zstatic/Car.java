package zstatic;

public class Car {
    private  static int i = 0;
    private String carsuri;
    public Car(String string){
        System.out.println("차량 구입"+ string);
        i++;
        carsuri = string;

    }

    public static void showTotalCars(){

        System.out.println(i);
    }
}
