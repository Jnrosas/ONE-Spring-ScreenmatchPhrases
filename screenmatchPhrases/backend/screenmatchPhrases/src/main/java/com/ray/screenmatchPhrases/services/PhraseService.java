package com.ray.screenmatchPhrases.services;

import com.ray.screenmatchPhrases.PhraseRepository;
import com.ray.screenmatchPhrases.models.Phrase;
import com.ray.screenmatchPhrases.models.PhraseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
   @Autowired
   PhraseRepository repository;

   public PhraseDTO getRandomPhrase() {
      Phrase p = repository.getRandomPhrase();
      return new PhraseDTO(p.getTitulo(), p.getFrase(), p.getPersonaje(), p.getPoster());
   }
}
