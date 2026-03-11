public class BuscaBinaria {
    public static int[] lista = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        Buscar(1);
    }

    public static void Buscar(int valor){


        Buscar(valor, 0, lista.length,0);
    }

    public static void Buscar(int valor, int minimo ,int maximo, int totalBusca){

        int metade = (int) (minimo + maximo)/2;

        totalBusca++;
        if(lista[metade] < valor){
            Buscar(valor, metade, maximo,totalBusca);
        }
        if(lista[metade] > valor){
            Buscar(valor, minimo, metade, totalBusca);
        }
        if(lista[metade] == valor){
            System.out.println(metade);
            System.out.println(totalBusca);
        }

    }
}
