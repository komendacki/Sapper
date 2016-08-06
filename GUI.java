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
        Display.sync(60);
    }

    public static void Draw(){
        glClear(GL_COLOR_BUFFER_BIT);

        for(GUIElement[] line:cells){
            for(GUIElement cell:line){
                drawElement(cell);
            }
        }
    }

    private static void drawElement(GUIElement elem){


        elem.getSprite().getTexture().bling();

        /*SHOULD BE REFACTORED!!!*/
        glBegin(GL_QUADS);
            glTextCoord2f(0, 0);
            glVertex2f(elem.getX(), elem.getY()+elem.getHeight());
            glTexCoord2f(1, 0);
            glVertex2f(elem.getX()+elem.getWidth(), elem.getY()+elem.getHeight());
            glTexCoord2f(1,1);
            glVertex2f(elem.getX()+elem.getWidth(), elem.getY());
            glTextCoord2f(0, 1);
            glVertex2f(elem.getX(), elem.getY());
        glEnd();
    }

}
