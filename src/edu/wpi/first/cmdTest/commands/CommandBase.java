package edu.wpi.first.cmdTest.commands;

import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.cmdTest.OI;
import edu.wpi.first.cmdTest.subsystems.Log;
import edu.wpi.first.cmdTest.subsystems.MainMotor;
import edu.wpi.first.cmdTest.subsystems.MotorTest;
import edu.wpi.first.cmdTest.subsystems.PidSpeed;
import edu.wpi.first.cmdTest.subsystems.PidTest;
import edu.wpi.first.cmdTest.subsystems.Pneumatics;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static MainMotor theMainMotor = new MainMotor();
    public static PidTest thePidTest = new PidTest();
    public static PidSpeed thePidSpeed = new PidSpeed ();
    public static MotorTest theMotorTest = new MotorTest();
    public static Log theLog = new Log();
    public static Pneumatics thePneumatics=new Pneumatics();
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
//        SmartDashboard.putData(theMainMotor);   
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
