package Characters;

import Interfaces.IPerson;
import Stuff.Distraction;
import Stuff.EPerson;

public abstract class Persons implements IPerson {
    protected String name;
    protected Distraction distraction;

    protected Persons(String name) {
        this.name = name;
    }

    protected Persons(String name, Distraction distraction) {
        this.name = name;
        this.distraction = distraction;
    }

    public Distraction getDistraction() {
        return distraction;
    }

    public void setDistraction(Distraction distraction) {
        this.distraction = distraction;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract EPerson getType();

    public String writeActSolo(String act) {
        return this.name + " " + act;
    }

    public  String writeActDuo(String act, Persons person) {
        return this.name + " " + act + " " + person.getName();
    }
    public String writeActEntity(String act) {
        return "";
    }

    @Override
    public String toString() {
        return "Персонаж: " + name;
    }

    @Override
    public  boolean equals(Object obj) {
        if (obj. getClass() != this.getClass()) {
            return false;
        }
        Persons person = (Persons) obj;
        return this.name == person.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
