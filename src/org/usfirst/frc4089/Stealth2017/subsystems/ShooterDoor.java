package org.usfirst.frc4089.Stealth2017.subsystems;

import org.usfirst.frc4089.Stealth2017.RobotMap;

import edu.wpi.first.wpilibj.PWMConfigDataResult;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterDoor extends Subsystem{

	private final Servo shooterDoor = RobotMap.shooterDoor;
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void openDoor(){
		shooterDoor.set(1);
	}
	public void closeDoor(){
		shooterDoor.set(0);
	}
}