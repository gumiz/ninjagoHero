package com.lib.gumisoft.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.lib.gumisoft.factories.Factory;
import com.lib.gumisoft.factories.IRandomizer;
import com.lib.gumisoft.factories.TextureFactory;

public class Player {
    private final Factory _factory;
    private final IRandomizer _randomizer;
    private Vector2 position = new Vector2();

    public Player(Factory factory) {
        _factory = factory;
        _randomizer = _factory.getRandomizer();
        position = new Vector2(200, 200);
    }

    private Texture getTexture() {
        return TextureFactory.getPlayerTextureKai();
    }

    private void move(){
        int x = _randomizer.getRandomNumber(-2,2);
        int y = _randomizer.getRandomNumber(-2,2);
        position.x += x;
        position.y += y;
    }

    public void render(Batch batch) {
        move();
        batch.draw(getTexture(), position.x, position.y);
    }

}
