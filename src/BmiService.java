public class BmiService {
    public double calculate(double height, int weight) {
        double result;
        return weight / (height * height);
    }
}