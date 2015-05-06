package com.mtr.android.Maven;

import java.io.FileReader;

public class Reader {
	public static void main(String args[]) {
		/*try {
			FileReader reader = new FileReader("data.txt");
			int character = reader.read();
			StringBuffer sb = new StringBuffer();
			while (character != -1) {
				sb.append((char) character);
				character = reader.read();
			}
			reader.close();
			//System.out.println(sb);
			String content = sb.toString();
			System.out.println(sb.substring(0, content.length() - 2));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		System.out.println((double)(Math.round((2/3.0)*100)/100.0));
	}
}
