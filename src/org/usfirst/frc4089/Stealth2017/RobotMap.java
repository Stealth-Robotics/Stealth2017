// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.Stealth2017;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;

import com.ctre.*;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveRightMotor1;
    public static CANTalon driveRightMotor2;
    public static CANTalon driveLeftMotor1;
    public static CANTalon driveLeftMotor2;
    //public static Encoder rightEncoder;
    //public static Encoder leftEncoder;
    public static RobotDrive driveRobotDrive41;
    public static SpeedController collectorMotorBC;
    public static SpeedController shooterMotor;
    public static Encoder shooterQuadratureEncoder1;
    public static SpeedController ellevatorMotor;
    public static SpeedController climberMotor1;
    public static SpeedController climberMotor2;
    public static Servo shooterDoor;
    public static Servo RBarrelBlocker;
    public static Servo LBarrelBlocker;
	public static SpeedController agitatorMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static DigitalInput utilsDigitialGyro;
    public static Accelerometer builtInAcc; 
    public static Ultrasonic sensorsSonic1;
    public static AnalogGyro sensorsAnalogGyro1;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveRightMotor1 = new CANTalon(Constants.rightMotor1SpeedControl);
        LiveWindow.addActuator("Drive", "RightMotor1", (CANTalon) driveRightMotor1);
        
        driveRightMotor2 = new CANTalon(Constants.rightMotor2SpeedControl);
        LiveWindow.addActuator("Drive", "RightMotor2", (CANTalon) driveRightMotor2);
        //driveRightMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
        //driveRightMotor2.set(Constants.rightMotor1SpeedControl);
        
        driveLeftMotor1 = new CANTalon(Constants.left1MotorSpeedControl);
        LiveWindow.addActuator("Drive", "LeftMotor1", (CANTalon) driveLeftMotor1);
        //driveLeftMotor1.reverseSensor(true);
        driveLeftMotor1.setInverted(false);
        
        driveLeftMotor2 = new CANTalon(Constants.left2MotorSpeedControl);
        LiveWindow.addActuator("Drive", "LeftMotor2", (CANTalon) driveLeftMotor2);
        driveLeftMotor2.setInverted(false);
        //driveLeftMotor2.changeControlMode(CANTalon.TalonControlMode.Follower);
        //driveLeftMotor2.set(Constants.left1MotorSpeedControl);
        
        
        driveRobotDrive41 = new RobotDrive(driveLeftMotor1, driveLeftMotor2,
              driveRightMotor1, driveRightMotor2);
        
        driveRobotDrive41.setSafetyEnabled(true);
        driveRobotDrive41.setExpiration(0.5);
        driveRobotDrive41.setSensitivity(0.25);
        driveRobotDrive41.setMaxOutput(1.0);
        
        /*rightEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "rightEncoder", rightEncoder);
        rightEncoder.setDistancePerPulse(0.0785398);
        rightEncoder.setPIDSourceType(PIDSourceType.kRate);
        
        leftEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "leftEncoder", leftEncoder);
        leftEncoder.setDistancePerPulse(0.0785398);
        leftEncoder.setPIDSourceType(PIDSourceType.kRate);
*/
        collectorMotorBC = new CANTalon(Constants.collectorMotorControl);
        LiveWindow.addActuator("Collector", "MotorBC", (CANTalon) collectorMotorBC);
        
        shooterMotor = new CANTalon(Constants.ShooterMotorSpeedControl);
        LiveWindow.addActuator("Shooter", "ShooterMotor", (CANTalon) shooterMotor);
        
        /*shooterQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "Quadrature Encoder 1", shooterQuadratureEncoder1);
        shooterQuadratureEncoder1.setDistancePerPulse(1.0);
        shooterQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        */ellevatorMotor = new CANTalon(Constants.ellevatorMotorSpeedControl);
        LiveWindow.addActuator("Ellevator", "EllevatorMotor", (CANTalon) ellevatorMotor);
        
        climberMotor1 = new CANTalon(Constants.climbMotor1SpeedControl);
        LiveWindow.addActuator("Climber", "ClimberMotor1", (CANTalon) climberMotor1);
       
        climberMotor2 = new CANTalon(Constants.climbMotor2SpeedControl);
        //climberMotor2.setInverted(true);
        LiveWindow.addActuator("Climber", "ClimberMotor2", (CANTalon) climberMotor2);
        
        agitatorMotor = new CANTalon(Constants.agitatorMotorSpeedControl);
        LiveWindow.addActuator("Ellevator", "agitatorMotor", (CANTalon) agitatorMotor);
         
        shooterDoor = new Servo(Constants.shooterDoorPort);
		shooterDoor.setBounds(2.25, 1.5, 1.5, 1.5, 0.9);
		shooterDoor.enableDeadbandElimination(false);
	
		RBarrelBlocker = new Servo(Constants.RBarrelBlockerPort);
		LBarrelBlocker = new Servo(Constants.LBarrelBlockerPort);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		builtInAcc = new BuiltInAccelerometer(Accelerometer.Range.k8G);
		sensorsSonic1 = new Ultrasonic(2, 3);
        LiveWindow.addSensor("Sensors", "Sonic1", sensorsSonic1);
        
        sensorsAnalogGyro1 = new AnalogGyro(0);
        LiveWindow.addSensor("Sensors", "AnalogGyro 1", sensorsAnalogGyro1);
        sensorsAnalogGyro1.setSensitivity(0.007);
    }
}
