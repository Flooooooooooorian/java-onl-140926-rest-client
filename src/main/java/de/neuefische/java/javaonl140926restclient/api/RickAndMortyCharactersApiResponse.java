package de.neuefische.java.javaonl140926restclient.api;

import java.util.List;

public record RickAndMortyCharactersApiResponse(
        RickAndMortyApiInfo info,
        List<RickAndMortyApiCharacter> results
) {
}
