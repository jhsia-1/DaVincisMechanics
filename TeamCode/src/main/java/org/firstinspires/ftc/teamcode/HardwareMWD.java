package org.firstinspires.ftc.teamcode;
import android.graphics.Color;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.IntegratingGyroscope;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

//MWD stands for mecanum wheel drive
public class HardwareMWD {
    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();
    public HardwareMWD(){}
    public void init(HardwareMap ahwMap) {

        hwMap = ahwMap;

    }
}
