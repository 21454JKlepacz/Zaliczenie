package pociagi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Implementacja interfejsów Pociag i Komunikat
public class PociagImpl implements Pociag, Komunikat {
    private static final Logger logger = LogManager.getLogger(PociagImpl.class);

    private String numerPociagu;
    private String stacjaOdjazdu;
    private String stacjaPrzyjazdu;
    private String godzinaOdjazdu;
    private String godzinaPrzyjazdu;


    public PociagImpl(String numerPociagu, String stacjaOdjazdu, String stacjaPrzyjazdu, String godzinaOdjazdu, String godzinaPrzyjazdu) {
        this.numerPociagu = numerPociagu;
        this.stacjaOdjazdu = stacjaOdjazdu;
        this.stacjaPrzyjazdu = stacjaPrzyjazdu;
        this.godzinaOdjazdu = godzinaOdjazdu;
        this.godzinaPrzyjazdu = godzinaPrzyjazdu;
    }


    @Override
    public void podajGodzinePrzyjazdu() {
        logger.info("Godzina przyjazdu: " + godzinaPrzyjazdu);
    }


    @Override
    public void podajGodzineOdjazdu() {
        logger.info("Godzina odjazdu: " + godzinaOdjazdu);
    }


    @Override
    public void wyświetlKomunikat() {
        logger.info("Pociąg " + numerPociagu + " z " + stacjaOdjazdu + " do " + stacjaPrzyjazdu);
        logger.info("Przyjazd: " + godzinaPrzyjazdu + ", Odjazd: " + godzinaOdjazdu);
    }
}
