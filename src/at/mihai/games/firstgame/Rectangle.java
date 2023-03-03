package at.mihai.games.firstgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.tests.GraphicsTest;

import java.awt.*;

public class Rectangle implements Actor{
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};

    private float speed;
    private float x;
    private float y;
    private DIRECTION objectorientation;


    public Rectangle(float speed, float x, float y) {
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public void render(Graphics graphics)
    {
       graphics.drawRect(this.x,this.y,5,5);
    }

    public void update(int delta) {
        this.x += (double) delta / speed;

        if(this.x > 800)
        {
            this.x = 10;
        }
    }
}
