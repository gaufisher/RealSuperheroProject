package com.gfisher.examples.services;

import com.gfisher.examples.daos.Interfaces.ISuperheroDao;
import com.gfisher.examples.entities.Superhero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gfisher on 12/24/2015.
 */
@Service
public class SuperheroService extends GenericService<Superhero> {

    @Autowired
    public SuperheroService(ISuperheroDao dao) {
        super(dao);
    }
}
