package test05;

public class Sub {
    public static void subA() throws Exception{
        System.out.println("Exceptionを発生させます");
        throw new Exception();
    }
    
    public static void subB() throws Exception{
        System.out.println("メッセージ付でExceptionを発生させます");
        throw new Exception("subBが実行されています");
    }
}
