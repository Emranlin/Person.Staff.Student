public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setGender('M');
        person.setEmail("rahim@gmail.com");
        System.out.println("The ful name:\n"+person.getFullName()+"Gender\n"+person.getGender()+"Email address:\n"+person.getEmail());
        System.out.println();

        Person person1=new Person();
        person1.setFullName("Aijamal Asangazieva");
        person1.setGender('F');
        person1.setEmail("aijamal@gmail.com");
        System.out.println("The ful name:\n"+person1.getFullName()+"Gender\n"+person1.getGender()+"Email address:\n"+person1.getEmail());
        System.out.println();

        Person person2=new Person();
        person2.setFullName("Muhammed Toichubai uulu");
        person2.setGender('M');
        person2.setEmail("muhammed@gmail.com");
        person.timetable();
        System.out.println("The full name:\n"+person2.getFullName()+"Gender:\n"+person2.getGender()+"Email address:\n"+person2.getEmail());
        System.out.println();

        Student student=new Student();
        student.setFullName("Zhalilova Zhiidegul");
        student.setGender('F');
        student.setEmail("zhijdegul@gmail.com");
        student.setProgram("Java");
        student.setYear(1993);
        student.setFee(12000);
        System.out.println("Student ful Name\n"+student.getFullName()+"Gender:\n"+student.getGender()+"Email address:\n"+student.getEmail()+
                "Student's learning program is: \n"+student.getProgram()+"Day of birthday:\n"+student.getYear()+"Fee for learning is: \n"+student.getFee());
        System.out.println();

        Student student1=new Student();
        student1.setFullName("Lira Kanatova");
        student1.setGender('F');
        student1.setEmail("kanatova@gmail.com");
        student1.setProgram("java");
        student1.setYear(1987);
        student1.setFee(12000);
        System.out.println("Student ful Name\n"+student1.getFullName()+"Gender:\n"+student1.getGender()+"Email address:\n"+student1.getEmail()+
                "Student's learning program is: \n"+student1.getProgram()+"Day of birthday:\n"+student1.getYear()+"Fee for learning is: \n"+student1.getFee());
        System.out.println();

        Student student2=new Student();
        student2.setFullName("Meerim Saskaraeva");
        student2.setGender('F');
        student2.setEmail("meerim@gmail.com");
        student2.setProgram("Java");
        student2.setYear(1983);
        student2.setFee(12000);
        System.out.println("Student ful Name\n"+student2.getFullName()+"Gender:\n"+student2.getGender()+"Email address:\n"+student2.getEmail()+
                "Student's learning program is: \n"+student2.getProgram()+"Day of birthday:\n"+student2.getYear()+"Fee for learning is: \n"+student2.getFee());
        student.timetable();
        System.out.println();
        Student[]students={student,student1,student2};

        Staff staff=new Staff();
        staff.setFullName("Peak soft");
        staff.setEmail("peaksoft@gamil.com");
        staff.setSalary(1000000000);
        staff.setSchool("Peak soft kids");
        staff.setStudents(students);
        System.out.println("Name of the staff:\n"+staff.getFullName()+"Staff email address:\n"+staff.getEmail()+"Salary of teachers:\n"+staff.getSalary()+
                "The new school of the staff\n"+staff.getSchool()+"There are best students:\n"+ students);
        staff.timetable();
    }
}