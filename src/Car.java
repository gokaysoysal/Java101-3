class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    void increaseSpeed(int increase){
        if ((speed + increase) < speedLimit){
            speed += increase;
        }
    }
    void decreaseSpeed(int decrease){
        if((speed - decrease)>0){
            speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println("Hızınız : " + speed);
    }

}
