package nl.subsequence.spring.petclinic.data.services;

import nl.subsequence.spring.petclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
