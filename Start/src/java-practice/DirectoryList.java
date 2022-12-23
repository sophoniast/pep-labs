import java.util.Scanner;
public class DirectoryList {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dname = new Scanner(null)
        System.out.println("How many offices are in the building?");
        int num = sc.nextInt();
        
        for(int i=0;i < num; i++){
            System.out.print("Room No."+ i +"name");
            
        }
    }
}