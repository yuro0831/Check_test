package test11;

public class Main {

    public static void main(String[] args) {
        AccountingSystem accountingSystem = new AccountingSystem();
        
        //有効なエントリを追加
        //期待値:正しくMapに追加される
        accountingSystem.addToLedger("Alice", 300);
        
        //無効なエントリを追加
        //期待値:アルファベット以外の文字が追加されているため、Mapに追加されない
        accountingSystem.addToLedger("佐藤", 1000);
        
        //無効なエントリを追加
        //期待値:スペースが含まれているため、Mapに追加されない
        accountingSystem.addToLedger("John Doe", 500);
        
        //無効なエントリを追加
        //期待値:nullが含まれているため、追加されない
        accountingSystem.addToLedger(null, 700);
        
        //有効な特定の人の経費を出力
        //期待値:Mapに追加されているため、経費が出力できる
        accountingSystem.printExpense("Alice");
        
        //無効な特定の人に経費を出力
        //期待値:Mapに追加しないため、経費が出力されない
        accountingSystem.printExpense("John Doe");
        
        //存在しない人の経費を出力
        //期待値:Nullの場合はNullPointerExceptionを出力する。
        accountingSystem.printExpense(null);
    }

}
