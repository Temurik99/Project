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
        return roundedToHundredth(D);
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
        String fraction = (int) numerator + "/" + (int) denominator;
        int slope = (int) numerator / (int) denominator;
        double intercept = yIntercept();
        String interceptString;


        if (intercept < 0) {
            interceptString = " - " + roundedToHundredth(Math.abs(intercept));
        } else {
            interceptString = " + " + roundedToHundredth(intercept);
        }

        if (slope() == 0 && intercept == 0) {
            return "y = 0";
        }
        else if (slope() != 0 && intercept == 0) {
            return "y = " + fraction + "x";
        }

        if (Y2 == Y1) {
            return "y = " + roundedToHundredth(intercept);
        }
        else if (numerator % denominator == 0) {
            if (slope == 1) {
                return "y = x" + interceptString;
            } else if (slope == -1) {
                return "y = -x" + interceptString;
            }
            return "y = " + slope + "x" + interceptString;
        }
        else if (slope == -1) {
            return "y = -x" + interceptString;
        }
        else {
            int indexSlash = fraction.indexOf("/");

            if (fraction.substring(0, 1).equals("-") && fraction.substring(indexSlash + 1, indexSlash + 2).equals("-")) {
                fraction = fraction.substring(1, indexSlash) + "/" + fraction.substring(indexSlash + 2);
            } else if (fraction.substring(indexSlash + 1, indexSlash + 2).equals("-") && !fraction.substring(0, 1).equals("-")) {
                fraction = "-" + fraction.substring(0, indexSlash) + "/" + fraction.substring(indexSlash + 2);
            }

            return "y = " + fraction + "x" + interceptString;
        }
    }



    public String coordinateForX(double x) {

        double yCoordinate = ((x) * slope()) + yIntercept();
        return "(" + roundedToHundredth(x) + ", " + roundedToHundredth(yCoordinate) + ")";
    }

    public String lineInfo() {

        return"The two points are: " + "(" + X1 + ", " + Y1 + ")" + " and " + "(" + X2 + ", " + Y2 + ")\n" + "The equation of the line between these" + " points is: " + equation() + "\n" + "The y-intercept of this line is: " + roundedToHundredth(yIntercept()) +"\n" + "The slope of this line is: " + roundedToHundredth(slope()) + "\n" + "The distance between the two points is: " + distance() + "\n";
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }


}

