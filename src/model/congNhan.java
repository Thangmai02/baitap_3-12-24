package model;

public class congNhan extends canBo {
    private int level;
    public congNhan(){}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public congNhan(String name, int age, String gender, String adress, int level){
       super(name, age, gender, adress);
        this.level=level;
    }
    public String toString(){
        return " Tên nhân viên :"+getName()+" Tuổi :"+getAge()+" Giới tính :"+getGender()+" Địa chỉ :"+getAdress()+" Bậc : "+level;
    }
}
