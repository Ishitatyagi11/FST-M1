package activities;

class Bicycle implements BicycleOperations, BicycleParts{

    int speed;
    int gears;

    public Bicycle(){}

    public Bicycle(int speed, int gears){
        speed = 100;
        gears = 5;

    }

        public void applyBrake(int a){
            int newspeed;
            newspeed = speed - a;
            System.out.println("Newspeed is after apply brake :" +newspeed);


        }

        public void speedUp(int b) {
            int newspeed1;
            newspeed1 = speed - b;
            System.out.println("New speed is after apply speed :" +newspeed1);

        }


    public void bicycleDesc(int gears, int speed){
        System.out.println("Number of gears are " +gears);
        System.out.println("Maximum speed of bycycle is " +speed);

    }

    public void seatHeight(int n){
        int seatHeight = n;
        System.out.println("seat height is: " +seatHeight);
    }

}

class MountainBike extends Bicycle {

    public MountainBike(){}

    public MountainBike(int speed, int gears){
        super.speed = 60;
        super.gears = 8;

    }

    public int bicycleDesc(int n1){
        int seatHeight = n1;
        return seatHeight;
    }

}

interface BicycleParts {
}

interface BicycleOperations {
}

public class Activity7 {
    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 0);
        System.out.println(mb.bicycleDesc(40));
        mb.speedUp(20);
        mb.applyBrake(5);
        mb.seatHeight(50);



    }
}
