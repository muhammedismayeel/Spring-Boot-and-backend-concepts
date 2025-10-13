class employee{
    String name;
    int salary;
    String deparment;

    employee(String name,int salary,String deparment){
        this.name = name;
        this.salary =salary;
        this.deparment = deparment;
    }

    void display(){
        System.out.println("Name :" + name);
        System.out.println("Salary :" + salary);
        System.out.println("deparment :" + deparment);
    }
}

class day4{
    public static void main(String[]args){
        employee em = new employee("Ali", 50000, "IT");
        employee em2 = new employee("Sara", 60000, "HR");

        em.display();
        em2.display();
    }
}