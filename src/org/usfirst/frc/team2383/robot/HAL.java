package org.usfirst.frc.team2383.robot;

import com.kauailabs.navx.frc.AHRS;
import org.usfirst.frc.team2383.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.VictorSP;

public class HAL {
	public static VictorSP leftFront = new VictorSP(0);
	public static VictorSP leftBack = new VictorSP(1);
	public static VictorSP rightFront = new VictorSP(2);
	public static VictorSP rightBack = new VictorSP(3);
	
	public static VictorSP tautString = new VictorSP(4);
	
	public static PowerDistributionPanel PDP = new PowerDistributionPanel(0);
	public static AHRS navX = new AHRS(SPI.Port.kMXP);

	public static Drivetrain drivetrain = new Drivetrain();
}
