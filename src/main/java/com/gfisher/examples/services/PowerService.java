package com.gfisher.examples.services;

import com.gfisher.examples.daos.Interfaces.IPowerDao;
import com.gfisher.examples.entities.Power;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gfisher on 12/24/2015.
 */
@Service
public class PowerService extends GenericService<Power> {

    @Autowired
    public PowerService(IPowerDao dao) {
        super(dao);
    }
}
