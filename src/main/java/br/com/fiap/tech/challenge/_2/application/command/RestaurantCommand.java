package br.com.fiap.tech.challenge._2.application.command;

import java.time.LocalTime;

public record RestaurantCommand(
        String name,
        String description,
        String addressId,
        String addressNumber,
        String addressComplement,
        String userId,
        String foodTypeId,
        LocalTime startTime,
        LocalTime endTime
) {
}
