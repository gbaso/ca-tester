package com.github.gbaso.catester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CaTesterController {

  private final CaTesterService service;

  CaTesterController(CaTesterService service) {
    this.service = service;
  }

  @GetMapping("/ping")
  Ack ping() {
    return service.ping();
  }
}
