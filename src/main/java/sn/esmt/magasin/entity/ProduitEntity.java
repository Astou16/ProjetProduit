package sn.esmt.magasin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {

  @Id
  @Column(name = "reference", length = 10)
  private String ref;
  @Column(name = "nom", length = 150, nullable = false)
  private String nom;
  @Column(name = "quantiteStock")
  private double qtStock;

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
