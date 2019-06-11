package nl.subsequence.spring.petclinic.data.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private String description;
    private LocalDate date;
    private Pet pet;

    public String getDescription() {
        return description;
    }

    public Visit setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Visit setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Pet getPet() {
        return pet;
    }

    public Visit setPet(Pet pet) {
        this.pet = pet;
        return this;
    }
}
