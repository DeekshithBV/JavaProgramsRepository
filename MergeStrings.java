import java.util.Scanner;

public class MergeStrings {
    String s1,s2;
    int len1, len2, maxLen;
    public StringBuilder mergeStrings(){
        System.out.println("Enter the string1: ");
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.next();
        System.out.println("Enter the string2: ");
        s2 = scanner.next();
        len1 = s1.length();
        len2 = s2.length();
        StringBuilder res = new StringBuilder();
        maxLen = Math.max(len1, len2);
        for (int i=0; i<maxLen; i++){
            if (i<len1) {
                res.append(s1.charAt(i));
            }
            if (i<len2){
                res.append(s2.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args){
        MergeStrings mergeStrings = new MergeStrings();
        System.out.println(mergeStrings.mergeStrings());
    }
}
