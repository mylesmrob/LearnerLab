package learner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> personList = new ArrayList<E>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        for(Person p : personList){
            if(person == p){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id) {
        for (Person p : personList) {
            if (p.getId() == id) {
                personList.remove(p);
            }
        }
    }

    public void removeAll(){
        for(Person p : personList){
            personList.remove(p);
        }
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();

    public Iterator iterator() {
        Iterator<E> i = personList.iterator();
        /*while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }*/
        return i;
    }
}
