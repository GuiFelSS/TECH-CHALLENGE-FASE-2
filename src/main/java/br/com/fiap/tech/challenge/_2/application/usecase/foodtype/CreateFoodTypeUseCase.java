package br.com.fiap.tech.challenge._2.application.usecase.foodtype;

import br.com.fiap.tech.challenge._2.domain.FoodType;
import br.com.fiap.tech.challenge._2.application.command.FoodTypeCommand;

public interface CreateFoodTypeUseCase {
    FoodType execute(FoodTypeCommand command);
}
