/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author Francisco
 */

import java.awt.Color;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

public class Alphabet {
    GL2 gl;
    
    public Alphabet(GL2 gl){
        this.gl = gl;
    }
    
    public void drawA(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2f, y+2);
        gl.glEnd();
        gl.glFlush();
        
    }
    
        public void drawB(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x, y);
        gl.glEnd();
        gl.glFlush();
        
    }
        
    public void drawC(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        
    }
    
        public void drawD(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        
    }
        
    public void drawE(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+1, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        
    }
    
    public void drawF(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+1, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();

        
    }
    
    public void drawH(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
    }
    
    public void drawI(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y);
        gl.glVertex2f(x+1, y+4);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawJ(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y);
        gl.glVertex2f(x+1, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+1, y);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawK(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawL(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawM(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+1, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y+2);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawN(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();


    }
    
    public void drawO(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x, y);
        gl.glEnd();
        gl.glFlush();


    }
    
    public void drawP(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();

        
    }
    
    public void drawR(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+3);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y+3);
        gl.glEnd();
        gl.glFlush();

        
    }
    
    public void drawS(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();

        
    }
    
    public void drawT(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y);
        gl.glVertex2f(x+1, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        

    }
    
    public void drawU(float x, float y, float width){
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x, y);
        gl.glEnd();
        gl.glFlush();


    }
    
    public void drawY(float x, float y, float width){
        
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+1, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y+2);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y+2);
        gl.glVertex2f(x+1, y);
        gl.glEnd();
        gl.glFlush();
        

    }
    
    public void draw1(float x, float y, float width){
     
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+1, y+4);
        gl.glVertex2f(x+1, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void draw2(float x, float y, float width){
     
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();

        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
    }
    
    public void draw3(float x, float y, float width){
     
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+2, y);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x+1, y+2);
        gl.glEnd();
        gl.glFlush();

        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+4);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
    }
    
    public void draw9(float x, float y, float width){

        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x+2, y+2);
        gl.glVertex2f(x, y+2);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x, y+4);
        gl.glEnd();
        gl.glFlush();
        
        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+4);
        gl.glVertex2f(x+2, y+4);
        gl.glEnd();
        gl.glFlush();

        
    }
    
    public void drawCif(float x, float y, float width){

        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y+2);
        gl.glVertex2f(x+2, y+2);
        gl.glEnd();
        gl.glFlush();

    }
    
    public void drawDot(float x, float y, float width){

        gl.glLineWidth(width);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(x, y);
        gl.glVertex2f(x+0.3f, y);
        gl.glEnd();
        gl.glFlush();

    }
    
}
