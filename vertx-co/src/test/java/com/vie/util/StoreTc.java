package com.vie.util;

import io.vertx.ext.unit.TestContext;
import org.junit.Test;
import top.StoreBase;

public class StoreTc extends StoreBase {

    @Test
    public void testJson(final TestContext context) {
        execJObject("test.json", config -> {
            Log.info(getLogger(), config.result().encode());
            context.assertTrue(config.succeeded());
        });
    }

    @Test
    public void testYaml(final TestContext context) {
        execYaml("test.yaml", config -> {
            context.assertTrue(config.succeeded());
        });
    }

    @Test
    public void testProp(final TestContext context) {
        execProp("test.properties", config -> {
            Log.info(getLogger(), config.result().encode());
            context.assertTrue(config.succeeded());
        });
    }
}
