package org.usfirst.frc.team2383.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;


import org.usfirst.frc.team2383.robot.*;
import org.usfirst.frc.team2383.commands.*;

/**
 * Drivetrain for MangoBot
 */
public class Drivetrain extends Subsystem {
    
	private final RobotDrive robotDrive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
	
	public Drivetrain(){
		this.robotDrive = new RobotDrive(leftFront, rightBack);
		robotDrive.setSafetyEnabled(false);
	}
	
	public void tank(double leftValue, double rightValue) {
		robotDrive.tankDrive(leftValue, rightValue);
	}
	

	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new TeleopDrive(OI.leftStick, OI.rightStick));
	}
}

