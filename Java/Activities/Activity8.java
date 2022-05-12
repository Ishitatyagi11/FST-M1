package activities;

public class Activity8 {
    public static void exceptionTest(String s) throws CustomException {
        if (s == null){
            throw new CustomException("null value");
        }
        else
            System.out.println("message is: " +s);
    }

    public static void main(String[] args) {
        try {

            Activity8.exceptionTest("Will print to console");

            Activity8.exceptionTest(null); // Exception is thrown here

            Activity8.exceptionTest("Won't execute");

        } catch(CustomException mae) {

            System.out.println("Inside catch block: " + mae.getMessage());

        }



    }

}

class CustomException extends Exception{
    private String message;
     public CustomException(String m){
         this.message = m;
     }

     public String getMessage(){
         return message;
     }
}
