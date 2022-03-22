package test;

import dao.config.ConfigJDBC;
import dao.impl.HotelDaoH2;
import model.Hotel;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.HotelService;


public class HotelServiceTest {

    private static final Logger LOGGER = Logger.getLogger(test.HotelServiceTest.class);

    private HotelService hotelService = new HotelService(
            new HotelDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarHotelNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Hotel hotel1 = new Hotel("hotel vagabundo","dos tolos",0, "Presidente Olegario", "MG",false,1);

        hotelService.salvar(hotel1);

        LOGGER.info(hotel1.toString());


    }

    /*@Test
    public void cadastrarHotelBanco() {

        hotelService.salvar(cadastrarHotelNoH2().getNomeFilial());
        hotelService.salvar(hotel1.getRua());
        hotelService.salvar(hotel1.getNumero());
        hotelService.salvar(hotel1.getCidade());
        hotelService.salvar(hotel1.getEstado());
        hotelService.salvar(hotel1.isHotel5strelas());
        hotelService.salvar(hotel1.getNumeroDeEstrelas());

    }*/



}

