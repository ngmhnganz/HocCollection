package nguyenminhngan.com;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	
	do 
	{
		ArrayList<String> ds= new ArrayList<String>();
		ds.add("09124567");
		ds.add("09223323");
		ds.add("019212133");
		for (int i=0; i<ds.size();i++) {
			String value = ds.get(i);
			System.out.println(value);
		}
		ds.add(0, "1111111111111");
		for (String s:ds) {
			System.out.println(s);
		}
		System.out.println("Tiếp tục không ? (c/k) ");
		String kq = new java.util.Scanner(System.in).nextLine();
		if (kq.equalsIgnoreCase("k")) break;
  }
	while (true);
}
}
