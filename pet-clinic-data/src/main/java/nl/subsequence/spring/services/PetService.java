package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Owner;
import nl.subsequence.spring.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Set<Pet> findByOwner(Owner owner);

    Set<Pet> findByBirthDate();

    Set<Pet> findByType();

}