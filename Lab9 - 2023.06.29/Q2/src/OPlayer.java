public class OPlayer extends Movements {
    private int x=0,y=0;
    @Override
    public void up() {
        y-=2;
        current();
    }

    @Override
    public void down() {
        y+=2;
        current();
    }

    @Override
    public void left() {
        x+=2;
        current();
    }

    @Override
    public void right() {
        x-=2;
        current();
    }
    public void current(){
        System.out.println("X:"+x+" Y:"+y);
    }
}
