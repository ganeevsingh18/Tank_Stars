package com.mygdx.game;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.Game;
import org.w3c.dom.Text;

public class MyGdxGame extends Game {
    SpriteBatch batch;
    Texture img;
    Texture pic;
    Texture menu;
    Texture exi;
    Texture play;
    Texture resume;
    Texture change;
    Texture st;
    Texture pause;
    Texture ch;
    Texture saved;

    ShapeRenderer shapeRenderer;
    BitmapFont font;

    @Override
    public void create () {
        batch = new SpriteBatch();
        img = new Texture(Gdx.files.internal("tank.jpg"));
        menu =new Texture(Gdx.files.internal("button.png"));
        exi =new Texture(Gdx.files.internal("exit.jpg"));
        pic=new Texture(Gdx.files.internal("menu.png"));
        st=new Texture(Gdx.files.internal("start.png"));
        saved=new Texture(Gdx.files.internal("saved.png"));
        pause = new Texture(Gdx.files.internal("pause.png"));
        resume=new Texture(Gdx.files.internal("resume.png"));
        change=new Texture(Gdx.files.internal("changetank.png"));
        shapeRenderer = new ShapeRenderer();
        font = new BitmapFont();

        setScreen(new MainMenu(this));
    }

//    @Override
    public void dinspose () {
        batch.dispose();
        img.dispose();
        menu.dispose();
        exi.dispose();
        shapeRenderer.dispose();
        font.dispose();
    }
}
