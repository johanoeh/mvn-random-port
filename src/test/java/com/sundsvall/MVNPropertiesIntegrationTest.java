package com.sundsvall;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

public class MVNPropertiesIntegrationTest {

    private static final Logger LOG = Logger.getLogger(MVNPropertiesIntegrationTest.class.getName());

    @BeforeClass
    public static void setUp(){

        String portString = System.getProperty("random.db.port");
        LOG.info(String.format("Allocated port %s", portString));
        Integer port = Integer.parseInt(portString);
        Assert.assertTrue(port > 0);
    }

    @Test
    public void test(){

    }
}
