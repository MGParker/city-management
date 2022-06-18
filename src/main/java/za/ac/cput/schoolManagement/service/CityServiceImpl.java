package za.ac.cput.schoolManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolManagement.domain.City;
import za.ac.cput.schoolManagement.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City save(City city) {
        return this.cityRepository.save(city);
    }

    public Optional<City> read(String id) {
        return this.cityRepository.findById(id);
    }

    public void delete(City city) {
        this.cityRepository.delete(city);
    }

    public List<City> readAll() {
        return this.cityRepository.findAll();
    }

    public void deleteById(String id) {
        Optional<City> city = read(id);
        if (city.isPresent())
            delete(city.get());
    }
}
