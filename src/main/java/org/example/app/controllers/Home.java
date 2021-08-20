package org.example.app.controllers;

import org.example.app.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
  @Autowired
  private Hello hello;

  @GetMapping("/")
  public String home() {
    return hello.getMessage();
  }
}
