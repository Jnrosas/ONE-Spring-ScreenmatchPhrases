package com.ray.screenmatchPhrases;

import com.ray.screenmatchPhrases.models.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

   @Query("select p from Phrase p order by random() limit 1")
   Phrase getRandomPhrase();
}
