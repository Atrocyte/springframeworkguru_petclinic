package nl.subsequence.spring.petclinic.data.bootstrap;

import nl.subsequence.spring.petclinic.data.model.*;
import nl.subsequence.spring.petclinic.data.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;


    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... strings) throws Exception {
        if (!dataIsInDatabase()) {
            populateDatabase();
        }

        PetType dog = petTypeService.save(new PetType().setName("Dog"));
        PetType cat = petTypeService.save(new PetType().setName("Cat"));
        PetType horse = petTypeService.save(new PetType().setName("Horse"));

        Owner michael = (Owner) new Owner()
                .setAddress("Poortkampen 27")
                .setCity("Zuidhorn")
                .setTelephone("0594505888")
                .setFirstName("Micheal")
                .setLastName("Keaton");
        Pet michaelsDog = new Pet().setName("Blax").setOwner(michael).setPetType(dog).setBirthDate(LocalDate.of(1990, 10, 30));
        michael.getPets().add(michaelsDog);

        ownerService.save(michael);

        Owner betty = (Owner) new Owner()
                .setAddress("Geruite Baars 81")
                .setCity("Zutphen")
                .setTelephone("09060906")
                .setFirstName("Betty")
                .setLastName("Blaster");
        Pet bettysCat = new Pet().setName("Meowth").setOwner(betty).setPetType(cat).setBirthDate(LocalDate.of(1986, 6, 30));
        betty.getPets().add(bettysCat);
        ownerService.save(betty);

        Owner augustijn = (Owner) new Owner()
                .setAddress("Vlinderhoeke 72772")
                .setCity("Olmen")
                .setTelephone("313 313 313")
                .setFirstName("Augustijn")
                .setLastName("de Hooi");
        Pet augustijnsPaard = new Pet().setName("Hiender").setOwner(augustijn).setPetType(horse).setBirthDate(LocalDate.of(1996, 4, 10));
        Pet augustijnsHond = new Pet().setName("Flap").setOwner(augustijn).setPetType(dog).setBirthDate(LocalDate.of(2012, 5, 1));
        augustijn.getPets().add(augustijnsPaard);
        augustijn.getPets().add(augustijnsHond);
        ownerService.save(augustijn);

        Specialty radiology = specialtyService.save(new Specialty().setDescription("Looking into bodies"));
        Specialty surgery = specialtyService.save(new Specialty().setDescription("Operating on bodies"));
        Specialty dentistry = specialtyService.save(new Specialty().setDescription("Tooth expertise"));

        Vet vet1 = new Vet();
        vet1.setFirstName("Butcher").setLastName("Pete");
        vet1.getSpecialties().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Wouter").setLastName("Woefjes");
        vet2.getSpecialties().add(surgery);
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Gerard").setLastName("de Grabbelaar");
        vet3.getSpecialties().add(dentistry);
        vetService.save(vet3);
    }

    private void populateDatabase() {
        PetType dog = petTypeService.save(new PetType().setName("Dog"));
        PetType cat = petTypeService.save(new PetType().setName("Cat"));
        PetType horse = petTypeService.save(new PetType().setName("Horse"));

        Owner michael = (Owner) new Owner()
                .setAddress("Poortkampen 27")
                .setCity("Zuidhorn")
                .setTelephone("0594505888")
                .setFirstName("Micheal")
                .setLastName("Keaton");
        Pet michaelsDog = new Pet().setName("Blax").setOwner(michael).setPetType(dog).setBirthDate(LocalDate.of(1990, 10, 30));
        michael.getPets().add(michaelsDog);

        ownerService.save(michael);

        Owner betty = (Owner) new Owner()
                .setAddress("Geruite Baars 81")
                .setCity("Zutphen")
                .setTelephone("09060906")
                .setFirstName("Betty")
                .setLastName("Blaster");
        Pet bettysCat = new Pet().setName("Meowth").setOwner(betty).setPetType(cat).setBirthDate(LocalDate.of(1986, 6, 30));
        betty.getPets().add(bettysCat);
        ownerService.save(betty);

        Owner augustijn = (Owner) new Owner()
                .setAddress("Vlinderhoeke 72772")
                .setCity("Olmen")
                .setTelephone("313 313 313")
                .setFirstName("Augustijn")
                .setLastName("de Hooi");
        Pet augustijnsPaard = new Pet().setName("Hiender").setOwner(augustijn).setPetType(horse).setBirthDate(LocalDate.of(1996, 4, 10));
        Pet augustijnsHond = new Pet().setName("Flap").setOwner(augustijn).setPetType(dog).setBirthDate(LocalDate.of(2012, 5, 1));
        augustijn.getPets().add(augustijnsPaard);
        augustijn.getPets().add(augustijnsHond);
        ownerService.save(augustijn);

        Specialty radiology = specialtyService.save(new Specialty().setDescription("Looking into bodies"));
        Specialty surgery = specialtyService.save(new Specialty().setDescription("Operating on bodies"));
        Specialty dentistry = specialtyService.save(new Specialty().setDescription("Tooth expertise"));

        Vet vet1 = new Vet();
        vet1.setFirstName("Butcher").setLastName("Pete");
        vet1.getSpecialties().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Wouter").setLastName("Woefjes");
        vet2.getSpecialties().add(surgery);
        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Gerard").setLastName("de Grabbelaar");
        vet3.getSpecialties().add(dentistry);
        vetService.save(vet3);
    }

    private boolean dataIsInDatabase() {
        return petTypeService.findAll().size() >= 0;
    }
}
