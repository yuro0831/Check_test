package test01;

public class Main {
    public static void main(String[] args) {
        
        // インスタンス化
        Ippan ippan= new Ippan();
        //Ippanに処理がなくても、SararyManの値を継承して処理できる
        ippan.announce();
        
        System.out.println();
        
        //インスタンス化
        //親クラスのコンストラクタが起動してから子クラスの管理職が動き出す。
        Kanrishoku kanri = new Kanrishoku();
        kanri.announce();
        
        System.out.println();
        
        //インスタンス化
        Shacho shacho = new Shacho();
        //上書きされたアナウンスが出力される
        shacho.announce();
        
        
        System.out.println();
        
        //継承元のクラスを使ってインスタンスを作成する事もできる
        //ippanクラス、kanriクラス、shachoクラスもざっくり同じSararyManとして使える
      //int aを1~3の数字を入れて処理を見てみましょう
        System.out.println("継承元の処理からnewも可能");
        int a = 1;
        SararyMan sarary;
        switch(a) {
        case 1:
            sarary = new Ippan();
            sarary.announce();
            break;
        case 2:
            sarary = new Kanrishoku();
            sarary.announce();
            break;
        case 3:
            sarary = new Shacho();
            sarary.announce();
            break;
        }

        
        //継承先から継承元のインスタンスを作ることはできません。
        //Ippan ippanB = new SararyMan();

    }

}
