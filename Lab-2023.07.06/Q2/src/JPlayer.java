public class JPlayer extends Movements {
    private int x=0,y=0;
    private boolean isCrouch = false;
    public void crouch (){
        if(isCrouch)isCrouch=false;
        else isCrouch=true;
    }
    @Override
    public void up() {
        if(isCrouch)y+=5;
        else y+=2;
        current();
    }

    @Override
    public void down() {
        if(isCrouch)y-=5;
        else y-=2;
        current();
    }

    @Override
    public void left() {
        if(isCrouch)x-=5;
        else x-=2;
        current();
    }

    @Override
    public void right() {
        if(isCrouch)x+=5;
        else x+=2;
        current();
    }
    public void current(){
        System.out.println("X:"+x+" Y:"+y);
    }
}
