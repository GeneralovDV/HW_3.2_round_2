public class BmiService {
    public double bmi() {
        double weight = 95;
        double height = 1.87;
        double index = weight / (height * height);
        return index;
    }
}
