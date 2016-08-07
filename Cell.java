/**
 * Created by Admin on 07.08.2016.
 */
public class Cell implements GUIElement {

    private int x;
    private int y;
    private int state;


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
        return null;
    }

    @Override
    public int receiveClick(int x, int y, int button) {
        return 0;
    }
}
