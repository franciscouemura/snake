/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.util.Random;

/**
 *
 * @author Francisco
 */
public class Fruit {
    float colorR;
    float colorG;
    float colorB;
    Coordinate coordinate;
    
    public Fruit () {
        Random r = new Random ();
        this.colorR = 0.3f + r.nextFloat()*0.7f;
        this.colorG = 0.3f + r.nextFloat()*0.7f;
        this.colorB = 0.3f + r.nextFloat()*0.7f;
        coordinate = new Coordinate(r.nextInt(58)-29, r.nextInt(58)-29);
    }
}
