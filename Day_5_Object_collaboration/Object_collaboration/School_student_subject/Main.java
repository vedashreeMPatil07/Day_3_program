import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
     /* Question :- create 3 classes school , subject and student disply result using student object */   
   Scanner sc=new Scanner(System.in);
   School school =new School();
   System.out.println("enter department:");
   school.setDepartment(sc.nextLine());

   Student s=new Student();
System.out.println("enter name and Roll number: ");
   s.setName(sc.nextLine());
   s.setRollNo(sc.nextInt());
   System.out.println(school);

System.out.println("enter 4 subject marks:");
   Subject sub =new Subject();
sub.setDatascience(sc.nextInt());
sub.setCloud(sc.nextInt());
sub.setDistributedComputing(sc.nextInt());
sub.setMaths(sc.nextInt());

System.out.println(sub);
    }
}
