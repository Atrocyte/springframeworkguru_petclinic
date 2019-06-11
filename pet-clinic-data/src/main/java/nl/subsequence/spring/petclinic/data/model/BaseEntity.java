package nl.subsequence.spring.petclinic.data.model;

import java.io.Serializable;

//TODO create proper equals method
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public BaseEntity setId(Long id) {
        this.id = id;
        return this;
    }
}
