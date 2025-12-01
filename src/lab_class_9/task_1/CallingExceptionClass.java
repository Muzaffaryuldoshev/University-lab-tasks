package lab_class_9.task_1;

public class CallingExceptionClass  {
    public static void main(String[] args) {
        NullPointer_ExceptionClass obj = new NullPointer_ExceptionClass();
        try {
            obj.nullGenerator();
        }catch(NullPointerException e){
            System.out.println( "Exception message" + e.getMessage());
            System.out.println(e.toString());
           // e.printStackTrace();
        }
    }
}
