public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.bmi();
        System.out.println(index);
    }
}
