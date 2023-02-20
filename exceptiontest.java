class customexception extends Exception{
    String msg;
    customexception(){
        msg = "Exception Occured";
    }
}

public class exceptiontest {
    public static void main(String[] args) {
        try{
            throw new customexception();
        }catch(customexception ce){
            System.out.println(ce.msg);
        }
    }
}
