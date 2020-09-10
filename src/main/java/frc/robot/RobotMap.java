package frc.robot;

import com.ctre.phoenixmotorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SerialPort;

import edu.wpi.first.wpilibj.I2C.Port;
import frc.robot.sensors.Navx;

public class RobotMap {
    public RobotMap() {

    }

public static int leftMasterid = 07;
public static int leftFollower1id = 08;
public static int leftFollower2id = 06;
public static int rightMasterid = 02;
public static int rightFollower1id = 03;
public static int rightFollower2id = 01;
public static int rightIntakeid = 10;
public static int leftIntakeid = 09;
public static TalonSRX leftFollower =new TalonSRX(leftFollower1id);
public static TalonSRX leftMaster =new TalonSRX(leftMasterid);
public static TalonSRX rightMaster =new TalonSRX(rightMasterid);
public static TalonSRX rightFollower =new TalonSRX(rightFollower1id);
public static TalonSRX rightIntake =new TalonSRX(rightIntakeid);
public static TalonSRX leftIntake =new TalonSRX(leftIntakeid);


}
