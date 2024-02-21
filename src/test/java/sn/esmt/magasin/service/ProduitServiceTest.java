package sn.esmt.magasin.service;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import sn.esmt.magasin.entity.ProduitEntity;
import sn.esmt.magasin.repository.ProduitRepository;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor
class ProduitServiceTest {

  private ProduitService produitService;
  private ProduitRepository produitRepository;

  @Autowired


  @BeforeEach
  void setUp() {
    this.produitRepository = new ProduitRepository() {
      @Override
      public Optional<ProduitEntity> findByReferenceAndQuantiteStock(String ref, double quantiteStock) {
        return Optional.empty();
      }

      @Override
      public Optional<ProduitEntity> findByReferenceAndQuantiteStockv2(String ref, double quantiteStock) {
        return Optional.empty();
      }

      @Override
      public Optional<ProduitEntity> findByRef(String ref) {
        return Optional.empty();
      }

      @Override
      public void flush() {

      }

      @Override
      public <S extends ProduitEntity> S saveAndFlush(S entity) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
      }

      @Override
      public void deleteAllInBatch(Iterable<ProduitEntity> entities) {

      }

      @Override
      public void deleteAllByIdInBatch(Iterable<String> strings) {

      }

      @Override
      public void deleteAllInBatch() {

      }

      @Override
      public ProduitEntity getOne(String s) {
        return null;
      }

      @Override
      public ProduitEntity getById(String s) {
        return null;
      }

      @Override
      public ProduitEntity getReferenceById(String s) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> List<S> findAll(Example<S> example) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
      }

      @Override
      public List<ProduitEntity> findAll() {
        return null;
      }

      @Override
      public List<ProduitEntity> findAllById(Iterable<String> strings) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> S save(S entity) {
        return null;
      }

      @Override
      public Optional<ProduitEntity> findById(String s) {
        return Optional.empty();
      }

      @Override
      public boolean existsById(String s) {
        return false;
      }

      @Override
      public long count() {
        return 0;
      }

      @Override
      public void deleteById(String s) {

      }

      @Override
      public void delete(ProduitEntity entity) {

      }

      @Override
      public void deleteAllById(Iterable<? extends String> strings) {

      }

      @Override
      public void deleteAll(Iterable<? extends ProduitEntity> entities) {

      }

      @Override
      public void deleteAll() {

      }

      @Override
      public List<ProduitEntity> findAll(Sort sort) {
        return null;
      }

      @Override
      public Page<ProduitEntity> findAll(Pageable pageable) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
      }

      @Override
      public <S extends ProduitEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
      }

      @Override
      public <S extends ProduitEntity> long count(Example<S> example) {
        return 0;
      }

      @Override
      public <S extends ProduitEntity> boolean exists(Example<S> example) {
        return false;
      }

      @Override
      public <S extends ProduitEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
      }
    };
    this.produitService = new ProduitService(produitRepository);
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void save() {
      // Créer un produit pour tester
      ProduitEntity produit = new ProduitEntity();
      produit.setNom("ordinateur");
      produit.setRef("10");
      produit.setQtStock(5);

      // Enregistrer le produit
      ProduitEntity produitEnregistre = produitService.save(produit);

      // Vérifier que le produit enregistré n'est pas nul
      assertNotNull(produitEnregistre);

      // Vérifier que le produit enregistré a un ID non nul
      assertNotNull(produitEnregistre.getId());

      // Vérifier que le produit enregistré a les mêmes attributs que le produit initial
      assertEquals(produit.getNom(), produitEnregistre.getNom());
      assertEquals(produit.getRef(), produitEnregistre.getRef());
      assertEquals(produit.getQtStock(), produitEnregistre.getQtStock());
    }

  }

