package screen.AT2MDMDE0014;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aibanez on 24/10/2016.
 */
public class AT2MDMDE0014Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2MDMDE0014Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2MDMDE0014Values.txt");
        setData();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData() {
        this.data = harvester.harvestAll();
        if (data.get("empty").equals("true")) {
            setDefaultData();
        }
    }

    public void setDefaultData() {
    }
}
