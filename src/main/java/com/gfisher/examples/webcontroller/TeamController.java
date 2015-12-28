package com.gfisher.examples.webcontroller;

import com.gfisher.examples.entities.Team;
import com.gfisher.examples.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gfisher on 12/28/2015.
 */
@RestController
@RequestMapping(value="/teams")
public class TeamController extends GenericController<Team>{

    @Autowired
    public TeamController(TeamService service) {
        super(service);
    }
}
