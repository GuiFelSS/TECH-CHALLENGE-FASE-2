package br.com.fiap.tech.challenge._2.application.usecase.foodtype.impl;

import br.com.fiap.tech.challenge._2.application.command.FoodTypeCommand;
import br.com.fiap.tech.challenge._2.application.gateway.FoodTypeGateway;
import br.com.fiap.tech.challenge._2.application.usecase.foodtype.UpdateFoodTypeUseCase;
import br.com.fiap.tech.challenge._2.domain.FoodType;

import java.util.UUID;

public class UpdateFoodTypeUseCaseImpl implements UpdateFoodTypeUseCase {
    private final FoodTypeGateway foodTypeGateway;

    public UpdateFoodTypeUseCaseImpl(FoodTypeGateway foodTypeGateway) {

        this.foodTypeGateway = foodTypeGateway;
    }

    @Override
    public FoodType execute(UUID id, FoodTypeCommand request) {
        FoodType foodType = FoodType.create(id,request.name());
        return foodTypeGateway.update(id,foodType);
    }
}
