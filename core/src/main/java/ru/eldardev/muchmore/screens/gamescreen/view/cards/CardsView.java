package ru.eldardev.muchmore.screens.gamescreen.view.cards;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;

public class CardsView extends Table {
    public CardsView(Skin skin) {
        super(skin);
        setDebug(Settings.DEBUG);

        add(new Label("Cards of the player", skin))
            .colspan(CardsViewSettings.GENERAL_CARDS)
            .height(CardsViewSettings.HEIGHT);

        row();

        add(new Label("-----", skin)).colspan(CardsViewSettings.GENERAL_CARDS);

        row();

        for (int i = 0; i < CardsViewSettings.GENERAL_CARDS; i++) {
            add(new Label("GC"+i, skin));
        }
    }
}
