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
import com.nerdherd.robot.Robot;
import com.nerdherd.robot.RobotMap;
import com.playingwithfusion.TimeOfFlight;

// import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends Drivetrain {
  /**
   * Creates a new Drivetrain.
   */
  private static final double trackwidth = 0.0;
  public static TimeOfFlight timeOfFlight1, timeOfFlight2;

  public Drive() {
    super(new NerdyFalcon(RobotMap.kLeftParentTalonID), new NerdyFalcon(RobotMap.kRightParentTalonID),
        new CANMotorController[] { new NerdyFalcon(
            RobotMap.kLeftChildTalonID) },
        new CANMotorController[] { new NerdyFalcon(
            RobotMap.kRightChildTalonID) },
    true,
    false,
    Drive.trackwidth
    );
    timeOfFlight1 = new TimeOfFlight(RobotMap.kTimeOfFlight1);
    timeOfFlight2 = new TimeOfFlight(RobotMap.kTimeOfFlight2);
    }

  public void setPower(double rightPow, double leftPow) {
    super.setPower(leftPow, rightPow);
  }

  public boolean WallDetected(){
    return timeOfFlight1.getRange() < RobotMap.kWallDetected;
  }

  public boolean DroneDetected(){
    return timeOfFlight2.getRange() < RobotMap.kDroneDetected;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
