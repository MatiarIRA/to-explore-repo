package com.matiar.api.explore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matiar.api.explore.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
