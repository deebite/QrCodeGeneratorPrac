package com.codegenerator.QRCodeGenerator.repositories;

import com.codegenerator.QRCodeGenerator.entities.QRCodeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface QRCodeDetailsRepository extends JpaRepository<QRCodeDetails, UUID> {
}
