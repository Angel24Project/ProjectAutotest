package screen.AT2BOOSA0001;

import core.FileGestor.DataHarvester;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2BOOSA0001Data {
    Map<String, String> data = new HashMap<>();
    DataHarvester harvester;

    public AT2BOOSA0001Data (String enviroment){
        this.harvester = new DataHarvester("C:/ProjectAutotest/src/main/resources  AT2BOOSA0001Values.txt");
        setData();
    }

    public Map<String, String> getData (){
        return data;
    }

    public void setData (){
        this.data = harvester.harvestAll();
        if(data.get("empty").equals("true")){
            setDefaultData();
        }
    }

    public void setDefaultData (){
        data.put("import_bookings", "C:\\ProjectAutotest\\src\\main\\resources\\ImportBookings.xlsx");
    }
}
