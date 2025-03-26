package Interfaces;

import Characters.Persons;

public interface IPerson {
    public String writeActSolo(String act);
    public String writeActDuo(String act, Persons person);
    public String writeActEntity(String act);
}
