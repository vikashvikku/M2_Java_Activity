import java.util.*;
public abstract class Match{
 private int currentScore;
 private float currentOver;
 private int target;

public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

 public int getCurrentScore() {
	return currentScore;
}

public void setCurrentScore(int currentScore) {
	this.currentScore = currentScore;
}

public float getCurrentOver() {
	return currentOver;
}

public void setCurrentOver(float currentOver) {
	this.currentOver = currentOver;
}

public int getTarget() {
	return target;
}

public void setTarget(int target) {
	this.target = target;
}
 abstract float calculateRunRate();
 abstract float calculateBalls();
 abstract void display();
}
class ODIMatch extends Match{

public ODIMatch() {
		super();
		// TODO Auto-generated constructor stub
		
	}



	//@Override
	float calculateRunRate() {
		// TODO Auto-generated method stub
		return ((getTarget()-getCurrentScore())/(50-getCurrentOver()));
		
	}

	//@Override
	float calculateBalls() {
		// TODO Auto-generated method stub
		
		return 6*(50-getCurrentOver());
	}
	
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}

}
class TestMatch extends Match{
public TestMatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Override
	float calculateRunRate() {
		return ((getTarget()-getCurrentScore())/(90-getCurrentOver()));
	}
	//@Override
	float calculateBalls() {
		// TODO Auto-generated method stub
		return 6*(90-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}

}
class T20Match extends Match{
public T20Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Override
	float calculateRunRate() {
	
			return ((getTarget()-getCurrentScore())/(20-getCurrentOver()));
			}
	//@Override
	
	float calculateBalls() {
		// TODO Auto-generated method stub
		return 6*(20-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}

}
class MatchMain{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Match Format");
		System.out.println("1.ODI\n2.T20\n3.Test");
		
		int c = scanner.nextInt();
		
		System.out.println("Enter the Current Score");
		
		int cScore = scanner.nextInt();
		
		
		System.out.println("Enter the Current Over");
		
		float cOver = scanner.nextFloat();

		
		System.out.println("Enter the Target Score");
		
		int tScore = scanner.nextInt();
		
		System.out.println("Requirements:");
		
		switch(c)
		{
		case 1: ODIMatch o1 =new ODIMatch();
				o1.setCurrentScore(cScore);
				o1.setCurrentOver(cOver);
				o1.setTarget(tScore);
				o1.display();
			break;
			
		case 2: T20Match tt1 = new T20Match();
				tt1.setCurrentScore(cScore);
				tt1.setCurrentOver(cOver);
				tt1.setTarget(tScore);
				tt1.display();
			break;
		
		case 3: TestMatch t1 = new TestMatch();
				t1.setCurrentScore(cScore);
				t1.setCurrentOver(cOver);
				t1.setTarget(tScore);
				t1.display();
			break;
			
		default: System.exit(0);
		}
		
		scanner.close();
	}

}