import java.util.Scanner;

public class Caluclator {
    public void add(double n1, double n2){
        System.out.printf("\nThe Addition of %.2f and %.2f is %.2f\n",n1,n2,n1+n2);
    }
    public void sub(double n1, double n2){
        System.out.printf("\nThe Subtraction of %.2f and %.2f is %.2f\n",n1,n2,n1-n2);
    }
    public void mul(double n1, double n2){
        System.out.printf("\nThe Multiplication of %.2f and %.2f is %.2f\n",n1,n2,n1*n2);
    }
    public void div(double n1, double n2){
        try {
            System.out.printf("\nThe division of %.2f by %.2f is %.2f\n",n1,n2,n1/n2);
        }catch (Exception e){//noinspection CallToPrintStackTrace
            e.printStackTrace();}
    }
    public void mod(double n1, double n2){
        System.out.printf("\nThe modulus of %.2f by %.2f is %.2f\n",n1,n2,n1%n2);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("\nEnter your choice + for Addition, - for Subtraction, * for Multiplication, / for Division, % for modulus, 0 for exit:");
            char ch = sc.next().charAt(0);
            if(ch == '0'){
                System.out.println("Bye!!!");
                break;
            }
            try{
                System.out.println("Enter first number:");
                double n1= sc.nextDouble();
                System.out.println("Enter second number:");
                double n2=sc.nextDouble();


                Caluclator c=new Caluclator();
                switch(ch){
                    case '+':c.add(n1,n2);
                        break;
                    case '-':c.sub(n1,n2);
                        break;
                    case '*':c.mul(n1,n2);
                        break;
                    case '/':c.div(n1,n2);
                        break;
                    case '%':c.mod(n1,n2);
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } catch (Exception e) {
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
            }
        }

    }
}
