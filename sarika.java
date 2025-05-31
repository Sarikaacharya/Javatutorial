class student
{
 int roll,marks;
 String name;
 void input()
 {
    System.out.println("enter roll no. and marks");
 }
} 

class sarika extends student
{
    void disp()
    {
        roll=35; name="SARIKA"; marks=100;
        System.out.println(roll+" "+name+" "+marks);

    }
    public static void main(String [] args) {
        sarika r=new sarika();
        r.input(); r.disp();
    }
}