/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ichsanfirdaus.datasiswa.service;

import org.ichsanfirdaus.datasiswa.domain.Data;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author ichsan
 */
public interface DataDao extends PagingAndSortingRepository<Data, String> {
    
}
