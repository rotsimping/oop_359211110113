package ooplab9;

public class Address {
    private String name;
    private String age;
    private Address address;
    private Job job;

    public Address(String name, String age, Address address, Job job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class
