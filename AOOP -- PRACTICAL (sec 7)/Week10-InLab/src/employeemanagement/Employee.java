package employeemanagement;

public class Employee implements Cloneable {
    private String name;
    private String dob;
    private String mobileNumber;
    private String id;

    public Employee(String name, String dob, String mobileNumber, String id) {
        this.name = name;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dob='" + dob + "', mobileNumber='" + mobileNumber + "', id='" + id + "'}";
    }

    @Override
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }
}
