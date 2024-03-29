import java.util.Scanner;
import java.util.Vector;

public class Candies {
    int n, max=0;
    Vector<Boolean> arrVector = new Vector<>();
    Scanner scanner = new Scanner(System.in);

    private Vector<Boolean> returnTotalCandies(int[] arr, int exCandies){
        n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i=0; i<n; i++){
            if (arr[i] == max)
                arrVector.add(true);
            else {
                if (arr[i]+exCandies >= max)
                    arrVector.add(true);
                else arrVector.add(false);
            }
        }
        return arrVector;
    }
    public static void main(String[] args){
        System.out.println("Enter the no of Kids: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Enter the no of candies for each kid: ");
        int[] arr = new int[m];
        for (int i=0; i<m; i++){
            arr[i] = scanner.nextInt();
        }
        Candies candies = new Candies();
        System.out.println(candies.returnTotalCandies(arr,4));
    }
}
