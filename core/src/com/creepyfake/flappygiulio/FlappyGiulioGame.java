package com.creepyfake.flappygiulio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.creepyfake.flappygiulio.states.GameStateManager;
import com.creepyfake.flappygiulio.states.MenuGameState;

public class FlappyGiulioGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	GameStateManager gsm;


	@Override
	public void create () {

		gsm = new GameStateManager();
		gsm.push(new MenuGameState(gsm));

		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());



		gsm.render(batch);

		/*batch.begin();
		batch.draw(img, 0, 0);
		batch.end();*/
	}
	
	@Override
	public void dispose () {
		gsm.disposeAll();

		batch.dispose();
		img.dispose();
	}
}
