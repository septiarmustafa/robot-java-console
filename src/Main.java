import model.RobotImpl;
import util.Direction;
import util.Step;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RobotImpl robot = new RobotImpl();

        String start = input.nextLine();
        String[] arrStart = start.split(",");

        String step = input.nextLine();
        String[] arrStepCommand = step.split("");

        Step stepCommand;

        for (int j = 0; j < arrStart.length; j++) {
            robot.setX(Integer.parseInt(String.valueOf(arrStart[1])));
            robot.setY(Integer.parseInt(String.valueOf(arrStart[2])));
            robot.setDirection(Direction.valueOf(arrStart[0]));
            }

        for (String s : arrStepCommand) {
            stepCommand = Step.valueOf(s);
            switch (stepCommand) {
                case A:
                    robot.forward();
                    System.out.printf("%s -> (%d,%d)\n", stepCommand, robot.getX(), robot.getY());
                    break;
                case L:
                    robot.turnLeft();
                    System.out.printf("%s -> (%d,%d)\n", stepCommand, robot.getX(), robot.getY());
                    break;
                case R:
                    robot.turnRight();
                    System.out.printf("%s -> (%d,%d)\n", stepCommand, robot.getX(), robot.getY());
                    break;
                default:
                    System.out.println("Invalid command input");
            }
        }
    }
}