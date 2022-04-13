import java.util.Scanner;
public class Taller {
    public static int ncol=24;
    public static int dias=Dias();
    public static double[][] Matriz(int dias){
        double[][] matriz;
        matriz= new double[dias][24];
        return matriz;
    }
    public static double Escala(){
        double min = 1.0;
        double max = 9.5;
        return (Math.random() * (max - min)) + min;
    }
    public static double[][] ValoresMatriz(int dias){
        double[][] matriz = Matriz(dias);
        for(int i=0;i<dias;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                matriz[i][j] = Escala();
            }
        }
        return matriz;
    }
    public static double MayorSismo(int dias){
        double Mayor;
        double[][] matriz = ValoresMatriz(dias);
        Mayor= matriz[0][0];
        for(int i=0;i<dias;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                }
            }
        }
        return Mayor;
    }
    public static double MayorSismoDia(int dias){
        double Mayor;
        double dia=0;
        double[][] matriz = ValoresMatriz(dias);
        Mayor= matriz[0][0];
        for(int i=0;i<dias;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                    dia =i;
                }
            }
        }
        return dia;
    }
    public static double MayorSismoHora(int dias){
        double Mayor;
        double hora=0;
        double[][] matriz = ValoresMatriz(dias);
        Mayor= matriz[0][0];
        for(int i=0;i<dias;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                    hora=j;
                }
            }
        }
        return hora;
    }
    public static void CualMayorSismo(){
        System.out.println("El día "+ MayorSismoDia(dias) +" , a las "+ MayorSismoHora(dias) +" , se registra sismo más intenso, con un valor de "+ MayorSismo(dias) + " en la escala de Richter");
    }

    public static void SismosAldia4(){
        int veces=0;
        double[][] matriz=ValoresMatriz(dias);

        for(int i=0;i<dias;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>=4.0){
                    veces+=1;
                }
            }
            System.out.println("Dia "+(i+1)+": "+veces);
            veces=0;
        }
    }

    public static void SismoMayor4(){
        double[][] matriz=ValoresMatriz(dias);

        for(int i=0;i<Dias();i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>=4.0){
                    System.out.println(matriz[i][j]);
                }
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

    public static void menu1() {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Matriz(dias);
        while(!salir){

            System.out.println("[1] Mostrar sismo más intenso");
            System.out.println("[2] Mostrar sismos >= 4.0 grados Richter");
            System.out.println("[3] Reiniciar el arreglo con nuevos valores");
            System.out.println("[4] Salir");

            System.out.println("Digite una opcion");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    CualMayorSismo();
                    break;
                case 2:
                    SismosAldia4();
                    break;
                case 3:
                    menu1();
                    break;
                case 4:
                    salir=true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        menu1();
    }
}
