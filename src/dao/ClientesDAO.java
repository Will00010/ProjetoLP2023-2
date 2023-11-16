/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClientesCwmo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author carlo
 */
public class ClientesDAO extends DAO_Abstract  {

 
 
    @Override
    public void insert(Object object) {
    session.beginTransaction();
    session.save(object);
    session.getTransaction().commit();
    //transações podem ter duas "finalidades" commit ou rollback, onde o commit salva a transação e o rollback defaz 
    }

    @Override
    public void update(Object object) {
    session.beginTransaction();
    session.flush();
    session.clear();
    session.update(object);
    session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
    session.beginTransaction(); 
    session.flush();
    session.clear();
    //flush e clear limpam o cache do hibernate pra não enviar as coisas erradas
    session.delete(object);
    session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesCwmo.class);
        criteria.add(Restrictions.eq("id", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return(ArrayList) lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesCwmo.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return(ArrayList) lista;
    }
    public List listInteresses(String interesses){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesCwmo.class);
        criteria.add(Restrictions.like("interessesCwmo", "%"+  interesses +"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
//            jTxtId.setText(Util.intStr(clientesCwmo.getIdClienteCwmo()));
    public List listEC(int ec){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesCwmo.class);
        criteria.add(Restrictions.eq("clientesCwmo", ec));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
        public List listInteressesEC(String interesses, int ec) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClientesCwmo.class);
        criteria.add(Restrictions.like("interessesCwmo", "%"+  interesses +"%"));
        criteria.add(Restrictions.eq("clientesCwmo",  ec));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
        }    
}
