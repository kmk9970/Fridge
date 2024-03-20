package com.todays.fridge.service;

import com.todays.fridge.domain.Recipe;
import com.todays.fridge.dto.RecipeRequest;
import com.todays.fridge.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecipeService {
    private final RecipeRepository repository;

    public Recipe save(RecipeRequest request) {
        return repository.save(request.RecipeToEntity());
    }
}
