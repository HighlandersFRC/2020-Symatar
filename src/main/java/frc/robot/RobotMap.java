package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SerialPort;

import edu.wpi.first.wpilibj.I2C.Port;
import frc.robot.sensors.Navx;

public class RobotMap {
    public RobotMap() {

    }

public static int leftMasterid = 7;
public static int leftFollower1id = 8;
public static int leftFollower2id = 6;
public static int rightMasterid = 2;
public static int rightFollower1id = 3;
public static int rightFollower2id = 1;
public static int rightIntakeid = 10;
public static int leftIntakeid = 9;
public static TalonSRX leftFollower =new TalonSRX(leftFollower1id);
public static TalonSRX leftMaster =new TalonSRX(leftMasterid);
public static TalonSRX rightMaster =new TalonSRX(rightMasterid);
public static TalonSRX rightFollower =new TalonSRX(rightFollower1id);
public static TalonSRX rightIntake =new TalonSRX(rightIntakeid);
public static TalonSRX leftIntake =new TalonSRX(leftIntakeid);
public static AHRS imu =new AHRS(Port.kMXP);


}
