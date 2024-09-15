package test11;

import java.util.HashMap;
import java.util.Map;

public class AccountingSystem {
    private Map<String, Integer> ledger;
    
    public AccountingSystem() {
        ledger = new HashMap<>();
    }
    
    //帳簿に記載する文字列を判定するメソッド
    public boolean isValidEntry(String name, int expense) {
        //スペースが含まれているか確認するメソッド
        return !containsSpace(name) && startsWithUpperCase(name) && isAlphabetic(name);
    }
    
    //スペースが含まれているか確認するメソッド
    private boolean containsSpace(String name) {
        //スペースが含まれているか判定する
        return name.contains(" ");
    }
    
    //頭文字が大文字になっているか判断するメソッド
    private boolean startsWithUpperCase(String name) {
        //頭文字が大文字になっているか判断する
        return Character.isUpperCase(name.charAt(0));
    }
    
    //文字列がアルファベットのみで構成されているか確認するメソッド
    private boolean isAlphabetic(String name) {
        //アルファベットのみで構成されているか判断する (エラーが発生する箇所１)
        return name.matches("[a-zA-Z]+");// name がnull の場合、NullPointerExceptionが発生する可能性がある
    }
    
    //帳簿をMapに格納するメソッド
    public void addToLedger(String name, int expense) {
        if (isValidEntry(name, expense)) {
            ledger.put(name, expense);
            System.out.println("Entry added to the ledger: " + name + " - $" + expense);
        } else {
            System.out.println("Invalid entry. Cannnot add to the ledger.");
        }
    }
    
    //特定の人の経費を出力するメソッド
    public void printExpense(String name) {
        //Mapから特定の人を選択し、キーをもとに経費を出力する
        if (ledger.containsKey(name)) {
            int expense = ledger.get(name);
            System.out.println(name +"'s expense: $" +expense);
          } else {
              System.out.println("Person not found in the ledger.");
          }
    }

}
