package booksAreFun;

public class Books {
    private String title;

    private Arthur arthur;


    public Books(String title, Arthur arthur) {
        this.title = title;
        this.arthur = arthur;
    }

    public String getTitle() {
        return title;
    }

    public Arthur getArthur() {
        return arthur;
    }

    public void findAuthor() {

        if (arthur != null) {

            arthur.printAuthurName();

        }

    }

}

