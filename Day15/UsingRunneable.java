package Day15;


public class UsingRunneable implements Runnable {

    Thread t;
    int end, start;
    String msg;

    public UsingRunneable( int end, int start, String msg){
        super();

        this.end = end;
        this.start = start;
        this.msg = msg;

        t = new Thread(this, "Child Thread");
        t.start();

    }


    @Override
    public void run(){
        for(int i = end; i>start; i--){

        try{
            Thread.sleep(500);
        }
        catch(InterruptedException){
            System.out.println(e.getMessage);
        }
        }

    }

    
}
