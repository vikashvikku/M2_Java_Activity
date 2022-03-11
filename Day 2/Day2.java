//cricket score card
import java.util.Scanner;


class code1
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String first = a.nextLine();
        System.out.println("Enter session:\r");
        String second=a.nextLine();
        String A= " to win";
        System.out.println("Enter runs:\r");
        int runs=a.nextInt();
        if(second.equals("First") || second.equals("first") || second.equals("1"))
        {
            
            System.out.println("Name:" + first);
            System.out.println("Scored:" + runs);
            System.out.println("Need " + ++runs + A);
        }
       else if(second.equals("second") || second.equals("Second") || second.equals("2"))
       {
           System.out.println("Name:" + first);
           System.out.println("Scored:"+ runs);
           System.out.println("Matched Ended.");
       }
       else
       {
        System.out.println("Invalid Input.");
       }

    }

}