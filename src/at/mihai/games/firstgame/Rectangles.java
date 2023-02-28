package at.mihai.games.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private float Squarex;
    private float Squarey;
    private float Circlex;
    private float Circley;
    private float Ovalx;
    private float Ovaly;
    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.Squarex = 100;
        this.Squarey = 100;
        this.Circlex = 30;
        this.Circley = 30;
        this.Ovalx = 100;
        this.Ovaly = 20;
        this.speed = 2;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        if(this.Squarey <= 100)
        {
            this.Squarex +=(float)delta/speed;
        }
        if(this.Squarex >= 600)
        {
            this.Squarey +=(float)delta/speed;
        }
        if(this.Squarey >= 400)
        {
            this.Squarex -=(float)delta/speed;
        }
        if(this.Squarex <= 100 && this.Squarey > 100)
        {
            this.Squarey -=(float)delta/speed;
        }


        if(this.Circley <= 30)
        {
            this.Circlex = 30;
        }
        if(this.Circlex == 30)
        {
            this.Circley +=(float)delta/speed;
        }else this.Circley -=(float)delta/speed;

        if(this.Circley >= 500)
        {
            this.Circlex = 31;
        }


        if(this.Ovalx <= 100)
        {
            this.Ovaly = 30;
        }
        if(this.Ovaly == 30)
        {
            this.Ovalx +=(float)delta/speed;
        }else this.Ovalx -=(float)delta/speed;

        if(this.Ovalx >= 500)
        {
            this.Ovaly = 31;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.Squarex,this.Squarey,100,100);
        graphics.drawOval(this.Circlex,this.Circley,50,50);
        graphics.drawOval(this.Ovalx,this.Ovaly,100,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
