package model;

public class kySu extends canBo {
    private String NganhDaoTao;
    public kySu(){}
    public kySu(String name,int age,String gender,String adress,String NganhDaoTao){
        super(name, age, gender, adress);
        this.NganhDaoTao=NganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }
    public String toString(){
        return  " Tên kỹ sư:"+getName()+" Tuổi :"+getAge()+" Giới tính :"+getGender()+" Địa chỉ :"+getAdress()+" Ngành đào tạo : "+NganhDaoTao;
    }
}
