package classes;

import classes.Person;

public class WriterInfo {
    //private classes.Person person;
    //classes.WriterInfo(classes.Person person){this.person=person;}
    public static void infoOut(Person person){
        person.printSurname();
        person.printAge();
        person.printSex();
    }
}
