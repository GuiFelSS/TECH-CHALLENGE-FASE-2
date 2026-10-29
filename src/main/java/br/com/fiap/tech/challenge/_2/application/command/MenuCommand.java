package br.com.fiap.tech.challenge._2.application.command;

import java.math.BigDecimal;

public record MenuCommand(
        String name,
        String description,
        BigDecimal price,
        boolean onlyLocal,
        String foodPhoto,
        String restaurantId,
        boolean active
) {
}
