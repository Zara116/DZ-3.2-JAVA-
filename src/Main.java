public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m=74;
        int h=172;
        int bmi= service.calculate(m,h);
                System.out.println(bmi);
    }

}

