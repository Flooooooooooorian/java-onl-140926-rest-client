package de.neuefische.java.javaonl140926restclient.api;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
//@RequiredArgsConstructor
public class RickAndMortyApiService {

    private final RestClient restClient;

    public RickAndMortyApiService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .build();
    }

    public RickAndMortyCharactersApiResponse loadAllCharacters() {

        RickAndMortyCharactersApiResponse response = restClient.get()
                .uri("https://rickandmortyapi.com/api/character")
                .retrieve()
//                .onStatus(
//                        HttpStatusCode::is4xxClientError,
//                        (httpRequest, httpResponse) -> {
//                            System.out.println("ERROR");
//                        })
                .body(RickAndMortyCharactersApiResponse.class);

        return response;
    }

    public void postCharacter(RickAndMortyCreateCharacterRequest characterRequest) {
        restClient.post()
                .uri("https://rickandmortyapi.com/api/character")
                .body(characterRequest)
                .contentType(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(String.class);
    }
}
