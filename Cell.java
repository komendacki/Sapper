/**
 * Created by Admin on 07.08.2016.
 */
public class Cell implements GUIElement {

    private int x;
    private int y;
    private int state;
    boolean isMarked;
    boolean isHidden;


    public Cell(int x, int y, int state){
        this.x = x;
        this.y = y;
        this.state = state;
        isMarked = false;
        isHidden = false;
    }


    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public Sprite getSprite() {
        if (this.isMarked){
            if(!this.isHidden && this.state != -1){
                return Sprite.BROKEN_FLAG;
            }
            return Sprite.FLAG;
        }else if(this.isHidden){
            return Sprite.HIDEN;
        }else{
            switch(state){
                case -2:
                    return Sprite.EXPLOSION;
                case -1:
                    return Sprite.BOMB;
                default:
                    assert (state>=0 && state<=8): "Some crap";
                    return skin_by_number[state];
            }
        }
    }

    @Override
    public int receiveClick(int x, int y, int button) {
        return 0;
    }
}
