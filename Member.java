

public class Member {
    

    private int memberid=0;
    private String name=null;
    private String surname=null;
    private double height=0;
    private double weight=0;
    private double weightstatus=0;

    public Member(int memberid,
                  String name, 
                  String surname,
                  double height,
                  double weight
                  ){
        this.memberid=memberid;
        this.name=name;
        this.surname=surname;
        this.height=height;
        this.weight=weight;
        this.weightstatus=calculateBMI(weight,height);
    }
    
    
    
    
    private double calculateBMI(double weight,double height){
        return (weight/Math.pow(height,2));
    
    }

    
    
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeightstatus() {
        return weightstatus;
    }

    public void setWeightstatus(double weightstatus) {
        this.weightstatus = weightstatus;
    }



}
