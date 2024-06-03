
package collections2;

import java.util.*;

public class CityStateMap extends HashMap<String, String> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CityStateMap() {
        super();
    }

    public void addCityState(String city, String state) {
        if (containsKey(city)) {
            put(city, state); // replace existing mapping
        } else {
            put(city, state);
        }
    }

    public List<String> getAllCities() {
        return new ArrayList<>(keySet());
    }

    public List<String> getAllStates() {
        return new ArrayList<>(new HashSet<>(values()));
    }

    public List<String> getCitiesForState(String state) {
        List<String> cities = new ArrayList<>();
        for (Map.Entry<String, String> entry : entrySet()) {
            if (entry.getValue().equals(state)) {
                cities.add(entry.getKey());
            }
        }
        return cities;
    }

    public void deleteCitiesForState(String state) {
        Iterator<Map.Entry<String, String>> iterator = entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(state)) {
                iterator.remove();
            }
        }
    }

    public void printAllData() {
        System.out.println("City-State Map:");
        for (Map.Entry<String, String> entry : entrySet()) {
            System.out.println("City: " + entry.getKey() + ", State: " + entry.getValue());
        }
    }
}
