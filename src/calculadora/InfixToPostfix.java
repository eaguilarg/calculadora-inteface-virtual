package calculadora;
import java.util.Scanner;
import calculadora.Pila;
import calculadora.Unchecked;

// Notación Polaca Inversa (RPN)
// "Shunting yard" algorithm
// Dijkstra

public class InfixToPostfix {
    
public InfixToPostfix(){
    
}   

	// Sólo revisa balanceo de paréntesis
	// (no revisa otros errores en la expresión infija)
	// Los únicos operadores válidos son: * / + -
    // Los elementos de la expresión deben estar separados por espacios

	public  String evaluate(String expr) {
		StringBuilder postfix = new StringBuilder();
		String token;
		Scanner sc;
		Pila<String> stack;

        stack = new Pila<String>();
		if ( ParentesisEvaluator.evaluate(expr) ) {

			sc = new Scanner(expr);

			try {
				while ( sc.hasNext() ) {
					token = sc.next();

					if ( isOperator(token) ) {
						while ( !stack.isEmpty() &&
								!ParentesisEvaluator.isOpeningParentesis(stack.peek()) &&
								opGreaterEqual(stack.peek(), token) ) {
							postfix.append(" " + stack.pop());
						}
						stack.push(token);
					}

					else if ( ParentesisEvaluator.isOpeningParentesis(token) )
						stack.push(token);

					else if ( ParentesisEvaluator.isClosingParentesis(token) ) {
						while ( !ParentesisEvaluator.isOpeningParentesis(stack.peek()) ) {
							postfix.append(" " + stack.pop());
						}
						stack.pop(); // paréntesis que abre correspondiente
					}

					else // token is operand
						postfix.append(" " + token);
				}

				while ( !stack.isEmpty() ) {
					postfix.append(" " + stack.pop());
				}
			}
			catch (Unchecked ese) {
				postfix = new StringBuilder("Invalid Expression");
				System.err.println(ese);
			}

		}
		else {
			postfix = new StringBuilder("Invalid Expression");
			System.err.println("Paréntesis no balanceados");
		}

		return postfix.toString();
	}


	static boolean isOperator(String token ) {
			return (token.equals("+") || token.equals("-") ||
					token.equals("*") || token.equals("/") );
	}

	private static boolean opGreaterEqual(String tope, String actual) {
		boolean result = false;
		if ( ( tope.equals("*") || tope.equals("/") ) &&
			 ( actual.equals("+") || actual.equals("-") ) )
			result = true;
		return result;
	}
        
        
 public static void main(String[] args){
     InfixToPostfix p=new InfixToPostfix();
     String z="5 + 3 * 2";
    
     System.out.println(p.evaluate(z));
 }       
        

}
