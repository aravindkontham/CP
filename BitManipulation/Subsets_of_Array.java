package CP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets_of_Array {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num = 0; num < (1 << n) ; num++) {
            List<Integer> li = new ArrayList<>();
            for (int bit = 0; bit < n; bit++) {
                if ((num & (1 << bit)) != 0) {
                    li.add(arr[bit]);
                }
            }
            ls.add(new ArrayList<>(li));
        }
        System.out.print("The subsets are: ");
        for (List<Integer> subset : ls) {
            System.out.print(subset+" ");
        }

    }
}
