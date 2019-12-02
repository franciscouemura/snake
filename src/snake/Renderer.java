
package snake;

import java.awt.Color;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.FPSAnimator;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Renderer extends KeyAdapter implements GLEventListener{
    GL2 gl;
    long stepInit;
    GLU glu;
    float dotSize = 5;
    int direction = KeyEvent.VK_RIGHT;
    int beforeStateDirection = KeyEvent.VK_RIGHT;
    ArrayList <Coordinate> snake = new ArrayList();
    Fruit fruit;
    int fase = 1;
    int x =0;
    int y =0;
    
    
    //--------------FUNÇÕES-----------------

        public void drawSnake(){
            
            for (Coordinate dot : snake){
                gl.glPointSize(dotSize);
                gl.glBegin(GL2.GL_POINTS);
                gl.glVertex2f(dot.x, dot.y);
                gl.glEnd();
                gl.glFlush();
            
            }

                
        }
        
        public void faseCalc() {
            long stepNow = System.currentTimeMillis();
            long step = stepNow -stepInit;
            
            switch (fase) {
                case 1:
                    if(step>45){
                      goToDirection();
                      stepInit = System.currentTimeMillis();
                    }
                    break;
                case 2:
                    if(step>35){
                      goToDirection();
                      stepInit = System.currentTimeMillis();
                    }
                    break;
                case 3:
                    if(step>20){
                      goToDirection();
                      stepInit = System.currentTimeMillis();
                    }
                    break;
                  
            }
            
            
        }
        
        public void goToDirection(){
             switch(direction){
               case KeyEvent.VK_UP:
                   if (beforeStateDirection != KeyEvent.VK_DOWN){
                       y++;
                       beforeStateDirection = KeyEvent.VK_UP;
                       moveSanake(hasEaten());  
                   }else {
                       y--;
                       moveSanake(hasEaten());
                   }
                   break;
               case KeyEvent.VK_DOWN:
                   if (beforeStateDirection != KeyEvent.VK_UP){
                       y--;
                       beforeStateDirection = KeyEvent.VK_DOWN;
                       moveSanake(hasEaten());
                   }else {
                       y++;
                       moveSanake(hasEaten());
                   }
                   break;
               case KeyEvent.VK_LEFT:
                   if (beforeStateDirection != KeyEvent.VK_RIGHT) {
                       x--;
                       beforeStateDirection = KeyEvent.VK_LEFT;
                       moveSanake(hasEaten());
                   }else {
                       x++;
                       moveSanake(hasEaten());
                   }
                   break;
               case KeyEvent.VK_RIGHT:
                   if (beforeStateDirection != KeyEvent.VK_LEFT) {
                       x++;
                       beforeStateDirection = KeyEvent.VK_RIGHT;
                       moveSanake(hasEaten());
                   }else {
                       x--;
                       moveSanake(hasEaten());
                   }
                   break;
           }
             
             if(x>30) x=-30;
             if(y>30) y= -30;
             if(x<-30) x=30;
             if(y<-30) y= 30;
        
        }
        
        public void moveSanake(boolean eate) {
            if (eate) {
                snake.add(new Coordinate(x, y));
                fruit = new Fruit();
            }else {
                snake.add(new Coordinate(x, y));
                snake.remove(0);
            }

        }
        
        public void drawFruit () {
                gl.glColor3f(fruit.colorR, fruit.colorG, fruit.colorB);
                gl.glPointSize(dotSize);
                gl.glBegin(GL2.GL_POINTS);
                gl.glVertex2f(fruit.coordinate.x, fruit.coordinate.y);
                gl.glEnd();
                gl.glFlush();
        }
        
        public boolean hasEaten() {
            return x == fruit.coordinate.x && y == fruit.coordinate.y;
        }
    
    @Override
       public void keyPressed(KeyEvent e){
          this.direction = e.getKeyCode();
          System.out.println(direction);
          
       }
       
    @Override
       public void keyReleased(KeyEvent e) {  
        
        }
       
    @Override
       public void keyTyped(KeyEvent e) {  
        
        }  
    
    
    //--------------FIM DE FUNÇÕES-----------------
            
            
            
     
    
        
    
	@Override
	public void display(GLAutoDrawable drawable) {
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
                gl.glMatrixMode(GL2.GL_MODELVIEW);
                gl.glLoadIdentity();
                gl.glColor3f(1.0f, 1.0f, 1.0f);
                

                

                faseCalc();
                drawSnake();
                drawFruit();
                

                      

                
                
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		
		gl = drawable.getGL().getGL2();
                stepInit = System.currentTimeMillis();
                snake.add(new Coordinate (0,0));
                snake.add(new Coordinate (-1,0));
                snake.add(new Coordinate (-2,0));
                snake.add(new Coordinate (-3,0));
                
                this.fruit = new Fruit();
                
		
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0);
                gl.glClearDepth(1.0f);
		gl.glMatrixMode(GL2.GL_PROJECTION);
		gl.glLoadIdentity();
		
		glu = new GLU();
		glu.gluOrtho2D(-30f, 30f, -30f, 30f);
                

	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
	}
	
	@Override
	public void dispose(GLAutoDrawable arg0) {
	}
        
	
	
        void load() {

		
		GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities cap = new GLCapabilities(profile);
		
		GLCanvas canvas = new GLCanvas(cap);
		canvas.addGLEventListener(this);
     
		
		JFrame frame = new JFrame("Snake");
		frame.getContentPane().add(canvas);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
                frame.addKeyListener(this);
                
                FPSAnimator animator = new FPSAnimator(canvas, 60);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		animator.start();
	}

}