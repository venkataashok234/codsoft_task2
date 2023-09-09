import java.util.*;
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 6 ;
        int marks[] = new int[n];
        String subjects[]={"Java","Python","M1","BEE","DBMS","NSS"};
        System.out.println("Enter the name of the student.");
        String name =sc.next();
        int total =0;
        for(int i = 0 ;i < 6;i++){
            System.out.println("Enter the marks obtained by "+name+" for the subject "+subjects[i]+" :");
            marks[i] =sc.nextInt();
            if(marks[i] > 100 || marks[i] < 0 ){
                System.out.println("Your data is invalid pelase enter valid marks :");
                marks[i] =sc.nextInt();
            }
            total += marks[i];
        }
        int percent = total/6;//(total/600)*100 == (total/6);
        String grade = null;
      System.out.println("Percentage of student is :"+percent);
      switch(percent/10) {
        // for >= 90
        case 10:
        case 9:
           grade = "A";
           break;
        // for >= 80 and <90
        case 8:
           grade = "B";
           break;
        // for >= 70 and <80
        case 7:
           grade = "C";
           break;
        // for >= 60 and <70
        case 6:
           grade = "D";
           break;
        // for >= 50 and <60
        case 5:
           grade = "E";
           break;
        // for < 50
        default:
           grade = "FAIL";
           break;
      }
      
      System.out.println("Grade of the student is = " + grade);
   
    }
}
