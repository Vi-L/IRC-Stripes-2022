package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

public class rotateArm extends CommandBase{
    Arm arm;
    double speed;

    rotateArm(Arm a, double s) {
        arm = a;
        speed = s;

        addRequirements(arm);
    }

    public void execute() {
        arm.rotate(speed);
    }
}