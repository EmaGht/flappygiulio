package com.creepyfake.flappygiulio.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by marchef on 04/01/2018.
 */

public class MenuGameState extends GameState {

    private Texture backgroud;
    private Texture playBtn;

    public MenuGameState(GameStateManager gsm) {
        super(gsm);
        backgroud = new Texture("background.png");
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handleUserInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new Level1GameState(gsm));
        }
    }

    @Override
    public void update(float deltaTime) {
        handleUserInput();
    }

    @Override
    protected void postRender() {

    }

    @Override
    protected void doRender(SpriteBatch sb) {
        sb.draw(backgroud,0,0,WIDTH,HEIGHT);
        sb.draw(playBtn,((WIDTH/2)-playBtn.getWidth()/2),((HEIGHT/2)-playBtn.getHeight()/2));
    }

    @Override
    protected void preRender(SpriteBatch sb) {

    }

    @Override
    public void dispose() {
        backgroud.dispose();
        playBtn.dispose();
    }
}
