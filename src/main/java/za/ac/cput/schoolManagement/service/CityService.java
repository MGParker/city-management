package za.ac.cput.schoolManagement.service;

import za.ac.cput.schoolManagement.domain.City;

import java.util.List;

public interface CityService extends IService<City, String> {
    List<City> readAll();
    void deleteById(String id);
}
