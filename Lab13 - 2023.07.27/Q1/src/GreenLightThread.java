public class GreenLightThread extends Thread{
    @Override
    public void run() {

        while (true){
            System.out.println("Green Light");
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}
