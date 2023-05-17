
public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha seu calculo");
        String calc = Entrada.leiaString("+ or - or / or *");
        float n2 = Entrada.leiaFloat("Numero um  ");
        float n3 = Entrada.leiaFloat("Numero dois ");

        if (calc.equals("+")){
            System.out.println(n2 + n3);
        } else if (calc.equals("-")) {
            System.out.println(n2 - n3);
        } else if ((calc.equals("/"))) {
            System.out.println(n2 / n3);
        } else if ((calc.equals("+"))) {
            System.out.println(n2 * n3);
        } else {
            System.out.println("Da zero pra ele");
        }
    }
}

