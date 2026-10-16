package de.neuefische.java.javaonl140926restclient;

import de.neuefische.java.javaonl140926restclient.api.RickAndMortyApiService;
import de.neuefische.java.javaonl140926restclient.api.RickAndMortyCharactersApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final RickAndMortyApiService rickAndMortyApiService;

    @GetMapping
    public RickAndMortyCharactersApiResponse getAllCharacters() {
        return rickAndMortyApiService.loadAllCharacters();
    }
}
