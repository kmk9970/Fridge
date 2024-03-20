package com.todays.fridge.controller;

import com.todays.fridge.domain.Recipe;
import com.todays.fridge.dto.RecipeRequest;
import com.todays.fridge.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class RecipeApiController {
    private final RecipeService service;

    @PostMapping("/api/writeTest")
    public ResponseEntity<Recipe> addRecipe(@RequestParam("foodName") String foodName,
                                            @RequestParam("description") String description){
        RecipeRequest request=new RecipeRequest(foodName,description);

        Recipe savedRecipe=service.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRecipe);
    }


}
