package screen.AT2BOOSA1002;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acarrillo on 18/05/2016.
 */
public class AT2BOOSA1002Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSA1002Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources/AT2BOOSA1002Values.txt");
        if (enviroment.equalsIgnoreCase("sis")) {
            setDataSis();
        } else {
            setDataTest();
        }
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setDataTest() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultDataTest();
        }
    }

    public void setDefaultDataTest() {
        data.put("header_interface", "H");
        //String content[] = {"HOTELOPESP","INTERUNION", "BESTHOTDEA", "BOOSTEN"};
        //data.put("header_to", (content[new Random().nextInt(content.length)]));
        data.put("header_to", "HOTELOPESP");
        //data.put("header_branch", "1");
        //data.put("header_user", "WLG00029");
        data.put("header_booking_type", "N");
        data.put("header_ag_ref", DataGenerator.getRandomAlphanumericSequence(6, true));
        data.put("header_despt", "HOTELOPIA");
        data.put("header_adults", String.valueOf(DataGenerator.random(2, 4)));
        data.put("header_child", String.valueOf(DataGenerator.random(1, 2)));
        data.put("header_baby", String.valueOf(DataGenerator.random(0, 1)));
        data.put("header_pax_name", "Godofredo");
        data.put("da_header_paxes_type", "A");
        data.put("da_header_paxes_type2", "ADU");
        data.put("header_paxes_country", "ES");
        data.put("da_header_paxes_type_edit", "N");
        data.put("da_header_paxes_type2_edit", "CHD");
        data.put("header_paxes_country_edit", "BB");
        //data.put("header_valuation", "");
        data.put("booking_remmarks", "Testing random data");
        data.put("hotel_startdate", DataGenerator.getToday());
        data.put("hotel_night", "5");
        data.put("hotel_name", "CAPDEMAR");
        data.put("room_name", "1BS");
        data.put("char_name", "1BS");
        data.put("hotel_fixinfo_phone", "971546791");
        data.put("hotel_fixinfo_mail", "anemail@adomain.ar");
        data.put("hotel_fixinfo_comment", "Testing some stauff");
        data.put("transfer_date", DataGenerator.getToday());
        data.put("activities_startdate", DataGenerator.getToday());
        data.put("from_zone", "AEROPUERTO");
        data.put("to_zone", "ALCUDIA");//from_zone2
        data.put("flight_airport", "PALMA DE MALLORCA");


    }

    public void setDataSis() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultDataSis();
        }
    }

    public void setDefaultDataSis() {
        data.put("header_interface", "H");
        //String content[] = {"HOTELOPESP","INTERUNION", "BESTHOTDEA", "BOOSTEN"};
        //data.put("header_to", (content[new Random().nextInt(content.length)]));
        data.put("header_to", "HOTELOPESP");
        //data.put("header_branch", "1");
        //data.put("header_user", "WLG00029");
        data.put("header_booking_type", "N");
        data.put("header_ag_ref", DataGenerator.getRandomAlphanumericSequence(6, true));
        data.put("header_despt", "HOTELOPIA");
        data.put("header_adults", String.valueOf(DataGenerator.random(2, 4)));
        data.put("header_child", String.valueOf(DataGenerator.random(1, 2)));
        data.put("header_baby", String.valueOf(DataGenerator.random(0, 1)));
        data.put("header_pax_name", "Godofredo");
        data.put("da_header_paxes_type", "A");
        data.put("da_header_paxes_type2", "ADU");
        data.put("header_paxes_country", "ES");
        //data.put("header_valuation", "");
        data.put("booking_remmarks", "Testing random data");
        data.put("hotel_startdate", DataGenerator.getToday());
        data.put("hotel_night", "5");
        data.put("hotel_name", "CAPDEMAR");
        data.put("room_name", "1BS");
        data.put("char_name", "1BS");
        data.put("hotel_fixinfo_phone", "971546791");
        data.put("hotel_fixinfo_mail", "anemail@adomain.ar");
        data.put("hotel_fixinfo_comment", "Testing some stauff");
        data.put("transfer_date", DataGenerator.getToday());
        data.put("activities_startdate", DataGenerator.getToday());
        data.put("from_zone", "AEROPUERTO");
        data.put("to_zone", "ALCUDIA");//from_zone2
        data.put("flight_airport", "PALMA DE MALLORCA");


    }
}
