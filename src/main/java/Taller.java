public class Taller {
    public static int ncol=24;
    public static double[][] Matriz(int nfilas){
        double matriz[][];
        matriz= new double[nfilas][24];
        return matriz;
    }
    public static double Escala(){
        double min = 1.0;
        double max = 9.5;
        return (Math.random() * (max - min)) + min;
    }

    public static double[][] ValoresMatriz(double matriz[][],int nfilas){
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                matriz[i][j] = Escala();
            }
        }
        return matriz;
    }
    public static double MayorSismo(){
        int nfilas=2;
        double Mayor;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor= matriz[0][0];
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                }
            }
        }
        return Mayor;
    }
    public static double MayorSismoDia(){
        int nfilas=2;
        double Mayor;
        double dia=0;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor= matriz[0][0];
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                    dia =i;
                }
            }
        }
        return dia;
    }
    public static double MayorSismoHora(){
        int nfilas=2;
        double Mayor;
        double hora=0;
        double[][] matriz = ValoresMatriz(Matriz(2), nfilas);
        Mayor= matriz[0][0];
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>Mayor){
                    Mayor= matriz[i][j];
                    hora=j;
                }
            }
        }
        return hora;
    }
    public void CualDiaSismo(){
        System.out.println("El día "+ MayorSismoDia() +" , a las "+ MayorSismoHora() +" , se registra sismo más intenso, con un valor de "+ MayorSismo() + " en la escala de Richter");
    }

    public static void SismosAldia4(){
        int nfilas=2;
        int veces=0;
        double[][] matriz=ValoresMatriz(Matriz(nfilas),nfilas);

        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>=4.0){
                    veces+=1;
                }
                System.out.println("Dia "+(i+1)+": "+veces);
            }
        }
    }

    public static void SismoMayor4(){
        int nfilas=2;
        double[][] matriz=ValoresMatriz(Matriz(2),nfilas);

        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                if(matriz[i][j]>=4.0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
    }
}

