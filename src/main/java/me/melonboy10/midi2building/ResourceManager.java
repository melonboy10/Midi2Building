package me.melonboy10.midi2building;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResourceManager {

    public static final int imageScale = 10;
    public static Font font = null;
    public static BufferedImage backgroundImage, widgetsScaled;

    private static final ClassLoader classLoader = GeneratorGUI.class.getClassLoader();

    static {
        try {
            Font tempFont = Font.createFont(Font.TRUETYPE_FONT, new File(classLoader.getResource("gui/Minecraftia-Regular.ttf").getFile()));
            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(tempFont);
            font = tempFont.deriveFont((float) 8 * GeneratorGUI.scale);

            backgroundImage = readImage("gui/Background.png");
            widgetsScaled = readImage("gui/Widgets.png");
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    static BufferedImage readImage(String path) throws IOException {
        return ImageIO.read(new File(classLoader.getResource(path).getFile()));
    }
}
