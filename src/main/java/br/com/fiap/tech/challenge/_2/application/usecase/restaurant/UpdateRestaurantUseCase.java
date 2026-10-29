package br.com.fiap.tech.challenge._2.application.usecase.restaurant;

import br.com.fiap.tech.challenge._2.domain.Restaurant;
import br.com.fiap.tech.challenge._2.application.command.RestaurantCommand;
import java.util.UUID;


public interface UpdateRestaurantUseCase {
    Restaurant execute(UUID id, RestaurantCommand command);
}
