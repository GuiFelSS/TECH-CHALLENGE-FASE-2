package br.com.fiap.tech.challenge._2.application.usecase.foodtype;

import br.com.fiap.tech.challenge._2.domain.FoodType;
import br.com.fiap.tech.challenge._2.application.command.FoodTypeCommand;

import java.util.UUID;

public interface UpdateFoodTypeUseCase {
    FoodType execute(UUID id, FoodTypeCommand command);
}

