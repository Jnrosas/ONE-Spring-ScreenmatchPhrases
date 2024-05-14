package com.ray.screenmatchPhrases.models;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrase {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   private String titulo;
   private String frase;
   private String personaje;
   private String poster;


   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTtulo(String titulo) {
      this.titulo = titulo;
   }

   public String getFrase() {
      return frase;
   }

   public void setFrase(String frase) {
      this.frase = frase;
   }

   public String getPersonaje() {
      return personaje;
   }

   public void setPersonaje(String personaje) {
      this.personaje = personaje;
   }

   public String getPoster() {
      return poster;
   }

   public void setPoster(String poster) {
      this.poster = poster;
   }
}
