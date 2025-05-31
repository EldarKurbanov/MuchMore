package ru.eldardev.muchmore.screens.gamescreen.view;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;

public class PlayersView extends Table {
    public Image[] avatars;
    public Texture avatarTexture;

    public PlayersView(Skin skin) {
        super(skin);

        super.setDebug(Settings.DEBUG);

        avatarTexture = new Texture(ViewResources.AVATAR);
        avatars = new Image[ViewSettings.PLAYERS_COUNT];

        for (int i = 0; i < avatars.length; i++) {
            super.add(new Image(avatarTexture)).width(ViewSettings.AVATAR_WIDTH);
        }
    }

    public void dispose() {
        avatarTexture.dispose();
    }
}
