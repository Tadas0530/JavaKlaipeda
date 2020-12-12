import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sda.kursai.klaipeda.softwaretesting.tractortask.Tractor;
import sda.kursai.klaipeda.softwaretesting.tractortask.TractorMethods;

import java.time.LocalDate;

public class TractorTest {
    @Test
    public void testMostExpensiveTractor() {
        // given
        Tractor tractor1 = new Tractor("John-Deer", "7530", 350,
                LocalDate.of(1995,7,30), 30000d);

        Tractor tractor2 = new Tractor("Fend", "1050", 280,
                LocalDate.of(1997,9,2), 23000d);

        Tractor tractor3 = new Tractor("Belarus", "MTZ-5", 400,
                LocalDate.of(1993,2,6), 15000d);

        // when
        String result = TractorMethods.findMostExpensiveTractor();

        // then
        Assertions.assertThat(result).isEqualTo("John-Deer 7530");
    }
    @Test
    public void testTheOldestTractor() {
        // given
        Tractor tractor1 = new Tractor("John-Deer", "7530", 350,
                LocalDate.of(1995,7,30), 30000d);

        Tractor tractor2 = new Tractor("Fend", "1050", 280,
                LocalDate.of(1997,9,2), 23000d);

        Tractor tractor3 = new Tractor("Belarus", "MTZ-5", 400,
                LocalDate.of(1993,2,6), 15000d);

        // when
        String result = TractorMethods.findTheOldestTractor();

        // then
        Assertions.assertThat(result).isEqualTo("Belarus MTZ-5");
    }

    @Test
    public void testFindTanksOver300() {
        // given
        Tractor tractor1 = new Tractor("John-Deer", "7530", 350,
                LocalDate.of(1995,7,30), 30000d);

        Tractor tractor2 = new Tractor("Fend", "1050", 280,
                LocalDate.of(1997,9,2), 23000d);

        Tractor tractor3 = new Tractor("Belarus", "MTZ-5", 400,
                LocalDate.of(1993,2,6), 15000d);

        // when
        int result = TractorMethods.findTanksOver300();
        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void testModelWithLetterM() {
        // given
        Tractor tractor1 = new Tractor("John-Deer", "7530", 350,
                LocalDate.of(1995,7,30), 30000d);

        Tractor tractor2 = new Tractor("Fend", "1050", 280,
                LocalDate.of(1997,9,2), 23000d);

        Tractor tractor3 = new Tractor("Belarus", "MTZ-5", 400,
                LocalDate.of(1993,2,6), 15000d);

        // when
        int result = TractorMethods.modelsWithLatterM();
        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

}
