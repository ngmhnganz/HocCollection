package Hasmap;

import java.util.Collection;
import java.util.HashMap;

public class MainHashMap {

	public static void main(String[] args) {
	HashMap<Integer, String> dsSV = new HashMap<Integer, String>();
	dsSV.put(113, "Nguyễn Văn X"); //Nguyễn Văn X được mã hóa thành 113.
	dsSV.put(114, "Trần Văn Tèo");
	// xuất ( chỉ lấy giá trị )
	Collection<String> value = dsSV.values();
	for ( String sv: value) {
		System.out.println(sv);
	}
	
	// muốn truy xuất tới 1 sv có mã bất kì.
	String sv=dsSV.get(114);
	System.out.println(sv);
	
	// muốn sửa dữ liệu
	dsSV.put(113,"Nguyễn Văn Tý");
	Collection<String> x = dsSV.values();
	for ( String i: x) {
		System.out.println(i);
	}
	
	// xóa dữ liệu có khóa chinh.
	dsSV.remove(113);
	// containsKey : kiểm tra có phần tử nào có khoa chính là abc không.
	}
}
