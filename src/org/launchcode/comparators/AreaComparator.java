package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        Double area1 = o1.getArea();
        Double area2 = o2.getArea();
        return area1.compareTo(area2);
    }
}
