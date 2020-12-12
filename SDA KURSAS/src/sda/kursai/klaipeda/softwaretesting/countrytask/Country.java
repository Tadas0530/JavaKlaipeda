package sda.kursai.klaipeda.softwaretesting.countrytask;

public class Country {
    private String name;
    private int co2Emission;
    private String pollutionFactor;

    public Country(String name, int co2Emission, String pollutionFactor) {
        if (pollutionFactor.equalsIgnoreCase("animal husbandry")) {
            co2Emission *= 1.2d;
        } else if (pollutionFactor.equalsIgnoreCase("transportation")) {
            co2Emission *= 0.9d;
        } else if (pollutionFactor.equalsIgnoreCase("factories")) {
            co2Emission *= 1.4d;
        }
        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;
        CountryMethods.addCountriesToArray(Country.this);
    }

    public String getName() {
        return name;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public String getPollutionFactor() {
        return pollutionFactor;
    }
}
