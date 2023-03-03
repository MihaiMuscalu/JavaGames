package at.mihai.games.firstgame;

import org.newdawn.slick.Graphics;

public class Circle implements Actor{

    private float x,y;
    private float speed;
    private int diameter;

    public Circle(float x, float y, float speed, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void render(Graphics graphics)
    {
        graphics.drawOval(this.x,this.y,this.diameter,this.diameter);
    }

    public void update(int delta) {
        this.y += (double) delta / speed;

        if(this.y > 600)
        {
            this.y = 10;
        }
    }
}
