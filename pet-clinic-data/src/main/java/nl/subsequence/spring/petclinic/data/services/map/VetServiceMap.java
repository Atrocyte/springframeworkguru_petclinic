package nl.subsequence.spring.petclinic.data.services.map;

import nl.subsequence.spring.petclinic.data.model.Pet;
import nl.subsequence.spring.petclinic.data.model.Specialty;
import nl.subsequence.spring.petclinic.data.model.Vet;
import nl.subsequence.spring.petclinic.data.services.SpecialtyService;
import nl.subsequence.spring.petclinic.data.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet != null) {
            if (vet.getSpecialties().size() > 0) {
                vet.getSpecialties().forEach(specialty -> {
                    if (specialty.getId() == null) {
                        Specialty saved = specialtyService.save(specialty);
                    }
                });
            }
            return super.save(vet);
        } else {
            return null;
        }
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
