package rentcompany;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    @DisplayName("line.separator: 캐리지리턴 + 개행")
    void lineSeparator() {
        assertThat(NEWLINE).isEqualTo("\r\n");
        assertThat(NEWLINE).isNotEqualTo("\n\r");
        assertThat(NEWLINE).isNotEqualTo("\n");
        assertThat(NEWLINE).isNotEqualTo("\r");
    }

    @Test
    @DisplayName("주입할 연료량 : Sonata")
    void chargeQuantitSonatay() {
        Sonata sonata = new Sonata(150);
        double chargeQuantity = sonata.getChargeQuantity();
        assertThat(chargeQuantity).isEqualTo(15);
    }

    @Test
    @DisplayName("주입할 연료량 : K5")
    void chargeQuantityK5() {
        K5 k5 = new K5(260);
        double chargeQuantity = k5.getChargeQuantity();
        assertThat(chargeQuantity).isEqualTo(20);
    }

    @Test
    @DisplayName("주입할 연료량 : Sonata")
    void chargeQuantitySonata() {
        Sonata sonata = new Sonata(120);
        double distancePerLiter = sonata.getChargeQuantity();
        assertThat(distancePerLiter).isEqualTo(12);
    }

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }
}