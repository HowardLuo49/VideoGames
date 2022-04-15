import java.util.*;

public class FiveStar {
	
	static Scanner scanner = new Scanner(System.in);
	
	static String[] fiveStarLimited = ArrayWork.arrayize("LimitedFiveStars");
	static String[] fiveStarPermanent = ArrayWork.arrayize("PermanentFiveStars");
	static int simulationCount;
	
	public static void main() {
		// TODO Auto-generated method stub		
		
		FiveStarRoll soul = new FiveStarRoll();
		
		System.out.println("Who are you pulling for?");
		soul.wish = scanner.nextLine();
		
		for(int i = 0; i < fiveStarPermanent.length; i++)
		{
			if(fiveStarPermanent[i].equalsIgnoreCase(soul.wish))
				soul.status = "permanent";
		}
		for(int i = 0; i < fiveStarLimited.length; i++)
		{
			if(fiveStarLimited[i].equalsIgnoreCase(soul.wish))
				soul.status = "limited";
		}
		if(soul.status == null)
		{
			System.out.println("You are terrible at spelling");
			System.exit(0);
		}
		
		System.out.println("Which banner are you pulling on?");
		soul.banner = scanner.nextLine();
		
		if(soul.banner.equalsIgnoreCase("standard") && soul.status.equals("limited"))
		{
			System.out.println("________________________________________________________________");
			System.out.println("Hah good luck");
			System.out.println("________________________________________________________________");
			System.exit(0);
		}
		else if(soul.banner.equalsIgnoreCase("limited") && soul.status.equals("permanent"))
		{
			System.out.println("________________________________________________________________");
			System.out.println("Your summoning decision sicken me so much I refuse to do the calculations");
			System.out.println("________________________________________________________________");
			System.exit(0);
		}
		
		if(soul.banner.equalsIgnoreCase("limited"))
		{
			System.out.println("Do you have the coinflip guarantee? (yes/no)");
			if(scanner.nextLine().equals("yes"))
				soul.guarantee = true;
		}
		
		System.out.println("How many pulls are you willing to spend?");
		soul.pulls = Integer.parseInt(scanner.nextLine());
		
		System.out.println("How many pulls have you done since last pity?");
		soul.pullCounter = Integer.parseInt(scanner.nextLine());
		
		if(soul.guarantee == true && soul.pulls > 90 - soul.pullCounter || soul.pulls > 180 - soul.pullCounter)
		{
			System.out.println("Why tf are you using this program are you incapable of 2nd grade math");
			System.exit(0);
		}
		
		System.out.println("How many simulations do you wish to do?");
		simulationCount = Integer.parseInt(scanner.nextLine());
		
		if(soul.status.equals("limited"))
			soul.limited(simulationCount);
		else
			soul.permanent(simulationCount);
	}		
}
