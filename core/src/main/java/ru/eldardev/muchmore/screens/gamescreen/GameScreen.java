package ru.eldardev.muchmore.screens.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import ru.eldardev.muchmore.screens.ScreensSettings;
import ru.eldardev.muchmore.screens.gamescreen.view.GameView;

public class GameScreen extends ScreenAdapter {
    Stage stage;
    GameView gameView;

    @Override
    public void show() {
        super.show();

        Viewport viewport = new ExtendViewport(ScreensSettings.WIDTH, ScreensSettings.HEIGHT);
        viewport.getCamera().position.set(ScreensSettings.WIDTH / 2, ScreensSettings.HEIGHT / 2, 1);

        stage = new Stage(viewport, new SpriteBatch());
        Gdx.input.setInputProcessor(stage);

        gameView = new GameView();

        stage.addActor(gameView);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act();
        stage.getViewport().apply();

        ScreenUtils.clear(Color.CLEAR);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        stage.getViewport().update(width, height, true);
    }

    @Override
    public void dispose() {
        super.dispose();

        gameView.dispose();
        stage.dispose();
    }
}
