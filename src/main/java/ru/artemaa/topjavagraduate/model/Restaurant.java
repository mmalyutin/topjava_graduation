package ru.artemaa.topjavagraduate.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MrArtemAA
 * 24.04.2017
 */
@Entity
@Table(name = "Restaurants")
public class Restaurant extends NamedEntity {

    public Restaurant() {
    }

    public Restaurant(Restaurant r) {
        super(r.getId(), r.getName());
    }

    public Restaurant(Integer id, String name) {
        super(id, name);
    }
}
