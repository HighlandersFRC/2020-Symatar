// Copyrights (c) 2018-2019 First, 2020 Highlanders FRC. All Rights Reserved.

package frc.robot;

public class RobotStats{

    public static final double encoderTicksPerWheelRotation = 10240;
    public static final double wheelDiam = 0.5;
    public static final double wheelCircum = wheelDiam * Math.PI;
    public static double ticksToFeet(double ticks){
        return (ticks / encoderTicksPerWheelRotation) * wheelCircum;
    }
    public static double feetToTicks(double feet){
        return (feet / wheelCircum) * encoderTicksPerWheelRotation;

    }



}