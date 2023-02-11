package java.Ex001;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {
    // TODO Auto-generated method stub
        return super.equals(obj);
    } 

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return id;
    }

        
    }

