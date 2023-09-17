package classes;

public class Person {
    private int age;
    static int count=0, average=0;
    private String surname,sex;
    public Person (String surname, int age, String sex){
        this.sex=sex;
        this.surname=surname;
        this.age=age;
        if(sex.equals("man")){
            average+=age;
            count++;
        }
    }
    public Person (){
        sex="man";
        surname="ПУСТОТА";
        age=99;
        average+=age;
        count++;
    }
    public int getAge(){return this.age;}
    public String getSex(){return this.sex;}
    public String getSurname(){return this.surname;}
    void printSurname(){System.out.print(surname +" ");}
    void printAge(){System.out.print(age +" ");}
    void printSex(){System.out.print(sex);}
    public static void func(){
        if(count!=0)System.out.println("Мужчин: "+count+" Средний возраст: " +(int)(average/count));
    }
}
