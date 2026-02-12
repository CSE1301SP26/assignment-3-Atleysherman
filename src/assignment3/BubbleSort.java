import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("How many items to sort?");
    int n=scan.nextInt();
    int[] numList= new int[n];
    
    for (int i=0;i<n;i++){
        
        System.out.println("number for spot "+(i+1));
        int nextNum= scan.nextInt();
        numList[i]=nextNum;

        }

    for (int p=0; p<n;p++)
        for (int j=0; j<(n-1); j++){
            int firstNum=numList[j];
            int secondNum=numList[(j+1)];
            if (firstNum>secondNum){
                numList[j]=secondNum;
                numList[(j+1)]=firstNum;
            }


    }
    for (int i=0;i<n;i++){
        
        System.out.print(numList[i]+ " ");
    

    }

}}