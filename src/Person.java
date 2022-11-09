

public class Person {
    private String fullName;
   private char gender;
   private String email;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void timetable(){
        System.out.println(
                       "**********************Timetable**********************" +"\n"+
                        " time  Monday   Tuesday   Saturday    Wednesday   Friday "+"\n"+
                        " 11:00          Session                Session            "+" \n"+
                        " 13:00                                                     "+"\n" +
                        " 14:00 English             English    Soft Skills           "+"\n " +
                        " 15:00                                                      "+"\n" +
                        " 18:00 Technical           Technical               Technical "+"\n"+
                        " 20:00   java                 java                   java    "+"\n" +
                        " ************************************************************" );

   }
}
