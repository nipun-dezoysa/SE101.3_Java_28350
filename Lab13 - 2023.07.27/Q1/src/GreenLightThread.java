public class GreenLightThread extends Thread{
    @Override
    public void run() {
        try{
            while (true) {
                System.out.println("Green Light");
                Thread.sleep(10000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
