/**
 * Created by Artur Komendacki on 05.08.2016.
 */
public interface GUIElement {

    int getWidth();

    int getHeight();

    int getX();

    int getY();

    Sprite getSprite();

    int receiveClick(int x, int y, int button);

    default boolean isHit(int xclick, int yclick){
        return (    (   (xclick > getX()    ) && (xclick < getX()+this.getWidth()))
                && (    (yclick > getY()) && (yclick < getY()+this.getHeight())  )  );
    }
}
