public class Student extends Person{
    private String program;
     private int year;
     private double fee;


     public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }


    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }

    public double getFee() {
        return fee;

    }


}
