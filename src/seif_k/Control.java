package seif_k;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

/**
 * @author Ksiaze Lobozow
 */
public class Control {

    private final NXTRegulatedMotor right = Motor.A;
    private final NXTRegulatedMotor left = Motor.B;
    private final NXTRegulatedMotor head = Motor.C;
    private final Measure measure = new Measure();
    private static final int wheelsStraightSpeed = 600;
    private static final int wheelsTurnSpeed = 300;
    private static final int headSpeed = 200;

    public Control() {
        head.setSpeed(headSpeed);
        this.setStrightSpeedToWheels();
    }

    private void setStrightSpeedToWheels() {
        right.setSpeed(wheelsStraightSpeed);
        left.setSpeed(wheelsStraightSpeed);
    }

    private void setTurnSpeedToWheels(){
        right.setSpeed(wheelsTurnSpeed);
        left.setSpeed(wheelsTurnSpeed);
    }
    
    public int[] stop() {
        right.stop(true);
        left.stop(true);
        head.stop();

        return measure.run();
    }

    public void wheelsForward() {
        this.setStrightSpeedToWheels();
        right.forward();
        left.forward();
    }

    public void wheelsBackward() {
        this.setStrightSpeedToWheels();
        right.backward();
        left.backward();
    }

    public void wheelsTurnRight() {
        this.setTurnSpeedToWheels();
        right.backward();
        left.forward();
    }
    
    public void wheelsTurnLeft(){
        this.setTurnSpeedToWheels();
        right.forward();
        left.backward();
    }
    
    public void headTurnRight(){
        head.backward();
    }
    
    public void headTurnLeft(){
        head.forward();
    }
    
}
