package com.creepyfake.flappygiulio.states;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by marchef on 04/01/2018.
 */

public abstract class GameState {

    public final static int WIDTH = 480;
    public final static int HEIGHT = 800;
    protected OrthographicCamera cam;
    protected GameStateManager gsm;
    protected Vector3 mouse;

    protected GameState(GameStateManager gsm) {

        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }


    public abstract void handleUserInput();

    public abstract void update(float deltaTime);

    public void render(SpriteBatch sb){
        preRender(sb);
        sb.begin();
        doRender(sb);
        sb.end();
        postRender();
    }

    protected abstract void postRender();

    protected abstract void doRender(SpriteBatch sb);

    protected abstract void preRender(SpriteBatch sb);

    public abstract void dispose();
}
