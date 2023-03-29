import java.util.Scanner;

public class Salary {
    public static void main(String args[])
    {
        double basic,da,hra,ta,pf,gross;
        System.out.println("Enter Basic salary of the employee\n");
        Scanner scanner;
        scanner = new Scanner(System.in);
        basic= scanner.nextDouble();
        da=8*basic/100;
        hra=10*basic/100;
        ta=9*basic/100;
        pf=20*basic/100;
        gross= basic+da+hra+ta-pf;
        System.out.println("The D.A of the basic salary of the employee is:" +da);
        System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
        System.out.println("The TA of the basic salary of the employee is:" +ta);
        System.out.println("The PF of the basic salary of the employee is:" +pf);
        System.out.println("The Gross salary of the employee is:" +gross);
    }
}
