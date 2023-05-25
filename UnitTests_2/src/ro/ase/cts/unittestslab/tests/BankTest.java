package ro.ase.cts.unittestslab.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.unittestslab.Bank;
import ro.ase.cts.unittestslab.BankAccount;
import ro.ase.cts.unittestslab.Client;

import javax.swing.event.CaretListener;
import java.util.Locale;

import static org.junit.Assert.*;

public class BankTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setName() {
        Bank bank = new Bank();
        String testStr = "shswhrf bank";
        bank.setName(testStr);
        assertEquals("Set pentru nume nu este implementat corect", testStr, bank.getName());
        assertTrue("Minim 5 caratere", bank.getName().length()>=5);
        assertTrue("Trebuie sa contina cuvantul bank", bank.getName().toLowerCase(Locale.ROOT).contains("bank"));
    }

    @Test
    public void setAddress() {
        Bank bank = new Bank();
        String testAddress = "Sura Mare 1";
        bank.setAddress(testAddress);
        assertEquals("Set pentru adresa nu este implementat corect", testAddress, bank.getAddress());
        assertTrue("Minim 10 caractere", bank.getAddress().length()>=10);
    }

    @Test
    public void setSwiftCode() {
        Bank bank=new Bank();
        String testCode="BRDE-ES-DR-124";
        bank.setSwiftCode(testCode);
        assertEquals("Set pentru cod nu este implementat corect", testCode, bank.getSwiftCode());

    }

    @Test
    public void setCurrency(){
        BankAccount bankAccount=new BankAccount();
        String testCurrency="RON";
        bankAccount.setCurrency(testCurrency);
        assertEquals("Set pentru valuta nu este implemntat corect", testCurrency, bankAccount.getCurrency());
    }

    @Test
    public void setIbanCode(){
        BankAccount bankAccount=new BankAccount();
        String testIbanCode="RO23BRDE1234567854361342";
        bankAccount.setIbanCode(testIbanCode);
        assertEquals("Set pentru IBAN nu este implemntat corect", testIbanCode, bankAccount.getIbanCode());
    }

    @Test
    public void setClientName(){
        Client client=new Client();
        String testName="Nume Prenume";
        client.setName(testName);
        assertEquals("Set pentru numele clientului nu este implementat corect", testName, client.getName());
        assertTrue("Minim 5 caractere", client.getName().length()>=5);
    }

    @Test
    public void setIdName(){
        Client client=new Client();
        String testIdClient="6000410360674";
        client.setId(testIdClient);
        assertEquals("Set pentru id-ul clientului nu este implementat corect", testIdClient, client.getId());
        assertTrue("Trebuie sa aibe 13 caractere", client.getId().length()==13);
    }




}