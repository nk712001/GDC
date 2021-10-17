import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n1=input.nextInt();

        System.out.println("Enter a number: ");
        int n2=input.nextInt();

        int GDC=(n1<n2)?n1:n2;
        while (true){
            if (n1 % GDC == 0 && n2 % GDC == 0){
                System.out.println("the GDC of "+n1+" and "+n2+" is "+GDC);
                break;
            }else {
              --GDC;
            }
        }
    }
}
