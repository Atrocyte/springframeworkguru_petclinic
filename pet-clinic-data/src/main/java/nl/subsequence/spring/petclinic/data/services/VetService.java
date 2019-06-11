package nl.subsequence.spring.petclinic.data.services;

import nl.subsequence.spring.petclinic.data.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

    Vet findByLastName(String lastName);
}
