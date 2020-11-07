/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.nerdherd.lib.oi.DefaultOI;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * Add your docs here.
 */
public class OI extends DefaultOI{
    public JoystickButton ForwardVoltage;
    public OI(){
        super();
        ForwardVoltage = new JoystickButton(driveJoyLeft, 1);
    }
}
