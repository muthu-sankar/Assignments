import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year to check\t");
        int year = in.nextInt() ;
        if(((year%4==0) && (year%100!=0))||(year%400==0))
            System.out.println(year+"\tIs A leap year");
        else
            System.out.println(year+"\t Is Not A Leap Year");
    }
}