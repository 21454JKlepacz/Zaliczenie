package pociagiTest;

import pociagi.Pociag;
import pociagi.PociagImpl;
import org.junit.jupiter.api.Test;

// Klasa testowa do testowania funkcjonalności klasy PociagImpl
class PociagiTest {

    // Testuje metody klasy PociagImpl
    @Test
    void testPociag() {
        Pociag pociag = new PociagImpl("123", "Kraków", "Warszawa", "10:00", "14:30");
        pociag.wyświetlKomunikat();
        pociag.podajGodzinePrzyjazdu();
        pociag.podajGodzineOdjazdu();
    }
}
