package at.mihai.games.firstgame;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.tests.GraphicsTest;

import java.awt.*;

public class Rectangle {
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
       graphics.drawRect(this.x,this.y,100,100);
    }

    public void update(int delta) {
        if(this.y <= 100)
        {
            this.x +=(float)delta/speed;
        }
        if(this.x >= 600)
        {
            this.y +=(float)delta/speed;
        }
        if(this.y >= 400)
        {
            this.x -=(float)delta/speed;
        }
        if(this.x <= 100 && this.y > 100)
        {
            this.y -=(float)delta/speed;
        }

        }
}
