package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import static java.lang.Math.atan;
import static java.lang.Math.round;
import static java.lang.Math.tan;
import static java.lang.Thread.sleep;
/**
 * Created by christinahsia on 4/16/18.
 */

@TeleOp(name="MWDTeleop: Teleop", group="MWD")
public class MWDTeleOp extends OpMode{
    HardwareMWD robot  = new HardwareMWD();
    @Override
    public void init() {
        telemetry.addData("Say", "Initialized");
        robot.init(hardwareMap);
        telemetry.addData("Say", "Hello Driver");
        telemetry.update();
    }
    @Override
    public void init_loop() {}
    @Override
    public void start() {}
    @Override
    public void loop() {
        //theloop
    }
    @Override
    public void stop() {
    }
}
