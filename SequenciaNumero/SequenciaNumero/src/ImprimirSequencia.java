public class ImprimirSequencia {
    void imprimirSequencia(int x){
    if(x == 0){
        return;
    }
    System.out.println(x);
    imprimirSequencia(x-1);
    }
}
