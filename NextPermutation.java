import java.util.Arrays;
import java.util.Scanner;

class NextPermutation {
    int n, value;
    boolean isLargestLex = true;
    public void returnsArray(){
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] array = new int[n];
        int[] resultArray = new int[n];
        System.out.println("Enter the array values: ");
        for (int i=0; i<n; i++){
            value = scanner.nextInt();
            array[i] = value;
        }
        System.out.println("The next permutation of the entered array is:");
        for (int i=0; i<n-1; i++){
            if (array[i] < array[i+1]){
                isLargestLex = false;
                break;
            }
        }
        if (isLargestLex){
            for (int i=0; i<n; i++){
                resultArray[n-i-1] = array[i];
            }
            System.out.println(Arrays.toString(resultArray));
            return;
        }

        for (int i=n-1; i>0; i--){
            if (array[i] > array[i-1]){
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                System.out.println(Arrays.toString(array));
                return;
            } else if (array[i-1] > array[i-2]) {
                int temp = array[i-1];
                array[i-1] = array[i-2];
                array[i-2] = temp;
                if (array[i-1] > array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
                System.out.println(Arrays.toString(array));
                return;
            }
        }
    }

    public static void main(String args[]){
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.returnsArray();
    }
}
