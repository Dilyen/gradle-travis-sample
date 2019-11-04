package io.turntabl;


import java.util.ArrayList;
import java.util.List;

    class ClientRegister {
        private List<Corporate> corporateClients;
        private List<Private> privateClients;

        public ClientRegister(List<Corporate> corporateClients, List<Private> privateClients) {
            this.corporateClients = corporateClients;
            this.privateClients = privateClients;
        }

        public List<String> getRegisterByPrivateClient(){
            List<String> privateClientNames = new ArrayList<>();
            for(Private privateClient: privateClients){
                privateClientNames.add(privateClient.getName());

            }
            return privateClientNames;
        }

        public List<String> getRegisterByCorporateClient(){
            List<String> corporateClientNames = new ArrayList<>();
            for(Corporate corporateClient: corporateClients){
                corporateClientNames.add(corporateClient.getName());

            }
            return corporateClientNames;
        }

}
