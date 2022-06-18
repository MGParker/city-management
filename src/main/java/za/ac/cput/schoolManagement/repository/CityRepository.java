package za.ac.cput.schoolManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.schoolManagement.domain.City;

public interface CityRepository extends JpaRepository<City, String> {
}
