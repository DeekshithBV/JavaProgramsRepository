import java.util.Scanner;

public class GcdOfStrings {
    String s1,s2;
    private String gcd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the strings:");
        s1 = scanner.next();
        s2 = scanner.next();
        int max = Math.min(s1.length(),s2.length());
        return  ((s1 + s2).equals(s2 + s1)) ? s1.substring(0, max) : "";
    }
    public static void main(String[] args){
        GcdOfStrings gcdOfStrings = new GcdOfStrings();
        System.out.println(gcdOfStrings.gcd());
    }
}
