package br.com.fiap.tech.challenge._2.application.usecase.menu;

import br.com.fiap.tech.challenge._2.domain.Menu;

import br.com.fiap.tech.challenge._2.application.command.MenuCommand;



public interface CreateMenuUseCase {
    Menu execute(MenuCommand command);
}
