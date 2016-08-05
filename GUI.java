import org.lwjgl.opengl.*;

/**
 * Created by Artur Komendacki on 05.08.2016.
 */
public class GUI {

    private static Cell[][] cells;

    public static int receiveClick(int x, int y, int button){
        int cell_x = x/CELL_SIZE;
        int cell_y = y/CELL_SIZE;

        return cells[cell_x][cell_y].receiveClick(x, y, button);
    }

    public static void Update(){
        updateOpenGL();
    }

    private static void updateOpenGL(){
        Display.update();
        Display.sync();
    }

}
