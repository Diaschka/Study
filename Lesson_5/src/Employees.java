public class Employees {

    private String name;
    public String position;
    public String email;
    public long telNumber;
    public int salary;
    private int age;

    public Employees(String _name, String _position, String _email, long _telNumber, int _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        telNumber = _telNumber;
        salary = _salary;
        age = _age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void infoFull(){
        System.out.println("Employee " + name + " is a " + position + ". E-mail(" + email + ")." + " Tel.: +7(777)" + telNumber + ". Salary: " + salary + "$. Age: " + age);
    }


}
