package za.ac.cput.schoolManagement.factory;

import za.ac.cput.schoolManagement.domain.City;
import za.ac.cput.schoolManagement.domain.Country;
import za.ac.cput.schoolManagement.helper.CityHelper;

public class CityFactory {

    public static City build(String id, String name, Country country) {
        CityHelper.checkStringParam("id", id);
        CityHelper.checkStringParam("name", name);
        CityHelper.checkingEntityParam("country", country);
        return new City.Builder().setId(id).setName(name).setCountry(country).build();
    }
}
