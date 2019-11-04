package io.turntabl;

import com.sun.security.ntlm.Client;

public class Corporate extends Client {
    private String accountManager;
    public Corporate(String name, int id, ServiceLevel level) {
        super(name, id, level);
    }

    @Override
    public String getName() {
        return accountManager;
    }
}