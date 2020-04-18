import java.util.*;
 class Details                                   // abstract class
{
    Scanner sc=new Scanner(System.in);
    String name,sport,res,gender;
    int age,marks;
    double fees=1000000;
    
        void method()
        {   
            
            System.out.println("Enter your age ");
            age=sc.nextInt();
            System.out.println("Enter your Percentage in 12th class ");
            marks=sc.nextInt();
            System.out.print("");
            name=sc.nextLine();
            System.out.println("Enter your favourite sport " );
            sport=sc.nextLine();
            System.out.println("Enter your Gender ");
            gender=sc.nextLine();
            System.out.println("Enter one on the mentioned below \n Hostler / Day Scholer");
            res=sc.nextLine();
            System.out.println("Enter your name ");
            name=sc.nextLine();
        }


       

}

class Table                                            // nested class
{
     void method4()
     {

        System.out.println("|-----------WELCOM TO STUDENT MANAGENMENT SYSTEM-----------|");
        System.out.println("|                                                          |");
        System.out.println("|                                                          |");
        System.out.println("|             Enter 1 to view your details                 |");
        System.out.println("|             Enter 2 to change your details               |");
        System.out.println("|             Enter 3 to register book from library        |");
        System.out.println("|             Enter 4 calculate your CGPA                  |");
        System.out.println("|             Enter 5 to view scholership details          |");
        System.out.println("|             Enter 6 to EXIT                              |");
        System.out.println("|                                                          |");
        System.out.println("|                                                          |");
        System.out.println("|----------------------------------------------------------|");
     }
}

class Fees extends Details              // inheritance
{   
    double raw,raw1,raw2;
    void method1(int m11)
    {
        if(m11 > 70)
        {
            raw= m11/2;
            raw1=fees/raw;
            System.out.printf(" Total fees is = "  + fees + "\n Your scholership is = " + raw1 + "\n Your fees is =  " + (fees-raw1) );
        }
        else
        {
            System.out.printf(" Total fees is = "  + fees + "\n Your scholership is = " + raw1 + "\n Your fees is =  " + fees );
        }
    }
}

class Cgpa extends Details
{   
    Scanner sc=new Scanner(System.in);
    int a1;
    
    void method()                                 // overriding
    {
        
        System.out.println("Welcome to the CGPA calculator \n Enter total no subjects");
        a1=sc.nextInt();
        int max_marks[]=new int[a1];
        int marks_score[]=new int[a1];
        int credit[]=new int[a1];
        String arr2[]=new String[a1];
        
        System.out.print("");
        arr2[0]=sc.nextLine();
        for (int i=0;i<a1;i++)
        {
            System.out.println("Enter subject number " + (i+1) );
            arr2[i]=sc.nextLine();
        }
        System.out.println("\n\nName of subjects entered sucessfully ");
        int total=0;
        int total0=0;
        int total1=0;
        int total2=0;
        for (int i=0;i<a1;i++)
        {
            int raw=0;
            System.out.println("\n\nEnter the maximum marks in "  + arr2[i]);
            raw=sc.nextInt();
            max_marks[i]=raw;
            
            int raw1;
            System.out.println("\nEnter marks scored in "  + arr2[i]);
            raw1=sc.nextInt();
            marks_score[i]=raw1;

            int raw2; 
            System.out.println("\nEnter credit of  "  + arr2[i]);
            raw2=sc.nextInt();
            credit[i]=raw2;
            
            total1=0;                             // for total marks
            total1 = raw1*raw2;
          

            total2 = total2 + total1;

            total= raw*raw2;                         // for max marks
            total0=total0 + total;
           
        }

        double cgpa=1;
        double c1=1;

        // exceptional handling

        try
        {                                          
        cgpa = c1*total2*10/total0 ;
        }
        
        catch (ArithmeticException ae)
        {
            System.out.println("ArithmeticException occured!");
        }
        
        System.out.println("\n\nCalculated CGPA of student is = " + cgpa);
        

    }
}

interface Lib                            // interface
{
    public void method3();
}

class Library implements Lib
{
   
    public void method3()
    {   
        Scanner sc = new Scanner(System.in);
        
        int books_taken=0;
        int books_want=0;
        System.out.println("Enter nummber of books you want");
        
        books_want=sc.nextInt();
        
        if (books_taken + books_want >= 5 )
        {
            System.out.println("LIMIT EXCEED Either return books taken or reduce number of books want");
            books_want=0;
        }
        else 
        {
            System.out.println("Books are sucessfully issues \n Total number of books issued");
            System.out.println(books_taken+books_want);
        }  
    }
}

class Present extends Details
{    
    void method(int m11,int a11,String n11,String s11,String r11,String g11)
    {/*
        int m11=obj1.marks;
        int a11=obj1.age;
        String n11=obj1.name;
        String s11=obj1.sport;
        String r11=obj1.res;
        String g11=obj1.gender;
*/

     System.out.println("NAME                -- "+n11);
     System.out.println("AGE                 -- "+a11);
     System.out.println("FAVOURATE SPORT     -- "+s11);
     System.out.println("HOSTLER/DAY SCHOLER -- "+r11);
     System.out.println("GENDER              -- "+g11);
     
    }

}

public class Caa
{
    public static void main(String arr[])
    {  
        Scanner sc=new Scanner(System.in); 
       
       
       System.out.println("-----------WELCOM TO STUDENT MANAGENMENT SYSTEM-----------\n\n\n");
       System.out.println("PLEASE ENTER YOUR DETAILS FIRST");
    
       Fees obj1;
       Table obj3;
       obj1=new Fees();
       obj3= new Table();


       obj1.method();                                           // 1st to run
       int m11=obj1.marks;
       int a11=obj1.age;
       String n11=obj1.name;
       String s11=obj1.sport;
       String r11=obj1.res;
       String g11=obj1.gender;
    
       
       while(true)
            {
            obj3.method4();
            int raw3;                                 // table
            raw3=sc.nextInt();

            if(raw3==1)
            {
                Present obj4;
                obj4 =new Present();
                obj4.method( m11,a11,n11,s11,r11,g11);
            }

            if(raw3==2)
            {
                Details obj5;
                obj5 =new Details(); 
                obj5.method();
            }

            if(raw3==3)
            {
                Library obj6;
                obj6 =new Library(); 
                obj6.method3();
            }

            if(raw3==4)
            {
                Cgpa obj7;
                obj7= new Cgpa();
                obj7.method();
            }

            if(raw3==5)
            {   
                obj1.method1(m11);
            }

            if(raw3==6)
            {   
                System.out.println(" -------------You have exitted sucessfully------------------ ");
                break;
            }
        }
        }
    
}
