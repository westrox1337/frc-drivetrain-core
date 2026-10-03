public class Robot {

    private boolean isAutonomous = false;
    private double driveSpeed = 0.0;

    public void robotInit() {
        System.out.println("[WPILib Core] Robot subsystem initialized successfully.");
        System.out.println("[WPILib Core] Differential Drive Controllers Ready.");
    }

    public void autonomousInit() {
        isAutonomous = true;
        driveSpeed = 0.5;
        System.out.println("[Auton] Autonomous mode started with target speed: " + driveSpeed);
    }

    public void teleopPeriodic() {
        isAutonomous = false;
        System.out.println("[Teleop] Driver control active. Telemetry running...");
    }

    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.robotInit();
        myRobot.autonomousInit();
        myRobot.teleopPeriodic();
    }
}
