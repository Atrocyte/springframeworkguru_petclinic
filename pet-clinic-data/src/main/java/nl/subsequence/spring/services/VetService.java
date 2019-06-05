package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
