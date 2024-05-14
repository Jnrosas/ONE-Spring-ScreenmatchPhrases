package com.ray.screenmatchPhrases.controllers;

import com.ray.screenmatchPhrases.models.PhraseDTO;
import com.ray.screenmatchPhrases.services.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
   @Autowired
   PhraseService service;

   @GetMapping("/series/frases")
   public PhraseDTO getPhrase() {
      return service.getRandomPhrase();
   }
}
