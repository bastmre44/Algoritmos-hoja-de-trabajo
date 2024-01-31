import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class Calculator implements ICalculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int substraction(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }

    public int residue(int n1, int n2) throws Exception {
        if (n2 == 0) {
            throw new Exception("Division por cero, indeterminado");
        }
        return n1 % n2;
    }

    public ArrayList<String> read(String llenar) throws Exception {
        ArrayList<String> e = new ArrayList<>();
        BufferedReader leer = new BufferedReader(new FileReader(llenar));
        String line;
        while ((line = leer.readLine()) != null) {
            e.add(line);
        }
        leer.close();
        return e;
    }

    public int solve(ArrayList<Character> elementos) throws Exception {
        Stack<Integer> stack = new Stack<>();
        for (char elemento : elementos) {
            if (Character.isDigit(elemento)) {
                stack.push(Character.getNumericValue(elemento));
            } else {
                int operando2 = stack.pop();
                int operando1 = stack.pop();
                switch (elemento) {
                    case '+':
                        stack.push(add(operando1, operando2));
                        break;
                    case '-':
                        stack.push(substraction(operando1, operando2));
                        break;
                    case '*':
                        stack.push(multiplication(operando1, operando2));
                        break;
                    case '/':
                        stack.push(division(operando1, operando2));
                        break;
                    case '%':
                        stack.push(residue(operando1, operando2));
                        break;
                    default:
                        throw new Exception("Operación no valida: " + elemento);
                }
            }
        }
        return stack.pop();
    }

}
