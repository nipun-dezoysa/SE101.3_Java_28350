public class Player extends Movements{
    private int x=0,y=0;
    @Override
    public void up() {
        y++;
        current();
    }

    @Override
    public void down() {
        y--;
        current();
    }

    @Override
    public void left() {
        x--;
        current();
    }

    @Override
    public void right() {
        x++;
        current();
    }
    public void current(){
        System.out.println("X:"+x+" Y:"+y);
    }

}
