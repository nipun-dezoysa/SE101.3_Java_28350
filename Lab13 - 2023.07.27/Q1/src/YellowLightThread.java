public class YellowLightThread extends Thread{
    @Override
    public void run() {

        while (true){

            System.out.println("Yellow Light");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }

        }
//        while (true){
//            System.out.println("Yellow Light");
//        }


    }
}
