public class Taller {
    public static double[][] Matriz(int nfilas){
        int ncol=24;
        double matriz[][];
        matriz= new double[nfilas][ncol];
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                System.out.print(" [ "+ matriz[i][j] +" ]");
            }
        }
        return matriz;
    }
    public static double Escala(){
        double min = 1.0;
        double max = 9.5;
        return (Math.random() * (max - min)) + min;
    }

    public static double[][] ValoresMatriz(double matriz[][],int nfilas){
        int ncol=24;
        for(int i=0;i<nfilas;i++){ //filas
            for(int j=0;j<ncol;j++){ //columnas
                matriz[i][j] = Escala();
            }
        }
        return matriz;
    }
    public static double MayorSismo(double[][] matriz){
        int nfilas=2;
        int ncol=24;
        double Mayor;
        double dia=0;
        double hora=0;
        matriz=ValoresMatriz(Matriz(2),nfilas);
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
        int ncol=24;
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
        int ncol=24;
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



    public static void SismoMayor4(){
        int nfilas=2;
        int ncol=24;
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
        SismoMayor4();
        MayorSismoDia();
    }
}

