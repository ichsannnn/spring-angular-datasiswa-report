/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ichsanfirdaus.datasiswa.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

/**
 *
 * @author mrsilentreader
 */

@Controller
public class SiswaReportController {

    @Autowired
    @Qualifier("siswaReport")
    private JasperReportsPdfView helloReport;
//    private DataDao dd;
    

    @RequestMapping(value = "report", method = RequestMethod.GET)
    public ModelAndView generateReportSiswa(ModelAndView m) {
        Map<String, Object> parameterMap = new HashMap<>();
        
//        Iterable<Data> data = dd.findAll();
        
//        parameterMap.put("tanggalUpdate", new Date());
        parameterMap.put("datasource", new JREmptyDataSource());

        m = new ModelAndView(helloReport, parameterMap);
//        m.addObject("dataSource", data);
        m.addObject("tanggalUpdate", new Date());
        return m;
    }

    
    
//    @RequestMapping("siswa")
//    public ModelAndView generateSiswa(ModelAndView m, @RequestParam(value = "format", required = false) String format) {
//        Iterable<Data> data = dd.findAll();
//        m.addObject("dataSource", data);
//        m.addObject("tanggalUpdate", new Date());
//        m.addObject("format", "pdf");
//        
//        if (format != null && !format.isEmpty()) {
//            m.addObject("format", format);
//        }
//        
//        m.setViewName("report_siswa");
//        
//        return m;
//    }
}
