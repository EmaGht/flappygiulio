package com.creepyfake.flappygiulio.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.creepyfake.flappygiulio.sprites.GiulioSprite;

/**
 * Created by marchef on 04/01/2018.
 */

public class Level1GameState extends GameState {
    Texture background;
    GiulioSprite giulio;

    public Level1GameState(GameStateManager gsm) {
        super(gsm);
        giulio = new GiulioSprite();
        background = new Texture("background.png");
    }

    @Override
    public void handleUserInput() {
        if(Gdx.input.justTouched()){
            giulio.flap();
        }
    }

    @Override
    public void update(float deltaTime) {
        handleUserInput();
        giulio.update(deltaTime);
    }

    @Override
    protected void postRender() {

    }

    @Override
    protected void doRender(SpriteBatch sb) {
        sb.draw(background,0,0);
        sb.draw(giulio.getTexture(),giulio.getPosition().x,giulio.getPosition().y);
    }

    @Override
    protected void preRender(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}
