package nl.subsequence.spring.petclinic.data.services.map;

import nl.subsequence.spring.petclinic.data.model.Specialty;
import nl.subsequence.spring.petclinic.data.model.Specialty;
import nl.subsequence.spring.petclinic.data.services.SpecialtyService;
import nl.subsequence.spring.petclinic.data.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }

}
