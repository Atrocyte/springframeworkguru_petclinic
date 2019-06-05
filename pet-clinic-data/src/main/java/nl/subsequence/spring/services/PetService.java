package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Owner;
import nl.subsequence.spring.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Set<Pet> findByOwner(Owner owner);

    Set<Pet> findByBirthDate();

    Set<Pet> findByType();

    Set<Pet> findAll();

    Pet save(Pet pet);
}
