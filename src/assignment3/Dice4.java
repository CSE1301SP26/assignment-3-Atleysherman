import java.util.Scanner;
public class Dice4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("how many dice?");
        int n = scan.nextInt();
        int[] dicerolls = new int [n];
        int [] vals = new int [(5*n+1)];
        int sum = 0;
        System.out.print("how many rolls");
        int rn=scan.nextInt();


    for (int j=0; j<rn; j++){
        for (int i=0; i<n; i++){
            dicerolls[i] = (int)(Math.random() * 6) + 1;
            sum+=dicerolls[i];}

        vals[sum-n]+=1;
        
        sum =0;
                

            
     }
     for(int k =0;k<5*n+1;k++)
        System.out.println("the amount of times "+ (k+n) + "was rolled is "+vals[k] );
    }

    }
