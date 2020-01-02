public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourofDay){
        if (hourofDay >0 && (hourofDay < 8 || hourofDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}

