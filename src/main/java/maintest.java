import domain.person.Age;
import domain.person.Person;
import domain.person.GenderPerson;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;

/**
 * Created by filipve on 17/02/2016.
 */
public class maintest {

    public static void main( String[] args ) {
//Movie m = new Movie ("The Hobbit 1",  );

        LocalDate dateofbirth = LocalDate.of(2010,01,14);
        MonthDay birthday = MonthDay.of(dateofbirth.getMonth(), dateofbirth.getDayOfMonth());

        LocalDate today = LocalDate.now();
        LocalDate bt = LocalDate.of(1994, Month.APRIL, 20);

        Period p = Period.between(bt,today);

        System.out.println(bt.getYear());
        System.out.println(today.getYear() - bt.getYear());

        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());

        LocalDate l = LocalDate.of(1994,Month.APRIL,20);
        Person pp = new Actor("naam","familienaam",new Age(l), GenderPerson.MALE);

        System.out.println(pp.getAge());

        System.out.println("mijn naam is: " + pp.getName());

        System.out.println("mijn familienaam is: " + pp.getFamilyName());

        System.out.println("ik ben aantal jaren oud : " + pp.berekenAantalJaarOud());

        System.out.println("mijn geslacht is : " + pp.getGender());

        System.out.println("mijn geboortedatum is " + pp.getDateOfBirth().toString());

    }
}
