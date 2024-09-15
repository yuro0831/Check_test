package test01;

public class Shacho extends SararyMan{
    public Shacho() {
        
        System.out.println("社長を起動します");
        this.name = "社長三郎";
        this.saraly = 0;
        this.grade = 10;
    }
    
    //元々SararyManに存在していた処理を上書いて別の処理に変更してみる
    @Override
    public void announce() {
        System.out.println("私の名前は" + name + "です");
        System.out.println("社長です");
        System.out.println("給料という概念は既になくなったが、");
        System.out.println("Gradeは" + grade + "です");

    }

}
