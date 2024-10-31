public class LinearEquation {


    private int X1;
    private int Y1;
    private int X2;
    private int Y2;


    public LinearEquation(int X1, int  Y1, int X2, int Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }


    public double distance() {
        double D = Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2));
        return D;
    }




    public double slope() {
        double S = ((double)Y2 - Y1) / (X2 - X1);
        return S;
    }




    public double yIntercept() {
    double Y = Y1 - (slope() * X1);
    return Y;
    }

    public String equation() {

        double numerator = Y2 - Y1;
        double denominator = X2 - X1;

        if (Y2 == Y1) {
            return "y=" + yIntercept();
        } else {
            String fraction = (int) numerator + "/" + (int) denominator;
            return "y= " + fraction + "x" + " + " + yIntercept();
        }
    }

    public String coordinateForX(double x) {

        double yCoordinate = ((x) * slope()) + yIntercept();
        return "(" + x + "," + yCoordinate + ")";
    }

    public String lineInfo() {

        return "\nThe two points are: " + "(" + X1 + "," + Y1 + ")" + " and " + "(" + X2 + "," + Y2 + ")" +
                "\n The equation of the line between these" + " points is: " + equation() +
                "\n The y-intercept of this line is: " + yIntercept() +
                "\n The slope of this line is: " + slope() +
                "\n The distance between these points is " + distance();
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }


}

