import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //problema1();
        problema2();
    }

    static public void problema1(){

        // Crea una aplicación que permita adivinar un número. La aplicación genera un número
        //aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número
        //a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan
        //(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        //(además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
        //muestra el número que había generado.

        // generamos un numero aleatorio del 1 --> 100
        int numeroAleatorio = (int)(Math.random() * 100 + 1);
        // creamos la variable que tendrá los valores que introdizcamos por consola
        int numero;
        // creamos la variable que irá contando la cantidad de veces que intentamos averiguar el numero
        int contador = 0;
        System.out.println(numeroAleatorio);
        Scanner scanner = new Scanner(System.in);

        do{
            // preguntamos y obtenemos el valor que el usuario introduce por consola
            System.out.println("Introduzca un numero del 1 al 100:");
            numero = scanner.nextInt();

            // comprobamos si el valor introducido por el usuario es igual al valor que nuestro programa generó
            // aleatoriamente, en el caso de que el usuario acierte el número imprimirá GANASTES¡¡¡ y pasará
            // directamente a la condición del while, comono cumple la condición de número != numeroAleatorio directamente
            // el programa termina.
            if(numero == numeroAleatorio){
                System.out.println("GANASTES¡¡¡");
            }else{
                // en el caso que el número introducido por el usuario no sea el generado por el programa entrará en
                // este else y comprobará si aún no hemos consumido todos nuestro intentos. En el caso de no consumir los
                // 20 intentos entrará en el if y nos imprimirá que no hemos acertado el número y nos dirá los intentos
                // que nos queda, a parte como no hemos acertado el número sumará en el contador un intento.
                if(contador < 19){
                    System.out.println("Vuelve a intentarlo. Te quedan " + (20-(contador+1)) + " intentos.");
                    contador++;
                }else{
                    // En el caso que hayamos agotado los 20 intentos imprimiremos PERDISTE¡¡¡ y usaremos el break para
                    // salir del bucle while y termine el programa
                    System.out.println("PERDISTE¡¡¡");
                    break;
                }

            }
        }while(numero != numeroAleatorio && contador < 20);

    }

    static public void problema2(){

        //Crea una calculadora en la que te pida un número, una operación(+,-,*,/) y un segundo número. Te
        //devolverá el resultado y saldrá un menú, la primera opción del menú será hacer otra operación y la
        //segunda opción será terminar el programa.

        // creamos los scaners y las variable que vamso a usar
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado = 0;
        int opciones = 0;
        String operacion;


        do{
            // pediremos los numeros y la operación
            System.out.println("Introduzca un numero:");
            numero1 = scannerInt.nextInt();
            System.out.println("Introduzca la operación que desee realizar: (+,-,*,/)");
            operacion = scannerString.next();
            System.out.println("Introducir segundo numero:");
            numero2 = scannerInt.nextInt();

            // con  los datos que hemos obtenido con un switch comprobamos que opcion hemos elegido en la operación
            // y dependiendo del resultado obtendremos el resultado de la operación en la variable resultado
            switch (operacion){
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Los datos introducidos son incorrectos¡¡¡");
                    break;
            }
            // imprimimos el resultado
            System.out.println("El resultado de la operación es: " + resultado);

            // realizamos las preguntas
            System.out.println("1. Realizar nueva operación.");
            System.out.println("2. Salir.");
            opciones = scannerInt.nextInt();

            // en el caso que elijamos la opcion 2 el while no se cumplirá por lo tanto terminará nuestro programa
        } while (opciones == 1);

    }
}