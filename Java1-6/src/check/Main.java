package check;

public class Main {

    public static void main(String[] args) {
        int num =0;
        do {
            num++;
            if(num == 1) {
                continue;
            }
            System.out.println(num);
        }while (num < 1);

    }

}
