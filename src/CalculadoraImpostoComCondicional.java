public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        double salario = 10000;
        double trintaPorcento = salario * 0.30;
        double quinzePorcento = salario * 0.15;
        if (salario >= 4500 ) {
            System.out.println("30% do salario é: R$ "+trintaPorcento);
        } else {
            System.out.println("15% do salario é: R$ "+quinzePorcento);
        }
    }
}
