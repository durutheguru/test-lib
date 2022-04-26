package com.julianduru.testlib;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * created by julian
 */
public class NullAwareBeanUtils extends BeanUtilsBean {


    private static final Logger logger = Logger.getLogger(NullAwareBeanUtils.class.getName());


    @Override
    public void copyProperty(Object dest, String name, Object value)
        throws IllegalAccessException, InvocationTargetException {
        if (value == null){
            return;
        }

        super.copyProperty(dest, name, value);
    }


    public static void copy(Object source, Object destination) {
        try {
            NullAwareBeanUtils utilsBean = new NullAwareBeanUtils();
            utilsBean.copyProperties(destination, source);
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new IllegalStateException(e);
        }
    }


}


