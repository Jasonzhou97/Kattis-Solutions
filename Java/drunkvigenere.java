import java.util.Scanner;

public class drunkvigenere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encrypt = sc.nextLine();
        String Key = sc.nextLine();

        char[] encrypted = encrypt.toCharArray();
        char[] key = Key.toCharArray();
        char[] decryped = new char[encrypted.length];
        for(int i=0;i<encrypt.length();i++){
            char c = encrypted[i];
            char k = key[i];
            int value = k-'A';
            int cVal = c - 'A';
            char decrypt;
            if(i%2==0){
                decrypt = (char)((cVal-value+26)%26);
            }
            else{
                decrypt = (char)((cVal+value+26)%26);
            }
            decryped[i] = (char) (decrypt+'A');
        }

        for(int i=0;i<decryped.length;i++){
            System.out.print(decryped[i]);
        }
    }
}
