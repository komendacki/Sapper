import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Artur Komendacki on 05.08.2016.
 */
public enum Sprite {
    ZERO("0"), ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"),
    SEVEN("7"), EIGHT("8"), HIDEN("space"), BOMB("bomb"), EXPLOSION("explosion"),
    FLAG("flag"), BROKEN_FLAG("broken_flag");

    private Texture texture;


    private Sprite(String textureName){
        try{
            this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("res/"+textureName+".png")));
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
