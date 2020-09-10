package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;

public class ButtonMap {
    public static OI oi = new OI();
    public static double getDriveThrottle(){
        return -oi.driverController.getRawAxis(1);
    } 
    public static double getRotation(){
        return oi.driverController.getRawAxis(4);
    }
    public static boolean runAuto(){
                            return oi.driverController.getYButton();
    }
}