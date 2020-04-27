package pl.pawel.homework9.model;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CSVModelNOSQLDAO extends MongoRepository<CSVModelNOSQL, String> {
}
