import java.util.Scanner;

public class Tablica {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        String imie;

        for(int i = 0; i < name.length; i++){
            System.out.println("Podaj imię: ");
            imie = scanner.nextLine();
            name[i] = imie;
        }
        for (int i = 4; i>=0; i--){
            System.out.println("Cześć " + name[i]);
        }

    }
}
