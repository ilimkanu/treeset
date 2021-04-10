public class Workers {
    private String name;
    private String filial;
    private int salary;
    private boolean isManager;

    public Workers(String name, String filial, int salary, boolean isManager) {
        this.name = name;
        this.filial = filial;
        this.salary = salary;
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", filial='" + filial + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
