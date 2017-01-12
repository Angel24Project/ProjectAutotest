package screen.AT2ACCDI0028;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;

import java.util.Locale;
import java.util.Random;

/**
 * Created by vsolis on 29/11/2016.
 *
 * Campo "Desactivation Date" no funciona, descomentar código cuando lo haga
 */
public class AT2ACCDI0028Test {
    protected AT2ACCDI0028Locators locators;
    protected AT2ACCDI0028Data data;

    public AT2ACCDI0028Test (){

    }

    public AT2ACCDI0028Locators getLocators (){
        return locators;
    }

    public void setLocators (AT2ACCDI0028Locators locators){
        this.locators = locators;
    }

    public AT2ACCDI0028Data getData (){
        return data;
    }

    public void setData (AT2ACCDI0028Data data){
        this.data = data;
    }

    public void start (TestDriver driver){
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo (TestDriver driver){
        driver.getTestdetails().setMainmenu("Accommodation");
        driver.getTestdetails().setSubmenu("Distribution");
        driver.getTestdetails().setScreen("Exclusions maintenance");
    }

    protected String getElements (String key){
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData (String key){
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){

        if(!Exclusions_maintenance_category(driver)){return false;}
        //  if(!Exclusions_maintenance_binding(driver)){return false;}
        if(!Exclusions_maintenance_generals(driver)){return false;}
        if(!Exclusions_maintenance_atlas(driver)){return false;}
        if(!Exclusions_maintenance_si(driver)){return false;}

        return false;
    }

    /*EXCLUSIONS MAINTENANCE TAB SI*/
    private boolean Exclusions_maintenance_si (TestDriver driver){

        if(!Exclusions_maintenance_si_add(driver)){return false;}
        if(!Exclusions_maintenance_si_search(driver)){return false;}
        if(!Exclusions_maintenance_si_edit(driver)){return false;}
        if(!Exclusions_maintenance_si_qbe(driver)){return false;}


        return true;
    }
    private boolean Exclusions_maintenance_si_qbe (TestDriver driver){
        String where;
        where= " on QBE";
        driver.getReport().addHeader(" QBE IN SI EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.clickQbE(driver,
                new String[]{"", getElements("")},// query button
                new String[]{"", getElements("")},//any query input
                where)){return false;} // where the operation occurs
        Functions.zoomOut(driver,3);
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "sequence", getData("sequence"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                "reason", getData("reason"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                "ie", getData("ie"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "start_date", getData("start_date"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                "active", getData("active"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                "main_acount", getData("main_acount"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "b2b", getData("b2b"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "clasification", getData("clasification"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "receptive", getData("receptive"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_contract",getElements("atlas_i_qbe_contract")},
                "contract", getData("contract"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_hotel",getElements("atlas_i_qbe_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_chain",getElements("atlas_i_qbe_chain")},
                "chain", getData("chain"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_destination",getElements("atlas_i_qbe_destination")},
                "destination", getData("destination"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_market",getElements("atlas_i_qbe_market")},
                "market", getData("market"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_country",getElements("atlas_i_qbe_country")},
                "country", getData("country"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_application",getElements("atlas_i_qbe_application")},
                "aplication", getData("aplication"),  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"atlas_i_qbe_sequence", getElements("atlas_i_qbe_sequence")}, //any query input
                new String[]{"atlas_n_records", getElements("atlas_n_records")}, //table result
                where)){return false;} // where this operation occurs
        return true;
    }
    private boolean Exclusions_maintenance_si_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" SEARCH IN SI EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                getData("reason"), "reason",  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                getData("ie"), "ie",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "start_date", getData("start_date"), where)){return false;}
        boolean check_box_main_acount;

        if (getData("main_acount").equalsIgnoreCase("yes")) {
            check_box_main_acount = true;
        }else{
            check_box_main_acount = false;
        }
        boolean check_box_b2b;

        if (getData("b2b").equalsIgnoreCase("yes")) {
            check_box_b2b = true;
        }else{
            check_box_b2b = false;
        }
        if (!Functions.checkboxValue(driver,
                getElements(""),"main_acount",check_box_main_acount,true, where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements(""),"b2b",check_box_b2b,true, where)){return false;}//where
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("tto"), // value to search
                "tto", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("clasification"), // value to search
                "clasification", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("external_agency"), // value to search
                "external_agency", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("CRS"), // value to search
                "CRS", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel_code"), // value to search
                "hotel_code", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("chain"), // value to search
                "chain", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("destination"), // value to search
                "destination", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("market"), // value to search
                "market", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"", getElements("")}, //LoV button
                new String[]{"", getElements("")}, //external LoV input
                new String[]{"", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("country"), // value to search
                "country", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.selectText(driver,
                new String[]{"",getElements("")},
                getData("aplication"), "dataname",  where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"",getElements("")}, //search button
                new String[]{"",getElements("")}, //result element
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"", getElements("")}, // element path
                "seguence", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"",getElements("")},
                "sequenece", getData("sequenece"), where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"",getElements("")}, //search button
                new String[]{"",getElements("")}, //result element
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_si_edit (TestDriver driver){
        String where;
        where= " on EDIT";
        driver.getReport().addHeader(" EDOT IN SI EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"", getElements("")}, //element to click
                new String[]{"", getElements("")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"", getElements("")}, //element to click
                new String[]{"", getElements("")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options_ie, "ie", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"", getElements("")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}

        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "external_agency", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "external_agency_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "CRS", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "CRS_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "rate", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "rate_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options_aplication, "aplication", where)){return false;}


        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"main_acount",false,true, where)){
                return false;

            }
        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"", getElements("")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_si_add (TestDriver driver){
        String where;
        where= " on ADD";
        driver.getReport().addHeader(" ADD IN SI EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"", getElements("")}, //element to click
                new String[]{"", getElements("")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"", getElements("")}, //element to click
                new String[]{"", getElements("")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options_ie, "ie", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"", getElements("")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}

        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "external_agency", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "external_agency_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "CRS", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "CRS_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "rate", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "rate_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"",getElements("")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"", getElements("")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"", getElements("")},
                list_options_aplication, "aplication", where)){return false;}


        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"main_acount",false,true, where)){
                return false;

            }
        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements(""),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"", getElements("")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }

        return true;
    }



     /*EXCLUSIONS MAINTENANCE TAB ATLAS*/
    private boolean Exclusions_maintenance_atlas (TestDriver driver){

        if(!Exclusions_maintenance_atlas_add(driver)){return false;}
        if(!Exclusions_maintenance_atlas_edit(driver)){return false;}
        if(!Exclusions_maintenance_atlas_search(driver)){return false;}
        if(!Exclusions_maintenance_atlas_qbe(driver)){return false;}
        if(!Exclusions_maintenance_atlas_other_actions(driver)){return false;}
        if(!Exclusions_maintenance_atlas_copy_exclusions(driver)){return false;}
        return true;
    }

    private boolean Exclusions_maintenance_atlas_copy_exclusions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"atlas_b_actions", getElements("atlas_b_actions")}, //element to click
                new String[]{"actions_b_copy_exclusions", getElements("actions_b_copy_exclusions")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"actions_b_copy_exclusions", getElements("actions_b_copy_exclusions")}, //element to click
                new String[]{"actions_copy_exclusions_tour_operators_b_qbe", getElements("actions_copy_exclusions_tour_operators_b_qbe")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"actions_copy_exclusions_tour_operators_qbe_e_tto", getElements("actions_copy_exclusions_tour_operators_qbe_e_tto")}, // element path
                "tto", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"actions_copy_exclusions_tour_operators_qbe_e_tto_name", getElements("actions_copy_exclusions_tour_operators_qbe_e_tto_name")}, // element path
                "tto_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"actions_copy_exclusions_tour_operators_b_qbe", getElements("actions_copy_exclusions_tour_operators_b_qbe")},// query button
                new String[]{"actions_copy_exclusions_tour_operators_qbe_i_tto", getElements("actions_copy_exclusions_tour_operators_qbe_i_tto")},//any query input
                where)){return false;} // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"actions_copy_exclusions_tour_operators_qbe_i_tto",getElements("actions_copy_exclusions_tour_operators_qbe_i_tto")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"actions_copy_exclusions_tour_operators_qbe_i_tto_name",getElements("actions_copy_exclusions_tour_operators_qbe_i_tto_name")},
                "tto_name", getData("tto_name"),  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"actions_copy_exclusions_tour_operators_qbe_i_tto", getElements("actions_copy_exclusions_tour_operators_qbe_i_tto")}, //any query input
                new String[]{"actions_copy_exclusions_e_result_tour_operators", getElements("actions_copy_exclusions_e_result_tour_operators")}, //table result
                where)){return false;} // where this operation occurs
        if(!Functions.getText(driver,new String[]{"actions_copy_exclusions_hotels_e_hotel", getElements("actions_copy_exclusions_hotels_e_hotel")}, // element path
                "hotel", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"actions_copy_exclusions_hotels_e_hotel_name", getElements("actions_copy_exclusions_hotels_e_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"actions_copy_exclusions_hotels_b_qbe", getElements("actions_copy_exclusions_hotels_b_qbe")},// query button
                new String[]{"actions_copy_exclusions_hotels_qbe_hotel", getElements("actions_copy_exclusions_hotels_qbe_hotel")},//any query input
                where)){return false;} // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"actions_copy_exclusions_hotels_qbe_hotel",getElements("actions_copy_exclusions_hotels_qbe_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"actions_copy_exclusions_hotels_qbe_hotel_name",getElements("actions_copy_exclusions_hotels_qbe_hotel_name")},
                "hotel_name", getData("hotel_name"), where)){return false;}


        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"actions_copy_exclusions_hotels_qbe_hotel", getElements("actions_copy_exclusions_hotels_qbe_hotel")}, //any query input
                new String[]{"actions_copy_exclusions_e_result_hotels", getElements("actions_copy_exclusions_e_result_hotels")}, //table result
                where)){return false;} // where this operation occurs
        if(!Functions.detachTable(driver,
                new String[]{"actions_copy_exclusions_tour_operators_b_detach",getElements("actions_copy_exclusions_tour_operators_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        if(!Functions.detachTable(driver,
                new String[]{"actions_copy_exclusions_hotels_b_detach",getElements("actions_copy_exclusions_hotels_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"actions_copy_exclusions_b_copy", getElements("actions_copy_exclusions_b_copy")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_atlas_other_actions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN ATLAS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.auditData(driver,
                new String[]{"atlas_b_actions",getElements("atlas_b_actions")}, //actions button
                new String[]{"atlas_b_audit",getElements("atlas_b_audit")}, //audit button
                new String[]{"atlas_b_ok",getElements("atlas_b_ok")}, //audit_b_ok
                where)){
            return false;
        }
        if(!Functions.detachTable(driver,
                new String[]{"atlas_b_detach",getElements("atlas_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_atlas_qbe (TestDriver driver){
        String where;
        where= " on QBE";
        driver.getReport().addHeader(" QBE IN ATLAS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.clickQbE(driver,
                new String[]{"atlas_b_qbe", getElements("atlas_b_qbe")},// query button
                new String[]{"atlas_i_qbe_reason", getElements("atlas_i_qbe_reason")},//any query input
                where)){return false;} // where the operation occurs
        Functions.zoomOut(driver,3);
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_sequence",getElements("atlas_i_qbe_sequence")},
                "sequence", getData("sequence"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_reason",getElements("atlas_i_qbe_reason")},
                "reason", getData("reason"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_ie",getElements("atlas_i_qbe_ie")},
                "ie", getData("ie"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_start_date",getElements("atlas_i_qbe_start_date")},
                "start_date", getData("start_date"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_active",getElements("atlas_i_qbe_active")},
                "active", getData("active"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_main_acount",getElements("atlas_i_qbe_main_acount")},
                "main_acount", getData("main_acount"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_ttoo",getElements("atlas_i_qbe_ttoo")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_exclude_b2b",getElements("atlas_i_qbe_exclude_b2b")},
                "b2b", getData("b2b"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_classification",getElements("atlas_i_qbe_classification")},
                "clasification", getData("clasification"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_receptive",getElements("atlas_i_qbe_receptive")},
                "receptive", getData("receptive"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_contract",getElements("atlas_i_qbe_contract")},
                "contract", getData("contract"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_hotel",getElements("atlas_i_qbe_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_chain",getElements("atlas_i_qbe_chain")},
                "chain", getData("chain"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_destination",getElements("atlas_i_qbe_destination")},
                "destination", getData("destination"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_market",getElements("atlas_i_qbe_market")},
                "market", getData("market"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_qbe_country",getElements("atlas_i_qbe_country")},
                "country", getData("country"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_qbe_application",getElements("atlas_i_qbe_application")},
                "aplication", getData("aplication"),  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"atlas_i_qbe_sequence", getElements("atlas_i_qbe_sequence")}, //any query input
                new String[]{"atlas_n_records", getElements("atlas_n_records")}, //table result
                where)){return false;} // where this operation occurs

        return true;
    }
    private boolean Exclusions_maintenance_atlas_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" SEARCH IN ATLAS EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if (!Functions.selectText(driver,
                new String[]{"atlas_i_search_reasons",getElements("atlas_i_search_reasons")},
                getData("reason"), "reason",  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_search_ie",getElements("atlas_i_search_ie")},
                getData("ie"), "ie",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"atlas_i_search_start_date",getElements("atlas_i_search_start_date")},
                "start_date", getData("start_date"), where)){return false;}
        boolean check_box_main_acount;

        if (getData("main_acount").equalsIgnoreCase("yes")) {
            check_box_main_acount = true;
        }else{
            check_box_main_acount = false;
        }
        boolean check_box_b2b;

        if (getData("b2b").equalsIgnoreCase("yes")) {
            check_box_b2b = true;
        }else{
            check_box_b2b = false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("atlas_cb_search_main_acount"),"main_acount",check_box_main_acount,true, where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("atlas_cb_search_b2b"),"b2b",check_box_b2b,true, where)){return false;}//where
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_ttoo", getElements("atlas_lov_search_ttoo")}, //LoV button
                new String[]{"atlas_i_search_ttoo", getElements("atlas_i_search_ttoo")}, //external LoV input
                new String[]{"atlas_i_search_ttoo_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("tto"), // value to search
                "tto", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_classification", getElements("atlas_lov_search_classification")}, //LoV button
                new String[]{"atlas_i_search_classification", getElements("atlas_i_search_classification")}, //external LoV input
                new String[]{"atlas_i_search_classification_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("clasification"), // value to search
                "clasification", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_receptive", getElements("atlas_lov_search_receptive")}, //LoV button
                new String[]{"atlas_i_search_receptive", getElements("atlas_i_search_receptive")}, //external LoV input
                new String[]{"atlas_i_search_receptive_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("receptive"), // value to search
                "receptive", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_contract", getElements("atlas_lov_search_contract")}, //LoV button
                new String[]{"atlas_i_search_contract", getElements("atlas_i_search_contract")}, //external LoV input
                new String[]{"atlas_i_search_contract_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("contract"), // value to search
                "contract", //name of the data
                where)){return false;}//where this operation occurs

        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_hotel", getElements("atlas_lov_search_hotel")}, //LoV button
                new String[]{"atlas_i_search_hotel", getElements("atlas_i_search_hotel")}, //external LoV input
                new String[]{"atlas_i_search_hotel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel_code"), // value to search
                "hotel_code", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_chain", getElements("atlas_lov_search_chain")}, //LoV button
                new String[]{"atlas_i_search_chain", getElements("atlas_i_search_chain")}, //external LoV input
                new String[]{"atlas_i_search_chain_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("chain"), // value to search
                "chain", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_i_search_destination", getElements("atlas_i_search_destination")}, //LoV button
                new String[]{"atlas_lov_search_destination", getElements("atlas_lov_search_destination")}, //external LoV input
                new String[]{"atlas_i_search_destination_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("destination"), // value to search
                "destination", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_market", getElements("atlas_lov_search_market")}, //LoV button
                new String[]{"atlas_i_search_market", getElements("atlas_i_search_market")}, //external LoV input
                new String[]{"atlas_i_search_market_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("market"), // value to search
                "market", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"atlas_lov_search_country", getElements("atlas_lov_search_country")}, //LoV button
                new String[]{"atlas_i_search_country", getElements("atlas_i_search_country")}, //external LoV input
                new String[]{"atlas_i_search_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("country"), // value to search
                "country", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.selectText(driver,
                new String[]{"atlas_i_search_application",getElements("atlas_i_search_application")},
                getData("aplication"), "dataname",  where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"atlas_b_search",getElements("atlas_b_search")}, //search button
                new String[]{"atlas_e_result",getElements("atlas_e_result")}, //result element
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"atlas_e_search_sequence", getElements("atlas_e_search_sequence")}, // element path
                "seguence", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"atlas_i_search_sequence",getElements("atlas_i_search_sequence")},
                "sequenece", getData("sequenece"), where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"atlas_b_search",getElements("atlas_b_search")}, //search button
                new String[]{"atlas_e_result",getElements("atlas_e_result")}, //result element
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_atlas_edit (TestDriver driver){
        String where;
        where= " on EDIT";
        driver.getReport().addHeader(" EDIT IN ATLAS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"atlas_b_add", getElements("atlas_b_add")}, //element to click
                new String[]{"atlas_i_add_reasons", getElements("atlas_i_add_reasons")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_i_add_sequence", getElements("atlas_i_add_sequence")}, // element path
                "secuence", // key for data value (the name)
                where)){return false;}

        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_i_add_reasons", getElements("atlas_i_add_reasons")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_sl_add_ie", getElements("atlas_sl_add_ie")},
                list_options_ie, "ie", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"atlas_i_add_start_date", getElements("atlas_i_add_start_date")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_ttoo",getElements("atlas_lov_add_ttoo")}, // b_lov
                new String[]{"atlas_i_add_ttoo", getElements("atlas_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_ttoo_description", getElements("atlas_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_classification",getElements("atlas_lov_add_classification")}, // b_lov
                new String[]{"atlas_i_add_classification", getElements("atlas_i_add_classification")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_classification_description", getElements("atlas_e_add_classification_description")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}

        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_receptive",getElements("atlas_lov_add_receptive")}, // b_lov
                new String[]{"atlas_i_add_receptive", getElements("atlas_i_add_receptive")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "receptive", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_contract",getElements("atlas_lov_add_contract")}, // b_lov
                new String[]{"atlas_i_add_contract", getElements("atlas_i_add_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contract", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_hotel",getElements("atlas_lov_add_hotel")}, // b_lov
                new String[]{"atlas_i_add_hotel", getElements("atlas_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_hotel_description", getElements("atlas_e_add_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_chain",getElements("atlas_lov_add_chain")}, // b_lov
                new String[]{"atlas_i_add_chain", getElements("atlas_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_chain_description", getElements("atlas_e_add_chain_description")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_destination",getElements("atlas_lov_add_destination")}, // b_lov
                new String[]{"atlas_i_add_destination", getElements("atlas_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_destination_description", getElements("atlas_e_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_market",getElements("atlas_lov_add_market")}, // b_lov
                new String[]{"atlas_i_add_market", getElements("atlas_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_market_description", getElements("atlas_e_add_market_description")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_country",getElements("atlas_lov_add_country")}, // b_lov
                new String[]{"atlas_i_add_country", getElements("atlas_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_lov_add_country_description", getElements("atlas_lov_add_country_description")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_i_add_application", getElements("atlas_i_add_application")},
                list_options_aplication, "aplication", where)){return false;}


        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_main_acount"),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_main_acount"),"main_acount",false,true, where)){
                return false;

            }
        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_b2b"),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_b2b"),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"atlas_b_add_save", getElements("atlas_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_atlas_add (TestDriver driver){
        String where;
        where= " on ADD";
        driver.getReport().addHeader(" ADD IN ATLAS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"atlas_tab", getElements("atlas_tab")}, //element to click
                new String[]{"atlas_b_add", getElements("atlas_b_add")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"atlas_b_add", getElements("atlas_b_add")}, //element to click
                new String[]{"atlas_i_add_reasons", getElements("atlas_i_add_reasons")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_i_add_sequence", getElements("atlas_i_add_sequence")}, // element path
                "secuence", // key for data value (the name)
                where)){return false;}

        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_i_add_reasons", getElements("atlas_i_add_reasons")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_sl_add_ie", getElements("atlas_sl_add_ie")},
                list_options_ie, "ie", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"atlas_i_add_start_date", getElements("atlas_i_add_start_date")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_ttoo",getElements("atlas_lov_add_ttoo")}, // b_lov
                new String[]{"atlas_i_add_ttoo", getElements("atlas_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_ttoo_description", getElements("atlas_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_classification",getElements("atlas_lov_add_classification")}, // b_lov
                new String[]{"atlas_i_add_classification", getElements("atlas_i_add_classification")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_classification_description", getElements("atlas_e_add_classification_description")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}

        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_receptive",getElements("atlas_lov_add_receptive")}, // b_lov
                new String[]{"atlas_i_add_receptive", getElements("atlas_i_add_receptive")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "receptive", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_contract",getElements("atlas_lov_add_contract")}, // b_lov
                new String[]{"atlas_i_add_contract", getElements("atlas_i_add_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "contract", //Data name
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_hotel",getElements("atlas_lov_add_hotel")}, // b_lov
                new String[]{"atlas_i_add_hotel", getElements("atlas_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_hotel_description", getElements("atlas_e_add_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_chain",getElements("atlas_lov_add_chain")}, // b_lov
                new String[]{"atlas_i_add_chain", getElements("atlas_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_chain_description", getElements("atlas_e_add_chain_description")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_destination",getElements("atlas_lov_add_destination")}, // b_lov
                new String[]{"atlas_i_add_destination", getElements("atlas_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_destination_description", getElements("atlas_e_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_market",getElements("atlas_lov_add_market")}, // b_lov
                new String[]{"atlas_i_add_market", getElements("atlas_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_e_add_market_description", getElements("atlas_e_add_market_description")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"atlas_lov_add_country",getElements("atlas_lov_add_country")}, // b_lov
                new String[]{"atlas_i_add_country", getElements("atlas_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"atlas_lov_add_country_description", getElements("atlas_lov_add_country_description")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"atlas_i_add_application", getElements("atlas_i_add_application")},
                list_options_aplication, "aplication", where)){return false;}


        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_main_acount"),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_main_acount"),"main_acount",false,true, where)){
                return false;

            }
        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_b2b"),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements("atlas_cb_add_b2b"),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"atlas_b_add_save", getElements("atlas_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }

    /*EXCLUSIONS MAINTENANCE TAB GENERALS*/
    private boolean Exclusions_maintenance_generals (TestDriver driver){

        if(!Exclusions_maintenance_generals_add(driver)){return false;}
        if(!Exclusions_maintenance_generals_search(driver)){return false;}
        if(!Exclusions_maintenance_generals_edit(driver)){return false;}
        if(!Exclusions_maintenance_generals_qbe(driver)){return false;}
        if(!Exclusions_maintenance_generals_other_actions(driver)){return false;}
        if(!Exclusions_maintenance_generals_actions_copy_exclusions(driver)){return false;}
        return true;
    }

    private boolean Exclusions_maintenance_generals_actions_copy_exclusions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"generals_b_copy_exclusions", getElements("generals_b_copy_exclusions")}, //element to click
                new String[]{"generals_copy_exclusions_tour_operators_b_qbe", getElements("generals_copy_exclusions_tour_operators_b_qbe")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"generals_copy_exclusions_tour_operators_qbe_e_to", getElements("generals_copy_exclusions_tour_operators_qbe_e_to")}, // element path
                "tto", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"generals_copy_exclusions_tour_operators_qbe_e_to_name", getElements("generals_copy_exclusions_tour_operators_qbe_e_to_name")}, // element path
                "tto_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"generals_copy_exclusions_tour_operators_b_qbe", getElements("generals_copy_exclusions_tour_operators_b_qbe")},// query button
                new String[]{"generals_copy_exclusions_tour_operators_qbe_i_to", getElements("generals_copy_exclusions_tour_operators_qbe_i_to")},//any query input
                where)){return false;} // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"generals_copy_exclusions_tour_operators_qbe_i_to",getElements("generals_copy_exclusions_tour_operators_qbe_i_to")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_copy_exclusions_tour_operators_qbe_i_to_name",getElements("generals_copy_exclusions_tour_operators_qbe_i_to_name")},
                "tto_name", getData("tto_name"),  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"generals_copy_exclusions_tour_operators_qbe_i_to", getElements("generals_copy_exclusions_tour_operators_qbe_i_to")}, //any query input
                new String[]{"generals_copy_exclusions_e_result", getElements("generals_copy_exclusions_e_result")}, //table result
                where)){return false;} // where this operation occurs
        if(!Functions.getText(driver,new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel", getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel")}, // element path
                "hotel", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel_name", getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"generals_copy_exclusions_hotel_name_b_qbe", getElements("generals_copy_exclusions_hotel_name_b_qbe")},// query button
                new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel", getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel")},//any query input
                where)){return false;} // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel",getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel_name",getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel_name")},
                "hotel_name", getData("hotel_name"), where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"generals_copy_exclusions_hotel_name_qbe_i_hotel", getElements("generals_copy_exclusions_hotel_name_qbe_i_hotel")}, //any query input
                new String[]{"generals_copy_exclusions_e_result", getElements("generals_copy_exclusions_e_result")}, //table result
                where)){return false;} // where this operation occurs
        if(!Functions.detachTable(driver,
                new String[]{"generals_copy_exclusions_e_detach_tour_operators",getElements("generals_copy_exclusions_e_detach_tour_operators")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        if(!Functions.detachTable(driver,
                new String[]{"generals_copy_exclusions_e_detach_hotels",getElements("generals_copy_exclusions_e_detach_hotels")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"generals_copy_exclusions_b_copy", getElements("generals_copy_exclusions_b_copy")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_generals_other_actions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.auditData(driver,
                new String[]{"generals_b_actions",getElements("generals_b_actions")}, //actions button
                new String[]{"generals_b_audit",getElements("generals_b_audit")}, //audit button
                new String[]{"generals_b_ok",getElements("generals_b_ok")}, //audit_b_ok
                where)){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"generals_b_detach",getElements("generals_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_generals_qbe (TestDriver driver){
        String where;
        where= " on QBE";
        driver.getReport().addHeader(" QBE IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"generals_b_qbe", getElements("generals_b_qbe")},// query button
                new String[]{"generals_i_qbe_sequence", getElements("generals_i_qbe_sequence")},//any query input
                where)){return false;} // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_sequence",getElements("generals_i_qbe_sequence")},
                "sequence", getData("sequence"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_qbe_reason",getElements("generals_i_qbe_reason")},
                "reason", getData("reason"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_qbe_ie",getElements("generals_i_qbe_ie")},
                "ie", getData("ie"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_start_date",getElements("generals_i_qbe_start_date")},
                "start_date", getData("start_date"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_qbe_active",getElements("generals_i_qbe_active")},
                "active", getData("active"),  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_qbe_main_acount",getElements("generals_i_qbe_main_acount")},
                "main_acount", getData("main_acount"),  where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_ttoo",getElements("generals_i_qbe_ttoo")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_exclude_b2b",getElements("generals_i_qbe_exclude_b2b")},
                "b2b", getData("b2b"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_classification",getElements("generals_i_qbe_classification")},
                "clasification", getData("clasification"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_hotel",getElements("generals_i_qbe_hotel")},
                "hotel", getData("hotel"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_chain",getElements("generals_i_qbe_chain")},
                "chain", getData("chain"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_destination",getElements("generals_i_qbe_destination")},
                "destination", getData("destination"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_market",getElements("generals_i_qbe_market")},
                "market", getData("market"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_qbe_country",getElements("generals_i_qbe_country")},
                "country", getData("country"), where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_qbe_application",getElements("generals_i_qbe_application")},
                "aplication", getData("aplication"),  where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"generals_i_qbe_sequence", getElements("generals_i_qbe_sequence")}, //any query input
                new String[]{"generals_e_result", getElements("generals_e_result")}, //table result
                where)){return false;} // where this operation occurs
        return true;
    }
    private boolean Exclusions_maintenance_generals_edit (TestDriver driver){
        String where;
        where= " on EDIT";
        driver.getReport().addHeader(" EDIT IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"generals_b_edit", getElements("generals_b_edit")}, //element to click
                new String[]{"generals_i_add_reason", getElements("generals_i_add_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_secuence", getElements("generals_e_secuence")}, // element path
                "secuence", // key for data value (the name)
                where)){return false;}

        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_i_add_reason", getElements("generals_i_add_reason")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_sl_add_ie", getElements("generals_sl_add_ie")},
                list_options_ie, "ie", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"generals_i_add_start_date", getElements("generals_i_add_start_date")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("atlas_i_add_active"),"active",false,true," where")){return false;}//where
        if(!Functions.checkClick(driver,
                new String[]{"atlas_lov_add_active_yes", getElements("atlas_lov_add_active_yes")}, //element to click
                new String[]{"generals_lov_add_ttoo", getElements("generals_lov_add_ttoo")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_ttoo",getElements("generals_lov_add_ttoo")}, // b_lov
                new String[]{"generals_i_add_ttoo", getElements("generals_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_ttoo_descriptión", getElements("generals_e_add_ttoo_descriptión")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_classification",getElements("generals_lov_add_classification")}, // b_lov
                new String[]{"generals_i_add_classification", getElements("generals_i_add_classification")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_classification_description", getElements("generals_e_add_classification_description")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_hotel",getElements("generals_lov_add_hotel")}, // b_lov
                new String[]{"generals_i_add_hotel", getElements("generals_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_hotel_description", getElements("generals_e_add_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_chain",getElements("generals_lov_add_chain")}, // b_lov
                new String[]{"generals_i_add_chain", getElements("generals_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_lov_add_chain_description", getElements("generals_lov_add_chain_description")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_destination",getElements("generals_lov_add_destination")}, // b_lov
                new String[]{"generals_i_add_destination", getElements("generals_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_destination_description", getElements("generals_e_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_market",getElements("generals_lov_add_market")}, // b_lov
                new String[]{"generals_i_add_market", getElements("generals_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_market_description", getElements("generals_e_add_market_description")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_country",getElements("generals_lov_add_country")}, // b_lov
                new String[]{"generals_i_add_country", getElements("generals_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_country_description", getElements("generals_e_add_country_description")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_sl_aplication", getElements("generals_sl_aplication")},
                list_options_aplication, "aplication", where)){return false;}
        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_main_acount"),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_main_acount"),"main_acount",false,true, where)){
                return false;

            }

        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_b2b"),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_b2b"),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"generals_b_add_save", getElements("generals_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_generals_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" SEARCH IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if (!Functions.selectText(driver,
                new String[]{"generals_i_search_reason",getElements("generals_i_search_reason")},
                getData("reason"), "reason",  where)){return false;}
        if (!Functions.selectText(driver,
                new String[]{"generals_i_search_ie",getElements("generals_i_search_ie")},
                getData("ie"), "ie",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"generals_i_search_start_date",getElements("generals_i_search_start_date")},
                "start_date", getData("start_date")," on where")){return false;}
        boolean check_box_main_acount;

        if (getData("main_acount").equalsIgnoreCase("yes")) {
            check_box_main_acount = true;
        }else{
            check_box_main_acount = false;
        }
        boolean check_box_b2b;

        if (getData("b2b").equalsIgnoreCase("yes")) {
            check_box_b2b = true;
        }else{
            check_box_b2b = false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("generals_cb_search_main_acount"),"main_acount",check_box_main_acount,true, where)){return false;}//where
        if (!Functions.checkboxValue(driver,
                getElements("generals_cb_search_b2b"),"b2b",check_box_b2b,true, where)){return false;}//where
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_ttoo", getElements("generals_lov_search_ttoo")}, //LoV button
                new String[]{"generals_i_search_ttoo", getElements("generals_i_search_ttoo")}, //external LoV input
                new String[]{"generals_i_search_ttoo_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("tto"), // value to search
                "tto", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_classification", getElements("generals_lov_search_classification")}, //LoV button
                new String[]{"generals_i_search_classification", getElements("generals_i_search_classification")}, //external LoV input
                new String[]{"generals_i_search_classification_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("clasification"), // value to search
                "clasification", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_hotel", getElements("generals_lov_search_hotel")}, //LoV button
                new String[]{"generals_i_search_hotel", getElements("generals_i_search_hotel")}, //external LoV input
                new String[]{"generals_i_search_hotel_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel_code"), // value to search
                "hotel_code", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_chain", getElements("generals_lov_search_chain")}, //LoV button
                new String[]{"generals_i_search_chain", getElements("generals_i_search_chain")}, //external LoV input
                new String[]{"generals_i_search_chain_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("chain"), // value to search
                "chain", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_destination", getElements("generals_lov_search_destination")}, //LoV button
                new String[]{"generals_i_search_destination", getElements("generals_i_search_destination")}, //external LoV input
                new String[]{"z", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("destination"), // value to search
                "destination", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_market", getElements("generals_lov_search_market")}, //LoV button
                new String[]{"generals_i_search_market", getElements("generals_i_search_market")}, //external LoV input
                new String[]{"generals_i_search_market_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("market"), // value to search
                "market", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.createLovByValue(driver,
                new String[]{"generals_lov_search_country", getElements("generals_lov_search_country")}, //LoV button
                new String[]{"generals_i_search_country", getElements("generals_i_search_country")}, //external LoV input
                new String[]{"generals_i_search_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("country"), // value to search
                "country", //name of the data
                where)){return false;}//where this operation occurs
        if (!Functions.selectText(driver,
                new String[]{"generals_i_search_application",getElements("generals_i_search_application")},
                getData("aplication"), "dataname",  where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"generals_b_search",getElements("generals_b_search")}, //search button
                new String[]{"generals_e_result",getElements("generals_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"generals_e_sequence", getElements("generals_e_sequence")}, // element path
                "seguence", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"generals_i_search_sequence",getElements("generals_i_search_sequence")},
                "sequenece", getData("sequenece"), where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                new String[]{"generals_b_search",getElements("generals_b_search")}, //search button
                new String[]{"generals_e_result",getElements("generals_e_result")}, //result element
                " on SEARCH")){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_generals_add (TestDriver driver){
        String where;
        where= " on ADD";
        driver.getReport().addHeader(" ADD IN GENERALS EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"generals_tab", getElements("generals_tab")}, //element to click
                new String[]{"generals_b_add", getElements("generals_b_add")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.checkClick(driver,
                new String[]{"generals_b_add", getElements("generals_b_add")}, //element to click
                new String[]{"generals_i_add_reason", getElements("generals_i_add_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_secuence", getElements("generals_e_secuence")}, // element path
                "secuence", // key for data value (the name)
                where)){return false;}

        String list_options[] = {"Selling to B2C client", "Other reason", "Category", "Direct contract with the hotel"
                , "Does not comply with Binding", "Client request", "Specific hotel request", "Signed by contract", "Client pricing to be revised", "Administration request", "B2B rate not valid for B2C clients"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_i_add_reason", getElements("generals_i_add_reason")},
                list_options, "reason", where)){return false;}

        String list_options_ie[] = {"I", "E"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_sl_add_ie", getElements("generals_sl_add_ie")},
                list_options_ie, "ie", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"generals_i_add_start_date", getElements("generals_i_add_start_date")},
                "start_date",DataGenerator.getToday(driver,"dd/MM/yyyy"),where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_ttoo",getElements("generals_lov_add_ttoo")}, // b_lov
                new String[]{"generals_i_add_ttoo", getElements("generals_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_ttoo_descriptión", getElements("generals_e_add_ttoo_descriptión")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_classification",getElements("generals_lov_add_classification")}, // b_lov
                new String[]{"generals_i_add_classification", getElements("generals_i_add_classification")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "clasification", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_classification_description", getElements("generals_e_add_classification_description")}, // element path
                "clasification_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_hotel",getElements("generals_lov_add_hotel")}, // b_lov
                new String[]{"generals_i_add_hotel", getElements("generals_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_hotel_description", getElements("generals_e_add_hotel_description")}, // element path
                "hotel_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_chain",getElements("generals_lov_add_chain")}, // b_lov
                new String[]{"generals_i_add_chain", getElements("generals_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_lov_add_chain_description", getElements("generals_lov_add_chain_description")}, // element path
                "cahin_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_destination",getElements("generals_lov_add_destination")}, // b_lov
                new String[]{"generals_i_add_destination", getElements("generals_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_destination_description", getElements("generals_e_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_market",getElements("generals_lov_add_market")}, // b_lov
                new String[]{"generals_i_add_market", getElements("generals_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_market_description", getElements("generals_e_add_market_description")}, // element path
                "market_description", // key for data value (the name)
                where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"generals_lov_add_country",getElements("generals_lov_add_country")}, // b_lov
                new String[]{"generals_i_add_country", getElements("generals_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"generals_e_add_country_description", getElements("generals_e_add_country_description")}, // element path
                "country_description", // key for data value (the name)
                where)){return false;}
        String list_options_aplication[] = {"All", "Xml","Web"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"generals_sl_aplication", getElements("generals_sl_aplication")},
                list_options_aplication, "aplication", where)){return false;}


        Random main_acount = new Random();
        boolean getRandomBoolean = main_acount.nextBoolean();

        String RandomBoolean;

        if(getRandomBoolean){

            RandomBoolean= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_main_acount"),"main_acount",true,true, where)){
                return false;
            }
        }else {RandomBoolean="No";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_main_acount"),"main_acount",false,true, where)){
                return false;

            }

        }
        Random b2b = new Random();
        boolean getRandomBoolean2 = b2b.nextBoolean();

        String RandomBoolean2;

        if(getRandomBoolean){

            RandomBoolean2= "Yes";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_b2b"),"b2b",true,true, where)){
                return false;
            }
        }else {RandomBoolean2="No";
            if(!Functions.checkboxValue(driver,
                    getElements("generals_cb_add_b2b"),"b2b",false,true, where)){
                return false;

            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"generals_b_add_save", getElements("generals_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }

    /*EXCLUSIONS MAINTENANCE TAB BINDING*/
    private boolean Exclusions_maintenance_binding (TestDriver driver){
        if(!Go_exclusions_maintenance_category_binding(driver)){return true;}
        if(!Exclusions_maintenance_category_binding_add(driver)){return true;}
        if(!Exclusions_maintenance_category_binding_search(driver)){return true;}
        return true;
    }

    private boolean Exclusions_maintenance_category_binding_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" SEARCH IN BINDING EXCLUSIONS MAINTENACE 2.0 ",3,false);


        return true;
    }
    private boolean Go_exclusions_maintenance_category_binding (TestDriver driver){
        String where;
        where= " on GO TO BINDING";
        driver.getReport().addHeader(" GO TO BINDING IN  EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.checkClick(driver,
                new String[]{"binding_tab", getElements("binding_tab")}, //element to click
                new String[]{"binding_b_add", getElements("binding_b_add")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}

        return true;
    }
    private boolean Exclusions_maintenance_category_binding_add (TestDriver driver){
        String where;
        where= " on ADD";
        driver.getReport().addHeader(" ADD IN BINDING EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"binding_b_add", getElements("binding_b_add")}, //element to click
                new String[]{"binding_i_add_reason", getElements("binding_i_add_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}
        String sl_reason[] = {"Selling to B2C client", "TEST Other reasons",
                "Category","Reduced commission",
                "Direct contract with the hotel", "Price Differences", "Does not comply with Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request",
                "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"binding_i_add_reason", getElements("binding_i_add_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"binding_i_add_start_date",getElements("binding_i_add_start_date")},
                "start_date", DataGenerator.getToday(driver,"dd/MM/yyyy"),  where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("binding_cb_add_main"),"main",true,true, where)){return false;}//where
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_ttoo",getElements("binding_lov_add_ttoo")}, // b_lov
                new String[]{"binding_i_add_ttoo", getElements("binding_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_ttoo_description", getElements("binding_i_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_market",getElements("binding_lov_add_market")}, // b_lov
                new String[]{"binding_i_add_market", getElements("binding_i_add_market")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "market_country", //Data name
                where)){return false;}
        Functions.break_time(driver,10,500);
        if(!Functions.getValue(driver,new String[]{"binding_i_add_market_description", getElements("binding_i_add_market_description")}, // element path
                "market_country_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_hotel",getElements("binding_lov_add_hotel")}, // b_lov
                new String[]{"binding_i_add_hotel", getElements("binding_i_add_hotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel", //Data name
                where)){return false;}
        Functions.break_time(driver,10,500);
        if(!Functions.getValue(driver,new String[]{"binding_i_add_hotel_description", getElements("binding_i_add_hotel_description")}, // element path
                "hotel_country", // key for data value (the name)
                where)){return false;} // where this operation occurs
   /*     if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_chain",getElements("binding_lov_add_chain")}, // b_lov
                new String[]{"binding_i_add_chain", getElements("binding_i_add_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_des_cadena", getElements("binding_i_add_des_cadena")}, // element path
                "descadena", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_destination",getElements("binding_lov_add_destination")}, // b_lov
                new String[]{"binding_i_add_destination", getElements("binding_i_add_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_destination_description", getElements("binding_i_add_destination_description")}, // element path
                "destination_description", // key for data value (the name)
                where)){return false;} // where this operation occurs
        if(!Functions.createLov(driver,
                new String[]{"binding_lov_add_country",getElements("binding_lov_add_country")}, // b_lov
                new String[]{"binding_i_add_country", getElements("binding_i_add_country")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination_country", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"binding_i_add_country_description", getElements("binding_i_add_country_description")}, // element path
                "destination_country_description", // key for data value (the name)
                where)){return false;} // where this operation occurs*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"binding_b_add_save", getElements("binding_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }



    /*EXCLUSIONS MAINTENANCE TAB CATEGORY*/
    private boolean Exclusions_maintenance_category (TestDriver driver){
        if(!Exclusions_maintenance_category_add(driver)){return false;}
        if(!Exclusions_maintenance_category_search(driver)){return false;}
        if(!Exclusions_maintenance_category_edit(driver)){return false;}
        if(!Exclusions_maintenance_category_qbe(driver)){return false;}
        if(!Exclusions_maintenance_category_other_actions(driver)){return false;}
      /*  if(!Exclusions_maintenance_category_desactivated(driver)){return false;}*/
        if(!Exclusions_maintenance_category_delete(driver)){return false;}


        return true;
    }

    /* private boolean Exclusions_maintenance_category_desactivated (TestDriver driver){
         String where;
         where= " on DESACTIVATED";
         driver.getReport().addHeader(" DESACTIVATED IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
         if(!Functions.checkClick(driver,
                 new String[]{"category_b_edit", getElements("category_b_edit")}, //element to click
                 new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                 30, 500, //seconds/miliseconds (driver wait)
                 where)){return false;}
         if (!Functions.checkboxValue(driver,
                 getElements("category_cb_add_active"),"active",false,true, where)){return false;}//where
         if(!Functions.checkClick(driver,
                 new String[]{"category_inactive_b_ok", getElements("category_inactive_b_ok")}, //element to click
                 new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                 30, 500, //seconds/miliseconds (driver wait)
                 where)){return false;}
         if(!Functions.getValue(driver,new String[]{"category_i_desactivation_date", getElements("category_i_desactivation_date")}, // element path
                 "desactivation_date", // key for data value (the name)
                 where)){return false;} // where this operation occurs
         if (!Functions.checkClickByAbsence(driver,
                 new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                 recursiveXPaths.glass, //element expected to disappear
                 30, 500,
                 where)) {
             return false;
         }
         if (!Functions.simpleClick(driver,
                 new String[]{"category_b_qbe_reset", getElements("category_b_qbe_reset")}, //element to click
                 where)){return false;}
         if (!Functions.insertInput(driver, new String[]{"category_i_search_desactivation_date",getElements("category_i_search_desactivation_date")},
                 "desactivation_date", getData("desactivation_date"), where)){return false;}
        if(!Functions.clickSearchAndResult(driver,
                 new String[]{"category_b_search", getElements("category_b_search")}, //search button
                 new String[]{"category_e_result", getElements("category_e_result")}, //result element
                 where)){return false;}

         if (!Functions.simpleClick(driver,
                 new String[]{"category_b_reset", getElements("category_b_reset")}, //element to click
                 where)){return false;}
            if (!Functions.insertInput(driver, new String[]{"category_i_qbe_desactivation_date",getElements("category_i_qbe_desactivation_date")},
                 "desactivation_date", getData("desactivation_date"), where)){return false;}
         if (!Functions.enterQueryAndClickResult(driver,
                 new String[]{"category_i_qbe_desactivation_date", getElements("category_i_qbe_desactivation_date")}, //any query input
                 new String[]{"category_e_result", getElements("category_e_result")}, //table result
                 where)){return false;} // where this operation occurs
         return true;
     }*/
    private boolean Exclusions_maintenance_category_delete (TestDriver driver){
        String where;
        where= " on DELTE";
        driver.getReport().addHeader(" DELTE IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if(!Functions.doDeleteNCheck(driver,
                new String[]{"category_b_delete",getElements("category_b_delete")},
                new String[]{"category_n_records",getElements("category_n_records")},
                new String[]{"category_b_delete_b_ok",getElements("category_b_delete_b_ok")},
                where)){
            return false;
        }
        return true;
    }
    private boolean Exclusions_maintenance_category_other_actions (TestDriver driver){
        String where;
        where= " on OTHER ACTIONS";
        driver.getReport().addHeader(" OTHER ACTIONS IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.auditData(driver,
                new String[]{"category_b_action",getElements("category_b_action")}, //actions button
                new String[]{"category_b_audit",getElements("category_b_audit")}, //audit button
                new String[]{"category_b_audit_b_ok",getElements("category_b_audit_b_ok")}, //audit_b_ok
                where)){
            return false;

        }
        if(!Functions.detachTable(driver,
                new String[]{"category_b_detach",getElements("category_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }

        return true;
    }
    private boolean Exclusions_maintenance_category_qbe (TestDriver driver){
        String where;
        where= " on QBE";
        driver.getReport().addHeader(" QBE IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);
        if (!Functions.simpleClick(driver,
                new String[]{"category_b_reset", getElements("category_b_reset")}, //element to click
                where)){return false;}
        if(!Functions.clickQbE(driver,
                new String[]{"category_b_qbe", getElements("category_b_qbe")},// query button
                new String[]{"category_i_qbe_reason", getElements("category_i_qbe_reason")},//any query input
                where)){return false;} // where the operation occurs

        if (!Functions.selectText(driver,
                new String[]{"category_i_qbe_reason",getElements("category_i_qbe_reason")},
                getData("sl_reason"), "sl_reason",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_start_date",getElements("category_i_qbe_start_date")},
                "start_date", getData("start_date"), where)){return false;}

        if (!Functions.selectText(driver,
                new String[]{"category_sel_qbe_active",getElements("category_sel_qbe_active")},
                getData("active"), "active",  where)){return false;}

     /*   if (!Functions.insertInput(driver, new String[]{"category_i_qbe_desactivation_date",getElements("category_i_qbe_desactivation_date")},
                "desactivation_date", getData("desactivation_date"), where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_ttoo",getElements("category_i_qbe_ttoo")},
                "tto", getData("tto"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_category",getElements("category_i_qbe_category")},
                "category", getData("category"), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"category_i_qbe_hotel_type",getElements("category_i_qbe_hotel_type")},
                "hotel_type", getData("hotel_type"), where)){return false;}

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"category_i_qbe_start_date", getElements("category_i_qbe_start_date")}, //any query input
                new String[]{"category_e_result", getElements("category_e_result")}, //table result
                where)){return false;} // where this operation occurs
        return true;
    }
    private boolean Exclusions_maintenance_category_edit (TestDriver driver){
        String where;
        where= " on EDIT";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"category_b_edit", getElements("category_b_edit")}, //element to click
                new String[]{"category_cb_add_active", getElements("category_cb_add_active")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}

        String sl_reason[] = {"Sellin to B2C client", "TEST Other reasons",
                "Category","Reduced comission",
                "Direct contract with the hotel", "Price Differences", "Does not comply whith Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request", "Tes",
                "TEST", "Test reason", "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"category_sl_reason", getElements("category_sl_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.checkboxValue(driver,
                getElements("category_cb_add_active"),"active",true,true, where)){return false;}//where
   /*     if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_inactive_b_ok", getElements("category_inactive_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"category_i_desactivation_date", getElements("category_i_desactivation_date")}, // element path
                "desactivation_date", // key for data value (the name)
                where)){return false;} // where this operation occurs*/

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_ttoo",getElements("category_lov_add_ttoo")}, // b_lov
                new String[]{"category_i_add_ttoo", getElements("category_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}

        if(!Functions.getValue(driver,new String[]{"category_e_add_ttoo_description", getElements("category_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_category",getElements("category_lov_add_category")}, // b_lov
                new String[]{"category_i_add_category", getElements("category_i_add_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_category_description", getElements("category_i_add_category_description")}, // element path
                "category_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_hotel_type",getElements("category_lov_add_hotel_type")}, // b_lov
                new String[]{"category_i_add_hotel_type", getElements("category_i_add_hotel_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_type", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_hotel_type_description", getElements("category_i_add_hotel_type_description")}, // element path
                "hotel_type_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }

        return true;
    }
    private boolean Exclusions_maintenance_category_search (TestDriver driver){
        String where;
        where= " on SEARCH";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if (!Functions.selectText(driver,
                new String[]{"category_i_search_reason",getElements("category_i_search_reason")},
                getData("sl_reason"), "sl_reason",  where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_start_date",getElements("category_i_search_start_date")},
                "start_date", getData("start_date"), where)){return false;}

        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_ttoo", getElements("category_lov_search_ttoo")}, //LoV button
                new String[]{"category_i_search_ttoo", getElements("category_i_search_ttoo")}, //external LoV input
                new String[]{"category_i_search_ttoo_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("tto"), // value to search
                "tto", //name of the data
                where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_ttoo_description",getElements("category_i_search_ttoo_description")},
                "tto_description", getData("tto_description"), where)){return false;}

        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_category", getElements("category_lov_search_category")}, //LoV button
                new String[]{"category_i_search_category", getElements("category_i_search_category")}, //external LoV input
                new String[]{"input", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("category"), // value to search
                "category", //name of the data
                where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_category_description",getElements("category_i_search_category_description")},
                "category_description", getData("category_description"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"category_lov_search_hotel_type", getElements("category_lov_search_hotel_type")}, //LoV button
                new String[]{"category_i_search_hotel_type", getElements("category_i_search_hotel_type")}, //external LoV input
                new String[]{"input", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("hotel_type"), // value to search
                "hotel_type", //name of the data
                where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_search_hotel_type_description",getElements("category_i_search_hotel_type_description")},
                "hotel_type_description", getData("hotel_type_description"), where)){return false;}

        if(!Functions.clickSearchAndResult(driver,
                new String[]{"category_b_search", getElements("category_b_search")}, //search button
                new String[]{"category_e_result", getElements("category_e_result")}, //result element
                where)){return false;}
        return true;
    }
    private boolean Exclusions_maintenance_category_add (TestDriver driver){
        String where;

        where= " on ADD";
        driver.getReport().addHeader(" ADD IN CATEGORY EXCLUSIONS MAINTENACE 2.0 ",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"category_b_add", getElements("category_b_add")}, //element to click
                new String[]{"category_sl_reason", getElements("category_sl_reason")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)){return false;}

        String sl_reason[] = {"Selling to B2C client", "Other reasons",
                "Category","Reduced commission",
                "Direct contract with the hotel", "Price Differences", "Does not comply with Binding",
                "Client request", "Specific hotel request", "Signed by contract",
                "Technical issues", "Client pricing to be revised", "Administration request",
                  "B2B rate not valid for B2C clients"   };
        if (!Functions.selectTextRandom(driver,
                new String[]{"category_sl_reason", getElements("category_sl_reason")},
                sl_reason, "sl_reason", where)){return false;}

        if (!Functions.insertInput(driver, new String[]{"category_i_add_start_date",getElements("category_i_add_start_date")},
                "start_date", DataGenerator.getToday(driver,"dd/MM/yyyy"),  where)){return false;}

        if (!Functions.checkboxValue(driver,
                getElements("category_cb_add_active"),"active",true,true, where)){return false;}//where

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_ttoo",getElements("category_lov_add_ttoo")}, // b_lov
                new String[]{"category_i_add_ttoo", getElements("category_i_add_ttoo")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){return false;}

        if(!Functions.getValue(driver,new String[]{"category_e_add_ttoo_description", getElements("category_e_add_ttoo_description")}, // element path
                "tto_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_category",getElements("category_lov_add_category")}, // b_lov
                new String[]{"category_i_add_category", getElements("category_i_add_category")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "category", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_category_description", getElements("category_i_add_category_description")}, // element path
                "category_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if(!Functions.createLov(driver,
                new String[]{"category_lov_add_hotel_type",getElements("category_lov_add_hotel_type")}, // b_lov
                new String[]{"category_i_add_hotel_type", getElements("category_i_add_hotel_type")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_type", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"category_i_add_hotel_type_description", getElements("category_i_add_hotel_type_description")}, // element path
                "hotel_type_description", // key for data value (the name)
                where)){return false;} // where this operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"category_b_add_save", getElements("category_b_add_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }
        return true;
    }
}
