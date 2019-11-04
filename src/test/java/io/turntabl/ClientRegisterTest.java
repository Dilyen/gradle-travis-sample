package io.turntabl;

import static org.junit.Assert.*;

public class ClientRegisterTest {
    @Test
    void getClientName() {
    }
    List<Client> Clients = Arrays.asList(
            new Private("Quay", 101, ServiceLevel.GOLD),
            new Private("Dawud", 113, ServiceLevel.PLATINUM),
            new Private("Jorginno", 350, ServiceLevel.PREMIUM),
            new Private("Sam", 011, ServiceLevel.GOLD),
            new Corporate("Debylynn",498,ServiceLevel.GOLD),
            new Corporate("kareen",543,ServiceLevel.PLATINUM),
            new Corporate("Daviv",999,ServiceLevel.PLATINUM),
            new Corporate("Dilyen",321,ServiceLevel.PLATINUM)

    );
    ClientRegister clientRegister = new ClientRegister();

    @Test
    void getGoldClients() {
        List<Client> Clients = Arrays.asList(
                new Private("Quay", 045, ServiceLevel.GOLD),
                new Private("Dawud", 730, ServiceLevel.PLATINUM),
                new Private("Jorginno", 3990, ServiceLevel.PREMIUM),
                new Private("Sam", 400, ServiceLevel.GOLD),
                new Corporate("Debylynn",498,ServiceLevel.GOLD),
                new Corporate("kareen",543,ServiceLevel.PLATINUM),
                new Corporate("Daviv",909,ServiceLevel.PLATINUM),
                new Corporate("Dilyen",221,ServiceLevel.PLATINUM)

        );

    }

}