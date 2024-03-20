package com.todays.fridge.dto;

import com.todays.fridge.domain.Recipe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RecipeRequest {
    private String name;
    private String description;
    //자바로 리스트를 받아서 저장해야함(그냥 없는걸로 치자...)
//    private String ingredient;

    public Recipe RecipeToEntity(){
        return Recipe.builder()
                .name(name)
                .description(description)
                .build();
    }
}
