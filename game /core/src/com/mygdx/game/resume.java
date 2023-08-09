package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class resume extends ScreenAdapter {
    MyGdxGame game;
    public resume(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show(){
    }

    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(game.resume,0,0);
        if(Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x<1280 && x>0 && y<720 && y>0){
                game.setScreen(new menu(game));
            }

        }
        game.batch.end();
    }

    @Override
    public void dispose(){
        game.resume.dispose();
    }

}

