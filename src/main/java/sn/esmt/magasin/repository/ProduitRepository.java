package sn.esmt.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.magasin.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {

  @Query("select p from ProduitEntity p where p.ref=?1 and p.qtStock=?2")
  public Optional<ProduitEntity> findByReferenceAndQuantiteStock(String ref, double quantiteStock);

  @Query("select p from ProduitEntity p where p.ref= :r and p.qtStock= :q")
  public Optional<ProduitEntity> findByReferenceAndQuantiteStockv2(@Param("r") String ref, @Param("q") double quantiteStock);
  public Optional<ProduitEntity> findByRef(String ref);
}
