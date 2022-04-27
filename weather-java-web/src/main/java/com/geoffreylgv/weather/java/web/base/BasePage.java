/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;

/**
 *
 * @author geoffreylgv
 */
public class BasePage extends WebPage {
    public BasePage() {
        this(null);
    }

    public BasePage(IModel model) {
        super(model);
    }
    
    public static String frontDateFormat(String format, Date date){
        format = format == null ? "dd/MM/yyyy" : format;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
        
}