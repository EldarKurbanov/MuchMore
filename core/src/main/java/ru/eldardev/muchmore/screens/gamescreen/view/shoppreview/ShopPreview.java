package ru.eldardev.muchmore.screens.gamescreen.view.shoppreview;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;

public class ShopPreview extends Table {
    public ShopPreview(Skin skin) {
        super(skin);
        setDebug(Settings.DEBUG);

        add(new Label("^", skin));

        row();

        add().width(ShopPreviewSettings.WIDTH).height(ShopPreviewSettings.HEIGHT);
    }
}
