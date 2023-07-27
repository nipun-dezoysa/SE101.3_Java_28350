public class Main {
    public static void main(String[] args) {
        RedLightThread rd = new RedLightThread();
        GreenLightThread gr = new GreenLightThread();
        YellowLightThread ye = new YellowLightThread();


        rd.start();

        gr.start();

        ye.start();


    }
}
