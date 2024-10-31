import java.util.Scanner;


public class LinearEquationLogic {


    private Scanner scan = new Scanner(System.in);
    private LinearEquation line;
    private String first = "";
    private String second = "";
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;


    public void start() {

        String answer = "y";

        while (answer.equals("y")) {
            System.out.println("Welcome to the linear equation calculator!");
            getData();
            parseData();
            System.out.println(line.lineInfo());

            System.out.print("Enter a value for x: ");
            double point = scan.nextDouble();

            System.out.println(line.coordinateForX(point));

            System.out.print("Would you like to enter another pair of coordinates? y/n:");
            answer = scan.nextLine();
        }

    }

    public void getData() {

        String notYet = "y";
        while (notYet.equals("y")) {

            System.out.print("Enter coordinate 1: ");
            first = scan.nextLine();

            System.out.print("Enter coordinate 2: ");
            second = scan.nextLine();

            int commaFirst = first.indexOf(",");
            int commaSecond = second.indexOf(",");

            if (first.substring(0, commaFirst).equals(second.substring(0, commaSecond))) {
                System.out.println("You can't enter two points with the same x value, try again");
            } else {
                notYet = "n";
            }
        }
    }


        public void parseData() {
            int firstComma = first.indexOf(",");
            int secondComma = second.indexOf(",");
            X1 = Integer.parseInt(first.substring(1, firstComma));
            Y1 = Integer.parseInt(first.substring(firstComma + 1, second.length() - 1));
            X2 = Integer.parseInt(second.substring(1, secondComma));
            Y2 = Integer.parseInt(second.substring(secondComma + 1, second.length() - 1));
            line = new LinearEquation(X1, Y1, X2, Y2);
        }
    }


