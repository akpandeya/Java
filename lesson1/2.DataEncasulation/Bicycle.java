class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    static int numGears = 6; //Belongs to Class not to the instance

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    static void changeNumGears(int newvalue) {
          numGears = newvalue;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear + 
             " Number of Gears: " + numGears );
    }
}