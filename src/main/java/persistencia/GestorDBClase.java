package persistencia;

import java.util.List;

import org.hibernate.Session;



public class GestorDBClase<T> implements IGestorDBClase<T>{

Session session;

    public GestorDBClase()
    {
        this.session = session;
    }

    @Override
    public List<T> getElements() {

        return null;
    }

    @Override
    public T getElement(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addElement(T element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeElement(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateElement(T element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void insertData() {
        // TODO Auto-generated method stub
        
    }
    
}
