/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.RobotMap;
import edu.wpi.first.cmdTest.commands.MainMotorDoNothing;
import edu.wpi.first.cmdTest.commands.MainMotorGoVariable;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author team3574
 */
public class MainMotor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Talon mainMotor = new Talon(RobotMap.motorTalonMain); 
    public Encoder mainEncoder = new Encoder(RobotMap.encoderTestMainPort,RobotMap.encoderTestMainPort+1); 
    public Encoder magneticEncoder = new Encoder(RobotMap.encoderMagneticMainPort,RobotMap.encoderMagneticMainPort+1);  
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new MainMotorGoVariable());
    }
    
    public MainMotor(){
        super("MainMotor");
        mainEncoder.start();
        magneticEncoder.start();
    }
    
    public void go(){
        mainMotor.set(.3);
    }
    
    public void goVariable(double speed)
    {
        mainMotor.set(speed);
       SmartDashboard.putNumber("motorspeed", mainMotor.get());
    }
    
    
    
    public void doNothing() {
        mainMotor.set(0.0);
    }
    
    
    

}
