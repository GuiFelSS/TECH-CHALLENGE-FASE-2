package br.com.fiap.tech.challenge._2.application.command;

public record AddressCommand(
        String name,
        String neighborhood,
        String city,
        String state,
        String postalCode,
        String country
) {
}
