package Bhuvana;
import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 4, 5, 6};
        int max = arrNum[arrNum.length - 1];
        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 1; i < max; i++) {
            boolean isFound = false;
            for (int num : arrNum) {
                if (i == num) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                missingNumbers.add(i);
            }
        }

        System.out.print("Missing numbers in the array: ");
        for (int missingNum : missingNumbers) {
            System.out.print(missingNum + " ");
        }
    }
}

