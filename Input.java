/******************************************************************
*
*
*
*	Facilitates reading in data from a file. See InputExample.java
*	for usage.
*
*
*
******************************************************************/


import java.util.*;
import java.io.*;

public class Input {

	private static Scanner reader;

	public static void open(String filename) {
		try {
			reader = new Scanner(new FileReader(filename));	
		} catch (Exception e) {
			System.out.println("File not found");
		}
		
	}

	public static void close() {
		if (reader != null) {
			reader.close();
		}
	}

	public static int nextInt() {
		return reader.nextInt();
	}

	public static double nextDouble() {
		return reader.nextDouble();
	}

	public static String next() {
		return reader.next();
	}

	public static boolean hasNext() {
		return reader.hasNext();
	}
}