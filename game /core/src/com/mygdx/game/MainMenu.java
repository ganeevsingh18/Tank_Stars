package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Input;

public class MainMenu extends ScreenAdapter {
    MyGdxGame game;



    public MainMenu(MyGdxGame game) {
        this.game = game;
//        Gdx.graphics.setContinuousRendering(false);
//        Gdx.graphics.requestRendering();
    }
    @Override
    public void show(){



    }



    public void render (float delta) {
        game.batch.begin();
        game.batch.draw(game.img, 0, 0);
        game.batch.draw(game.menu,10,10);
        game.batch.draw(game.exi,1070,10);

        if(Gdx.input.isTouched()){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x<300 && x>10 && y<710 && y>630){
                System.out.println("hallekjdd");
                game.setScreen(new menu(game));
//               return;
            }
            if(x<1270 && x>1070 && y<710 && y>630){
                System.out.println("something");
                System.exit(0);
            }
        }
        game.batch.end();
    }



    @Override
    public void dispose() {
        game.batch.dispose();
        game.img.dispose();
        game.menu.dispose();
        game.exi.dispose();
    }
}
