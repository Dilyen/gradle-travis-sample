package io.turntabl;

public class Clients<ContactName> {

    public abstract class Client extends ContactName {
        private String name;
        private int id;
        private ServiceLevel serviceLevel;

        public Client(String name, int id, ServiceLevel serviceLevel) {
            this.name = name;
            this.id = id;
            this.serviceLevel = serviceLevel;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", serviceLevel=" + serviceLevel +
                    '}';
        }

        @Override
        public String getName() {
            return name;
        }
    }

}
