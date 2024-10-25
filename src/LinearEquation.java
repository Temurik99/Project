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


    private double distance() {
        double D = Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2));
        return D;
    }




    private double slope() {
        double S = ((double)Y2 - Y1) / (X2 - X1);
        return S
    }




    private double yIntercept() {


        double B =
        double slope = 1.0 * (Y2 - Y1) / (X2 - X1);
    }
}

