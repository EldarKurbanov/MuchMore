package ru.eldardev.muchmore;

import com.badlogic.gdx.Game;
import ru.eldardev.muchmore.screens.gamescreen.GameScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
