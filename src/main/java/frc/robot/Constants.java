// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
     public static final class ModuleConstants {
         public static final double kWheelDiameterMeters = Units.inchesToMeters(3.75);
         public static final double kDriveMotorGearRatio = 8.14/1;
         public static final double kTurningMotorGearRatio = 21.4285714/1;
         public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
         public static final double kTurningEncoderRot2Rad = kDriveMotorGearRatio * 2 * Math.PI;
         public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
         public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
         public static final double kPTurning = 0.5;
     };

//    {
//        public static class OperatorConstants {
//            public static final int DRIVER_CONTROLLER_PORT = 0;
//        }
//    }
}