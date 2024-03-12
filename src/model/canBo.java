package model;

public class canBo {
    private String name;
    private int age;
    private String gender;
    private  String adress;
   public canBo(){

   }
   public canBo( String name,int age,String gender,String adress){
       this.adress=adress;
       this.age=age;
       this.gender=gender;
       this.name=name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString(){
       return " Tên cán bộ :"+name+" Tuổi :"+age+" Giới tính :"+gender+" Địa chỉ :"+adress;
    }

}
