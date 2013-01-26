/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.commands;

/**
 *
 * @author team3574
 */
public class KickinItOldSchool extends CommandBase {
    
    public KickinItOldSchool() {
        // Use requires() here to declare subsystem dependencies
         requires(thePneumatics);
         this.setTimeout(0.75);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (this.timeSinceInitialized() < 0.25) {
            thePneumatics.openSolenoid();
            System.out.println(thePneumatics.buttonState());
        }
        else {
            thePneumatics.closeSolenoid();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
