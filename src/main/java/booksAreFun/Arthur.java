package booksAreFun;

public class Arthur {
    private String name;
    private String eMail;
    private char gender;

    public Arthur(String name, String eMail, char gender) {
        this.name = name;
        this.eMail = eMail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public char getGender() {
        return gender;
    }

    public void printAuthurName(){
        System.out.println("Found" + name);
    }


}
