package ro.ase.cts.unittestslab;

import java.util.List;

public class Client {
    //Minim 5 caractere, trebuie sa contina cel putin un spatiu (Ex.:Nume Prenume)
    private String name;
    //CNP valid
    private String id;
    private List<BankAccount> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.length()>=5 && name.contains(" ")){
           this.name=name;
       }else {
           throw new IllegalArgumentException("Numele trebuie sa aiba minim 5 caractere si sa contina un spatiu");
       }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() ==13 && id.matches("[0-9]+")){
            this.id=id;
        }else{
            throw new IllegalArgumentException("Id ul nu contine formatul cnp");
        }
    }

    public void addAccount(BankAccount bankAccount)
    {
        this.accounts.add(bankAccount);
    }
}
