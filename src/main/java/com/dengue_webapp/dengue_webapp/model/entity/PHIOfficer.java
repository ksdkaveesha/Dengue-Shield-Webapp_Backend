package com.dengue_webapp.dengue_webapp.model.entity;

import com.dengue_webapp.dengue_webapp.model.entity.MOHOfficer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PHIOfficer")
public class PHIOfficer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser appuser;

    @Column(name = "mobilenumber", length = 255)
    private String mobilenumber;


    @Column(name = "area", length = 255)
    private String area;


    @Column(name = "district", length = 255)
    private String district;

    @Column(name = "branch", length = 255)
    private String branch;

    @ManyToOne
  @JoinColumn(name = "moh_officer_id")
  private MOHOfficer mohOfficer;

    @OneToMany(mappedBy = "phi", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<InwardDocument> inwardDocuments = new ArrayList<>();

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDate.now(); // ✅ Ensures accurate date when saving
    }
    
}
