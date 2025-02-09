import java.util.Arrays;
import java.util.Scanner;

public class temperatureconversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble();
        System.out.println(Arrays.toString(convert(celsius)));
    }
    public static double[] convert(double celsius) {
        double[] arr = new double[2];
        arr[0] = celsius + 273.15;//convert celsius to kelvin
        arr[1] = celsius * 1.80 + 32.00;//convert celsius to fahrenheit
        return arr;
    }
}
