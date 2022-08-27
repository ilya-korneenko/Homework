package HomeWork5.Service;

import HomeWork5.Service.ServiceName;

public class ServiceNickPerson {
    private final ServiceName service = new ServiceName();
    public StringBuffer RandomGenericNickPerson(int length){
        return service.RandomGenericName(length, service.getRussianStr());
    }

    public StringBuffer RandomGenericEnglishNickPerson(int length){
        return service.RandomGenericRussianName(length, service.getRussianStr());
    }

    
}
