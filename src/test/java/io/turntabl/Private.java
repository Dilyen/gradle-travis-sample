package io.turntabl;

import com.sun.security.ntlm.Client;

public class Private extends Client implements Public {
    public Private(String name, int id, ServiceLevel level) {

        super(name, id, level);
    }

    @Override
    String getName() {

        return getName();
    }
}