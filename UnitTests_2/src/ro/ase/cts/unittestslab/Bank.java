package ro.ase.cts.unittestslab;

import java.util.HashMap;
import java.util.List;

public class Bank {
    //Minim 5 caractere - trebuie sa contina cuvantul "bank"
    private String name;
    //Minim 10 caractere
    private String address;
    //Formatul este: LLLL-LL-LL-CCC  , unde L - litera si C - cifra.
    // Primele 4 litere reprezinta codul bancii
    private String swiftCode;
    private HashMap<String, Client> clientsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 5 && name.toLowerCase().contains("bank")) {
            this.name = name;
        } else{
            throw new IllegalArgumentException("Numele trebuie sa contina minim 5 caractere si cuvantul 'bank");
    }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() >= 10) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Adresa trebuie să conțină minim 10 caractere.");
        }
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        if(swiftCode.matches("[A-Z]{4}-[A-Z]{2}-[A-Z]{2}-[0-9]{3}")){
            this.swiftCode=swiftCode;
        }else{
            throw new IllegalArgumentException("Codul swift trebuie sa respecte formatul LLLL-LL-LL-CCC");
        }
    }

    public Client getClientByCNP(String cnp)
    {
        return clientsList.get(cnp);
    }
}
