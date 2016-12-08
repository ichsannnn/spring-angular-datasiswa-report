/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ichsanfirdaus.datasiswa.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

/**
 *
 * @author mrsilentreader
 */

@Configuration

public class WebConfig extends WebMvcConfigurerAdapter {

//    @Bean
//    public JasperReportsViewResolver getJasperReportsViewResolver() {
//        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
//        
//        resolver.setPrefix("classpath:/reports/");
//        resolver.setSuffix(".jrxml");
//        resolver.setViewNames("report_*");
//        resolver.setViewClass(JasperReportsMultiFormatView.class);
//        resolver.setOrder(0);
//        
//        return resolver;
//    }
    
    @Bean
    @Qualifier("siswaReport")
    public JasperReportsPdfView getHelloWorldReport() {
        JasperReportsPdfView v = new JasperReportsPdfView();
        v.setUrl("classpath:reports/report_siswa.jrxml");
        v.setReportDataKey("datasource");
        return v;
    }

}
