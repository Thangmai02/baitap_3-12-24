package model;

import java.util.ArrayList;

public class QLCanBo implements  quanLyCanBo{
    private ArrayList<canBo> Danhsachcanbo;
    public  QLCanBo(){
        Danhsachcanbo=new ArrayList<>();
    }

    @Override
    public void themCanBo(canBo canBo) {
        Danhsachcanbo.add(canBo);
    }

    @Override
    public void findCanBo(String hoten) {
        System.out.println(" kết quả tìm kiem ");
        for (canBo canBo : Danhsachcanbo){
            if (canBo.getName().equalsIgnoreCase(hoten)){
                System.out.println(canBo);
            }
        }

    }

    @Override
    public void hienthiDSCanBo() {
        System.out.println("Danh sách các cán bộ:");
        for (canBo canBo : Danhsachcanbo) {
            System.out.println(canBo);

        }
    }
}
