package ooplab9;

public class personApp { public static void main(String[] args) {
    Person person = new Person("Joy", "23",
            new Address("80 m1", "nakhon", "801100"),
            new Job("Programer",5000));

    System.out.println(person.toString());

    //edit data of object
    person.getJob().setSalary(50000);
    System.out.println("Name: "+person.getname()+
            "Salary: "+person.getJob().getSalary());
}
}//class
