package com.todays.fridge.domain;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Recipe {
    @Id
    @Column(name = "name", updatable = false)
    private String name;

    @Column(name = "description")
    private String description;

//    @Column(name = "ingredient")
//    private String ingredient;
    @Builder
    public Recipe(String name, String description){
        this.name=name;
        this.description=description;
    }

}
