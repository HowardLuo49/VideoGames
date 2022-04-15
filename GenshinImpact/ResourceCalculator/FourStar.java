import java.util.*;

public class FourStar {

	static Scanner scanner = new Scanner(System.in);
	
	static String[] fourStar = ArrayWork.arrayize("UpdateFourStars");
	static int simulationCount;
	
	public static void main() {
		// TODO Auto-generated method stub		
		
		FourStarRoll soul = new FourStarRoll();
		
		System.out.println("How many 4* do you desire?");
		soul.desiredCount = Integer.parseInt(scanner.nextLine());
		if(soul.desiredCount > fourStar.length)
		{
			System.out.println("You greedy butt");
			System.exit(0);
		}
		
		soul.wish = new String[soul.desiredCount];
		soul.verification = new boolean[soul.desiredCount];
		soul.successes = new boolean[soul.desiredCount];
		
		for(int i = 1; i < soul.desiredCount + 1; i++)
		{
			System.out.println("Character #" + i + "?");
			soul.wish[i - 1] = scanner.nextLine();
		}
		
		for(int i = 0; i < fourStar.length; i++)
		{
			for(int j = 0; j < soul.wish.length; j++)
			{
				if(fourStar[i].equalsIgnoreCase(soul.wish[j]))
					soul.verification[j] = true;
			}
		}
		for(int i = 0; i < soul.verification.length; i++)
		{
			if(!soul.verification[i])
			{
				System.out.println("You are terrible at spelling");
				System.exit(0);
			}
		}
		
		System.out.println("Which banner are you pulling on?");
		soul.banner = scanner.nextLine();
			
		if(soul.banner.equalsIgnoreCase("limited"))
		{
			System.out.println("Do you care about 5*? (yes/no)");
			String dodge = scanner.nextLine();
			
			if(dodge.equalsIgnoreCase("yes"))
			{
				soul.care = true;
				
				System.out.println("Do you have the 5* coinflip guarantee? (yes/no)");
				if(scanner.nextLine().equals("yes"))
					soul.guarantee = true;
				
				System.out.println("How many pulls have you done since last 5* pity?");
				soul.pullCounter = Integer.parseInt(scanner.nextLine());
			}
			else if(dodge.equalsIgnoreCase("no"))
				soul.care = false;
			else
			{
				System.out.println("You had two options and still managed to fail");
				System.exit(0);
			}
			
			for(int i = 1; i < 4; i++)
			{
				System.out.println("Who is rate up character #" + i + "?");
				String increased = scanner.nextLine();
				boolean contains = false;
				for(int j = 0; j < fourStar.length; j++)
				{
					if(fourStar[j].equalsIgnoreCase(increased))
						contains = true;
				}
				if(!contains)
				{
					System.out.println("I am disappointed you could not spell names");
					System.exit(0);
				}
				soul.rates[i-1] = increased;
			}
			
			System.out.println("Do you have the 4* coinflip guarantee? (yes/no)");
			if(scanner.nextLine().equals("yes"))
				soul.fourGuarantee = true;
		}

		System.out.println("How many pulls have you done since last 4* pity?");
		int four = Integer.parseInt(scanner.nextLine());
		if(four >= 10)
		{
			System.out.println("Even kindergarteners can count to 10");
			System.exit(0);
		}
		else
			soul.fourPullCounter = four;
		
		System.out.println("How many pulls are you willing to spend?");
		soul.pulls = Integer.parseInt(scanner.nextLine());
		
		System.out.println("How many simulations do you wish to do?");
		simulationCount = Integer.parseInt(scanner.nextLine());
		
		if(soul.banner.equals("limited"))
			soul.limited(simulationCount);
		else
			soul.permanent(simulationCount);
	}
}
