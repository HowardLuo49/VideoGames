import java.util.*;
import java.io.*;

public class ArrayWork {
	
	public static String[] arrayize(String file) {
		
		String[] result;
		
		try
		{
			Scanner scanner = new Scanner(new File(file));
			int total = Integer.parseInt(scanner.nextLine());
			result = new String[total];
			
			for(int i = 0; i < total; i++)
			{
				String next = scanner.nextLine();
				result[i] = next;
			}
			scanner.close();
			return result;
		}
		catch (FileNotFoundException e)
		{
			System.out.println(file + " not found");
			return null;
		}
	}
}
