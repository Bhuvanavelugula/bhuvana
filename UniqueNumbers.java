
package Bhuvana;

    
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 2, 1, 3, 4, 3, 4, 1, 5, 3, 5};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : arrNum) {
            uniqueNumbers.add(num);
        }

        System.out.print("Unique numbers in the array: ");
        for (int uniqueNum : uniqueNumbers) {
            System.out.print(uniqueNum + " ");
        }
    }
}

