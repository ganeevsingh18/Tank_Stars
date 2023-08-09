package com.mygdx.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.Screens.PlayScreen;
import com.badlogic.gdx.Game;

public class MyGdxGame extends Game {
	public static  final int V_WIDTH=1280;
	public static final int V_HEIGHT=720;
	public SpriteBatch batch;
	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();

		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
	}
}

