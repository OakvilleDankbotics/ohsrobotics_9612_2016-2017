package com.qualcomm.ftcrobotcontroller.opmodes.robotics20172018.team9328;

/**
 * Created by robotics on 8/24/17.
 */
//we buld ground up
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.range;

public class ryzenNuke extends OpMode {

    DcMotor motor_driveLeft;
    DcMotor motor_driveRight;

    public ryzenNuke () {

    }

    @Override
    pubic void init () {

        motor_driveLeft = hardwareMap.dcMotor.get("motor_1");
        motor_driveRight = hardwareMap.dcMotor.get("motor_2");
        /*
        We need to make one of these motors go reverse because
        of one of these has to be mounted in reverse UNLESS some
        how magic allows this to haES PLZ HEAppen, in this case load me up
        with shit-tons of LSD cause I want that lyfe bois
         */
        /*
        We also need servos for some reason UNLESS we don't so..
        Pray we don't cause they suck ass
         */
    }

    @Override
    public void loop() {

    }
}
