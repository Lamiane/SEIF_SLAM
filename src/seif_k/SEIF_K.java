package seif_k;

import lejos.nxt.Button;
import lejos.util.Delay;

/**
 *
 * @author ksiazelobozow
 */
public class SEIF_K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control control = new Control();
        int msDelay = 2500;

        Delay.msDelay(msDelay);


        control.wheelsForward();
        Delay.msDelay(msDelay);

        control.stop();
        Delay.msDelay(msDelay);
//
//        control.wheelsBackward();
//        Delay.msDelay(msDelay);
//
//        control.stop();
//        Delay.msDelay(msDelay);

        control.wheelsTurnLeft();
        Delay.msDelay(msDelay/2);

        control.stop();
        Delay.msDelay(msDelay);

//        control.wheelsTurnRight();
//        Delay.msDelay(msDelay);
//
//        control.stop();
//        Delay.msDelay(msDelay);

        control.wheelsForward();
        Delay.msDelay(msDelay/2);

        control.stop();
        Delay.msDelay(msDelay);

//        control.headTurnRight();
//        Delay.msDelay(msDelay);
//        
//        control.stop();
//        Delay.msDelay(msDelay);
//        
//        control.headTurnLeft();
//        Delay.msDelay(msDelay);
//        
//        control.stop();
//        Delay.msDelay(msDelay);

    }
}
