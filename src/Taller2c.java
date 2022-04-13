import java.util.Scanner;

public class Taller2c {
    public static void menu1() {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){

            System.out.println("[1] Mostrar sismo más intenso");
            System.out.println("[2] Mostrar sismos >= 4.0 grados Richter");
            System.out.println("[3] Reiniciar el arreglo con nuevos valores");
            System.out.println("[4] Salir");

            System.out.println("Digite una opcion");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    ValoresMatriz(Matriz(1),2);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static int Dias() {
        Scanner leer = new Scanner(System.in);
        int dias;
        do {
            System.out.println("Ingresa la cantidad de dias");
            dias = leer.nextInt();
        } while (2>= dias || 31 <= dias);
        return dias;
    }

    public static double[][] Matriz(int nfilas) {
        int ncol = 24;
        double matriz[][];
        matriz = new double[nfilas][ncol];
        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
            }
        }
        return matriz;
    }

    public static double Escala() {
        double min = 1.0;
        double max = 9.5;
        return (Math.random() * (max - min)) + min;
    }

    public static double[][] ValoresMatriz(double matriz[][], int nfilas) {
        int ncol = 24;
        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
                matriz[i][j] = Escala();
            }
        }
        return matriz;
    }

    public static double MayorSismo(double[][] matriz) {
        int nfilas = 2;
        int ncol = 24;
        double Mayor;
        double hora = 0;
        matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor = matriz[0][0];
        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
                if (matriz[i][j] > Mayor) {
                    Mayor = matriz[i][j];
                }
            }
        }
        return Mayor;
    }

    public static double MayorSismoDia() {
        int nfilas = 2;
        int ncol = 24;
        double Mayor;
        double dia = 0;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor = matriz[0][0];
        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
                if (matriz[i][j] > Mayor) {
                    Mayor = matriz[i][j];
                    dia = i;
                }
            }
        }
        return dia;
    }

    public static double MayorSismoHora() {
        int nfilas = 2;
        int ncol = 24;
        double Mayor;
        double hora = 0;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor = matriz[0][0];
        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
                if (matriz[i][j] > Mayor) {
                    Mayor = matriz[i][j];
                    hora = j;
                }
            }
        }
        return hora;
    }


    public static void SismoMayor4() {
        int nfilas = 2;
        int ncol = 24;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);

        for (int i = 0; i < nfilas; i++) { //filas
            for (int j = 0; j < ncol; j++) { //columnas
                if (matriz[i][j] >= 4.0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }


    public static void main(String[] args) {
        menu1();
    }
}
