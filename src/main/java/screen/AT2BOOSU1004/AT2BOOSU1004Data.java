package screen.AT2BOOSU1004;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 05/10/2016.
 */
public class AT2BOOSU1004Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSU1004Data(String enviroment) {
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources AT2BOOSU1004Values.txt");
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
