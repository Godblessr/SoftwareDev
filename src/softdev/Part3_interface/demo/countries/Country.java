package softdev.Part3_interface.demo.countries;


public class Country implements Comparable<Country> {
    private final String name;
    private final int area;
    private final long population;

    public Country(String name, int area, long population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }

    // natural ordering
    @Override
    public int compareTo(Country country) {
        return this.getName().compareTo(country.getName());
    }
}
