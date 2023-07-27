public class YellowLightThread extends Thread{
    @Override
    public void run() {
        try{
            while (true) {
                System.out.println("Yellow Light");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
