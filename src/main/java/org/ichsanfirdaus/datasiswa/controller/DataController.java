package org.ichsanfirdaus.datasiswa.controller;

import org.ichsanfirdaus.datasiswa.domain.Data;
import org.ichsanfirdaus.datasiswa.service.DataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ichsan
 */
@RestController
@RequestMapping("/siswa")
public class DataController {
    @Autowired
    private DataDao dataDao;
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Data d) {
        dataDao.save(d);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Page<Data> findAll(Pageable pageable) {
        return dataDao.findAll(pageable);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        Data d = dataDao.findOne(id);
        if (d != null) {
            dataDao.delete(d);
        }
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable String id, @RequestBody Data d) {
        Data data = dataDao.findOne(id);
        if (data != null) {
            d.setId(id);
            dataDao.save(d);
        }
    }
}
