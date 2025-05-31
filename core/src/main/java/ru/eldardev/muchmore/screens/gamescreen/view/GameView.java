package ru.eldardev.muchmore.screens.gamescreen.view;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;
import ru.eldardev.muchmore.screens.ScreensResources;

public class GameView extends Table {
    PlayersView playersView;

    public GameView() {
        super(new Skin(ScreensResources.SKIN));
        setDebug(Settings.DEBUG);
        setFillParent(true);

        playersView = new PlayersView(super.getSkin());

        add(playersView);
        row();
        add(new CardsView(super.getSkin()));
    }

    public void dispose() {
        playersView.dispose();
    }
}
