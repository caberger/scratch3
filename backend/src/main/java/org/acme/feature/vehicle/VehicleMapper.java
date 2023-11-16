package org.acme.feature.vehicle;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleMapper {
    VehicleDto toResource(Vehicle v) {
        return new VehicleDto(v.name, v.color, v.yearOfConstruction);
    }
}
