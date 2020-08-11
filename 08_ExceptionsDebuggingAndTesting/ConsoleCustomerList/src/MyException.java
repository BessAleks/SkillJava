public class MyException extends Exception{
    public MyException(String message){
        super("Вызов моего исключения: "  + message);
    }
}
