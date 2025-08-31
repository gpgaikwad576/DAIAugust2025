package day4;

import java.io.File;
import java.io.IOException;

public class DemoChecked {
	/*
	 * throws vs throw : throws is used to declare an exception
	 * throw is used to create an exception
	 */
	public static void checkFile(String path) throws IOException
	{
		File f = new File(path);
//		if(!f.exists())
//		{
//			f.createNewFile();
//		}
		if(!f.exists())
		{
			throw new IOException("File doesnt exist");
		}
	}
	public static void main(String[] args)  {
		
		try {
			checkFile("abc.txt");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
