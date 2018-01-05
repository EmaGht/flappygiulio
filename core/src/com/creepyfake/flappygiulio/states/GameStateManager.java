package com.creepyfake.flappygiulio.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by marchef on 04/01/2018.
 */

public class GameStateManager {

    Stack<GameState> states;

    public GameStateManager(){
        states = new Stack<GameState>();
    }

    public void push(GameState state){
        states.push(state);
    }

    public GameState pop(){
        GameState st = states.pop();
        st.dispose();
        return st;
    }

    public void set(GameState state){
        pop();
        states.push(state);
    }

    public void disposeAll(){
        while(!states.empty())
            pop();
    }

    public void update(float deltaTime) {
        GameState st =states.peek();
        st.update(deltaTime);
    }

    public void render(SpriteBatch batch) {
        GameState st =states.peek();
        st.render(batch);
    }
}
