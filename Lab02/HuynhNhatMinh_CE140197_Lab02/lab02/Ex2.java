package lab02;
 
import java.util.Scanner;
 
public class Ex2 {
    public static void main(String args[]) {
        Fibo();
    }
        public static void Fibo(){
            int a0, a1, a2, n;
        a0 = 1;
        a1 = 1;
         
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter number n: ");
            n = input.nextInt();
        }while(n <= 0);
         
        // in day Fibo
        System.out.printf("%d\t%d", a0, a1);
        a2 = a0 + a1;
        while(a2 <= n){
            System.out.printf("\t%d", a2);
            a0 = a1;
            a1 = a2;
            a2 = a0 + a1;
        }
 
    }
            
        }
        
