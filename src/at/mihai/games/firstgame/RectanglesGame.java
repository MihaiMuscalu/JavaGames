package at.mihai.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectanglesGame extends BasicGame {

    private List<Actor>actors;
    private Rectangle rect1;

    public RectanglesGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100;i++)
        {
            Rectangle rectangle = new Rectangle(random.nextInt(5), random.nextInt(600), random.nextInt(600));
            actors.add(rectangle);
        }

        for (int i = 0; i < 100;i++)
        {
            Circle circle = new Circle(random.nextInt(600), random.nextInt(600), random.nextInt(10),random.nextInt(10));
            actors.add(circle);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(delta);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectanglesGame("RectanglesGame"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
