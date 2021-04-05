package sungtae.spring.mvc.exam;
import java.util.Scanner;

public class EMPMain {
    public static void main(String[] args) {
        EMPService epvs = new EMPService();
        Scanner sc = new Scanner(System.in);
        String menu = null;
        while (true) {
            epvs.displayMenu();
            menu = sc.nextLine();
            switch (menu){
                case "1": epvs.newEMP(); break;
                case "2": epvs.showEMP();break;
                case "3": epvs.showOneEMP();break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }

}