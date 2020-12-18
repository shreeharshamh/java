import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class anArray {
    public static void main(String[] args) {
        int[] values = new int[4];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;

        for (int value : values) {
            System.out.println(value);
        }

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : numbers) {
            System.out.println(number + " times");
        }

        String[] str = new String[3];
        str[0] = "Rajeshwari";
        str[1] = "Harsha";
        str[2] = "Shwetha";

        for(int i=0; i< str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
