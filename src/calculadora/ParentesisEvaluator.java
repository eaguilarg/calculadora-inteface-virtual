package calculadora;
import calculadora.Pila;
import calculadora.Unchecked;
import java.util.Scanner;

public class ParentesisEvaluator {

	public static boolean evaluate(String expr) {
		boolean result;
        Pila<String> stack;
		String token, top;
		Scanner sc;

		try {
            stack = new Pila<String>();
			result = true;
			sc = new Scanner(expr);
			while (sc.hasNext() && result) {
				token = sc.next();
				if ( isOpeningParentesis(token) ) {
					stack.push(token);
				}
				else if ( isClosingParentesis(token) ) {
					top = stack.pop();
					if (! matchingParentesis(token, top) ) {
						System.err.println(token + top);
						result = false;
					}
				}
			}
			if (! stack.isEmpty())
				result = false;
		} catch (Unchecked ese) {
			System.err.println(ese);
			result = false;
		}
		return result;
	}

	static boolean isOpeningParentesis(String token ) {
			return (token.equals("(") || token.equals("[") ||
					token.equals("{") );
	}

	static boolean isClosingParentesis(String token ) {
			return (token.equals(")") || token.equals("]") ||
					token.equals("}") );
	}

	static boolean matchingParentesis(String token, String top) {
		return ( top.equals("(") && token.equals(")") ||
				 top.equals("[") && token.equals("]") ||
				 top.equals("{") && token.equals("}") );
	}

}
