package com.mygdx.game.Scenes;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.Viewport;


import java.awt.*;

public class Terrain {
    public Stage stage;
    private Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label tankLabel;

    public Terrain(SpriteBatch sb){
        worldTimer=300;
        timeCount=0;
        score=0;
        viewport = new FillViewport(MyGdxGame.V_WIDTH,MyGdxGame.V_HEIGHT,new OrthographicCamera());
        stage= new Stage(viewport,sb);

        Table table =new Table();
        table.top();
        table.setFillParent(true);

        countdownLabel= new Label(String.format("%03d",worldTimer),new Label.LabelStyle(new BitmapFont(),Color.WHITE));
        scoreLabel= new Label(String.format("%06d",score),new Label.LabelStyle(new BitmapFont(),Color.WHITE));

        table.add(countdownLabel).expandX().padTop(10);
        table.add(scoreLabel).expandX().padTop(10);

        stage.addActor(table);

    }


}
