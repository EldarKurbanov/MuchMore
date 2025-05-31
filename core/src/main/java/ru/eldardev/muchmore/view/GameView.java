package ru.eldardev.muchmore.view;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;

public class GameView extends Table {
    public GameView() {
        super(new Skin(Resources.SKIN));
        super.setDebug(Settings.DEBUG);
        super.setFillParent(true);

        Label example = new Label("Example", super.getSkin());
        Label example2 = new Label("Example", super.getSkin());

        super.add(example);
        super.row();
        super.add(example2);
    }
}
