/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 * @author team3574
 */
public class PidSpeed extends PIDSubsystem {

    private static final double Kp = 1.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    
    NetworkTable table;
    
    Jaguar motorControl = new Jaguar(RobotMap.pidSpeed);
    Encoder encoder = new Encoder (RobotMap.encoderSpeedFirstPort, RobotMap.encoderSpeedFirstPort+1);
    DigitalInput prox = new DigitalInput (RobotMap.proximitySensorPort);

    // Initialize your subsystem here
    public PidSpeed() {
        super("PidSpeed", Kp, Ki, Kd);
        table = NetworkTable.getTable("");
        table.putNumber("x", Kp);
        
        encoder.start();

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        setSetpoint(100);
        enable ();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
//        System.out.println(encoder.get());
//        System.out.println (encoder.getRate());
//        System.out.println(prox.get());
        return encoder.getRate();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
        motorControl.set(output);
    }
}
