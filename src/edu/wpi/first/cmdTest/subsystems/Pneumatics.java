/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.RobotMap;
import edu.wpi.first.cmdTest.commands.KickinItOldSchool;
import edu.wpi.first.cmdTest.commands.NotKickinItOldschool;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author team3574
 */
public class Pneumatics extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Solenoid kicker = new Solenoid(RobotMap.kickerPort);
    public Compressor comp = new Compressor(RobotMap.compressorSaftyPort, RobotMap.compressorPort);
    public DigitalInput button = new DigitalInput(RobotMap.buttonPort);

    public Pneumatics() {
        comp.start(); 
    }   
            
    public void initDefaultCommand() {        
    // Set the default command for a subsystem here.
        setDefaultCommand(new NotKickinItOldschool());
    }
    
    public void openSolenoid(){
        kicker.set(true);
    }
    
    public void closeSolenoid(){
        kicker.set(false);
    }
    
    public boolean buttonState(){
        return !button.get();
        
    }
    
}

