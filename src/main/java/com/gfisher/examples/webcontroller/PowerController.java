package com.gfisher.examples.webcontroller;

import com.gfisher.examples.entities.Power;
import com.gfisher.examples.services.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gfisher on 12/28/2015.
 */
@RestController
@RequestMapping(value="/powers")
public class PowerController extends GenericController<Power>{

    @Autowired
    public PowerController(PowerService service) {
        super(service);
    }
}
