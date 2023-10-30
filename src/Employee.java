import java.lang.reflect.Array;

public class Employee {
    //Mitarbeiter - wird bei corporateCustomer im Konstruktor mit ausgerufen, da jeder CC ein Employee als salesRep hinterlegt hat
    public String empNo;
    Employee(String empNo){this.empNo = empNo;}
}
