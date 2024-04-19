import java.util.Scanner;

import domain.Pikachu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Pikachu pikachu = new Pikachu("Pikachu", 1500, 112);
        System.out.println("Digite o valor do cp");
        int cp = in.nextInt();
        if (novoCp <= 0) {
            System.out.println("CP não pode ser menor ou igual a 0");        
        } else {
            cp = novoCp;
        }
        System.out.println(pikachu);
        in.close();
    }
}