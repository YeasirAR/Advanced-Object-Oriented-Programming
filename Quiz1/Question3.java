import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageViewer {
    void go(){
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel img1 = readImage("star.png", 50, 50);

        // YOUR CODE HERE
        int x = 300-50;
        int y = 300-50;
        img1.setBounds(x, y, 50, 50);

        for(int i = 0; i < 50; i++){
            img1.setBounds(x, y, 50, 50);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = x - 5;
            y = y - 5;
        }
        ////

        frame.add(img1);
        frame.setVisible(true);
    }


    JLabel readImage(String imagePath, int width, int height){
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));


            Image imageScaled = image.getScaledInstance(width, height,
                    Image.SCALE_SMOOTH);


            return new JLabel(new ImageIcon(imageScaled));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        new ImageViewer().go();
    }
}