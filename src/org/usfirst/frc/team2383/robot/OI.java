package org.usfirst.frc.team2383.robot;

import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;

import org.usfirst.frc.team2383.lib.Gamepad;
import org.usfirst.frc.team2383.robot.Constants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

@SuppressWarnings("unused")

public class OI {

	private static DoubleUnaryOperator inputExpo = (x) -> {
		return Constants.inputExpo * Math.pow(x, 3) + (1 - Constants.inputExpo) * x;
	};
	private static DoubleUnaryOperator deadband = (x) -> {
		return Math.abs(x) > Constants.inputDeadband ? x : 0;
	};
	
	public static Gamepad driverGamepad = new Gamepad(0);
	public static Gamepad operatorGamepad = new Gamepad(1);

	public static DoubleSupplier leftStick = () -> deadband.applyAsDouble(driverGamepad.getLeftY());
	public static DoubleSupplier rightStick = () -> deadband.applyAsDouble(driverGamepad.getRightX());

	public static Button releaseString = new JoystickButton(operatorGamepad,1);
	public static Button catapultRelease = new JoystickButton(operatorGamepad,2);
	public static Button retractString = new JoystickButton(operatorGamepad, 3);
}
