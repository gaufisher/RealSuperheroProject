package com.gfisher.examples.services;

import com.gfisher.examples.daos.TeamDao;
import com.gfisher.examples.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gfisher on 12/24/2015.
 */
@Service
public class TeamService extends GenericService<Team>{

    @Autowired
    public TeamService(TeamDao dao) {
        super(dao);
    }
}
