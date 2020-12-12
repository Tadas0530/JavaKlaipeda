package sda.kursai.klaipeda.softwaretesting.countrytask;

public class CountryMethods {
    private static Country[] countriesArray = new Country[3];

    public static void addCountriesToArray(Country country) {
        for (int i = 0; i < countriesArray.length; i++) {
            if (countriesArray[i] == null) {
                countriesArray[i] = country;
                break;
            }
        }
    }

    public static String leastPollutedCountry() {
        double leastPollutedNum = countriesArray[0].getCo2Emission();
        String countryName = "";
        for (Country country : countriesArray) {
            if (leastPollutedNum > country.getCo2Emission()) {
                leastPollutedNum = country.getCo2Emission();
                countryName = country.getName();
            }
        }
        System.out.println("Least polluted country is " + countryName + ".");
        return countryName;
    }

    public static int commonCountriesPollution() {
        int pollutionSum = 0;
        for (Country country : countriesArray) {
            pollutionSum += country.getCo2Emission();
        }
        System.out.println("Countries common pollution is " + pollutionSum + ".");
        return pollutionSum;
    }

    public static int countryPollutionAverage() {
        int pollutionSum = 0;
        for (Country country : countriesArray) {
            pollutionSum += country.getCo2Emission();
        }
        System.out.println("Countries average pollution is " + pollutionSum / countriesArray.length + ".");
        return pollutionSum / countriesArray.length;
    }
}
