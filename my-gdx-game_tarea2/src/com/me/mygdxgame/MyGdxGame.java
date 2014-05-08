package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Texture texture2;
	private Texture texture3;
	private Sprite sprite;
	private Sprite sprite2;
	private Sprite sprite3;

	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/pacman_multi_agent.png"));

		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 512);
		
		sprite = new Sprite(region);
		sprite.setSize(1f, 1f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2.3f, -sprite.getHeight()/1.3f);
		
		texture2 = new Texture(Gdx.files.internal("data/pacman.png"));

		texture2.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region1 = new TextureRegion(texture2, 0, 0, 256, 256);
		
		sprite2 = new Sprite(region1);
		sprite2.setSize(0.1f, 0.1f * sprite2.getHeight() / sprite2.getWidth());
		sprite2.setOrigin(sprite2.getWidth()/2, sprite2.getHeight()/2);
		sprite2.setPosition(-sprite2.getWidth()/2f, -sprite2.getHeight()/0.4f);
		
		texture3 = new Texture(Gdx.files.internal("data/th_Pacman.png"));

		texture3.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region2 = new TextureRegion(texture3, 0, 0, 256, 256);
		
		sprite3 = new Sprite(region2);
		sprite3.setSize(0.1f, 0.1f * sprite3.getHeight() / sprite3.getWidth());
		sprite3.setOrigin(sprite3.getWidth()/2f, sprite3.getHeight()/2f);
		sprite3.setPosition(-sprite3.getWidth()/2.5f, -sprite3.getHeight()/1.5f);
		
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
		sprite2.draw(batch);
		sprite3.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
