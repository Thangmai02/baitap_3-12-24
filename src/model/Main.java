package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập ten");
        String name = scanner.nextLine();
        System.out.println(" nhập tuoi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" nhập gioi tinh");
        String gender = scanner.nextLine();
        System.out.println(" nhập địa chi");
        String adress = scanner.nextLine();
//        canBo canBo1 = new canBo(name, age, gender, adress);
//        System.out.println(canBo1);
//        scanner.nextLine();
//        -------------------------------------------
//        System.out.println(" nhập thông tin nhân viên");
//        System.out.println("Nhập cấp bậc:");
//        int level = scanner.nextInt();
//        congNhan congNhan = new congNhan(name, age, gender, adress, level) ;
//                System.out.println(congNhan);
        //____________________________________///
//        System.out.println(" nhập thông tin kỹ sư");
//        System.out.println("Nhập ngành:");
//        String Nganhdaotao = scanner.nextLine();
//       kySu kySu=new kySu(name, age, gender, adress,Nganhdaotao) ;
//                System.out.println(kySu);
//--------------------------------------------------
        System.out.println(" nhập thông tin nhân vien");
        System.out.println("Nhập công việc:");
      String congviec1= scanner.nextLine();
        nhanvien nhanvien=new nhanvien(name, age, gender, adress,congviec1) ;
        System.out.println(nhanvien);
        scanner.close();
        }
    }


