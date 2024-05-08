import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String nome = scan.next();
        System.out.println("Qual sua idade: ");
        int idade = scan.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " Com idade de "+idade+" participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Com idade de "+idade+" participará da categoria Juvenil");
        } else if(idade >= 16 && idade <= 17){
            System.out.println(nome + " Com idade de "+idade+" participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
