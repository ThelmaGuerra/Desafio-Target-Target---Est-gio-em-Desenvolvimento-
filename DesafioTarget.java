import java.util.ArrayList;
import java.util.List;

public class DesafioTarget {

    public void question1() {

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;


        while (K < INDICE) {
            K += 1;
            SOMA += K;
        }

        System.out.println(SOMA);
    }

    public String question2(int number) {

        int firstTerm = 0;
        int secondTerm = 1;

        List<Integer> result = new ArrayList<>();


        System.out.println("Sequência Fibonacci com " + number + " números:");

        for (int i = 1; i <= number; ++i) {
            System.out.print(firstTerm + " ");
            result.add(firstTerm);

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        if (result.contains(number)) {
            return "O número informado pertence a sequência!";
        }
        return "O número informado NÃO pertence a sequência!";
    }

    public void question3() {
        // A) Sequência de números ímpares. O próximo número é 9.
        // B) O próximo número é 128.
        // C) O próximo número é 49.
        // D) O próximo número é 10², que é 100.
        // E) É a sequência Fibonacci, o próximo é 13.
        // F)
    }

    public void question4() {
        // Eu deixaria dois interruptores virados iguais, e um diferente.
        // Assim, saberia qual sala seria a diferente (apagada ou acessa).
        // E depois deixaria os dois outros interruptores que sobraram (q eu não sei)
        // Mexeria em um deles, e veria qual das outras salas muda.
    }

    public String question5(String input) {

        StringBuilder resultado = new StringBuilder(input.length());

        for (String s : input.split(" ")) {
            if (resultado.length() != 0) resultado.append(' ');
            for (int x = s.length() - 1; x >= 0; x--) {
                resultado.append(s.charAt(x));
            }
        }


        return resultado.toString();
    }

    public static void main(String[] args) {
        DesafioTarget t1 = new DesafioTarget();
        t1.question1();
        System.out.println(t1.question2(13));
        System.out.println(t1.question5("testando"));
    }
}
