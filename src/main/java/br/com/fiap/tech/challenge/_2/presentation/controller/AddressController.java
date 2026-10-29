package br.com.fiap.tech.challenge._2.presentation.controller;

import br.com.fiap.tech.challenge._2.application.command.AddressCommand;
import br.com.fiap.tech.challenge._2.application.usecase.address.*;
import br.com.fiap.tech.challenge._2.domain.Address;
import br.com.fiap.tech.challenge._2.presentation.controller.request.AddressRequest;
import br.com.fiap.tech.challenge._2.presentation.controller.response.AddressResponse;
import br.com.fiap.tech.challenge._2.presentation.presenter.AddressPresenter;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/addresses")
public class AddressController {
      private final CreateAddressUseCase createAddressUseCase;
      private final FindAddressUseCase findAddressUseCase;
      private final GetAllAddressUseCase getAllAddressUseCase;
      private final DeleteAddressUseCase deleteAddressUseCase;
      private final UpdateAddressUseCase updateAddressUseCase;

    public AddressController(CreateAddressUseCase createAddressUseCase,
                             FindAddressUseCase findAddressUseCase,
                             GetAllAddressUseCase getAllAddressUseCase,
                             DeleteAddressUseCase deleteAddressUseCase,
                             UpdateAddressUseCase updateAddressUseCase)
    {
         this.createAddressUseCase = createAddressUseCase;
         this.findAddressUseCase = findAddressUseCase;
         this.getAllAddressUseCase=getAllAddressUseCase;
         this.deleteAddressUseCase=deleteAddressUseCase;
         this.updateAddressUseCase=updateAddressUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddressResponse create(
          @Valid @RequestBody AddressRequest request
    ) {

        Address address = createAddressUseCase.execute(toCommand(request));


        return AddressPresenter.toResponse(address);
    }

   @GetMapping("/{id}")
   @ResponseStatus(HttpStatus.OK)
    public AddressResponse findById(
           @PathVariable UUID id
    ) {

        Address address = findAddressUseCase.execute(id);

        return AddressPresenter.toResponse(address);
   }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<AddressResponse> getAll()
    {
        List<Address> list = getAllAddressUseCase.execute();
        return AddressPresenter.toResponseList(list);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(
            @PathVariable UUID id
    ) {

       deleteAddressUseCase.execute(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AddressResponse update( @PathVariable UUID id,
        @Valid  @RequestBody AddressRequest request
    ) {

        Address address = updateAddressUseCase.execute(id, toCommand(request));
        return AddressPresenter.toResponse(address);
    }

    private AddressCommand toCommand(AddressRequest request) {
        return new AddressCommand(request.name(), request.neighborhood(), request.city(), request.state(),
                request.postalCode(), request.country());
    }
}
