package people;

import java.util.ArrayList;




public class People {

    private Person person;

    ArrayList<Person> personList = new ArrayList<Person>();


    //Methods

    public void  add(Person p){
        personList.add(p);
    }



    public Person findID(long id) {

        for (Person p: personList) {
            if (p.getId() == id ){
                return p;

            }
        }

        return null;
    }

    public void remove (Person person){
            personList.remove(person);

        }


    public void remove(long id) {
        for (Person p: personList) {
            if (id == p.getId() ){
              personList.remove(p);
            }
        }



    }
    public int getCount(){
        return personList.size();
    }

    public String getArray(){

       return person.toString();

    }

    public void removeAllEntries(){
        personList.clear();

    }








}
