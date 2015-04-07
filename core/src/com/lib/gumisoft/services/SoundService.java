package com.lib.gumisoft.services;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.utils.Array;
import com.lib.gumisoft.factories.Factory;

public class SoundService {
    private Factory _factory;

    public SoundService(Factory factory) {
        _factory = factory;
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/SwordSwing.mp3")));
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/Swoosh.mp3")));
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/LightsaberTurnOn.mp3")));
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/SwordsColide.mp3")));
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/SwordsClashing.mp3")));
        swords.add(Gdx.audio.newSound(Gdx.files.internal("audio/AxeSwing.mp3")));
    }

    private static Array<Sound> swords = new Array<Sound>();

    public void playSword() {
        swords.get(_factory.getRandomizer().getRandomNumber(6)).play();
    }
}