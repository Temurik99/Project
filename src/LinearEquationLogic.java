import java.util.Scanner;


public class LinearEquationLogic {


    Scanner scan = new Scanner(System.in);


    private String first = "";
    private String second = "";
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;




    public void start() {


        System.out.println ("Welcome to the linear equation calculator!");


    }


    public void getData() {


        System.out.print("Enter coordinate 1: ");
        first = scan.nextLine();


        System.out.print("Enter coordinate 2: ");
        second = scan.nextLine();
    }


    public void parseData() {
        int firstComma = first.indexOf(",");
        int secondComma = second.indexOf(",");
        X1 = Integer.parseInt(first.substring(1,firstComma));
        Y1 = Integer.parseInt(first.substring(firstComma + 1, second.length() - 1));
        X2 = Integer.parseInt(second.substring(1,secondComma));
        Y2 = Integer.parseInt(second.substring(secondComma + 1, second.length() - 1));
        LinearEquation line = new LinearEquation(X1, Y1, X2, Y2);
    }

