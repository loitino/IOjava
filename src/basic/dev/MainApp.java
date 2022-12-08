package basic.dev;

import java.util.Scanner;

public class MainApp {
		public static void main(String[] args) {
			//Thông tin sinh viên

			System.out.println("Thông tin sinh viên");
			Scanner sc = new Scanner(System.in);

			System.out.println("Nhập Họ và tên");
			String hoVaTen = sc.nextLine();
			System.out.println("Mã sinh viên");
			long msv = sc.nextLong();
			System.out.println("nhập CMND");
			int cmnd = sc.nextInt();
			System.out.println("Nhập tên lớp");
			String tenLop = sc.next();
			System.out.println("Nhập tên trường");
			String tentruong = sc.next();
			System.out.println("Điểm trung bình");
			float dtb = sc.nextFloat();

	}

}
