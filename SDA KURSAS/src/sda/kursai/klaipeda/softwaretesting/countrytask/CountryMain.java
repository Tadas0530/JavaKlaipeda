package sda.kursai.klaipeda.softwaretesting.countrytask;

public class CountryMain {
    public static void main(String[] args) {
        Country country1 = new Country("Lithuania", 7950, "factories");
        Country country2 = new Country("Latvia", 9842, "transportation");
        Country country3 = new Country("Estonia", 8970, "animal husbandry");

        CountryMethods.leastPollutedCountry();
        CountryMethods.countryPollutionAverage();
        CountryMethods.commonCountriesPollution();
    }
}
