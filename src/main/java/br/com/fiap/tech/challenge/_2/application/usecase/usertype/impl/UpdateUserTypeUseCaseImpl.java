package br.com.fiap.tech.challenge._2.application.usecase.usertype.impl;

import br.com.fiap.tech.challenge._2.application.command.UserTypeCommand;
import br.com.fiap.tech.challenge._2.application.gateway.UserTypeGateway;
import br.com.fiap.tech.challenge._2.application.usecase.usertype.UpdateUserTypeUseCase;
import br.com.fiap.tech.challenge._2.domain.UserType;

import java.util.UUID;

public class UpdateUserTypeUseCaseImpl implements UpdateUserTypeUseCase {
    private final UserTypeGateway userTypeGateway;

    public UpdateUserTypeUseCaseImpl(UserTypeGateway userTypeGateway) {
        this.userTypeGateway = userTypeGateway;
    }
    @Override
    public UserType execute(UUID id, UserTypeCommand request) {

        UserType userType = UserType.create(id,request.name(),request.owner());
        return userTypeGateway.update(id, userType);
    }
}
