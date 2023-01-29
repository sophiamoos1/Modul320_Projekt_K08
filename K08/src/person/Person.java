package person;

import adress.Adress;

public class Person {
    private String firstName;
    private String lastName;
    private Pronoun pronoun;

    private String firmenName;
    private Adress adress;

    /**
     * @param firstName
     * @param lastName
     * @param pronoun
     * @param adress
     */
    public Person(String firstName, String lastName, Pronoun pronoun, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pronoun = pronoun;
        this.adress = adress;
    }


    /**
     * @param firmenName
     * @param adress
     */
    public Person(String firmenName, Adress adress) {
        this.firmenName = firmenName;
        this.adress = adress;
    }


    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Pronoun getPronoun() {
        return pronoun;
    }

    /**
     * @param pronoun
     */
    public void setPronoun(Pronoun pronoun) {
        this.pronoun = pronoun;
    }

    /**
     * @return
     */
    public String getFirmenName() {
        return firmenName;
    }

    /**
     * @param firmenName
     */
    public void setFirmenName(String firmenName) {
        this.firmenName = firmenName;
    }

    /**
     * @return
     */
    public Adress getAdress() {
        return adress;
    }

    /**
     * @param adress
     */
    public void setAdress(Adress adress) {
        this.adress = adress;
    }


    /**
     * @return
     */
    public String stringPerson(){
        String str;
        if(this.firstName == null || this.firstName.equals("")){
            str = this.firmenName;
        }else{
            str = " Person:\n Vorname: " + this.firstName + "\n Nachname: " + this.lastName;
        }
        return str;
    }
}

