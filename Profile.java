//Purpose: Implementation of constructor
import java.util.Scanner;
class Profile{
    String name;
    String age;
    String address;
    String course;
    void YourName(String n){
        name = n;
    }
    void YourAge(String a){
        age = a;    
    }
    void YourAddress(String ad){ 
        address = ad;
    }
    void YourCourse(String c){
        course = c;
    }
    void OutputName(){System.out.print(name + "\n");}
    void OutputAge(){System.out.print(age + "\n");}
    void OutputAddress(){System.out.print(address + "\n");}
    void OutputCourse(){System.out.print(course + "\n");}
    }
class YourProfile {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: "); 
        String name1 = input.nextLine();
        System.out.print("Age: "); 
        String age2 = input.nextLine();
        System.out.print("Address: "); 
        String address3 = input.nextLine();
        System.out.print("Course: "); 
        String course4 = input.nextLine();
        System.out.print("\n"); 
        Profile e1 = new Profile();
        e1.YourName(name1);
        e1.YourAge(age2);
        e1.YourAddress(address3);
        e1.YourCourse(course4);
        e1.OutputName();
        e1.OutputAge();
        e1.OutputAddress();
        e1.OutputCourse();
    }
}

