/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.commands.LogToConsole;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author team3574
 */
public class Log extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new LogToConsole());
    }
}
