
import java.io.Console;


public class Main {


    public static void main(String[] args) {
        Console c=System.console();
        String key="0";
        SportCenter sp=new SportCenter();
        while (!key.equals("4")){
            System.out.println("1-Add a new member");   
            System.out.println("2-Display all members");
            System.out.println("3-Search");
            System.out.println("4-Exit");  
            
            key=c.readLine();
            if (key.equals("1")){
                sp.addMember(c);    
            }else if (key.equals("2")){
                sp.printMembers();
            }else if (key.equals("3")){
                sp.search(c);
            }
        }
        System.out.println("EXIT");
    }
    
    
}
