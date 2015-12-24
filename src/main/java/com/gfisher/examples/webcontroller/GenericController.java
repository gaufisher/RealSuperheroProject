package com.gfisher.examples.webcontroller;

import com.gfisher.examples.entities.BaseEntity;
import com.gfisher.examples.services.GenericService;
import com.gfisher.examples.webcontroller.IGenericController.IGenericController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gfisher on 12/23/2015.
 */
@RestController
public abstract class GenericController<T extends BaseEntity> implements IGenericController<T> {

    protected GenericService<T> service;

    public GenericController(GenericService service) {
        this.service = service;
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<T> getAll() {
        return service.getAll();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public void add(@RequestBody T t) {
        service.add(t);
    }

    @RequestMapping(value="", method=RequestMethod.PUT)
    public void update(@RequestBody T t) {
        service.update(t);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
