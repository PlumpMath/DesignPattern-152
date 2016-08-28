package ClassWorkEndOfSummer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class MainMapFreq {

	public static void main(String[] args) throws Exception {
	//	BufferedReader buf = new BufferedReader(new FileReader("c:\\in\\sonet.txt"));
		 URL oracle = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader buf = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
		
		StringBuilder allStr=new StringBuilder();
		
		while(buf.ready())
		allStr.append(buf.readLine());
		String [] masStr=allStr.toString().split("\\s");
		Map<String, Integer> m = new HashMap<String, Integer>();
		// Initialize frequency table from command line
		for (String a : masStr) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}
