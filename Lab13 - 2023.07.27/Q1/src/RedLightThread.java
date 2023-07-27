public class RedLightThread extends Thread{
    @Override
    public void run() {
        while (true){

            System.out.println("Red Light");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
