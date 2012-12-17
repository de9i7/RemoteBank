package com.remote.bank.context;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public class ApplicationContext {

    private static final Logger LOG = Logger.getLogger(ApplicationContext.class);

    /** The particular mode for model objects transformation */
    private static final String PARAM_TRANSFORMER_MODE = "app.transformer.mode";

    /** Properties instance */
    private Properties appProperties;

    /** Configuration file name mask */
    private static final String PROPERTIES_FILE = "properties/application.properties";

    public void readProperties() {
        this.appProperties = new Properties();

        InputStream is = null;

        try {
            is = new FileInputStream(PROPERTIES_FILE);
            this.appProperties.load(is);
            LOG.info("Application properties were loaded.");
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }

    }

}
