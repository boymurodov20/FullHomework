import java.util.Scanner;

public interface Input {
    static int inputNumber(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        if (scanner.hasNext()){
            return scanner.nextInt();
        }
        else return inputNumber(msg);
    }
    static String inputString(String msg){
        Scanner scannerStr = new Scanner(System.in);
        System.out.println(msg);
        return scannerStr.nextLine();
    }
}
