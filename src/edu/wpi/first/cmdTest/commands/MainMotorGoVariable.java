/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import team.util.MotorScaler;

/**
 *
 * @author team3574
 */
public class MainMotorGoVariable extends CommandBase {
    int lastMagEncoderValue = 0;
    int loopCounter = 0;
    
    public static MotorScaler testScaler = new MotorScaler();
    
    public MainMotorGoVariable() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(theMainMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double speed = testScaler.scale(oi.topUpDown1());
        //double speed = oi.topUpDown();
        theMainMotor.goVariable(speed);
        if (this.loopCounter > 20){
            loopCounter = 0;
            int current = theMainMotor.magneticEncoder.get();
            SmartDashboard.putNumber("MagneticEncoder",current - lastMagEncoderValue);
            lastMagEncoderValue = current;
        }
        else{
            loopCounter++;
        }
        SmartDashboard.putNumber("Joystick",oi.topUpDown1());
        SmartDashboard.putNumber("MainEncoder",theMainMotor.mainEncoder.get());
       
        
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
