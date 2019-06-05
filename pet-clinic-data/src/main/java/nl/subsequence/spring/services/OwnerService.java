package nl.subsequence.spring.services;

import nl.subsequence.spring.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
