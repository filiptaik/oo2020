package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters(){
        characters = List.of(
            new GameCharacter("Filip", 'M', "Goblin"),
            new GameCharacter("Kati", 'N', "Witch"),
            new GameCharacter("Mati", 'M', "Wizard")
            );
        return characters;
    }
}