
package br.com.fiap.tech.challenge._2.application.usecase.menu;

import br.com.fiap.tech.challenge._2.domain.Menu;
import br.com.fiap.tech.challenge._2.application.command.MenuCommand;
import java.util.UUID;


public interface UpdateMenuUseCase {
    Menu execute(UUID id, MenuCommand command);
}
