import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sda.kursai.klaipeda.softwaretesting.countrytask.Country;
import sda.kursai.klaipeda.softwaretesting.countrytask.CountryMethods;

public class CountryTest {
    @Test
    public void testCountriesCommonPollution() {
        // given
        Country country1 = new Country("Lithuania", 7950, "factories");
        Country country2 = new Country("Latvia", 9842, "transportation");
        Country country3 = new Country("Estonia", 8970, "animal husbandry");

        // when
        double result = CountryMethods.commonCountriesPollution();

        // then
        Assertions.assertThat(result).isEqualTo(30751);
    }

    @Test
    public void testCountriesAveragePollution() {
        // given
        Country country1 = new Country("Lithuania", 7950, "factories");
        Country country2 = new Country("Latvia", 9842, "transportation");
        Country country3 = new Country("Estonia", 8970, "animal husbandry");

        // when
        int result = CountryMethods.countryPollutionAverage();

        // then
        Assertions.assertThat(result).isEqualTo(30751);
    }

    @Test
    public void testLeastPollutedCountry() {
        // given
        Country country1 = new Country("Lithuania", 7950, "factories");
        Country country2 = new Country("Latvia", 9842, "transportation");
        Country country3 = new Country("Estonia", 8970, "animal husbandry");

        // when
        String result = CountryMethods.leastPollutedCountry();

        // then
        Assertions.assertThat(result).isEqualTo("Latvia");
    }
}
