package de.neuefische.java.javaonl140926restclient.api;

public record RickAndMortyApiCharacter(
                int id,
                String name,
                String status,
                String species,
                RickAndMortyApiOrigin origin
) {
}
