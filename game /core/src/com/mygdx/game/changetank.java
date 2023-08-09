package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class changetank extends ScreenAdapter {
    MyGdxGame game;
    public changetank(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show(){
    }

    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(game.change,0,0);

        if(Gdx.input.isTouched()){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x>72 && x<600 && y<629 && y>370){
                game.setScreen(new menu(game));
            }
        }
        game.batch.end();
    }

    @Override
    public void dispose(){
        game.change.dispose();

    }
}
