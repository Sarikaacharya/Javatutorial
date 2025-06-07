abstract class firstyearcourse{
    public abstract void printname();
     public abstract void printcode();
    public void printtotalweeks() {
       System.out.println("total number of weeks in 1st year is 36");
    }
}
class javacourse extends firstyearcourse {
   @Override
    public void printname(){
       System.out.println("course name:introduction to java programming");
    }
    @Override
    public void printcode() {
       System.out.println("course code:java04");
    }

   
}
public class M{
   public static void main(String[] args){
       firstyearcourse course = new javacourse();

       course.printname();
   course.printcode();
    course.printtotalweeks();



   }
}






