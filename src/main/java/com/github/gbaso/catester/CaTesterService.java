package com.github.gbaso.catester;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
class CaTesterService {

  private final RestClient restClient;

  CaTesterService(RestClient.Builder restClientBuilder) {
    this.restClient = restClientBuilder
        .baseUrl("https://mockserver.mockserver:1080")
        .build();
  }

  Ack ping() {
    return restClient
        .get()
        .uri("/ping")
        .retrieve()
        .toEntity(Ack.class)
        .getBody();
  }
}
