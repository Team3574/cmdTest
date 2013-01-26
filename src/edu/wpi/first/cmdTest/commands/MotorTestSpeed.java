/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.commands;

/**
 *
 * @author team3574
 */
public class MotorTestSpeed extends CommandBase {
    
    public MotorTestSpeed() {
        // Use requires() here to declare subsystem dependencies
        requires(theMotorTest);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       double analog1 = oi.analogDS1();
       analog1 = analog1/2.5 - 1;
       theMotorTest.goVariable(analog1);
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
