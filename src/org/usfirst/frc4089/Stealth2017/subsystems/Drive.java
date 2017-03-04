// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.Stealth2017.subsystems;

import org.usfirst.frc4089.Stealth2017.Constants;
import org.usfirst.frc4089.Stealth2017.RobotMap;
import org.usfirst.frc4089.Stealth2017.commands.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController rightMotor1 = RobotMap.driveRightMotor1;
    private final SpeedController rightMotor2 = RobotMap.driveRightMotor2;
    private final SpeedController leftMotor1 = RobotMap.driveLeftMotor1;
    private final SpeedController leftMotor2 = RobotMap.driveLeftMotor2;
    private final RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;
    public final Encoder rightEncoder = RobotMap.rightEncoder;
    public final Encoder leftEncoder = RobotMap.leftEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public double rightSpeed = 0;
    public double leftSpeed = 0;
    
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new UserDrive());
    }
    public void operatorDrive(Joystick DriveStick){
    	arcDrive(DriveStick.getRawAxis(1), -DriveStick.getRawAxis(2));
    	
    }
	private void arcDrive(double turn, double pow) {
		robotDrive41.arcadeDrive(turn, pow + Constants.curve);
		
	}
	public void driveF(){
		rightMotor1.set(1);
		rightMotor2.set(1);
		leftMotor1.set(-.92);
		leftMotor2.set(-.92);
	}
	public void driveB(){
		rightMotor1.set(1);
		rightMotor2.set(1);
		leftMotor1.set(1);
		leftMotor2.set(1);
	}
	public void driveR(){
		rightMotor1.set(1);
		rightMotor2.set(1);
		leftMotor1.set(1);
		leftMotor2.set(1);
	}
	public void driveL(){
		rightMotor1.set(-1);
		rightMotor2.set(-1);
		leftMotor1.set(-1);
		leftMotor2.set(-1);
	}
	public void stop(){
		rightMotor1.stopMotor();
		rightMotor2.stopMotor();
		leftMotor1.stopMotor();
		leftMotor2.stopMotor();
	}
	public void tankDrive(double leftValue, double rightValue){
		robotDrive41.tankDrive(leftValue, rightValue);
	}
	public void debugR1(){
		leftMotor1.set(.2);
	}
	public void debugR2(){
		leftMotor2.set(.2);
	}
	
	public void resetEncoders(){
		rightEncoder.reset();
		leftEncoder.reset();
	}
}

