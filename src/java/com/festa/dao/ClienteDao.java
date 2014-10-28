
package com.festa.dao;

import com.festa.model.Cliente;
import com.festa.util.HibernateUtil;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

public class ClienteDao implements Idao{
    
    private Session session;

    @Override
    public void adicionar(Cliente cliente) {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
            
            
            
        } catch (Exception e) {
            session.beginTransaction().rollback();
        }
    }

   
    
}
