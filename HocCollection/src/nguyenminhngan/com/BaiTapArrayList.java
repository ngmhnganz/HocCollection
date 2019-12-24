package nguyenminhngan.com;

import java.util.ArrayList;
import java.util.Scanner;


public class BaiTapArrayList {
	
	/**
	 * Viết chương trình quản lý sdt
	 * Khi chạy phần mêm lên có menu lựa chọn:
	 * 1. Thêm
	 * 2. Sửa
	 * 3. Tìm sdt khi nhớ 3 số cuối.
	 * 4. Xóa sdt bất kỳ.
	 * 5. Xuất toàn bộ sdt trong danh bạ.
	 * 6. Thoát phần mềm
	 */
	static void Menu() 
	{
		System.out.println("Mời bạn chọn chức năng: ");
		System.out.println("1.Thêm SĐT");
		System.out.println("2.Sửa SĐT");
		System.out.println("3.Tìm SĐT với 3 số cuối");
		System.out.println("4.Xóa SĐT");
		System.out.println("5.Xuất SĐT");
		System.out.println("6.Thoát");
		Scanner sc = new Scanner(System.in);
		int kq= sc.nextInt();
		switch (kq) {
		case 1:
			themPhone();
			break;
		case 2:
			suaPhone();
			break;
		case 3:
			timPhone();
			break;
		case 4:
			xoaPhone();
			break;
		case 5:
			xuatPhone();
			break;
		case 6: 
			System.out.println("Tạm biệt.");
			break;
		}
	}
	private static void xuatPhone() {
		for (int i=0;i<dsPhone.size();i++) 
		{
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
	}
	private static void xoaPhone() {
		for (int i=0;i<dsPhone.size();i++) 
		{
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
		System.out.println("Nhập vị trí bạn muốn xóa.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		dsPhone.remove(i-1);
		for (int j=0;j<dsPhone.size();j++) 
		{
			System.out.println((i+1)+".\t"+dsPhone.get(j));
		}
	}
	private static void timPhone() {
		System.out.println("Mời bạn nhập các số cuối có thể nhớ.");
		Scanner sc= new Scanner(System.in);
		String chuoiso=sc.nextLine();
		for (int i=0; i<dsPhone.size(); i++) {
			String phone = dsPhone.get(i);
			if (phone.endsWith(chuoiso)) System.out.println(phone);
		}
	}
	private static void suaPhone() 
	{
		for (int i=0;i<dsPhone.size();i++) 
		{
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
		System.out.println("Nhập vào vị trí muốn sửa.");
		int vitrisua=new Scanner(System.in).nextInt();
		System.out.println("Nhập số điện thoại mới.");
		String phone = new Scanner(System.in).nextLine();
		dsPhone.set(vitrisua-1, phone);
		for (int i=0;i<dsPhone.size();i++) 
		{
			System.out.println((i+1)+".\t"+dsPhone.get(i));
		}
	}
	private static void themPhone() {
		System.out.println("Nhập số điện thoại bạn muốn thêm.");
		String phone= new Scanner(System.in).nextLine();
		dsPhone.add(phone);
	}
	public static void main(String[] args) {
			do {Menu();} while (true);
	}
		static ArrayList<String> dsPhone= new ArrayList<String>(); {}
}
