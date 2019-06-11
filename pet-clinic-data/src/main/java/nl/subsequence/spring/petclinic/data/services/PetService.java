package nl.subsequence.spring.petclinic.data.services;

import nl.subsequence.spring.petclinic.data.model.Owner;
import nl.subsequence.spring.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Set<Pet> findByOwner(Owner owner);

    Set<Pet> findByBirthDate();

    Set<Pet> findByType();

}