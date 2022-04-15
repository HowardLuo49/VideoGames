
public class FourStarRoll {

	String[] fourStar = ArrayWork.arrayize("UpdateFourStars");
	
	String banner;
	boolean guarantee = false;
	boolean fourGuarantee = false;
	int pulls;
	int pullCounter;
	int fourPullCounter;
	int fourPullNum;
	
	int successfulSimulation = 0;
	int wow = 0;
	boolean guar = guarantee;
	boolean fourGuar = fourGuarantee;
	boolean pulledFiveStar = false;
	int fiveStarCounter = 0;
	boolean success = false;
	
	int desiredCount;
	String[] wish;
	boolean[] verification;
	boolean[] successes;
	boolean care;
	String[] rates = new String[3];
	
	double fiveRate = 0.6;
	double fiveRate2 = 32.4;
	double fourRate = 5.1;
	int pullNum = pullCounter;
	
	int allComplete = 0;
	boolean partial = false;
	int partialComplete = 0;
	boolean fakePartial = false;
	int fakePartialCounter = 0;
	
	public void limited(int simulationCount)
	{
		
	}
	
	public void permanent(int simulationCount)
	{
		if(banner.equalsIgnoreCase("standard"))
		{
			for(int i = 0; i < simulationCount; i++)
			{
				for(int j = 0; j < pulls; j++)
				{
					pullNum++;
					double state = Math.random() * 100;
					if(care)
					{
						
					}
					else
					{
						if((pullNum == 10 || state < fourRate) && !success)
						{
							fourPullNum = 0;
							int state2 = 0;
							state2 = (int) (Math.random() * fourStar.length);
							String pulledCharacter = fourStar[state2];
							boolean part = true;
							for(int k = 0; k < wish.length; k++)
							{
								if(wish[k].equalsIgnoreCase(pulledCharacter))
								{
									successes[k] = true;
									partial = true;
									part = false;
								}
							}
							if(part)
								fakePartial = true;
							boolean complete = true;
							for(int k = 0; k < successes.length; k++)
							{
								if(!successes[k])
									complete = false;
							}
							if(complete)
							{
								allComplete++;
								partial = false;
								success = true;
							}
						}
					}
				}
				if(fakePartial && !success && !partial)
					fakePartialCounter++;
				if(partial && !success)
					partialComplete++;
				if(pulledFiveStar && !success)
					fiveStarCounter++;
				fourPullNum = fourPullCounter;
				pullNum = pullCounter;
				fourGuar = fourGuarantee;
				guar = guarantee;
				pulledFiveStar = false;
				success = false;
				for(int k = 0; k < successes.length; k++)
					successes[k] = false;
				partial = false;
			}
			System.out.println("________________________________________________________________");
			System.out.println(((double) allComplete) / simulationCount * 100.0 + "% chance of getting all desired 4*");
			System.out.println(((double) partialComplete) / simulationCount * 100.0 + "% chance of getting some desired 4*");
			System.out.println(((double) fakePartialCounter) / simulationCount * 100.0 + "% chance of getting some fake 4*");
			System.out.println((double) (simulationCount - allComplete - partialComplete - fakePartialCounter) / simulationCount * 100.0 + "% chance of no 4*");
			System.out.println("________________________________________________________________");
			System.exit(0);
		}
		else
		{
			System.out.println("________________________________________________________________");
			System.out.println("You suck at spelling you bozo");
			System.out.println("________________________________________________________________");
			System.exit(0);
		}
	}
}
