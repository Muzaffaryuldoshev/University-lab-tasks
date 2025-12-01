package lab_class_9.task_3;

public class task3_Main {
    public static void main(String[] args) {
        Account obj = new Account(200, 123456789, "Jonathan");
        try {
            obj.transfer(300);
        } catch (NotEnoughFund e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

}
