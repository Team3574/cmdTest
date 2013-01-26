/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.cmdTest.subsystems;

import edu.wpi.first.cmdTest.RobotMap;
import edu.wpi.first.cmdTest.commands.MotorTestSpeed;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author team3574
 */
public class MotorTest extends Subsystem {
    Jaguar jaguarTest = new Jaguar (RobotMap.testAJagPort); 
    Victor victorTest = new Victor (RobotMap.testAVictorPort);
    Relay spikeTest = new Relay (RobotMap.testARelay);
    Talon talonTest = new Talon (RobotMap.testATalonPort);
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new MotorTestSpeed());
        
    }
    
    public void goVariable (double speed) {
        jaguarTest.set (speed);
        victorTest.set (speed);
        talonTest.set (speed); 
        
        if (speed > -0.5 && speed < 0.5){
            spikeTest.set (Relay.Value.kOff);
        }
        else if (speed >= 0.5){
             spikeTest.set(Relay.Value.kOn);
             spikeTest.set (Relay.Value.kForward);
        }
        else if (speed <= -0.5){
             spikeTest.set(Relay.Value.kOn);
             spikeTest.set (Relay.Value.kReverse);
        }
    }
}
