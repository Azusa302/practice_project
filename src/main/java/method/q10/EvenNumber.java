package method.q10;
 
import java.util.Arrays;
 
public class EvenNumber {

    public int getEvenNumbers(int[] a) {
        int count = 0;
        for (int number : a) {
            if (number % 2 == 0) { 
                count++;
            }
        }
        return count; 
    }

    public static void main(String[] args) {
        EvenNumber evenNumberCounter = new EvenNumber();

        int[] a = {3, 2, 5, 6, 7, 25, 10, 51, 88, 98};

        int evenCount = evenNumberCounter.getEvenNumbers(a);

        System.out.println(Arrays.toString(a) + "には、偶数が" + evenCount + "個あります。");
    }
}