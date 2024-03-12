package model;

import java.util.ArrayList;
import java.util.Scanner;

public class mainTestQLCB {

    public static void main(String[] args) {
        ArrayList<canBo> list = new ArrayList<>();
        list.add(new canBo("thang", 22, "Nam","hn"));
        list.add(new canBo("manh", 22, "Nam","hn"));
        list.add(new canBo("tinh", 22, "Nam","hn"));

        while (true) {
            System.out.println("============Danh Sach============" +
                    "\n1. Xem danh sach" +
                    "\n2. Them moi" +
                    "\n3. Tim kiem" +
                    "\n0. Thoat");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Danh sach la: ");
                for (canBo cb : list) {
                    System.out.println(cb);
                }
            } else if (choice == 2) {
                System.out.println("Nhap thong tin can bo: ");
                System.out.println("Nhap ten can bo: ");
                String hoTen = scanner.nextLine();
                System.out.println("Nhap tuoi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap gioi tinh: ");
                String gioiTinh = scanner.nextLine();
                System.out.println("Nhap Dia Chi");
                String diaChi = scanner.nextLine();
                list.add(new canBo(hoTen, tuoi, gioiTinh,diaChi));
            } else if (choice == 3) {
                System.out.println("Nhap ten can tim: ");
                String hoTen = scanner.nextLine();
                boolean found = false;
                for (canBo cb : list) {
                    if (cb.getName().equals(hoTen)) {
                        System.out.println(cb);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Khong tim thay can bo co ten " + hoTen);
                }
            } else if (choice == 0) {
                break;
            }
        }
    }
}