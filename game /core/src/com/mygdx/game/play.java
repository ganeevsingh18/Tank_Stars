package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class play extends ScreenAdapter {
    MyGdxGame game;
    public play(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show(){
    }

    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(game.st,0,0);
        game.batch.end();
        if(Gdx.input.isTouched()){
            int x=Gdx.input.getX();
            int y=Gdx.input.getY();
            if(x<320 && x>0 && y<718 && y>500) {
                System.out.println("hallekjdd");
                game.setScreen(new MainMenu(game));
            }else if(x<802 && x>529 && y<683 && y>623){
                System.out.println("hallekjdd");
                game.setScreen(new Save(game));
            }else if(x<1263 && x>1146 && y<130 && y>14){
                System.out.println("hallekjdd");
                game.setScreen(new Pause(game));
            }
//            if(x<1270 && x>1070 && y<710 && y>630){
//                System.out.println("something");
//                System.exit(0);
//            }
        }
    }

    @Override
    public void dispose(){
        game.st.dispose();

    }

}
