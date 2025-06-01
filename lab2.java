import java.util.Scanner;
public class lab2{

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your marks(0-100)");
        int marks=input.nextInt();
        String grade;
        if(marks>=90)
        {
            grade="A+";
        }
        else if(marks>=80)
        {
            grade="A";
        }
        else if(marks>=70)
        {
            grade="B+";
        }else if(marks>=60)
        {
            grade="B";
        }
        else if(marks>=50)
        {
            grade="C+";
        }else if(marks>=40)
        {
            grade="C";
        }
        else
        {
            grade="F";
        }
        System.out.println("the grade you obtained is:"+grade);
        input.close();
    }

    }





















