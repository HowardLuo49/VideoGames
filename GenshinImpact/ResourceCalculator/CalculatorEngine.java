import java.util.*;

public class CalculatorEngine {

	static final int FIVE = 1;
	static final int FOUR = 2;
	static final int THREE = 3;
	static final int HAMSTRING = 4;
	static final int QUIT = 5;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.out.println("What is your desperate situation?");
		
		int situation = getSituation();
		
		while(situation != QUIT)
		{
			if(situation < 1 || situation > 5)
			{
				System.out.println("________________________________________________________________");
				System.out.println("Type a valid bloody number u doofus");
				System.out.println("________________________________________________________________");
			}
			if(situation == HAMSTRING)
			{
				System.out.println("________________________________________________________________");
				System.out.println("Hamstring is not on a currently featured banner");
				System.out.println("________________________________________________________________");
			}
			else
			{
				switch (situation)
				{
					case FIVE: System.out.println(); fiveStar(); break;
					case FOUR: System.out.println(); fourStar(); break;
					case THREE: System.out.println(); threeStar(); break;
					default: break;
				}
			}
			situation = getSituation();
		}
	}
	
	public static int getSituation() {
		System.out.println();
		System.out.println(FIVE + ". Pulling 5 star");
		System.out.println(FOUR + ". Pulling 4 star");
		System.out.println(THREE + ". Pulling 3 star");
		System.out.println(HAMSTRING + ". Pulling hamstring");
		System.out.println(QUIT + ". QUIT");
		System.out.print("\tEnter choice # => ");
		return (Integer.parseInt(scanner.nextLine()));
	}
	
	public static void fiveStar()
	{
		FiveStar.main();
	}
	
	public static void fourStar()
	{
		FourStar.main();
	}
	
	public static void threeStar()
	{
		System.out.println("Debate club all day every day");
	}
}
