/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.robot.subsystems;

import com.nerdherd.lib.drivetrain.experimental.Drivetrain;
import com.nerdherd.lib.motor.motorcontrollers.CANMotorController;
import com.nerdherd.lib.motor.motorcontrollers.NerdyFalcon;
import com.nerdherd.robot.RobotMap;

// import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends Drivetrain {
  /**
   * Creates a new Drivetrain.
   */
  private static final double trackwidth = 0.0;
  public ExampleSubsystem() {
    super(new NerdyFalcon(RobotMap.kLeftParentTalonID), new NerdyFalcon(RobotMap.kRightParentTalonID),
        new CANMotorController[] { new NerdyFalcon(
            RobotMap.kLeftChildTalonID) },
        new CANMotorController[] { new NerdyFalcon(
            RobotMap.kRightChildTalonID) },
    true,
    false,
    ExampleSubsystem.trackwidth
    );
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
