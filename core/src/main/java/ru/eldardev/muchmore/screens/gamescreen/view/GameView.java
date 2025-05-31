package ru.eldardev.muchmore.screens.gamescreen.view;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;
import ru.eldardev.muchmore.screens.ScreensResources;
import ru.eldardev.muchmore.screens.gamescreen.view.cards.CardsView;
import ru.eldardev.muchmore.screens.gamescreen.view.players.PlayersView;
import ru.eldardev.muchmore.screens.gamescreen.view.shoppreview.ShopPreview;

public class GameView extends Table {
    PlayersView playersView;

    public GameView() {
        super(new Skin(ScreensResources.SKIN));
        setDebug(Settings.DEBUG);
        setFillParent(true);

        playersView = new PlayersView(super.getSkin());

        add(playersView);

        row();
        add().height(GameViewSettings.SPACING_HEIGHT);
        row();

        add(new CardsView(super.getSkin()));

        row();
        add().height(GameViewSettings.SPACING_HEIGHT);
        row();

        add(new ShopPreview(super.getSkin()));
    }

    public void dispose() {
        playersView.dispose();
        getSkin().dispose();
    }
}
