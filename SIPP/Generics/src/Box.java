public class Box <E>{
    private E id;
    private E name;
    private E salary;

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public E getName() {
        return name;
    }

    public E getSalary() {
        return salary;
    }

    public void setName(E name) {
        this.name = name;
    }

    public void setSalary(E salary) {
        this.salary = salary;
    }
}
