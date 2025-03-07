package Interface;

interface Employee {
    void work();
    double getSalary();
}


class Engineer implements Employee {
    @Override
    public void work() {
        System.out.println("Mühendis: Tasarım yapıyor.");
    }

    @Override
    public double getSalary() {
        return 8000.0;
    }
}


class Accountant implements Employee {
    @Override
    public void work() {
        System.out.println("Muhasebeci: Finans yönetiyor.");
    }

    @Override
    public double getSalary() {
        return 6000.0;
    }
}

