public class CorporateCustomer extends Customer {
    //CorporateCustomer erbt von Überklasse Customer
    // attributelist
    public String contactName;
    //name of company as customer
    public String creditRating;
    //creditrating as String
    public Integer creditLimit;
    //creditlimit as Integer for the company
    public Employee salesRep;
    //employeenumber of Employee (foreignkey)
    CorporateCustomer(Employee salesRep){
        //jeder CorporateCustomer benötigt zwingend einen Employee der als salesRep hinterlegt wird
        super("obi", "irgendeine Straße 6");

        this.salesRep = salesRep;}
    //functions - ohne groß Funktionalität
    public void billForMonth(int month) {

    }
    public void remind (){

    }

}
