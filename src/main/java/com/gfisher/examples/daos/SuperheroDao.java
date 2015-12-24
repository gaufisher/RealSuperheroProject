package com.gfisher.examples.daos;

import com.gfisher.examples.daos.Interfaces.ISuperheroDao;
import com.gfisher.examples.entities.Superhero;
import org.springframework.stereotype.Repository;

/**
 * Created by gfisher on 12/24/2015.
 */
@Repository
public class SuperheroDao extends GenericDao<Superhero> implements ISuperheroDao {
    public SuperheroDao() {
        super(Superhero.class);
    }
}
