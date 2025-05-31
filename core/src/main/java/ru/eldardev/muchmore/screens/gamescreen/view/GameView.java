package ru.eldardev.muchmore.screens.gamescreen.view;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;
import ru.eldardev.muchmore.screens.ScreensResources;

public class GameView extends Table {
    PlayersView playersView;

    public GameView() {
        super(new Skin(ScreensResources.SKIN));
        super.setDebug(Settings.DEBUG);
        super.setFillParent(true);

        playersView = new PlayersView(super.getSkin());

        super.add(playersView);
        super.row();
        super.add();
    }

    public void dispose() {
        playersView.dispose();
    }
}
