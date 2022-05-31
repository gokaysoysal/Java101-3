public class MainCar {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi";
        audi.type = "Sedan";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(30);
        bmw.increaseSpeed(25);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.increaseSpeed(50);
        mercedes.decreaseSpeed(30);
        mercedes.increaseSpeed(40);
        mercedes.increaseSpeed(25);
        mercedes.printSpeed();

    }
}
