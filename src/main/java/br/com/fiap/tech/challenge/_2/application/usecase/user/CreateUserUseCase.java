package br.com.fiap.tech.challenge._2.application.usecase.user;

import br.com.fiap.tech.challenge._2.domain.User;
import br.com.fiap.tech.challenge._2.application.command.UserCommand;


public interface CreateUserUseCase {
    User execute(UserCommand command);
}
