package com.gfisher.examples.entities;

import javax.persistence.Entity;

/**
 * Created by gfisher on 12/24/2015.
 */
@Entity
public class Power extends BaseEntity{
    private String type;
    private String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
