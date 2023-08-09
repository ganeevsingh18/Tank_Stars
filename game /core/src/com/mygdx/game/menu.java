package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
public class menu extends ScreenAdapter {
    MyGdxGame game;
    public menu(MyGdxGame game){
        this.game=game;
    }
    @Override
    public void show(){
    }

    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(game.pic,0,0);
//        game.batch.draw(game.resume,1000,300);
//        game.batch.draw(game.change,1000,50);
        game.batch.end();
        if(Gdx.input.isTouched()) {

            int x = Gdx.input.getX();
            int y = Gdx.input.getY();
            if (x < 898 && x > 627 && y < 377 && y > 315) {
                game.setScreen(new resume(game));
            } else if (x < 898 && x > 627 && y < 480 && y > 420) {
                game.setScreen(new changetank(game));
            } else if (x < 898 && x > 626 && y < 271 && y > 157) {
                game.setScreen(new play(game));
            }else if(x< 1270 && x>1041 && y>400 && y<708){
                System.exit(0);
            }
            if(x<1270 && x>1070 && y<710 && y>630){
                System.out.println("something");
                System.exit(0);
            }

        }
    }

    @Override
    public void dispose(){
        game.pic.dispose();

//        game.change.dispose();
//        game.resume.dispose();
    }

}
