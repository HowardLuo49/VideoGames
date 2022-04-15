
public class FiveStarRoll {
	
	String[] fiveStarLimited = ArrayWork.arrayize("LimitedFiveStars");
	String[] fiveStarPermanent = ArrayWork.arrayize("PermanentFiveStars");
	
	String status = null;
	String banner;
	String wish;
	boolean guarantee = false;
	int pulls;
	int pullCounter;
	
	int successfulSimulation = 0;
	int wow = 0;
	boolean guar = guarantee;
	boolean pulledFakeFiveStar = false;
	boolean success = false;
	
	double fiveRate = 0.6;
	double fiveRate2 = 32.4;
	int fakeFiveStarCounter = 0;
	int pullNum = pullCounter;
	
	public void limited(int simulationCount)
	{		
		for(int i = 0; i < simulationCount; i++)
		{
			for(int j = 0; j < pulls; j++)
			{
				pullNum++;
				double state = Math.random() * 100;
				if((((pullNum < 75 && state < fiveRate) || (pullNum >= 75 && state < fiveRate2)) || pullNum == 90) && !success)
				{
					pullNum = 0;
					simFlip();
				}
			}
			if(pulledFakeFiveStar)
				fakeFiveStarCounter++;
			pullNum = pullCounter;
			guar = guarantee;
			pulledFakeFiveStar = false;
			success = false;
		}
		System.out.println("________________________________________________________________");
		System.out.println(((double) successfulSimulation) / simulationCount * 100.0 + "% chance of 5* without fakes");
		System.out.println(((double) fakeFiveStarCounter) / simulationCount * 100.0 + "% chance of losing coinflip");
		System.out.println(((double) wow) / simulationCount * 100.0 + "% chance of losing coniflip, but still getting desired 5*");
		System.out.println((double) (simulationCount - successfulSimulation - fakeFiveStarCounter - wow) / simulationCount * 100.0 + "% chance of no 5*");
		System.out.println("________________________________________________________________");
		System.exit(0);
	}
	
	private void simFlip()
	{
		if(guar)
		{
			if(!guarantee && pulledFakeFiveStar)
			{
				wow++;
				pulledFakeFiveStar = false;
			}
			else
				successfulSimulation++;
			success = true;
		}
		else
		{
			int flip = (int) (Math.random() * 100);
			if(flip < 50)
			{
				successfulSimulation++;
				success = true;	
			}
			else
			{
				guar = true;
				pulledFakeFiveStar = true;
			}
		}
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
					if(( pullNum == 90 || (pullNum < 75 && state < fiveRate) || (pullNum >= 75 && state < fiveRate2)) && !success)
					{
						pullNum = 0;
						double state2 = Math.random() * 100;
						{
							if(state2 < 50)
							{
								double state3 = Math.random() * 100;
								if(state3 < 20)
								{
									if(!pulledFakeFiveStar)
										successfulSimulation++;
									else
										wow++;
									success = true;
								}
								else
									pulledFakeFiveStar = true;
							}
							else
								pulledFakeFiveStar = true;
						}
					}
				}
				if(pulledFakeFiveStar && !success)
					fakeFiveStarCounter++;
				pullNum = pullCounter;
				pulledFakeFiveStar = false;
				success = false;
			}
			System.out.println("________________________________________________________________");
			System.out.println(((double) successfulSimulation) / simulationCount * 100.0 + "% chance of getting desired 5* without fakes");
			System.out.println(((double) wow) / simulationCount * 100.0 + "% chance of getting desired 5* with fakes");
			System.out.println((double) fakeFiveStarCounter / simulationCount * 100.0 + "% chance of getting fake 5*");
			System.out.println((double) (simulationCount - successfulSimulation - fakeFiveStarCounter - wow) / simulationCount * 100.0 + "% chance of no 5*");
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
