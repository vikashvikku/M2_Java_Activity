import java.util.*;
import java.util.Scanner;
public class cricket_Match
{

Scanner sc=new Scanner(System.in);
private String team_name;
private String opponent_name;
private String innings_name;
private int runs;

public void setTeam_name(String teamname)
{
this.team_name=teamname;
}
public void setOpponent_name(String oppname)
{
    this.opponent_name=oppname;
}
public void setInnings_name(String inningsname)
{
this.innings_name=inningsname;
}
public void setRuns(int runs)
{
this.runs=runs;
}
public String getTeam_name()
{
return this.team_name;
}
public String getOpponent_name()
{
return this.opponent_name;
}
public String getInnings_name()
{
return this.innings_name;
}
public int getRuns()
{
return this.runs;
}
void Values()
{
System.out.println("Enter the team name:");
team_name=sc.next();
System.out.println("Enter the opp name:");
opponent_name=sc.next();
System.out.println("Enter session:");
innings_name=sc.next();
System.out.println("Enter runs:");
runs=sc.nextInt();
}
void displayValues()
{
System.out.println("Name:"+this.team_name);
System.out.println("Scored:"+this.runs);
if(this.innings_name.equalsIgnoreCase("First"))
{
runs=runs+1;
System.out.printf(this.opponent_name+" Need %d to win",runs);
}
else
{
System.out.println("Match Ended");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
cricket_Match crkt= new cricket_Match();
crkt.Values();
crkt.displayValues();
}
}