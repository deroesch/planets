package org.deroesch.planets.dbs;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

import org.deroesch.planets.models.Planet;
 

public class PlanetsDB {

    public static final Planet mercury = new Planet("Mercury", "57,900,000 km (36,000,000 miles)",
            "4,878 km (3,031 miles)", "59 days", "88 days", "0.38", "-183 °C to 427 °C", "Sodium, helium", 0);

    public static final Planet venus = new Planet("Venus", "108,160,000 km (67,000,000 miles)",
            "12,104 km (7,521 miles)", "243 days", "224 days", "0.9", "480 °C", "Carbon Dioxide (96%), Nitrogen (3.5%)",
            0);

    public static final Planet earth = new Planet("Earth", "149,600,000 km (92,960,000 miles)",
            "12,756 km (7,926 miles)", "23 hours, 56 mins", "365.25 days", "1", "14 °C", "Nitrogen (77%), Oxygen (21%)",
            1);

    public static final Planet mars = new Planet("Mars", "227,936,640 km (141,700,000 miles)", "6,794 km (4,222 miles)",
            "24 hours, 37 mins", "687 days", "0.38", "-63 °C", "Carbon Dioxide(95.3%), Argon", 2);

    public static final Planet jupiter = new Planet("Jupiter", "778,369,000 km (483,500,000 miles)",
            "142,984 km (88,846 miles)", "9 hours, 55 mins", "11.86 years", "2.64", "-130 °C", "Hydrogen, Helium", 79);

    public static final Planet saturn = new Planet("Saturn", "1,427,034,000 km (888,750,000 miles)",
            "120,536 km (74,900 miles)", "10 hours, 39 mins", "29 years", "1.16", "-130 °C", "Hydrogen, Helium", 82);

    public static final Planet uranus = new Planet("Uranus", "2,870,658,186 km (1,783,744,300 miles)",
            "51,118 km (31,763 miles)", "17 hours, 14 mins", "84 years", "1.11", "-200 °C", "Hydrogen, Helium, Methane",
            27);

    public static final Planet neptune = new Planet("Neptune", "4,496,976,000 km (2,797,770,000 miles)",
            "49,532 km (30,779 miles)", "16 hours, 7 mins", "164.8 years", "1.21", "-200 °C",
            "Hydrogen, Helium, Methane", 14);

    public static final Planet pluto = new Planet("Pluto",
            "4,436,820,000 to 7,375,930,000 km (2,756,902,000 to 4,583,190,000 miles)", "2,370 km (1473 miles)",
            "6 days, 9 hours", "248 years", "Unknown", "-228 °C", "Unknown", 5);

    public static final Map<String, Planet> planets = new HashMap<>();

    /**
     * Get one planet
     * 
     * @param name
     * @return
     */
    public static Planet getOne(String name) {
        assert null != name;

        Planet p = PlanetsDB.planets.get(name.toLowerCase());
        return p == null ? Planet.error : p;
    }

    /**
     * Get some planets
     * 
     * @param names
     * @return
     */
    public static Set<Planet> getSome(String[] names) {
        Set<Planet> planets = new HashSet<>();

        // Collect named planets
        for (String name : names)
            planets.add(PlanetsDB.getOne(name.toLowerCase()));

        return planets;
    }

    /**
     * Get all planets
     * 
     * @return
     */
    public static Collection<Planet> getAll() {
        return PlanetsDB.planets.values();
    }

    // Initialize the database
    static {
        PlanetsDB.planets.put(mercury.getId(), mercury);
        PlanetsDB.planets.put(venus.getId(), venus);
        PlanetsDB.planets.put(earth.getId(), earth);
        PlanetsDB.planets.put(mars.getId(), mars);
        PlanetsDB.planets.put(jupiter.getId(), jupiter);
        PlanetsDB.planets.put(saturn.getId(), saturn);
        PlanetsDB.planets.put(uranus.getId(), uranus);
        PlanetsDB.planets.put(PlanetsDB.neptune.getId(), neptune);
        PlanetsDB.planets.put(PlanetsDB.pluto.getId(), pluto);
    }

}
