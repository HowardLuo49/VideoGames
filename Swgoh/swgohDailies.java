import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

public class swgohDailies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot r;
		try
		{
			r = new Robot();
			
			System.out.println("Starting up");
			ld(r, 3000);
			
			//evac
			keys(r, 18, 9);
			ld(r, 1000);
			
			//bronzium
			key(r, 80);
			ld(r, 3000);
			key(r, 77);
			ld(r, 3000);
			key(r, 79);
			ld(r, 3000);
			key(r, 79);
			ld(r, 3000);
			key(r, 79);
			ld(r, 3000);
			key(r, 69);
			ld(r, 3000);
//			
//			//shipments
//			key(r, 83);
//			ld(r, 3000);
//			key(r, 66);
//			ld(r, 3000);
//			key(r, 85);
//			ld(r, 3000);
//			key(r, 83);
//			ld(r, 3000);
//			key(r, 85);
//			ld(r, 3000);
//			key(r, 65);
//			ld(r, 3000);
//			key(r, 85);
//			ld(r, 3000);
//			key(r, 84);
//			ld(r, 3000);
//			key(r, 85);
//			ld(r, 3000);
//			key(r, 81);
//			ld(r, 3000);
//			
//			//cantina
//			key(r, 66);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//
//			for(int i = 0; i < 7; i++)
//			{
//				key(r, 89);
//				ld(r, 3000);
//			}
//			
//			key(r, 68);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 69);
//			ld(r, 3000);
//			
//			//mods
//			key(r, 77);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//
//			for(int i = 0; i < 7; i++)
//			{
//				key(r, 89);
//				ld(r, 3000);
//			}
//			
//			key(r, 68);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 69);
//			ld(r, 3000);
//			
//			//sa
//			key(r, 65);
//			ld(r, 3000);
//			key(r, 79);
//			ld(r, 3000);
//			key(r, 79);
//			ld(r, 10000);
//			key(r, 48);
//			ld(r, 3000);
//			key(r, 57);
//			ld(r, 3000);
//			key(r, 56);
//			ld(r, 3000);
//			key(r, 69);
//			ld(r, 3000);
//			
//			//galactic war
//			key(r, 71);
//			ld(r, 3000);
//			key(r, 53);
//			ld(r, 3000);
//			key(r, 86);
//			ld(r, 3000);
//			key(r, 55);
//			ld(r, 3000);
//			key(r, 68);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 69);
//			ld(r, 3000);
//			
//			//ls battles
//			key(r, 56);
//			ld(r, 3000);
//			key(r, 52);
//			ld(r, 3000);
//			key(r, 51);
//			ld(r, 3000);
//			key(r, 50);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 68);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 49);
//			ld(r, 3000);
//			key(r, 51);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 68);
//			ld(r, 3000);
//			key(r, 76);
//			ld(r, 3000);
//			key(r, 69);
//			ld(r, 3000);
//			
//			for(int i = 0; i < 9; i++)
//			{
//				key(r, 79);
//				ld(r, 3000);
//			}
			
			//evac bac
			keys(r, 18, 9);
			ld(r, 1000);
		}
		catch(AWTException e)
		{
			System.out.println("Failed");
		}
	}
	
	
	public static void key(Robot r, int key)
	{
		r.keyPress(key);
		ld(r, 50);
		r.keyRelease(key);
		ld(r, 50);
	}
	
	public static void keys(Robot r, int key1, int key2)
	{
		r.keyPress(key1);
		ld(r, 50);
		key(r, key2);
		ld(r, 50);
		r.keyRelease(key1);
		ld(r, 50);
	}
	
	public static void move(Robot r, int x, int y)
	{
		r.mouseMove(screenWidth(r) * x/1536, screenHeight(r) * y/960);
		ld(r, 50);
	}
	
	public static void lc(Robot r)
	{
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		ld(r, 50);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		ld(r, 50);
	}
	
	public static void rc(Robot r)
	{
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		ld(r, 50);
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		ld(r, 50);
	}
	
	public static void ld(Robot r, int delay)
	{
		r.delay(delay);
	}
	
	public static int screenWidth(Robot r)
	{
		return(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	}

	public static int screenHeight(Robot r)
	{
		return(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	}
}
