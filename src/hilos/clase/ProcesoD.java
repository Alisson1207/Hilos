package hilos.clase;

public class ProcesoD implements Runnable{
    private int n;

    public ProcesoD(int numero){
        this.n=numero;

    }
    public void simbolo(int n){
        for(int i = 1; i< n; i++){
            System.out.println("*******");
        }
    }
    @Override
    public void run(){
        simbolo(n);
    }
}
