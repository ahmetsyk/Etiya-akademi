package com.etiya.rentacar.dataAccess.abstracts;

import com.etiya.rentacar.entities.concretes.BrandColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandColorRepository extends JpaRepository<BrandColor,Integer> {
}
