package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class Pause extends ScreenAdapter {
    MyGdxGame game;
    public Pause(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show(){
    }

    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(game.pause,0,0);
        game.batch.end();
        if(Gdx.input.isTouched()){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x<796 && x>524 && y<548 && y>485){
                game.setScreen(new menu(game));
            }else if(x<796 && x>524 && y<442 && y>379){
                game.setScreen(new play(game));
            }
        }
    }

    @Override
    public void dispose(){
        game.pause.dispose();

    }
}
