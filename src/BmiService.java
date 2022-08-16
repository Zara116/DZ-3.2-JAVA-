public class BmiService {
    public int calculate(double weight, double height) {
        double height2 = (height / 100);
        double height3 = height2 * height2;
        double bmi = (weight / height3);


        return (int) bmi;

    }

    {


    }
}
