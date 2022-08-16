public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 74;
        int height = 172;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }

}

