package com.creepyfake.flappygiulio.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by marchef on 04/01/2018.
 */

public class GiulioSprite {
    Vector3 position;
    Vector3 velocity;
    Texture texture = new Texture("giulio_temp.bmp");

    public GiulioSprite(){
        position = new Vector3(64,320,0);
        velocity = new Vector3(0,0,0);
    }

    public void flap(){
        velocity.y = 250;

    }

    public void update(float dt){
        //applica gravità
        velocity.add(0,-15,0);

        velocity.scl(dt);
        position.add(velocity);
        velocity.scl(1/dt);

        // stop al terreno
        if(position.y < 160)
            position.y = 160;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return texture;
    }
}
