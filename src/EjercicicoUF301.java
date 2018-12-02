/*Ejercicio 1*/
/*Declara una variable llamada num1 y asígnale un valor al azar del 1 al 20. Luego declara otra variable llamada num2. Si num1 está comprendido entre 5 y 15 (ambos inclusive) asigna a num2 el resultado de la operación num1+15, de lo contrario asigna a num2 el resultado de la operación num1+5. Al final muestra en pantalla el valor de ambas variables.*/
public class EjercicicoUF301 {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() *20 +1);
		int num2 = 0;
		if (num1 >=5 && num1 <=15) {
				num2 = num1 + 15;
		}else {
				num2= num1 + 6;
			}
		System.out.println("la variable num1 es: " + num1);
		System.out.println("la variable num2 es: " + num2);
		}

	}


