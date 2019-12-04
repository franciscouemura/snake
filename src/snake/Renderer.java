
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
    int fase = 3;
    int x =0;
    int y =0;
    int state = 0;
    boolean blinkState = false;
    Alphabet alfa;
    
    
    //--------------FUNÇÕES-----------------

    
    
        public void initGameParams(){
            x=0;
            y=0;
                direction = KeyEvent.VK_RIGHT;
                beforeStateDirection = KeyEvent.VK_RIGHT;
                snake = new ArrayList();
                snake.add(new Coordinate (-3,0));
                snake.add(new Coordinate (-2,0));
                snake.add(new Coordinate (-1,0));
                snake.add(new Coordinate (0,0));

                this.fruit = new Fruit();
        }
        
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
                    if(step>30){
                      goToDirection();
                      stepInit = System.currentTimeMillis();
                    }
                    break;
                case 3:
                    if(step>15){
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
               case KeyEvent.VK_ESCAPE:
                   state=0;
                   break;
           }
             
             if(x>30) x=-30;
             if(y>30) y= -30;
             if(x<-30) x=30;
             if(y<-30) y= 30;
             isDead();
        
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
        
        
        public void isDead() {
            for (Coordinate c: snake) {
                if(c.x == x && c.y == y && snake.indexOf(c)!= snake.size()-1) {
                    state = 2;
                    direction = 0;
                }
            }
        
        }
        
        public void deadAnimation() {
            long stepNow = System.currentTimeMillis();
            long step = stepNow -stepInit;
            
            
                if(blinkState) {
                    gl.glColor3f(1.0f, 1.0f, 1.0f);
                    drawSnake();
                    if (step> 150) {
                        stepInit = System.currentTimeMillis();
                        blinkState = false;
                    }
                } else {
                    if (step> 150) {
                        stepInit = System.currentTimeMillis();
                        blinkState = true;
                    }
                }
            
        
        }
        
        public void pressAnimation () {
            long stepNow = System.currentTimeMillis();
            long step = stepNow -stepInit;
            
            
                if(blinkState) {
                    gl.glColor3f(0f, 1.0f, 1.0f);
                        alfa.drawP(-6f, 15f, 2.0f);
                        alfa.drawR(-3f, 15f, 2.0f);
                        alfa.drawE(0f, 15f, 2.0f);
                        alfa.drawS(3f, 15f, 2.0f);
                        alfa.drawS(6f, 15f, 2.0f);
                    if (step> 150) {
                        stepInit = System.currentTimeMillis();
                        blinkState = false;
                    }
                } else {
                    if (step> 150) {
                        stepInit = System.currentTimeMillis();
                        blinkState = true;
                    }
                }
        }
        
        public void state0(){
            
            pressAnimation();
                        
            gl.glColor3f(1.0f, 0f, 0.3f);
            alfa.draw1(-10.5f, 6f, 2.0f);
            alfa.drawCif(-7.5f, 6f, 2.0f);
            gl.glColor3f(0f, 1.0f, 0f);
            alfa.drawS(-4.5f, 6f, 2.0f);
            alfa.drawT(-1.5f, 6f, 2.0f);
            alfa.drawA(1.5f, 6f, 2.0f);
            alfa.drawR(4.5f, 6f, 2.0f);
            alfa.drawT(7.5f, 6f, 2.0f);
                        
            gl.glColor3f(1.0f, 0f, 0.3f);
            alfa.draw2(-10.5f, 1f, 2.0f);
            alfa.drawCif(-7.5f, 1f, 2.0f);
            gl.glColor3f(0f, 1.0f, 0f);
            alfa.drawA(-4.5f, 1f, 2.0f);
            alfa.drawB(-1.5f, 1f, 2.0f);
            alfa.drawO(1.5f, 1f, 2.0f);
            alfa.drawU(4.5f, 1f, 2.0f);
            alfa.drawT(7.5f, 1f, 2.0f);
            
             switch(direction){
               case KeyEvent.VK_1:                  
                   state = 4;
                   direction = KeyEvent.VK_RIGHT;
                   break;
               case KeyEvent.VK_2:
                   state=3;
                   break;
                   
             }
        
        }
        
        public void state2 () {
            
            gl.glColor3f(1.0f, 0.3f, 0.3f);
            gl.glLineWidth(3);
            
            alfa.drawP(-13.5f, -5f, 2.0f);
            alfa.drawR(-10.5f, -5f, 2.0f);
            alfa.drawE(-7.5f, -5f, 2.0f);
            alfa.drawS(-4.5f, -5f, 2.0f);
            alfa.drawS(-1.5f, -5f, 2.0f);
            
            alfa.drawA(4.5f, -5f, 2.0f);
            alfa.drawN(7.5f, -5f, 2.0f);
            alfa.drawY(10.5f, -5f, 2.0f);
            
            alfa.drawK(-4.5f, -11f, 2.0f);
            alfa.drawE(-1.5f, -11f, 2.0f);
            alfa.drawY(1.5f, -11f, 2.0f);
            
            
            gl.glScalef(2, 2, 2);
            alfa.drawD(-6f, 5f, 5.0f);
            alfa.drawE(-3f, 5f, 5.0f);
            alfa.drawA(0f, 5f, 5.0f);
            alfa.drawD(3f, 5f, 5.0f);
            
            if(direction !=0){
                state = 0;
            }
        
        }
        
        
        public void state3 () {
            gl.glColor3f(1f, 0.2f, 0f);
            
            alfa.drawA(-10.5f, 15f, 2.0f);
            alfa.drawU(-7.5f, 15f, 2.0f);
            alfa.drawT(-4.5f, 15f, 2.0f);
            alfa.drawH(-1.5f, 15f, 2.0f);
            alfa.drawO(1.5f, 15f, 2.0f);
            alfa.drawR(4.5f, 15f, 2.0f);
            alfa.drawS(7.5f, 15f, 2.0f);
            
            gl.glColor3f(0f, 1.0f, 0.3f);
            alfa.drawF(-19.5f, 6f, 2.0f);
            alfa.drawR(-16.5f, 6f, 2.0f);
            alfa.drawA(-13.5f, 6f, 2.0f);
            alfa.drawN(-10.5f, 6f, 2.0f);
            alfa.drawC(-7.5f, 6f, 2.0f);
            alfa.drawI(-4.5f, 6f, 2.0f);
            alfa.drawS(-1.5f, 6f, 2.0f);
            alfa.drawC(1.5f, 6f, 2.0f);
            alfa.drawO(4.5f, 6f, 2.0f);
            
            alfa.drawU(10.5f, 6f, 2.0f);
            alfa.drawDot(13.5f, 6f, 2.0f);
            
            alfa.drawJ(15.5f, 6f, 2.0f);
            alfa.drawDot(17.5f, 6f, 2.0f);
            
            gl.glColor3f(0f, 1.0f, 0.3f);
            alfa.drawM(-15f, -1f, 2.0f);
            alfa.drawU(-12f, -1f, 2.0f);
            alfa.drawR(-9f, -1f, 2.0f);
            alfa.drawI(-6f, -1f, 2.0f);
            alfa.drawL(-3f, -1f, 2.0f);
            alfa.drawO(0f, -1f, 2.0f);
            
            alfa.drawM(6f, -1f, 2.0f);
            alfa.drawDot(9f, -1f, 2.0f);
            
            alfa.drawA(11f, -1f, 2.0f);
            alfa.drawDot(14.5f, -1f, 2.0f);
            
            gl.glColor3f(0f, 1.0f, 0.3f);
            alfa.drawI(-6f, -15f, 2.0f);
            alfa.drawF(-3f, -15f, 2.0f);
            alfa.drawT(0f, -15f, 2.0f);
            alfa.drawM(3f, -15f, 2.0f);
            
            alfa.drawO(-10.5f, -20f, 2.0f);
            alfa.draw2(-7.5f, -20f, 2.0f);
            alfa.drawCif(-4.5f, -20f, 2.0f);
            alfa.draw2(-1.5f, -20f, 2.0f);
            alfa.drawO(1.5f, -20f, 2.0f);
            alfa.draw1(4.5f, -20f, 2.0f);
            alfa.draw9(7.5f, -20f, 2.0f);

            switch(direction){
               case KeyEvent.VK_ESCAPE:
                   state = 0;
                   direction = KeyEvent.VK_RIGHT;
                   break;
             }
        }
        
        public void state4 () {
            
            gl.glColor3f(0f, 1.0f, 1f);
            alfa.drawD(-15f, 15f, 2.0f);
            alfa.drawI(-12f, 15f, 2.0f);
            alfa.drawF(-9f, 15f, 2.0f);
            alfa.drawF(-6f, 15f, 2.0f);
            alfa.drawI(-3f, 15f, 2.0f);
            alfa.drawC(0f, 15f, 2.0f);
            alfa.drawU(3f, 15f, 2.0f);
            alfa.drawL(6f, 15f, 2.0f);
            alfa.drawT(9f, 15f, 2.0f);
            alfa.drawY(12f, 15f, 2.0f);
            
            gl.glColor3f(0.2f, 1f, 0.2f);
            alfa.draw1(-15f, 6f, 2.0f);
            alfa.drawCif(-12f, 6f, 2.0f);
            alfa.drawO(-9f, 6f, 2.0f);
            alfa.drawK(-6f, 6f, 2.0f);
            
            gl.glColor3f(0.2f, 0.2f, 1f);
            alfa.draw2(-15f, -1f, 2.0f);
            alfa.drawCif(-12f, -1f, 2.0f);
            alfa.drawK(-9f, -1f, 2.0f);
            alfa.drawI(-6f, -1f, 2.0f);
            alfa.drawN(-3f, -1f, 2.0f);
            alfa.drawD(0f, -1f, 2.0f);
            alfa.drawA(3f, -1f, 2.0f);
            alfa.drawO(9f, -1f, 2.0f);
            alfa.drawK(12f, -1f, 2.0f);
            
            gl.glColor3f(1f, 0.2f, 0.2f);
            alfa.draw3(-15f, -8f, 2.0f);
            alfa.drawCif(-12f, -8f, 2.0f);
            alfa.drawN(-9f, -8f, 2.0f);
            alfa.drawO(-6f, -8f, 2.0f);
            alfa.drawT(-3f, -8f, 2.0f);
            alfa.drawO(3f, -8f, 2.0f);
            alfa.drawK(6f, -8f, 2.0f);
            
            switch(direction){
               case KeyEvent.VK_1:
                   initGameParams();
                   fase = 1;
                   state = 1;
                   break;
               case KeyEvent.VK_2:
                   initGameParams();
                   fase = 2;
                   state = 1;
                   break;
               case KeyEvent.VK_3:
                   initGameParams();
                   fase = 3;
                   state = 1;
                   break;
                   
             }
            
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
                
                

                switch(state){
                    case 0:
                        state0();
                        
                        break;
                    case 1:
                        faseCalc();
                        drawSnake();
                        drawFruit();
                        break;
                    case 2:
                        deadAnimation();
                        drawFruit();
                        state2();
                        break;
                    case 3:
                        // -----ABOUT--------
                        state3();
                        break;
                    case 4:
                        state4();
                        break;
                }


                

                      

                
                
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		
		gl = drawable.getGL().getGL2();
                stepInit = System.currentTimeMillis();

                alfa = new Alphabet(gl);
		
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