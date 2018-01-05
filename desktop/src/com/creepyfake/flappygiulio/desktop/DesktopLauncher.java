package com.creepyfake.flappygiulio.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.creepyfake.flappygiulio.FlappyGiulioGame;
import com.creepyfake.flappygiulio.states.GameState;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = GameState.WIDTH;
		config.height = GameState.HEIGHT;
		new LwjglApplication(new FlappyGiulioGame(), config);
	}
}
