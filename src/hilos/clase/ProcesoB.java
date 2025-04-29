package hilos.clase;

public class ProcesoB  extends Thread{ //Thread: clase para que funcione como subproceso

    private int n;
    public ProcesoB(int n){
        this.n=n;

    }
    public void contar(int n){
        for(int i=1; i<=n ; i++){
            System.out.println("Iteracion N.- "+i);
        }
    }

    @Override
    public void run(){
        for(int i= 1; i<n; i++){
            System.out.println("Iteraccion N.- "+i);
            try{
                sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
