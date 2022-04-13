import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

public class ayakaRitual {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Robot r;
		try {
			r = new Robot();

			loadingDelay(r, 2000);
			for (int i = 0; i < 8; i++) {
				
				System.out.println("Processing The Future Beyond Your Dreams");
				loadingDelay(r, 800);
			}
			System.out.println("...");
			loadingDelay(r, 1000);

//escaping
			move(r, 1805, 10);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 250, 1060);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "Themes and related settings");
			loadingDelay(r, 1000);
			move(r, 200, 500);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			window(r, 38);
			loadingDelay(r, 1000);
			move(r, 150, 220);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 400, 550);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			ctrl(r, 76);
			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin\\Ayaka");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 400, 300);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 1000, 975);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "AyakaBackground.png");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 1900, 15);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 180, 970);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 30, 35);
			loadingDelay(r, 1000);
			r.keyPress(16);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			r.keyRelease(16);
			loadingDelay(r, 1000);
			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int y = 35; y < 201; y++) {
				move(r, 30, y);
				loadingDelay(r, 1);
			}
			for (int x = 30; x < 1950; x++) {
				move(r, x, 200);
				loadingDelay(r, 1);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);

			move(r, 510, 1060);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			window(r, 38);
			loadingDelay(r, 1000);
			ctrl(r, 76);
			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

//opens Honeyview
			move(r, 786, 307);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);

			move(r, 840, 500);
			loadingDelay(r, 1000);
			r.mouseWheel(1);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);

			loadingDelay(r, 1000);
			ctrl(r, 76);
			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin\\Ayaka");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 220, 976);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "AyakaSub1.png");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

//open Honeyview 2
			move(r, 786, 307);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);
			move(r, 840, 500);
			loadingDelay(r, 1000);
			r.mouseWheel(1);
			loadingDelay(r, 1000);

			loadingDelay(r, 1000);
			ctrl(r, 76);
			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin\\Ayaka");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 220, 976);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "AyakaSub2.jpg");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 500);
			key(r, 10);

//openHoneyView 3
			move(r, 786, 307);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);

			move(r, 840, 500);
			loadingDelay(r, 1000);
			r.mouseWheel(1);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);

			loadingDelay(r, 1000);
			ctrl(r, 76);
			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin\\Ayaka");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 220, 976);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "AyakaRitual.png");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

//closing file explorer then cropping images
			loadingDelay(r, 1000);
			move(r, 1900, 15);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);

//moving image 3 & cropping
			move(r, 200, 700);
			loadingDelay(r, 1000);

			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int x = 200; x < 550; x++) {
				move(r, x, 700);
				loadingDelay(r, 1);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);

//moving image 2 & cropping
			loadingDelay(r, 1000);
			move(r, 200, 700);
			loadingDelay(r, 1000);

			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int y = 700; y > 357; y--) {
				move(r, 200, y);
				loadingDelay(r, 1);
			}
			for (int x = 200; x > 179; x--) {
				move(r, x, 357);
				loadingDelay(r, 1);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);

			loadingDelay(r, 1000);
			move(r, 191, 695);
			loadingDelay(r, 1000);
			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int y = 686; y > 215; y--) {
				move(r, 200, y);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);

			loadingDelay(r, 1000);
			move(r, 390, 217);
			loadingDelay(r, 1000);
			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int y = 217; y < 341; y++) {
				move(r, 390, y);
			}
			for (int x = 390; x < 610; x++) {
				move(r, x, 341);
				loadingDelay(r, 1);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);

//cropping image 3
			move(r, 777, 385);
			loadingDelay(r, 1000);
			r.mousePress(InputEvent.BUTTON1_MASK);
			loadingDelay(r, 1000);
			for (int x = 777; x < 1136; x++) {
				move(r, x, 385);
				loadingDelay(r, 1);
			}
			r.mouseRelease(InputEvent.BUTTON1_MASK);

//break

//snowflakes
			loadingDelay(r, 1000);
			move(r, 645, 310);
			loadingDelay(r, 1000);
			rightClick(r);
			loadingDelay(r, 1000);

			move(r, 722, 523);
			loadingDelay(r, 1000);
			move(r, 975, 523);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);

			r.keyPress(18);
			loadingDelay(r, 50);
			r.keyPress(96);
			loadingDelay(r, 50);
			r.keyRelease(96);
			loadingDelay(r, 50);
			r.keyPress(97);
			loadingDelay(r, 50);
			r.keyRelease(97);
			loadingDelay(r, 50);
			r.keyPress(102);
			loadingDelay(r, 50);
			r.keyRelease(102);
			loadingDelay(r, 50);
			r.keyPress(96);
			loadingDelay(r, 50);
			r.keyRelease(96);
			loadingDelay(r, 50);
			r.keyRelease(18);
			loadingDelay(r, 50);
			key(r, 10);
			loadingDelay(r, 1000);

			move(r, 645, 310);
			loadingDelay(r, 1000);
			rightClick(r);
			loadingDelay(r, 1000);
			move(r, 760, 670);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 933, 359);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 730, 655);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 960, 475);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);

			alt(r, 32);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 40);
			loadingDelay(r, 100);
			key(r, 10);

			loadingDelay(r, 1000);
			ctrl(r, 76);

			loadingDelay(r, 1000);
			type(r, "C:\\Howard\\Genshin\\Ayaka\\Cryo flakes");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);
			move(r, 220, 976);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			type(r, "flake.ico");
			loadingDelay(r, 1000);
			key(r, 10);
			loadingDelay(r, 1000);

			move(r, 877, 737);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			move(r, 808, 770);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);

			move(r, 640, 305);
			loadingDelay(r, 1000);
			leftClick(r);
			loadingDelay(r, 1000);
			ctrl(r, 67);
			loadingDelay(r, 1000);

//sf copies
//snowflake(r, 645, 310, 750, 400, 2);

//snowflake(r, 330, 130, 400, 215, 3);

//snowflake(r, 493, 27, 582, 115, 4);

			snowflake(r, 644, 123, 756, 210, 2);

			snowflake(r, 793, 31, 875, 116, 3);

			snowflake(r, 792, 215, 882, 300, 4);

			snowflake(r, 943, 124, 1025, 213, 5);

			snowflake(r, 944, 309, 1031, 395, 6);

			snowflake(r, 1094, 30, 1177, 120, 7);

			snowflake(r, 1095, 218, 1172, 305, 8);

			snowflake(r, 1244, 124, 1323, 210, 9);

			snowflake(r, 1244, 312, 1335, 400, 10);

			snowflake(r, 1399, 28, 1484, 115, 11);

			snowflake(r, 1865, 214, 1736, 300, 12);

			snowflake(r, 1786, 399, 1726, 488, 13);

			snowflake(r, 1862, 587, 1723, 675, 17);

//break

			loadingDelay(r, 1000);
			move(r, 760, 1060);
			loadingDelay(r, 1000);
			leftClick(r);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void snowflake(Robot r, int xi, int yi, int xf, int yf, int alting) {
		move(r, xi, yi);
		loadingDelay(r, 500);
		rightClick(r);
		loadingDelay(r, 500);
		move(r, xf, yf);
		loadingDelay(r, 500);
		leftClick(r);
		loadingDelay(r, 500);
		key(r, 113);
		loadingDelay(r, 500);
		for (int i = 0; i < alting; i++) {
			loadingDelay(r, 5);
			alt0160(r);
			loadingDelay(r, 5);
		}
		loadingDelay(r, 500);
		key(r, 10);
		loadingDelay(r, 1000);
	}

	public static void alt0160(Robot r) {
		r.keyPress(18);
		loadingDelay(r, 5);
		r.keyPress(96);
		loadingDelay(r, 5);
		r.keyRelease(96);
		loadingDelay(r, 5);
		r.keyPress(97);
		loadingDelay(r, 5);
		r.keyRelease(97);
		loadingDelay(r, 5);
		r.keyPress(102);
		loadingDelay(r, 5);
		r.keyRelease(102);
		loadingDelay(r, 5);
		r.keyPress(96);
		loadingDelay(r, 5);
		r.keyRelease(96);
		loadingDelay(r, 5);
		r.keyRelease(18);
	}

	public static void alt(Robot r, int key) {
		r.keyPress(18);
		r.delay(50);
		r.keyPress(key);
		r.delay(50);
		r.keyRelease(key);
		r.delay(50);
		r.keyRelease(18);
	}

	public static void ctrl(Robot r, int key) {
		r.keyPress(17);
		r.delay(50);
		r.keyPress(key);
		r.delay(50);
		r.keyRelease(key);
		r.delay(50);
		r.keyRelease(17);
	}

	public static void window(Robot r, int key) {
		r.keyPress(524);
		r.delay(50);
		r.keyPress(key);
		r.delay(50);
		r.keyRelease(key);
		r.delay(50);
		r.keyRelease(524);
	}

	public static void shift(Robot r, int key) {
		r.keyPress(16);
		r.delay(50);
		r.keyPress(key);
		r.delay(50);
		r.keyRelease(key);
		r.delay(50);
		r.keyRelease(16);
	}

	public static void move(Robot r, int x, int y) {
		r.mouseMove(screenWidth(r) * x / 1920, screenHeight(r) * y / 1080);
	}

	public static void key(Robot r, int key) {
		r.keyPress(key);
		r.delay(30);
		r.keyRelease(key);
	}

	public static void upperKey(Robot r, int key) {
		r.keyPress(16);
		r.delay(50);
		r.keyPress(key);
		r.delay(100);
		r.keyRelease(key);
		r.delay(50);
		r.keyRelease(16);
	}

	public static void leftClick(Robot r) {
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(50);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	public static void rightClick(Robot r) {
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(50);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
	}

	public static void type(Robot r, String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(":")) {
				shift(r, 59);
			} else if (input.substring(i, i + 1).equals("\\")) {
				key(r, 92);
			} else if (Character.isUpperCase(input.charAt(i))) {
				upperKey(r, (int) input.charAt(i));
			} else {
				String temp = input.substring(i, i + 1);
				temp = temp.toUpperCase();
				key(r, (int) temp.charAt(0));
			}
		}
	}

	public static void loadingDelay(Robot r, int delay) {
		r.delay(delay);
	}

	public static int screenWidth(Robot r) {
		return (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	}

	public static int screenHeight(Robot r) {
		return (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	}

	public static void evac(Robot r) {
		r.keyPress(18);
		r.delay(500);
		key(r, 9);
		r.delay(500);
		r.keyRelease(18);
		r.delay(500);
	}

	public static void newTab(Robot r) {
		r.keyPress(17);
		r.delay(500);
		key(r, 84);
		r.delay(500);
		r.keyRelease(17);
		r.delay(500);
	}
}
