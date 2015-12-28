package com.gfisher.examples.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * Created by gfisher on 12/24/2015.
 */
@Entity
public class Superhero extends BaseEntity{
    private String realName;
    private String originType;
    private String costumeImage;
    private String height;
    private Integer weight;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    public String getCostumeImage() {
        return costumeImage;
    }

    public void setCostumeImage(String costumeImage) {
        this.costumeImage = costumeImage;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Set<Power> getPowers() {
        return powers;
    }

    public void setPowers(Set<Power> powers) {
        this.powers = powers;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Power> powers;
}
