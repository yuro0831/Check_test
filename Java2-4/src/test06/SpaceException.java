package test06;

//独自のExceptionを作成する時はExceptionを継承する
public class SpaceException extends Exception{
    
    //コンストラクトを用意した後、super()を使ってExceptionクラスのコンストラクトを呼び出し、
    //処理を実施させる
    SpaceException() {
        super(Message.ME001);
    }
    
    //コンストラクタを用意した後、super()を使ってExceptionクラスのコンストラクタを呼び出し、
    //処理を実施させる
    SpaceException(String msg){
        super(msg);
    }

}
