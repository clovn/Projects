public class MaclSer{
    public static void main(String[] args) {
        String func = args[0];
        double x = Double.parseDouble(args[1]);
        double res = 0.0;
        boolean right = false;

        if ("sin".equals(func)) {
            double rads = Utils.degreesToRadians(x);
            res = Utils.sin(rads);
            right = Utils.isRight(res, Math.sin(rads));
        } else if ("cos".equals(func)) {
            double rads = Utils.degreesToRadians(x);
            res = Utils.cos(rads);
            right = Utils.isRight(res, Math.cos(rads));
        } else if ("e".equals(func)) {
            res = Utils.e(x);
            right = Utils.isRight(res, Math.pow(Math.E, x));
        } else if ("ln1".equals(func)) {
            res = Utils.ln1(x);
            right = Utils.isRight(res, Math.log1p(x));
        }

        System.out.println(res + " " + right);
    }
}

class Utils{
    final static double ESP = 1e-10;


    public static double degreesToRadians(double degrees){
        return (degrees * Math.PI) / 180.0;
    }

    public static boolean isRight(double result, double right){
        return Math.abs(result - right) < 1e-7;
    }

    public static double e(double x){
        double result = 0;
        long fact = 1;
        int ser = 1;
        double deg = 1;
        double term = deg / fact;

        while (Math.abs(term)> ESP && ser < 20){
            result += term;
            fact *= ser;
            ser += 1;
            deg *= x;
            term =  deg / fact;
        }

        return result;
    }

    public static double sin(double x) {
        double result = 0;
        long fact = 1;
        int ser = 1;
        int sign = 1;
        double deg = x;
        double term = sign * deg / fact;
        while (Math.abs(term)>ESP && ser < 20){
            result += term;
            ser += 1;
            fact *= (2*ser - 1)* (2*ser - 2);
            sign = -1 * sign;
            deg *= x * x;
            term = sign * deg / fact;
        }

        return result;
    }

    public static double cos(double x) {
        double result = 0;
        long fact = 1;
        int ser = 1;
        int sign = 1;
        double deg = 1;
        double term = sign * deg / fact;

        while (Math.abs(term)>ESP && ser < 20){
            result += term;
            fact *= ser*(ser + 1);
            ser += 1;
            sign = -1 * sign;
            deg *= x * x;
            term = sign * deg / fact;
        }

        return result;
    }

    public static double ln1(double x){
        double result = 0;
        long fact = 1;
        int ser = 1;
        int sign = 1;
        double deg = x;
        double term = sign * deg / ser;


        while (Math.abs(term) > ESP && ser < 20){
            result += term;
            ser += 1;
            sign = -1 * sign;
            deg *= x;
            term = sign * deg / ser;
        }

        return result;
    }

}