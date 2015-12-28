package com.gfisher.examples.webcontroller;

import com.gfisher.examples.entities.Superhero;
import com.gfisher.examples.services.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gfisher on 12/28/2015.
 */
@RestController
@RequestMapping(value="/superheros")
public class SuperheroController extends GenericController<Superhero>{

    @Autowired
    public SuperheroController(SuperheroService service) {
        super(service);
    }
}
