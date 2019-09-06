package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        Integer pop1 = (Integer) o1.getPopulation();
        Integer pop2 = (Integer) o2.getPopulation();
        return pop1.compareTo(pop2);
        
    }
}
