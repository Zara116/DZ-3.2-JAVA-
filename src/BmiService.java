public class BmiService {
    public int calculate(double m, double h) {
        double h2=(h/100);
        double h3=h2*h2;
        double bmi = (m/h3);



        return (int) bmi;

    }

    {


    }
}
