
package collections2;
import java.util.*;

public class CityStateOperations {
    private CityStateMap cityStateMap;

    public CityStateOperations(CityStateMap cityStateMap) {
        this.cityStateMap = cityStateMap;
    }

    public void addCityState(String city, String state) {
        cityStateMap.addCityState(city, state);
    }

    public List<String> getAllCities() {
        return cityStateMap.getAllCities();
    }

    public List<String> getAllStates() {
        return cityStateMap.getAllStates();
    }

    public List<String> getCitiesForState(String state) {
        return cityStateMap.getCitiesForState(state);
    }

    public void deleteCitiesForState(String state) {
        cityStateMap.deleteCitiesForState(state);
    }
}