package io.turntabl;

import static org.junit.Assert.*;

public class ClientRegisterTest {
    @Test
    void getClientName() {
    }
    List<Client> Clients = Arrays.asList(
            new Private("Harrison", 101, ServiceLevel.GOLD),
            new Private("Dawud", 113, ServiceLevel.PLATINUM),
            new Private("Robert", 350, ServiceLevel.PREMIUM),
            new Private("Grace", 011, ServiceLevel.GOLD),
            new Corporate("Debby",498,ServiceLevel.GOLD),
            new Corporate("kareen",543,ServiceLevel.PLATINUM),
            new Corporate("Daviv",999,ServiceLevel.PLATINUM),
            new Corporate("Dilyen",321,ServiceLevel.PLATINUM)

    );
    ClientRegister clientRegister = new ClientRegister();

    @Test
    void getGoldClients() {
    }

}