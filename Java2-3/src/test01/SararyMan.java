package test01;

public class SararyMan {

    String name;
    int saraly;
    int grade;
    
    public SararyMan() {
        System.out.println("サラリーマンを起動します");
        this.name = "初期値太郎";
        this.saraly = 200000;
        this.grade = 1;
    }
    
    public void announce() {
        System.out.println("私の名前は" + name + "です");
        System.out.println("会社員です");
        System.out.println("給料は"+ saraly + "円で");
        System.out.println("Gradeは" + grade +"です");
    }
    
}
