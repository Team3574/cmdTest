/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.RobotMap;
import edu.wpi.first.cmdTest.commands.CommandBase;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author team3574
 */
public class PidTest extends PIDSubsystem {

    private static final double Kp = 1.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;

    AnalogChannel pot = new AnalogChannel(RobotMap.potPort);
  
    Talon pidMotor = new Talon(RobotMap.pidMotor);
    
    
    // Initialize your subsystem here
    public PidTest() {
        super("PidTest", Kp, Ki, Kd);
       
      
        
        
      
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        setSetpoint(2.5);
        enable();
    }
    
    protected void initDefaultCommand(){}
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        return pot.getVoltage();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        pidMotor.set(output);
    }
   
    public double getPotVoltage() {
       return pot.getVoltage();
    }
}
