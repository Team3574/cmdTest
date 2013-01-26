/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.commands;

import edu.wpi.first.wpilibj.networktables.NetworkTable;


/**
 *
 * @author team3574
 */
public class LogToConsole extends CommandBase {
    NetworkTable table;
    
    public LogToConsole() {
        // Use requires() here to declare subsystem dependencies
        requires(theLog);
        table = NetworkTable.getTable("datatable");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        table.putNumber("x", 5.0);
        System.out.println("hi");
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
