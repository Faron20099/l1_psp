package L1;
import classes.Person;
import classes.WriterInfo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        int average = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Сколько добавить: ");
        num = in.nextInt();
        //classes.Person p1 = new classes.Person("ДА", 10, "man");
        //classes.Person p2 = new classes.Person("НЕТ", 20.5, true);
        Person[] arr = new Person[num];
        for(int d=0; d< arr.length;d++){
            System.out.printf("Выберите тип ввода: 1(нормальный), 2(по приколу): ");
            switch (in.nextInt()){
                case 1:
                    System.out.printf("Введите фамилию, возраст и пол: ");
                    arr[d]= new Person(in.next(),in.nextInt(),in.next());
                    break;
                case 2:
                    arr[d]= new Person();
                    break;
            }
        }
        //arr[0]=p1;
        //arr[1]=p2;
        if(count!=0) System.out.println("Мужчин: "+count+" Средний возраст222: " +(int)(average/count));
        Person.func();
        WriterInfo.infoOut(arr[0]);
    }
}

//коментарий