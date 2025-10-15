class person{
    String name;
    int age;
    
    person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Nmae : " + name);
        System.out.println("Age : " + age);
    }
}

class Teacher extends person {
    private int salary;
    String subject;

    Teacher(String name, int age, int salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void display(){
        System.out.println("Salary : " + salary);
        System.out.println("Subject : " + subject);
    }
}

class day5{
    public static void main(String[]agre){
        Teacher t1 = new Teacher("Ali" , 30 , 50000 , "bca");
        t1.display();
    }
}