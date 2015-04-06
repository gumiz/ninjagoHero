package com.lib.gumisoft.fighters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.lib.gumisoft.factories.Factory;
import com.lib.gumisoft.factories.TextureManager;

public class Ninjago extends Fighter {
    Array<Texture> textures;

    public Ninjago(Factory factory) {
        super(factory);
    }

    @Override
    protected void setup() {
        textures = new Array<Texture>();
        textures.add(TextureManager.getPlayerTextureKai());
        textures.add(TextureManager.getPlayerTextureJay());
        textures.add(TextureManager.getPlayerTextureZane());
    }

    @Override
    protected void setPosition() {
        position = new Vector2(200, 200);
    }

    @Override
    protected void setTexture() {
        int number = _factory.getRandomizer().getRandomNumber(3);
        texture = textures.get(number);
    }

    @Override
    protected void applyMousePosition() {
        int mouseX = Gdx.input.getX();
        int mouseY = Gdx.graphics.getHeight()-Gdx.input.getY();
        if (mouseX > position.x)
            directionX++;
        else
            directionX--;
        if (mouseY > position.y)
            directionY++;
        else
            directionY--;
    }

}