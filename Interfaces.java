import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
interface one{

}
interface two{

}
class Interfaces implements AdvancedArithmetic,one,two{
    @Override
    public int divisor_sum(int n) {
        int res = 0;
        for (int i=1; i<n; i++){
            if (n%i == 0)
                res+=i;
        }
        res+=n;
        return res;
    }
}
class Solution{
    public static void main(String[] args){
        Interfaces interfaces = new Interfaces();
        System.out.print("I implemented : ");
        ImplementedInterfaceNames(interfaces);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(interfaces.divisor_sum(n));
        scanner.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}