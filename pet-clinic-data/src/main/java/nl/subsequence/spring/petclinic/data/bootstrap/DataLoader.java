package nl.subsequence.spring.petclinic.data.bootstrap;

import nl.subsequence.spring.petclinic.data.model.Owner;
import nl.subsequence.spring.petclinic.data.model.Vet;
import nl.subsequence.spring.petclinic.data.services.OwnerService;
import nl.subsequence.spring.petclinic.data.services.PetService;
import nl.subsequence.spring.petclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal").setLastName("Keaton").setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Betty").setLastName("Blaster").setId(2L);
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Augustijn").setLastName("de Hooi").setId(3L);
        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setFirstName("Butcher").setLastName("Pete").setId(1000L);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Wouter").setLastName("Woefjes").setId(1001L);
        vetService.save(vet2);
    }
}
