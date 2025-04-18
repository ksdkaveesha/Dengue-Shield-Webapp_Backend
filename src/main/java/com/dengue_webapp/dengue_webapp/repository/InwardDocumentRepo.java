package com.dengue_webapp.dengue_webapp.repository;

import com.dengue_webapp.dengue_webapp.model.entity.InwardDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface InwardDocumentRepo extends JpaRepository<InwardDocument,Long> {
    boolean existsByOriginalNumberAndInwardNumber(String originalNumber, String inwardNumber);

    List<InwardDocument> findAllByPhi_Id(Long phiId);
}
