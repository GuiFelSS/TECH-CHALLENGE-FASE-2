package br.com.fiap.tech.challenge._2.application.usecase.address;

import br.com.fiap.tech.challenge._2.domain.Address;
import br.com.fiap.tech.challenge._2.application.command.AddressCommand;

public interface CreateAddressUseCase {
    Address execute(AddressCommand command);
}
