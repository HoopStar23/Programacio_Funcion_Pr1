import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        static Scanner scanner;
    public static void main(String[] args) {
	    scanner = new Scanner(System.in);
        menuOpciones();
    }

    public static void menuOpciones(){
        int opciones;
        do {
            menu();
            opciones = validaInt();
            scanner.nextLine();
            switch (opciones){
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 14 -> ejercicio14();
                case 15 -> ejercicio15();
                case 16 -> ejercicio16();
                case 17 -> System.out.println("SALIENDO");
            }
        }while(opciones != 17);
    }

    public static void menu(){
        System.out.println("Elige el ejercicio");
        System.out.println("Ejerc.1");
        System.out.println("Ejerc.2");
        System.out.println("Ejerc.3");
        System.out.println("Ejerc.4");
        System.out.println("Ejerc.5");
        System.out.println("Ejerc.6");
        System.out.println("Ejerc.7");
        System.out.println("Ejerc.8");
        System.out.println("Ejerc.9");
        System.out.println("Ejerc.10");
        System.out.println("Ejerc.11");
        System.out.println("Ejerc.12");
        System.out.println("Ejerc.13");
        System.out.println("Ejerc.14");
        System.out.println("Ejerc.15");
        System.out.println("Ejerc.16");
    }

    public static int validaInt(){
        while(!scanner.hasNextInt()){
            System.out.println("No es un numero");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double validaDouble(){
        while(!scanner.hasNextDouble()){
            System.out.println("No es un numero");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static double multiplicar(double a,double b){
        return a*b;
    }

    public static void ejercicio1(){
        System.out.println("--->EJERCICIO 1<---");
        System.out.println("Introduce dos numeros, para multiplicarlos");
        double num1 = validaDouble();
        double num2 = validaDouble();

        System.out.println("La multiplicacion de estos dos numeors son: " + multiplicar(num1,num2));
    }

    public static boolean esMayorEdad(int edad){
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static void ejercicio2(){
        System.out.println("--->EJERCICIO 2<---");
        System.out.println("Cual es tu edad?");
        int edad = validaInt();

        System.out.println(esMayorEdad(edad));
    }

    public static int minimo(int a, int b){
        if (a > b) {
            return b;
        }
        return a;
    }

    public static void ejercicio3(){
        System.out.println("--->EJERCICIO 3<---");
        System.out.println("Introduce dos numeros");
        int num1 = validaInt();
        int num2 = validaInt();

        System.out.println("El numero mas pequeño entre los dos es: " + minimo(num1,num2));
    }

    public static int dimeSigno(int a){
        if (a == 0) {
            System.out.println("Es igual");
            a = 0;
        }else if (a > 0) {
            System.out.println("Es positivo");
            a = 1;
        }else{
            System.out.println("Es negativo");
            a = -1;
        }
        return a;
    }

    public static void ejercicio4(){
        System.out.println("--->EJERCICIO 4<---");
        System.out.println("Por favor introduce un numero");
        int num = validaInt();

        System.out.println("El numero que elegistes es: " + dimeSigno(num));
    }

    public static double millasKilometros(double a){
        return a*1.60934;
    }

    public static void ejercicio5(){
        System.out.println("--->EJERCICIO 5<---");
        System.out.println("Introduce un valor en millas para ser convertido en km");
        double millas = validaDouble();

        System.out.println("Su equivalencia en km es: " + millasKilometros(millas));
    }

    public static double iva(double a){
        final double iva = 21;
        return a + ((a*iva)/100);
    }

    public static void ejercicio6(){
        double precio;
        for (int i = 1; i <= 5; i++) {
            System.out.println("A continuacion introduce el precio del producto " + (i));
            precio = validaInt();
            System.out.println("El prodcuto " + (i) + " cuesta con 21% IVA " + iva(precio) + " euros");
        }
    }

    public static double perimetro(double a, double b){
        return (a*2)+(b*2);
    }

    public static double area (double a, double b){
        return a*b;
    }

    public static void ejercicio7(){
        System.out.println("A continuacion introduce el ancho del rectangulo");
        double ancho = validaDouble();
        System.out.println("Ahora introduce el lado del rectangulo");
        double lado = validaDouble();

        System.out.println("Con los datos introducidos tienes un area de: " + area(ancho,lado) + " y su perimetro es de: " + perimetro(ancho, lado));
    }


    public static int sumatorio(int a){
        int valor = 0;
        for (int i = 1; i <= a; i++) {
            valor += i;
        }
        return valor;
    }

    public static int productorio(int a){
        int valor = 1;
        for (int i = 1; i <= a; i++) {
            valor *= i;
        }
        return valor;
    }

    public static double intermedio(int a){
        return (double)a/2;
    }

    public static void ejercicio8(){
        System.out.println("Introduce un numero maximo:");
        int max = validaInt();
         while( max < 0){
             System.out.println("Tiene que ser mayor de 0");
             max = validaInt();
         }
        System.out.println("OK");

        System.out.println("El sumatorio es: " + sumatorio(max));
        System.out.println("El productorio es: " + productorio(max));
        System.out.println("El valor intermedio es: " + intermedio(max));
    }

    public static int valorMax(int a, int b){
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }
    public static void ejercicio9(){
        System.out.println("A continuacion introduce tres numeros");
        int numA = validaInt();
        int numB = validaInt();
        int numC = validaInt();

        while(numA < 0 || numB < 0 || numC < 0){
            System.out.println("Uno de los numeros es menor de 0 y tienen que ser mayores");
            System.out.println("Puedes introducir los datos otra vez porfavor");
            numA = validaInt();
            numB = validaInt();
            numC = validaInt();
        }
        System.out.println("OK");

        if (numC > valorMax(numA, numB)) {
            System.out.println(numC + " es mayor");
        }else {
            System.out.println(valorMax(numA, numB) + " es mayor");
        }

    }

    public static boolean validaFecha(int d, int m, int y){

        boolean verificado = false;
        if (d > 0 && d < 31) {
            if (m > 0 && m < 13) {
                if (y != 0) {
                    verificado = true;
                }else {
                    System.out.println("El año no puede ser 0");
                }
            }else {
                System.out.println("Hay un error con el mes");
            }
        }else{
            System.out.println("Hay un error en el dia");
        }
        return verificado;
    }
    public static void ejercicio10(){
        System.out.println("A continuacion introduce el dia");
        int dia = validaInt();
        System.out.println("Ahora el mes");
        int mes = validaInt();
        System.out.println("Al final el año");
        int anyo = validaInt();

        System.out.println("La fecha que introducistes es: " + validaFecha(dia, mes, anyo));
    }

    public  static int[] tablaMult(int a){
        int array [] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = a*(i+1);
        }
        return array;
    }

    public static void ejercicio11(){
        System.out.println("Introduce un numero");
        int num = validaInt();

        System.out.println("A continuacion muestro la tabla de multiplicar de dicho numero introducido");
        System.out.println(Arrays.toString(tablaMult(num)));
    }

    public static double kmMillas(double a){
        return a*0.621371;
    }

    public static void ejercicio12(){
        System.out.println("Introduce un valor de km para darte el valor en millas");
        double km = validaDouble();

        while(km < 0){
            System.out.println("Por favor introduce un valor mayor de 0");
            km = validaDouble();
        }

        System.out.println("OK");

        System.out.println("El valor en millas es: " + kmMillas(km));
    }

    public static double descuento(double original, double descuento){
        return 100-((descuento*100)/original);
    }
    public static void ejercicio13(){
        System.out.println("Introduce el precio del producto sin el descuento");
        double precioN = validaDouble();
        System.out.println("Ahora introduce el precio del producto con el descuento aplicado");
        double precioD = validaDouble();

        while(precioD > precioN){
            System.out.println("El precio con el descuento tiene que ser menor del original");
            precioD = validaDouble();
        }
        System.out.println("OK");

        System.out.println("El descuento de este producto es un: " + descuento(precioN, precioD) + " porciento");
    }

    public static String crearPiramide(int a, String b){
        int contador = 1;
        String cadena = "";
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < (a-contador); j++) {
                cadena += " ";
            }
            for (int j = 0; j < 2*i-1; j++) {
                cadena += b;
            }
            cadena += "\n";
            contador++;
        }
        return cadena;
    }

    public static void ejercicio14(){
        System.out.println("Cantidad de la piramide");
        //5\n
        int piramide = validaInt(); //5
        //\n
        scanner.nextLine();
        //
        System.out.println("Contenido dentro la piramide");
        String contenido = scanner.nextLine();

        System.out.println(crearPiramide(piramide, contenido));
    }

    public static int total(int [] a){
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public static double media( int [] a){
        return total(a)/100;
    }

    public static void ejercicio15(){
        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1);
        }

        System.out.println("Total: " + total(array));
        System.out.println("Media: " + media(array));
    }

    public static int[] random(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (1 + Math.random()*100);
        }
        return a;
    }
    public static void ejercicio16(){
        System.out.println("Escribe un tamaño");
        int tamanyo = validaInt();

        int array[] = new int[tamanyo];

        System.out.println(Arrays.toString(random(array)));
    }
}
