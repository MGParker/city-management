package za.ac.cput.schoolManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.schoolManagement.domain.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
