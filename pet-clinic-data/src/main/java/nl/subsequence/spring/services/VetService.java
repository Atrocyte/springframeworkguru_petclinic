package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
