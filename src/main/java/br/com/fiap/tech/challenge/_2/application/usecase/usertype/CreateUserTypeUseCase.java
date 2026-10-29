package br.com.fiap.tech.challenge._2.application.usecase.usertype;

import br.com.fiap.tech.challenge._2.domain.UserType;
import br.com.fiap.tech.challenge._2.application.command.UserTypeCommand;

public interface CreateUserTypeUseCase {
    UserType execute(UserTypeCommand command);
}
