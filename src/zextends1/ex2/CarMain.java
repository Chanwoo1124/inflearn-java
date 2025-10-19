package zextends1.ex2;



public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillup();
        gascar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
        hydrogenCar.openDoor();

    }
}
