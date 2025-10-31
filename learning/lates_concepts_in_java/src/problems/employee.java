package problems;

public class employee{
    private String name;

    public employee(String name, int salaray, String department) {
        this.name = name;
        this.salaray = salaray;
        this.department = department;
    }

    private int salaray;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaray() {
        return salaray;
    }

    public void setSalaray(int salaray) {
        this.salaray = salaray;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
