
package collections2;

import java.util.List;
import java.util.Scanner;

public class CityStateApp {
    public static void main(String[] args) {
        CityStateMap cityStateMap = new CityStateMap();
        CityStateOperations operations = new CityStateOperations(cityStateMap);

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (ADD, GET_CITIES, GET_STATES, GET_CITIES_FOR_STATE, DELETE_CITIES_FOR_STATE, GET_ALL_DATA, STOP):");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("STOP")) {
                break;
            }

            if (command.equalsIgnoreCase("ADD")) {
                System.out.println("Enter city and state (separated by space):");
                String[] cityState = scanner.nextLine().split(" ");
                operations.addCityState(cityState[0], cityState[1]);
            } else if (command.equalsIgnoreCase("GET_CITIES")) {
                List<String> cities = operations.getAllCities();
                System.out.println("Cities: " + cities);
            } else if (command.equalsIgnoreCase("GET_STATES")) {
                List<String> states = operations.getAllStates();
                System.out.println("States: " + states);
            } else if (command.equalsIgnoreCase("GET_CITIES_FOR_STATE")) {
                System.out.println("Enter state:");
                String state = scanner.nextLine();
                List<String> citiesForState = operations.getCitiesForState(state);
                System.out.println("Cities for state " + state + ": " + citiesForState);
            } else if (command.equalsIgnoreCase("DELETE_CITIES_FOR_STATE")) {
                System.out.println("Enter state:");
                String state = scanner.nextLine();
                operations.deleteCitiesForState(state);
                System.out.println("Cities for state " + state + " deleted");
            } else if (command.equalsIgnoreCase("GET_ALL_DATA")) {
                cityStateMap.printAllData();
            }
        }
    }
}