package org.acme;

import java.util.Collections;
import java.util.Map;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class MutableConfigSource implements ConfigSource {

    public static final String NAME = "MutableConfigSource";

    @Override
    public int getOrdinal() {
        return 900;
    }

    @Override
    public Map<String, String> getProperties() {
        return Collections.emptyMap();
    }

    @Override
    public String getValue(String key) {
        return null;
    }

    @Override
    public String getName() {
        return NAME;
    }

}
