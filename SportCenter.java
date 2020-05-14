
import java.io.Console;


public class SportCenter {
    
    private String name=null;
    private Member[] memberList=new Member[10];
    private int index=0;
    
    public SportCenter(){
    
    }
    
    
    
    public void addMember(Console c){
        if (index==10){
            System.out.println("Members are full");
            return;
        }
        System.out.println("Enter your name: ");
        String name=c.readLine();
        System.out.println("Enter your surname: ");
        String surname=c.readLine();
        System.out.println("Enter your height: ");
        double height=Double.valueOf(c.readLine());
        System.out.println("Enter your weight: ");
        double weight=Double.valueOf(c.readLine());
        Member member=new Member(index,name,surname,height,weight);
        memberList[index]=member;
        index++;
    }

 
    public void search(Console c){
        System.out.println("Enter member's name: ");
        String name=c.readLine();
        System.out.println("Enter member's surname: ");
        String surname=c.readLine();
        Member member=null;
        for (int i=0;i<index;i++){
            member=memberList[i];
            if (member.getName().equals(name)  &&  member.getSurname().equals(surname)){
                if(member.getWeightstatus()<18.5){
                    System.out.println("Underweight");
                }
                else if(member.getWeightstatus()<=24.9){
                    System.out.println("Normal");
                }
                else if(member.getWeightstatus()<=29.9){
                    System.out.println("Owerweight");
                }
                else if(member.getWeightstatus()<=34.9){
                    System.out.println("Obese");
                }
                else if(member.getWeightstatus()>=35){
                    System.out.println("Extremly Obese");
                }
                
            }
        }        
    }    
    
    
    
    public void printMembers(){
        Member member=null;
        //for (int i=0;i<memberList.length;i++){
        for (int i=0;i<index;i++){
            member=memberList[i];
            System.out.print("Id:"+member.getMemberid());
            System.out.print(" Name:"+member.getName());
            System.out.print(" Surname:"+member.getSurname());
            System.out.print(" Weight:"+member.getWeight());
            System.out.println(" Height:"+member.getHeight());
        }
    }

    
    
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member[] getMemberList() {
        return memberList;
    }

    public void setMemberList(Member[] memberList) {
        this.memberList = memberList;
    }

    
    
    
    
    
}
