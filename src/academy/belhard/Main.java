package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.printInfo();
        car.price();


        System.out.println();

        Motorcycle moto = new Motorcycle(2, 290);
        moto.printInfo();
        moto.price();



    }
}
