import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // per huruf
        char[] per_huruf = input.nextLine().toCharArray();
        for(int i = 0; i < per_huruf.length/2; i++){
            char temp = per_huruf[i];
            per_huruf[i] = per_huruf[per_huruf.length-1-i];
            per_huruf[per_huruf.length-1-i] = temp;
        }
        System.out.println(per_huruf);

        // per kata
        String per_kata = input.nextLine();
        String bagian[] = per_kata.split(" ");
        per_kata = "";

        for(int i=0; i< bagian.length; i++){
            per_kata += bagian[bagian.length-1-i] + " ";
        }

        System.out.println(per_kata);

    }
}
