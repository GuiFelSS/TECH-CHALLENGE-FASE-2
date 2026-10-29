package br.com.fiap.tech.challenge._2.application.usecase.foodtype.impl;

import br.com.fiap.tech.challenge._2.application.command.FoodTypeCommand;
import br.com.fiap.tech.challenge._2.application.gateway.FoodTypeGateway;
import br.com.fiap.tech.challenge._2.application.usecase.foodtype.CreateFoodTypeUseCase;
import br.com.fiap.tech.challenge._2.domain.FoodType;

import java.util.UUID;

public class CreateFoodTypeUseCaseImpl implements CreateFoodTypeUseCase {
    private final FoodTypeGateway foodTypeGateway;

    public CreateFoodTypeUseCaseImpl(FoodTypeGateway foodTypeGateway) {
        this.foodTypeGateway = foodTypeGateway;
    }

    @Override
    public FoodType execute(FoodTypeCommand request) {
        FoodType foodType = FoodType.create(UUID.randomUUID(),request.name());
        return foodTypeGateway.save(foodType);
    }
}
