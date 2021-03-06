package me.melonboy10.midi2building.util;

import javafx.scene.canvas.Canvas;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import me.melonboy10.midi2building.screenElements.ToggleableCanvas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static me.melonboy10.midi2building.screenElements.GeneratorApplication.scale;

public class ResourceManager {

    public enum BlockAtlas {
        SIDE_TORCH   (0),
        BOTTOM_TORCH (1),
        REPEATER_ONE (2),
        REPEATER_TWO (3),
        LEVER        (4),
        REDSTONE_DOT (5),
        REDSTONE_LINE(6),
        LAMP         (7),
        NOTE_BLOCK   (8);

        public final int column;
        BlockAtlas(int column) {
            this.column = column;
        }
    }

    public static List<String> NOTE_NAMES = new ArrayList<>(){{add("C"); add("C#"); add("D"); add("D#"); add("E"); add("F"); add("F#"); add("G"); add("G#"); add("A"); add("A#"); add("B");}};
    public static final int imageScale = 10;
    public static Image backgroundImage, atlas, mousedLever, blockSelectionbackgroundImage, soundSelectionbackgroundImage, soundAtlas, scrollBar;
    public static Font minecraftia,minecraftiaChest,minecraftiaSign;
    public static DropShadow textShadow;

    static {
        textShadow = new DropShadow();
        textShadow.setRadius(0.0);
        textShadow.setOffsetX(1.0 * scale);
        textShadow.setOffsetY(1.0 * scale);
        textShadow.setColor(Color.gray(0.2));

        try {
            minecraftia = Font.loadFont(getResource("src/main/resources/gui/Minecraftia-Regular.ttf"),5*scale);
            minecraftiaChest = Font.loadFont(getResource("src/main/resources/gui/Minecraftia-Regular.ttf"),6.5*scale);
            minecraftiaSign = Font.loadFont(getResource("src/main/resources/gui/Minecraftia-Regular.ttf"),5*scale);
            atlas = readImage("src/main/resources/gui/BlockAtlas.png");
            soundAtlas = readImage("src/main/resources/gui/SoundAtlas.png");
            mousedLever = readImage("src/main/resources/gui/MousedLever.png");
            backgroundImage = new javafx.scene.image.Image(new FileInputStream("src/main/resources/gui/Background-NoRedstone.png"));
            blockSelectionbackgroundImage = new javafx.scene.image.Image(new FileInputStream("src/main/resources/gui/NoteSelectionBackground.png"));
            soundSelectionbackgroundImage = new javafx.scene.image.Image(new FileInputStream("src/main/resources/gui/BlockSelectionBackground.png"));
            scrollBar = new javafx.scene.image.Image(new FileInputStream("src/main/resources/gui/ScrollBar.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void setCanvas(Canvas canvas, Image image) {
        canvas.getGraphicsContext2D().clearRect(0,0,image.getWidth() * scale,image.getHeight() * scale);
        canvas.getGraphicsContext2D().drawImage(
                image, 0, 0, image.getWidth() * imageScale, image.getHeight() * imageScale, 0, 0, image.getWidth() * scale, image.getHeight() * scale
        );
    }

    /**
     * Gets an image from the Atlas where all the images are stored.
     * Returns a Canvas sized with the app's scale factors
     * @implNote By default, images are 16 x 16 Minecraft pixels where 10 pixels is one MC pixel
     **/
    public static void getImageFromAtlas(ToggleableCanvas canvas, Image image, BlockAtlas atlas) {
        getImageFromAtlas(canvas, image, atlas.column, 0);
    }

    public static void getImageFromAtlas(ToggleableCanvas canvas,Image image, BlockAtlas atlas, int row) {
        getImageFromAtlas(canvas, image, atlas.column, row);
    }

    public static void getImageFromAtlas(ToggleableCanvas canvas, Image image, BlockAtlas atlas, boolean isOn) {
        if (isOn) {
            getImageFromAtlas(canvas, image, atlas.column, 0);
        } else {
            getImageFromAtlas(canvas, image, atlas.column, 1);
        }
    }

    public static void getImageFromAtlas(ToggleableCanvas canvas, Image image, int column, int row) {
        double width = canvas.getPixelWidth();
        double height = canvas.getPixelHeight();

        canvas.getGraphicsContext2D().clearRect(0,0,width * scale,height * scale);
        canvas.getGraphicsContext2D().drawImage(
                image, width * imageScale * column, height * imageScale * row, width * imageScale, height * imageScale, 0, 0, width * scale, height * scale
        );
    }


    // Helper functions to load assets
    // ToDo: Add descriptors and what each function accepts and returns
    public static ImageView readImageView(String path) throws IOException {
        return new ImageView(new javafx.scene.image.Image(new FileInputStream(path)));
    }
    public static Image readImage(String path) throws IOException {
        return new javafx.scene.image.Image(new FileInputStream(path));
    }
    public static FileInputStream getResource(String path) throws FileNotFoundException {
        return new FileInputStream(path);
    }
    public static File getMidi(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter fileExtension = new FileChooser.ExtensionFilter("Select your midi file", "*.mid","*.midi");
        fileChooser.getExtensionFilters().add(fileExtension);
        File midiFile= fileChooser.showOpenDialog(new Stage());
        return midiFile;
    }
}
