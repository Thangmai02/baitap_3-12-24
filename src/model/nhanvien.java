package model;

public class nhanvien extends canBo{
    private String CongViec;
    public  nhanvien(){}
    public nhanvien(String name,int age,String gender,String adress,String CongViec){
        super(name, age, gender, adress);
        this.CongViec=CongViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
    public String toString(){
        return  " Tên nhân viên:"+getName()+" Tuổi :"+getAge()+" Giới tính :"+getGender()+" Địa chỉ :"+getAdress()+" Công việc: "+CongViec;
    }
}
