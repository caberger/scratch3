package org.acme.feature.vehicle;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class VehicleDao {
    @Inject
    EntityManager em;

    List<Vehicle> all() {
        var vehicles = em.createQuery("select v from Vehicle v", Vehicle.class).getResultList();
        return vehicles;
    }
}

