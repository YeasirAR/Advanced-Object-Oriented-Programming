### Question 1

Consider the following code:

```java
JTextField textField = new JTextField("My text");
textField.setBounds(100, 200, 50, 75);
```
What is the x position of the textField object?
- a.50
- **b.100**
- c.75
- d.200

### Question 2
Which of the following statements are true about "Thread.sleep(5);" 

##### a. When used in animation, If the value 5 inside the sleep method is replaced with 50,  the animation will become slower.

##### b. The execution of the program will be halted for 5 millisecond. 

c. The execution of the program will be halted for 5 second. 

d. When used in animation, If the value 5 inside the sleep method is replaced with 50,  the animation will become faster.

### Question 3
Complete the following code, so that the image of the star appears on the bottom-right corner and moves towards the top-left corner, using simple animation concepts.


```java
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

```

### Question 4
Consider the following code (for mouse click event handling):

```java
frame.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        System.out.println(x + " " + y); 
    }
});
```
Suppose when clicked on the top-left corner of the window, the values "30 10" is printed in the console. How can we fix the values of x and y, so that they are correct?
Note: The correct code should print "0 0" in the console when clicked on the top-left corner.


a. 
The code can not be fixed.


b.
int x = e.getX() + 30;
int y = e.getY() + 10;


**c.
int x = e.getX() - 30;
int y = e.getY() - 10;**


d.
int x = e.getX() - 10;
int y = e.getY() - 30;

### Question 5
Which of the following codes is correct?


a.
```java
JButton b = new JButton("Click");
b.addClickListener(new ActionListener() {
    @Override
    public void onClick(ActionEvent e) {
        System.out.println("Hello!");
    }
});
```


b.
```java
JButton b = new JButton("Click");
b.addEventListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello!");
    }
});
```

c.
```java
JButton b = new JButton("Click");
b.addActionListener(new ActionListener() {
    @Override
    public void onClick(ActionEvent e) {
        System.out.println("Hello!");
    }
});
```

**d.**
```java
JButton b = new JButton("Click");
b.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello!");
    }
});
```

### Question 6
Consider the following code: 

```java
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setSize(500, 500); 
frame.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='s'){
            System.out.println("What a fine morning!");
        }
        else{
            System.out.println("It is very hot today!");
        }
    }
});
frame.setVisible(true);
```

What will happen if the user presses the key 's' after running the given code (Assume that other necessary codes for running this code is given and correct)?

a. Nothing happens.

b. The following text is printed in the console: 
"It is very hot today!"

**c. The following text is printed in the console: 
"What a fine morning!"**

d. The given code is incorrect, so the program will not run.
