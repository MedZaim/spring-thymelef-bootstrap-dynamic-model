/**
 * @author : Mohamed Zaim
 * @mailto : mohamed.zaim97@gmail.com
 * @created : 20/04/2024, Saturday
 **/


package com.smi.zaim.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity    @Data @NoArgsConstructor @AllArgsConstructor
public class Cantry {
    @Id @GeneratedValue
  private   int id ;
  private   String name;
  private String capital;

    public Cantry(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
