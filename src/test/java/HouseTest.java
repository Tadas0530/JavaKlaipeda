import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sda.kursai.klaipeda.softwaretesting.housetask.House;
import sda.kursai.klaipeda.softwaretesting.housetask.HouseMethods;

public class HouseTest {
    @Test
    public void testNewestHouse() {
        // given
        House house1 = new House(200, "Simonaitytes", 2015, "unfinished");
        House house2 = new House(150, "Klaipedos", 2017, "partially finished");
        House house3 = new House(300, "Zemaiciu", 2019, "fitted");

        // when
        int result = HouseMethods.findNewestHouse();

        // then
        Assertions.assertThat(result).isEqualTo(2019);
    }

    @Test
    public void testSmallestHouse() {
        // given
        House house1 = new House(200, "Simonaitytes", 2015, "unfinished");
        House house2 = new House(150, "Klaipedos", 2017, "partially finished");
        House house3 = new House(300, "Zemaiciu", 2019, "fitted");

        // when
        int result = HouseMethods.findSmallestHouse();

        // then
        Assertions.assertThat(result).isEqualTo(150);
    }

    @Test
    public void testFittedHouse() {
        // given
        House house1 = new House(200, "Simonaitytes", 2015, "fitted");
        House house2 = new House(150, "Klaipedos", 2017, "partially finished");
        House house3 = new House(300, "Zemaiciu", 2019, "fitted");

        // when
        int result = HouseMethods.findFittedHouse();

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }
}