package seif_k;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

/**
 * @author Ksiaze Lobozow
 */
public class Measure {
    private final NXTRegulatedMotor right = Motor.A;
    private final NXTRegulatedMotor left = Motor.B;
    private final NXTRegulatedMotor head = Motor.C;

    public int[] run(){
        int[] measurementsArray = new int[6];
        int[] tmp = this.getHead();
        measurementsArray[0]=tmp[0];
        measurementsArray[1]=tmp[1];
        tmp=this.getLeft();
        measurementsArray[2]=tmp[0];
        measurementsArray[3]=tmp[1];
        tmp=this.getRight();
        measurementsArray[4]=tmp[0];
        measurementsArray[5]=tmp[1];
        return measurementsArray;
    };
    
    private int[] getHead(){
        int[] vector = new int[2];
        vector[0] = head.getTachoCount();
        vector[1] = head.getSpeed();
        return vector;
    }
    
    private int[] getLeft(){
        int[] vector = new int[2];
        vector[0] = left.getTachoCount();
        vector[1] = left.getSpeed();
        return vector;
    }
    
    private int[] getRight(){
        int[] vector = new int[2];
        vector[0] = right.getTachoCount();
        vector[1] = right.getSpeed();
        return vector;
    }
}
