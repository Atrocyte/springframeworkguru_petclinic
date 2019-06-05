package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
