package com.gfisher.examples.daos;

import com.gfisher.examples.daos.Interfaces.ITeamDao;
import com.gfisher.examples.entities.Team;
import org.springframework.stereotype.Repository;

/**
 * Created by gfisher on 12/24/2015.
 */
@Repository
public class TeamDao extends GenericDao<Team> implements ITeamDao{
    public TeamDao() {
        super(Team.class);
    }
}
