package com.gfisher.examples.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

/**
 * Created by gfisher on 12/24/2015.
 */
@Entity
public class Team extends BaseEntity{
    private String headquarters;
    private String publicSupportLevel;

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Set<Superhero> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Set<Superhero> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public String getPublicSupportLevel() {
        return publicSupportLevel;
    }

    public void setPublicSupportLevel(String publicSupportLevel) {
        this.publicSupportLevel = publicSupportLevel;
    }

    public Superhero getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Superhero teamLeader) {
        this.teamLeader = teamLeader;
    }

    @OneToOne
    private Superhero teamLeader;
    @OneToMany
    private Set<Superhero> teamMembers;
}
