package edu.wpi.first.cmdTest;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    
    // pwm outputs
    public static final int motorTalonMain = 1;
    public static final int motorSec = 3;
    public static final int pidMotor = 2;
    public static final int pidSpeed = 4;
    public static final int testAJagPort = 7;
    public static final int testAVictorPort = 9;
    public static final int testATalonPort = 8;
//    public static final int testmotor = 3;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    // analog inputs 
    public static final int potPort = 1;
    
    // digital IO
    public static final int compressorSaftyPort = 8; 
    public static final int encoderSpeedFirstPort = 1;//incoders take two ports
   
    public static final int proximitySensorPort = 3;
    public static final int buttonPort = 4;
    
    // relay
    public static final int compressorPort = 1;
    public static final int testARelay = 8;
    
   //Pneumatics
    public static final int kickerPort = 1;
    
}