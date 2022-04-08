package guiapplication;
import java.awt.*;
import java.awt.event.*;

class PSnakeGame extends Frame implements KeyListener {
    Frame f;
    int x=400,y=400,dx=0,dy=0,r=10;
    PSnakeGame(){
        f=new Frame();
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setVisible(true);
        setSize(800,800);
        this.addKeyListener(this);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        x=x+dx;y=y+dy;
        g.fillOval(x,y,r,r);
        
    }
    public void keyPressed(KeyEvent event) {
        dx=0;dy=0;
        int k=event.getKeyCode();
        if (k==KeyEvent.VK_UP){
            dy=dy-1;
        }
        else if (k==KeyEvent.VK_DOWN){
            dy=dy+1;
        }
        else if (k==KeyEvent.VK_RIGHT){
            dx=dx+1;
        }
        else if (k==KeyEvent.VK_LEFT){
            dx=dx-1;
        }
        repaint(); 
    }
    public void keyReleased(KeyEvent event) {

    }
    public void keyTyped(KeyEvent event) {
        

    }
    public static void main(String[] args) {
        new PSnakeGame();
        
    }
    
}