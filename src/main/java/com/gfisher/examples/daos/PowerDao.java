package com.gfisher.examples.daos;

import com.gfisher.examples.daos.Interfaces.IPowerDao;
import com.gfisher.examples.entities.Power;
import org.springframework.stereotype.Repository;

/**
 * Created by gfisher on 12/24/2015.
 */
@Repository
public class PowerDao extends GenericDao<Power> implements IPowerDao{
    public PowerDao() {
        super(Power.class);
    }
}
