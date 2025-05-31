package ru.eldardev.muchmore.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen extends ScreenAdapter {
    Skin skin;
    Stage stage;

    @Override
    public void show() {
        super.show();

        skin = new Skin(Resources.SKIN);

        Viewport viewport = new ExtendViewport(Settings.WIDTH, Settings.HEIGHT);
        viewport.getCamera().position.set(Settings.WIDTH / 2, Settings.HEIGHT / 2, 1);

        stage = new Stage(viewport, new SpriteBatch());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act();
        ScreenUtils.clear(Color.CLEAR);
        stage.getViewport().apply();

        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);

        stage.getViewport().update(width, height);
    }

    @Override
    public void dispose() {
        super.dispose();

        skin.dispose();
        stage.dispose();
    }
}
