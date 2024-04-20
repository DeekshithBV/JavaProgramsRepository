import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int no_array_lists = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList2D =
                new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < no_array_lists; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int columns = scanner.nextInt();
            for (int j = 0; j < columns; j++) {
                int element = scanner.nextInt();
                row.add(element);
            }
            // Add the row to the 2D ArrayList
            arrayList2D.add(row);
        }

        int no_of_queries = scanner.nextInt();
        int arr[][] = new int[no_of_queries][2];
        for(int i=0; i<no_of_queries; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<no_of_queries; i++){
            int index = arr[i][0], valIndex = arr[i][1];
            if(valIndex <= arrayList2D.get(index-1).size()){
                int searchElement = arrayList2D.get(index-1).get(valIndex-1);
                if (arrayList2D.get(index-1).contains(searchElement)) {
                    System.out.println(searchElement);
                }
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}