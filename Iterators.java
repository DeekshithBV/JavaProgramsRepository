import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterators {
    static Iterator func(ArrayList myList){
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object object = it.next();
            if (object.equals("###")){
                break;
            }
        }
        return it;
    }
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i=0;i<n;i++){
            arrayList.add(scanner.nextInt());
        }
        arrayList.add("###");
        for (int i=0;i<m;i++){
            arrayList.add(scanner.next());
        }

        Iterator iterator = func(arrayList);
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println((String) object);
        }
    }
}
