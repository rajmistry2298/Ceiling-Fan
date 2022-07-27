package Main;

/**
 * Main class Which implements the characteristics of Ceiling Main.Fan.
 */
public class Fan {
    public static final int OFF = 0;
    //Default speed of Main.Fan is OFF which is 0.
    private int speed = OFF;
    //Default fan direction is FORWARD.
    private String fanDirection = "FORWARD";

    public int getSpeed() {
        return speed;
    }

    //This method implements the functions of speed Cord.
    public void increaseSpeed() {
        if(this.speed == 3){
            this.speed = OFF;
        }else this.speed++;
    }

    public String getFanDirection() {
        return fanDirection;
    }

    //This method implements the functions of Direction Cord.
    public void reverseDirection() {
        if(this.fanDirection.equalsIgnoreCase("FORWARD")){
            this.fanDirection = "REVERSE";
        }else{
            this.fanDirection = "FORWARD";
        }
    }
    
    @Override
    public String toString() {
        return "Fan is working at "+speed+" speed and the direction of Fan is "+ fanDirection + ".";
    }
}
