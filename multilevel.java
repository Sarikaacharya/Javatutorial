class A
{
    int a,b,c;
    void Addition()
    {
        a=10; b=20;
        c=a+b;
        System.out.println("Addition of two numbers:" +c);
    }
    void Subtraction()
    {
        a=1000; b=200;
        c=a-b;
        System.out.println("Subtraction of two numbers:" +c);
    }
}
class B extends A
{
    void Multiplication()
    {
        a=30; b=28;
        c=a*b;
        System.out.println(" Multiplication of two numbers: "+c);
    }
    void Division()
    {
        a=102; b=34;
        c=a/b;
        System.out.println("Division of two numbers:" +c);
    }
}
class C extends B    
{
    void Remainder()
    {
        a=1000; b=20;
        c=a%b;
        System.out.println("Remainder of two numbers:" +c);
    }
}
class multilevel
{
    public static void main(String [] args){
        C r=new C();
        r.Addition(); r.Subtraction();
        r.Multiplication(); r.Division(); r.Remainder();
    }
}