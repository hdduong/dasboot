package com.boot.service;

import com.boot.model.Shipwreck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by HienD on 4/8/2017.
 */
@Service
public class ShipwreckServiceImpl implements ShipwreckService {
    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<Shipwreck> listAll() {
        EntityManager em = emf.createEntityManager();

        return em.createQuery("from Shipwreck", Shipwreck.class).getResultList();

    }

    public Shipwreck getById(Long id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Shipwreck.class, id);
    }

    public Shipwreck saveOrUpdate(Shipwreck shipwreck) {
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        Shipwreck savedShipwreck = em.merge(shipwreck);
        em.getTransaction().commit();

        return savedShipwreck;
    }

    public Shipwreck delete(Long id) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Shipwreck deletedShipwreck = getById(id);
        em.remove(deletedShipwreck);
        em.getTransaction().commit();

        return deletedShipwreck;

    }
}
