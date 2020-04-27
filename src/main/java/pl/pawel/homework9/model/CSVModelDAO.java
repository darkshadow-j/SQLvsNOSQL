package pl.pawel.homework9.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CSVModelDAO extends JpaRepository<CSVModel, Long> {
}
