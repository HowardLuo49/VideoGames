import java.util.*;

public class Temporary {
	
	public void test()
	{
		int[] books = new int[6]; //0Freedom, 1Resistance, 2Ballad, 3Prosperity, 4Diligence, 5Gold
		int book = 0;
		
		int lvli = 0;
		int skill1i = 0;
		int skill2i = 0;
		int skill3i = 0;
		
		int lvlf = 0;
		int skill1f = 0;
		int skill2f = 0;
		int skill3f = 0;
		
		int moraCount = 0;
		int purpleBookCount;
		int weekly = 0;
		int specialty = 0;
		int ascension = 0;
		int boss = 0;
		int frag = 0;
		int crown = 0;
		
		//lvl
		int[] allLevels = new int[]{ 1000 ,	1325 ,	1700 ,	2150 ,	2625 ,	3150 ,	3725 ,	4350 ,	5000 ,	5700 ,	6450 ,	7225 ,	8050 ,	8925 ,	9825 ,	10750 ,	11725 ,	12725 ,	13775 ,	14875 ,	16800 ,	18000 ,	19250 ,	20550 ,	21875 ,	23250 ,	24650 ,	26100 ,	27575 ,	29100 ,	30650 ,	32250 ,	33875 ,	35550 ,	37250 ,	38975 ,	40750 ,	42575 ,	44425 ,	46300 ,	50625 ,	52700 ,	54775 ,	56900 ,	59075 ,	61275 ,	63525 ,	65800 ,	69125 ,	70475 ,	76500 ,	79050 ,	81650 ,	84275 ,	86950 ,	89650 ,	92400 ,	95175 ,	98000 ,	100875 ,	108950 ,	112050 ,	115175 ,	118325 ,	121525 ,	124775 ,	128075 ,	131400 ,	134775 ,	138175 ,	148700 ,	152375 ,	156075 ,	159825 ,	163600 ,	167425 ,	171300 ,   175225	,   179175 ,	183175 ,	216225 ,	243025 ,	273100 ,	306800 ,	344600 ,	386950 ,	434425 ,	487625 ,	547200};
		int expTotal = 0;
		for(int i = lvli - 1; i < lvlf - 1; i++)
		{
			expTotal += allLevels[i];
		}
		moraCount += expTotal;
		purpleBookCount = (expTotal / 4000) + 1;
		if(lvlf > 80 && lvli < 80)
		{
			frag += 6*3*3*3;
			boss += 20;
			specialty += 60;
			ascension += 24*3*3;
		}
		if(lvlf > 70 && lvli < 70)
		{
			frag += 6*3*3;
			boss += 12;
			specialty += 45;
			ascension += 12*3*3;
		}
		if(lvlf > 60 && lvli < 60)
		{
			frag += 3*3*3;
			boss += 8;
			specialty += 30;
			ascension += 18*3;
		}
		if(lvlf > 50 && lvli < 50)
		{
			frag += 6*3;
			boss += 4;
			specialty += 20;
			ascension += 12*3;
		}
		if(lvlf > 40 && lvli < 40)
		{
			frag += 3*3;
			boss += 2;
			specialty += 10;
			ascension += 15;
		}
		if(lvlf > 20 && lvli < 20)
		{
			frag += 1;
			specialty += 3;
			ascension += 3;
		}
		
		
		
		//talent
		int[] skills = new int[6];
		skills[0] = skill1i;
		skills[1] = skill1f;
		skills[2] = skill2i;
		skills[3] = skill2f;
		skills[4] = skill3i;
		skills[5] = skill3f;
		
		for(int i = 0; i < 6; i = i + 2)
		{
			if(skills[i+1] > 9 && skills[i] < 9)
			{
				specialty += 9*3*3;
				book += 12*3*3;
				weekly += 2;
				crown += 1;
			}
			if(skills[i+1] > 8 && skills[i] < 8)
			{
				specialty += 6*3*3;
				book += 6*3*3;
				weekly += 1;
			}
			if(skills[i+1] > 7 && skills[i] < 7)
			{
				specialty += 4*3*3;
				book += 4*3*3;
				weekly += 1;
			}
			if(skills[i+1] > 6 && skills[i] < 6)
			{
				specialty += 9*3;
				book += 9*3;
			}
			if(skills[i+1] > 5 && skills[i] < 5)
			{
				specialty += 6*3;
				book += 6*3;
			}
			if(skills[i+1] > 4 && skills[i] < 4)
			{
				specialty += 4*3;
				book += 4*3;
			}
			if(skills[i+1] > 3 && skills[i] < 3)
			{
				specialty += 3*3;
				book += 2*3;
			}
			if(skills[i+1] > 2 && skills[i] < 2)
			{
				specialty += 6;
				book += 3;
			}
		}
	}
}
