package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
         System.out.println("実験パターン１回目");
         //数字以外の文字列をコンソールに入力するとNumberFormaExceptionが発生する
         String s = sc.nextLine();
         int a = Integer.parseInt(s);
         System.out.println("OK");
         
         System.out.println("実験パターン2回目");
         
         //数字以外の文字列をコンソールに入力するとInputMismatchExceptionが発生する
         int b = sc.nextInt();
         System.out.println(a + b);
         System.out.println("OK");
         
         /*
          * catchは複数記載することで想定されるエラーパターンをより詳細にわけることができる。
          */
             }catch (NumberFormatException e) {
                 System.out.println("実験パターン1で失敗");
             }catch (InputMismatchException e) {
                 System.out.println("実験パターン2で失敗");
             }finally {
                 sc.close();
             }
        

    }

}
