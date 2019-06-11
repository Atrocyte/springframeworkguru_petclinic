package nl.subsequence.spring.petclinic.data.services.map;

import nl.subsequence.spring.petclinic.data.model.Owner;
import nl.subsequence.spring.petclinic.data.model.Pet;
import nl.subsequence.spring.petclinic.data.services.CrudService;
import nl.subsequence.spring.petclinic.data.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Set<Pet> findByOwner(Owner owner) {
        return null;
    }

    @Override
    public Set<Pet> findByBirthDate() {
        return null;
    }

    @Override
    public Set<Pet> findByType() {
        return null;
    }
}
