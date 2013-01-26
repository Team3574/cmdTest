/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team.util;

/**
 *
 * @author team3574
 */
public class MotorScaler {
    double lastInput, maxChange;
    
    public MotorScaler(){
        lastInput = 0.0;
        maxChange = 0.02;
    }
    public MotorScaler(double _maxChange){
        lastInput = 0.0;
        maxChange = _maxChange;
    }
    
    public double scale(double input){
        double newSpeed;
        if (input - lastInput > 0){
            newSpeed = lastInput + maxChange;
            lastInput = newSpeed;
            return newSpeed;
        }
        else {
            newSpeed = lastInput - maxChange;
            lastInput = newSpeed;
            return newSpeed;
        }
    }
}
