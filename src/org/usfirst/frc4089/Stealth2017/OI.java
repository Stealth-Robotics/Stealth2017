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

import org.usfirst.frc4089.Stealth2017.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4089.Stealth2017.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driveStick;
    public JoystickButton runShooter;
    public JoystickButton stopShooter;
    public JoystickButton runEllevator;
    public JoystickButton stopEllevator;
    public JoystickButton extendCollector;
    public JoystickButton retractCollector;
    public JoystickButton runCollector;
    public JoystickButton stopCollector;
    public Joystick utilityStick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        utilityStick = new Joystick(1);
        
        stopCollector = new JoystickButton(utilityStick, 5);
        stopCollector.whenPressed(new CollectorStop());
        runCollector = new JoystickButton(utilityStick, 4);
        runCollector.whenPressed(new CollectorRun());
        retractCollector = new JoystickButton(utilityStick, 2);
        retractCollector.whenPressed(new CollectorIn());
        extendCollector = new JoystickButton(utilityStick, 3);
        extendCollector.whenPressed(new CollectorOut());
        stopEllevator = new JoystickButton(utilityStick, 7);
        stopEllevator.whenPressed(new EllevatorStop());
        runEllevator = new JoystickButton(utilityStick, 6);
        runEllevator.whenPressed(new EllevatorRun());
        stopShooter = new JoystickButton(utilityStick, 10);
        stopShooter.whenPressed(new ShooterStop());
        runShooter = new JoystickButton(utilityStick, 11);
        runShooter.whenPressed(new ShooterRun());
        driveStick = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ShooterRun", new ShooterRun());
        SmartDashboard.putData("ShooterStop", new ShooterStop());
        SmartDashboard.putData("EllevatorRun", new EllevatorRun());
        SmartDashboard.putData("EllevatorStop", new EllevatorStop());
        SmartDashboard.putData("CollectorRun", new CollectorRun());
        SmartDashboard.putData("CollectorStop", new CollectorStop());
        SmartDashboard.putData("CollectorIn", new CollectorIn());
        SmartDashboard.putData("CollectorOut", new CollectorOut());
        SmartDashboard.putData("DriveF", new DriveF());
        SmartDashboard.putData("DriveB", new DriveB());
        SmartDashboard.putData("DriveR", new DriveR());
        SmartDashboard.putData("DriveL", new DriveL());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveStick() {
        return driveStick;
    }

    public Joystick getUtilityStick() {
        return utilityStick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

