package at.mihai.games.firstgame;

import org.newdawn.slick.*;

public class RectanglesGame extends BasicGame {

    private Rectangle rect1;

    public RectanglesGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rect1 = new Rectangle(2,100,100);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rect1.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rect1.render(graphics);
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
