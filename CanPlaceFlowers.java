import java.util.Scanner;

public class CanPlaceFlowers {
    int m, newFlowersToPlant;
    public boolean can_place_flowers(){
        System.out.println("Enter the array size: ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the planted flowers: ");
        for (int i=0; i<m; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter new flowers to plant: ");
        newFlowersToPlant = scanner.nextInt();
        boolean isNewFlowersValid = (newFlowersToPlant>=1 && newFlowersToPlant<=m);

        if ((m==1 && arr[0] == 0 && isNewFlowersValid) || (m==2 && arr[0] == 0 && arr[1] == 0 && isNewFlowersValid)){
            arr[0] = 1;
            newFlowersToPlant--;
        }
        for (int i=0; i<m-2; i++){
            if (newFlowersToPlant == 0){
                break;
            }
            if (arr[0]==0 && arr[1]==0){
                arr[0] = 1;
                newFlowersToPlant--;
            }
            else if (arr[m-2]==0 && arr[m-1]==0){
                arr[m-1] = 1;
                newFlowersToPlant--;
            }
            else if (arr[i] == 0 && arr[i+1] == 0 && arr[i+2] == 0){
                arr[i+1] = 1;
                newFlowersToPlant--;
            }
        }
        System.out.println("After planting new flowers: ");
        for (int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return newFlowersToPlant == 0;
    }
    public static void main(String[] args){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.can_place_flowers());
    }
}
