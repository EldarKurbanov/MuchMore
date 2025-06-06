package ru.eldardev.muchmore.screens.gamescreen.view.players;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import ru.eldardev.muchmore.Settings;

public class PlayersView extends Table {
    public Image[] avatars;
    public Texture avatarTexture;

    public PlayersView(Skin skin) {
        super(skin);

        setDebug(Settings.DEBUG);

        avatarTexture = new Texture(PlayersViewResources.AVATAR);
        avatars = new Image[PlayersViewSettings.PLAYERS_COUNT];

        for (int i = 0; i < avatars.length; i++) {
            add(new Image(avatarTexture)).width(PlayersViewSettings.AVATAR_WIDTH);
        }

        row();

        for (int i = 0; i < PlayersViewSettings.PLAYERS_COUNT; i++) {
            add(new Label("5m", skin));
        }

        row();

        for (int i = 0; i < PlayersViewSettings.PLAYERS_COUNT; i++) {
            add(new Label("3k", skin));
        }
    }

    public void dispose() {
        avatarTexture.dispose();
    }
}
