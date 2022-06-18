package za.ac.cput.schoolManagement.factory;

import za.ac.cput.schoolManagement.domain.Country;
import za.ac.cput.schoolManagement.helper.CityHelper;

public class CountryFactory {

    public static Country build(String countryId, String countryName){
        CityHelper.checkStringParam("countryId", countryId);
        CityHelper.checkStringParam("countryName", countryName);
        return new Country.Builder().setCountryId(countryId).setCountryName(countryName).build();
    }
}
