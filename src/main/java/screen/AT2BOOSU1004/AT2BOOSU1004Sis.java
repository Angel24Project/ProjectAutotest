package screen.AT2BOOSU1004;

import com.gargoylesoftware.htmlunit.javascript.host.idb.IDBFactory;
import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by vsolis on 05/10/2016.
 *
 * A la espera de solucion de bug, falta programar tres tablas Historic
 */
public class AT2BOOSU1004Sis {
    protected AT2BOOSU1004Locators locators;
    protected AT2BOOSU1004Data data;

    public AT2BOOSU1004Sis() {

    }

    public AT2BOOSU1004Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSU1004Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSU1004Data getData() {
        return data;
    }

    public void setData(AT2BOOSU1004Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Bookings");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("Reconfirmations set up 2.0");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED (TestDriver driver){
        if (!Reconfirmation_clients(driver)) return false;
        if(!Suplier_hotel_exclusions(driver)) return false;

        return false;
    }

    //SUPLIER HOTEL EXCLUSIONS
    private boolean Suplier_hotel_exclusions (TestDriver driver){

        if(!Go_to_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Add_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Search_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Edit_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Search_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Other_actions_suplier_hotel_exclusions(driver)){
            return false;
        }

        if(!Delete_supler_hotel_exclusions(driver)){
            return false;
        }

        return true;


    }

    private boolean Delete_supler_hotel_exclusions (TestDriver driver){

        driver.getReport().addHeader("DELETE IN SUPLIER HOTEL EXCLUSIONS",3,false);


        if(!Functions.doDeleteNCheck(driver,
                new String[]{"suplier_hotel_exclusions_b_delete",getElements("suplier_hotel_exclusions_b_delete")},
                new String[]{"suplier_hotel_exclusions_e_records",getElements("suplier_hotel_exclusions_e_records")},
                new String[]{"suplier_hotel_exclusions_b_delete_ok",getElements("suplier_hotel_exclusions_b_delete_ok")},
                " on DELETE IN HOTEL EXCLUSIONS")){
            return false;
        }
        return true;
    }

    private boolean Other_actions_suplier_hotel_exclusions (TestDriver driver){

        driver.getReport().addHeader("OTHER ACTIONS IN SUPLIER HOTEL EXCLUSIONS",3,false);
        String where = " on OTHER ACTIONS IN HOTEL EXCLUSIONS";

        if(!Functions.auditData(driver,
                new String[]{"suplier_hotel_exclusions_b_actions",getElements("suplier_hotel_exclusions_b_actions")}, //actions button
                new String[]{"suplier_hotel_exclusions_b_actions_b_data_history",getElements("suplier_hotel_exclusions_b_actions_b_data_history")}, //audit button
                new String[]{"suplier_hotel_exclusions_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;

        }

        if(!Functions.detachTable(driver,
                new String[]{"suplier_hotel_exclusions_b_detach",getElements("suplier_hotel_exclusions_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }

        return true;
    }

    private boolean Edit_suplier_hotel_exclusions (TestDriver driver){

        String where = " on EDIT IN HOTEL EXCLUSIONS";
        driver.getReport().addHeader(" EDIT IN SUPLIER HOTEL EXCLUSIONS",3,false);

        Functions.break_time(driver,6,500);

        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_ed_b_edit",getElements("suplier_hotel_exclusions_ed_b_edit")}, //element to click
                new String[]{"suplier_hotel_exclusions_ed_lov_company",getElements("suplier_hotel_exclusions_ed_lov_company")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_ed_lov_company",getElements("suplier_hotel_exclusions_ed_lov_company")}, // b_lov
                new String[]{"suplier_hotel_exclusions_ed_i_company",getElements("suplier_hotel_exclusions_ed_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_ed_lov_suplier_code",getElements("suplier_hotel_exclusions_ed_lov_suplier_code")}, // b_lov
                new String[]{"suplier_hotel_exclusions_ed_i_suplier_code",getElements("suplier_hotel_exclusions_ed_i_suplier_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "suplier_code", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_ed_lov_hotel_code",getElements("suplier_hotel_exclusions_ed_lov_hotel_code")}, // b_lov
                new String[]{"suplier_hotel_exclusions_ed_i_hotel_code",getElements("suplier_hotel_exclusions_ed_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_ed_lov_chain",getElements("suplier_hotel_exclusions_ed_lov_chain")}, // b_lov
                new String[]{"suplier_hotel_exclusions_ed_i_chain",getElements("suplier_hotel_exclusions_ed_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_ed_lov_office",getElements("suplier_hotel_exclusions_ed_lov_office")}, // b_lov
                new String[]{"suplier_hotel_exclusions_ed_i_office",getElements("suplier_hotel_exclusions_ed_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_ed_e_suplier_name",getElements("suplier_hotel_exclusions_ed_e_suplier_name")}, // element path
                "suplier_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_ed_e_hotel_name",getElements("suplier_hotel_exclusions_ed_e_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_ed_e_chain_name",getElements("suplier_hotel_exclusions_ed_e_chain_name")}, // element path
                "chain_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_ed_e_description",getElements("suplier_hotel_exclusions_ed_e_description")}, // element path
                "description", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_ed_suplier_short_name",getElements("suplier_hotel_exclusions_ed_suplier_short_name")}, // element path
                "short_name", // key for data value (the name)
                where)){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save",getElements("suplier_hotel_exclusions_add_b_save")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_sl_status",getElements("suplier_hotel_exclusions_add_b_save_b_ok_sl_status")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.selectText(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_sl_status",getElements("suplier_hotel_exclusions_add_b_save_b_ok_sl_status")},
                "Not Confirmed","confirmed",where)){
            return false;
        }
        Functions.break_time(driver,6,500);

        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_b_status_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok_b_status_ok")}, //element to click
                new String[]{"suplier_hotel_exclusions_b_actions",getElements("suplier_hotel_exclusions_b_actions")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }


        return true;
    }

    private boolean Search_suplier_hotel_exclusions (TestDriver driver){

        String where = " on SEARCH IN HOTEL EXCLUSIONS";
        driver.getReport().addHeader(" SEARCH IN SUPLIER HOTEL EXCLUSIONS",3,false);
        Functions.break_time(driver,6,500);
        if(!Functions.clickQbE(driver,
                new String[]{"suplier_hotel_exclusions_se_b_qbe",getElements("suplier_hotel_exclusions_se_b_qbe")},// query button
                new String[]{"suplier_hotel_exclusions_se_i_suplier_code",getElements("suplier_hotel_exclusions_se_i_suplier_code")},//any query input
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.insertInput(driver,new String[]{"suplier_hotel_exclusions_se_i_suplier_code",getElements("suplier_hotel_exclusions_se_i_suplier_code")},
                "se_suplier_code",data.getData().get("suplier_code"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"suplier_hotel_exclusions_se_i_suplier_name",getElements("suplier_hotel_exclusions_se_i_suplier_name")},
                "se_suplier_name",data.getData().get("suplier_name"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"suplier_hotel_exclusions_se_i_chain",getElements("suplier_hotel_exclusions_se_i_chain")},
                "se_chain",data.getData().get("chain"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"suplier_hotel_exclusions_se_i_hotel_code",getElements("suplier_hotel_exclusions_se_i_hotel_code")},
                "se_hotel_code",data.getData().get("hotel_code"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"suplier_hotel_exclusions_se_i_hotel_name",getElements("suplier_hotel_exclusions_se_i_hotel_name")},
                "se_hotel_name","%" + data.getData().get("hotel_name"),where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"suplier_hotel_exclusions_se_i_suplier_code",getElements("suplier_hotel_exclusions_se_i_suplier_code")}, //search button
                new String[]{"suplier_hotel_exclusions_se_e_result",getElements("suplier_hotel_exclusions_se_e_result")}, //result element
                where)){
            return false;
        }
        return true;
    }

    private boolean Add_suplier_hotel_exclusions (TestDriver driver){

        String where = " on ADD IN SUPLIER HOTEL EXCLUSIONS";
        driver.getReport().addHeader(" ADD IN SUPLIER HOTEL EXCLUSIONS",3,false);

        Functions.break_time(driver,6,500);

        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_add",getElements("suplier_hotel_exclusions_add_b_add")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_lov_company",getElements("suplier_hotel_exclusions_add_lov_company")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }

        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_add_lov_company",getElements("suplier_hotel_exclusions_add_lov_company")}, // b_lov
                new String[]{"suplier_hotel_exclusions_add_i_company",getElements("suplier_hotel_exclusions_add_i_company")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "company", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_add_lov_suplier_code",getElements("suplier_hotel_exclusions_add_lov_suplier_code")}, // b_lov
                new String[]{"suplier_hotel_exclusions_add_i_suplier_code",getElements("suplier_hotel_exclusions_add_i_suplier_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "suplier_code", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_add_lov_hotel_code",getElements("suplier_hotel_exclusions_add_lov_hotel_code")}, // b_lov
                new String[]{"suplier_hotel_exclusions_add_i_hotel_code",getElements("suplier_hotel_exclusions_add_i_hotel_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "hotel_code", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_add_lov_chain",getElements("suplier_hotel_exclusions_add_lov_chain")}, // b_lov
                new String[]{"suplier_hotel_exclusions_add_i_chain",getElements("suplier_hotel_exclusions_add_i_chain")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "chain", //Data name
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"suplier_hotel_exclusions_add_lov_office",getElements("suplier_hotel_exclusions_add_lov_office")}, // b_lov
                new String[]{"suplier_hotel_exclusions_add_i_office",getElements("suplier_hotel_exclusions_add_i_office")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "office", //Data name
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_add_e_suplier_name",getElements("suplier_hotel_exclusions_add_e_suplier_name")}, // element path
                "suplier_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_add_e_hotel_name",getElements("suplier_hotel_exclusions_add_e_hotel_name")}, // element path
                "hotel_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_add_e_chain_name",getElements("suplier_hotel_exclusions_add_e_chain_name")}, // element path
                "chain_name", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_add_e_description",getElements("suplier_hotel_exclusions_add_e_description")}, // element path
                "descripion", // key for data value (the name)
                where)){
            return false;
        }
        if(!Functions.getValue(driver,new String[]{"suplier_hotel_exclusions_add_suplier_short_name",getElements("suplier_hotel_exclusions_add_suplier_short_name")}, // element path
                "short_name", // key for data value (the name)
                where)){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save",getElements("suplier_hotel_exclusions_add_b_save")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_sl_status",getElements("suplier_hotel_exclusions_add_b_save_b_ok_sl_status")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,6,500);
        if(!Functions.selectText(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_sl_status",getElements("suplier_hotel_exclusions_add_b_save_b_ok_sl_status")},
                "Confirmed","confirmed",where)){
            return false;
        }
        Functions.break_time(driver,6,500);

        if(!Functions.checkClick(driver,
                new String[]{"suplier_hotel_exclusions_add_b_save_b_ok_b_status_ok",getElements("suplier_hotel_exclusions_add_b_save_b_ok_b_status_ok")}, //element to click
                new String[]{"suplier_hotel_exclusions_b_actions",getElements("suplier_hotel_exclusions_b_actions")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        return true;
    }

    private boolean Go_to_suplier_hotel_exclusions (TestDriver driver){
        if(!Functions.checkClick(driver,
                new String[]{"go_to_suplier_hotel_exclusions",getElements("go_to_suplier_hotel_exclusions")}, //element to click
                new String[]{"suplier_hotel_exclusions_add_b_add",getElements("suplier_hotel_exclusions_add_b_add")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                " on GO TO")){
            return false;
        }
        return true;
    }


    private boolean Reconfirmation_clients (TestDriver driver){

        if(!Add_cofiguration_by_tto(driver)){
            return false;
        }
        if(!Search_configuratons_by_tto(driver)){
            return false;
        }

        if(!Edit_configuration_by_tto(driver)){
            return false;
        }
        if(!Search_edit_configuration_by_tto(driver)){
            return false;
        }

        if(!Other_actions_configuration_by_tto(driver)){
            return false;
        }

        if(!Delete_configuration_by_tto(driver)){
            return false;
        }

        if(!Add_configuration_by_clients(driver)){
            return false;
        }

        if(!Search_configuration_by_clients(driver)){
            return false;
        }

        if(!Edit_configuration_by_clients(driver)){
            return false;
        }
        if(!Search_configuration_by_clients(driver)){
            return false;
        }


        if(!Other_actions_configuration_by_clients(driver)){
            return false;
        }

        if(!Delete_configuration_by_clients(driver)){
            return false;
        }
        return true;
    }

    // CONFIGURATION BY CLIENT
    private boolean Delete_configuration_by_clients (TestDriver driver){
        driver.getReport().addHeader("DELETE IN CONFIGURATION BY CLIENTS",3,false);
        String where = " on EDIT IN CONFIGURATION BY CLIENTS ";
// Contador de records no se actualiza.
        if(!Functions.doDelete(driver,
                new String[]{"configuration_by_clients_rating_b_delete",getElements("configuration_by_clients_rating_b_delete")},
                new String[]{"configuration_by_clients_rating_b_delete_b_ok",getElements("configuration_by_clients_rating_b_delete_b_ok")},
                where)){
            return false;
        }

        return true;
    }

    private boolean Other_actions_configuration_by_clients (TestDriver driver){
        driver.getReport().addHeader(" OTHER ACTIONS IN CONFIGURATION BY CLIENTS",3,false);
        String where = " on EDIT IN CONFIGURATION BY CLIENTS ";
        if(!Functions.auditData(driver,
                new String[]{"configuration_by_clients_rating_b_actions",getElements("configuration_by_clients_rating_b_actions")}, //actions button
                new String[]{"configuration_by_clients_rating_b_actions_b_data_history",getElements("configuration_by_clients_rating_b_actions_b_data_history")}, //audit button
                new String[]{"configuration_by_clients_rating_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;

        }

        if(!Functions.detachTable(driver,
                new String[]{"configuration_by_clients_rating_b_detach",getElements("configuration_by_clients_rating_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }

    /* private boolean Search_edit_configuration_by_clients(TestDriver driver) {
         driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY CLIENTS", 3, false);
         String where=" on SEARCH EDIT IN CONFIGURATION BY CLIENTS ";
         if (!Functions.clickQbE(driver,
                 new String[]{"configuration_by_clients_rating_b_qbe", getElements("configuration_by_clients_rating_b_qbe")},// query button
                 new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},//any query input
                 where)) {
             return false;
         }
         if (!Functions.zoomOut(driver, 3)) {
             return false;
         }

         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")},
                 "se_client_rating", data.getData().get("client_rating"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_sale_value", getElements("configuration_by_clients_rating_i_sale_value")},
                 "se_sale_value", data.getData().get("sale_value"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_from", getElements("configuration_by_clients_rating_i_arrival_date_from")},
                 "se_arrivale_from", data.getData().get("arrival_from"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_arrival_date_to", getElements("configuration_by_clients_rating_i_arrival_date_to")},
                 "se_arrival_to", data.getData().get("arrival_to"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_from", getElements("configuration_by_clients_rating_i_stay_date_from")},
                 "se_stay_from", data.getData().get("Stay_from"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_stay_date_to", getElements("configuration_by_clients_rating_i_stay_date_to")},
                 "se_stay_to", data.getData().get("stay_to"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_from", getElements("configuration_by_clients_rating_i_chase_from")},
                 "se_chase_from", data.getData().get("chase_from"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_chase_until", getElements("configuration_by_clients_rating_i_chase_until")},
                 "se_chase_to", data.getData().get("chase_to"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_rechase_days", getElements("configuration_by_clients_rating_i_rechase_days")},
                 "se_rechase_days", data.getData().get("rechase_days"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_co", getElements("configuration_by_clients_rating_i_atlas_co")},
                 "se_atlas_co", data.getData().get("atlas_co"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_atlas_office", getElements("configuration_by_clients_rating_i_atlas_office")},
                 "se_atlas_office", data.getData().get("atlas_office"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination", getElements("configuration_by_clients_rating_i_destination")},
                 "se_destination", data.getData().get("destination"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_destination_zone", getElements("configuration_by_clients_rating_i_destination_zone")},
                 "se_destination_zone", data.getData().get("destination_zone"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_hotel_category", getElements("configuration_by_clients_rating_i_hotel_category")},
                 "se_hotel_category", data.getData().get("hotel_category"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_last_minute_days", getElements("configuration_by_clients_rating_i_last_minute_days")},
                 "se_last_minute", data.getData().get("last_minute"), where)) {
             return false;
         }
         if (!Functions.insertInput(driver, new String[]{"configuration_by_clients_rating_i_project_name", getElements("configuration_by_clients_rating_i_project_name")},
                 "se_project_name", data.getData().get("project_name"), where)) {
             return false;
         }
         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_include_dnd_hotels", getElements("configuration_by_clients_rating_sl_include_dnd_hotels")},
                 "No", "se_dnd_hotels", where)) {
             return false;
         }

         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_include_bms", getElements("configuration_by_clients_rating_sl_include_bms")},
                 data.getData().get("include_bms"), "se_include_bms", where)) {
             return false;
         }

         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_include_integrations", getElements("configuration_by_clients_rating_sl_include_integrations")},
                 data.getData().get("integrations"), "se_integrations", where)) {
             return false;
         }

         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_include_ref_to_client", getElements("configuration_by_clients_rating_sl_include_ref_to_client")},
                 "No", "se_to_clients", where)) {
             return false;
         }
         Functions.break_time(driver, 9, 500);
         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_client_confirmation", getElements("configuration_by_clients_rating_sl_client_confirmation")},
                 "No", "se_client_confirmation", where)) {
             return false;
         }
         Functions.break_time(driver, 9, 500);
         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_send_copy_kam", getElements("configuration_by_clients_rating_sl_send_copy_kam")},
                 "No", "se_copy_kam", where)) {
             return false;
         }
         Functions.break_time(driver, 9, 500);
         if (!Functions.selectText(driver,
                 new String[]{"configuration_by_clients_rating_sl_active", getElements("configuration_by_clients_rating_sl_active")},
                 "No", "se_active", where)) {
             return false;
         }

         Functions.break_time(driver, 9, 500);
         if (!Functions.enterQueryAndClickResult(driver,
                 new String[]{"configuration_by_clients_rating_i_client_rating", getElements("configuration_by_clients_rating_i_client_rating")}, //search button
                 new String[]{"configuration_by_clients_rating_e_result", getElements("configuration_by_clients_rating_e_result")}, //result element
                 where)) {
             return false;
         }

         if (!Functions.zoomIn(driver)) {
             return false;
         }

         return true;
     }*/
    private boolean Edit_configuration_by_clients (TestDriver driver){
        driver.getReport().addHeader(" EDIT IN CONFIGURATION ",3,false);
        String where = " on EDIT IN CONFIGURATION BY CLIENTS ";

        if(!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_edit",getElements("configuration_by_clients_rating_ed_b_edit")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_client_rating",getElements("configuration_by_clients_rating_ed_lov_client_rating")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.createLov(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_client_rating",getElements("configuration_by_clients_rating_ed_lov_client_rating")}, // b_lov
                new String[]{"configuration_by_clients_rating_ed_i_client_rating",getElements("configuration_by_clients_rating_ed_i_client_rating")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client_rating", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_arrival_date_from",getElements("configuration_by_clients_rating_ed_i_arrival_date_from")},
                "arrival_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_stay_date_from",getElements("configuration_by_clients_rating_ed_i_stay_date_from")},
                "Stay_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_chase_from",getElements("configuration_by_clients_rating_ed_i_chase_from")},
                "chase_from",(Integer.toString(DataGenerator.random(501,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_rechase_days",getElements("configuration_by_clients_rating_ed_i_rechase_days")},
                "rechase_days",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        String list_options3[] = {"Exclude BMS","Auto confirm BMS","Reconfirm BMS"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_clients_rating_ed_sl_include_bms",getElements("configuration_by_clients_rating_ed_sl_include_bms")},
                list_options3,"include_bms",where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_ed_ch_include_dns_hotels"),"include_dnc_hotels",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_ed_ch_include_ref_to_client"),"include_ref_to_client",
                where)){
            return false;
        }

        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_project_name",getElements("configuration_by_clients_rating_ed_i_project_name")},
                "project_name","PRUEBA1",where)){
            return false;
        }
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_ed_ch_active"),"active",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_sale_value",getElements("configuration_by_clients_rating_ed_i_sale_value")},
                "sale_value",(Integer.toString(DataGenerator.random(1,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_arrival_date_to",getElements("configuration_by_clients_rating_ed_i_arrival_date_to")},
                "arrival_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(2,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_stay_date_to",getElements("configuration_by_clients_rating_ed_i_stay_date_to")},
                "stay_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(2,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_chase_to",getElements("configuration_by_clients_rating_ed_i_chase_to")},
                "chase_to",(Integer.toString(DataGenerator.random(1,500))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_ed_i_last_minute_day",getElements("configuration_by_clients_rating_ed_i_last_minute_day")},
                "last_minute",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        String list_options4[] = {"Exclude B2B","Auto confirm B2B","Reconfirm B2B"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_clients_rating_ed_sl_include_integrations",getElements("configuration_by_clients_rating_ed_sl_include_integrations")},
                list_options4,"integrations",where)){
            return false;
        }

        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_ed_ch_client_confirmation"),"client_confirmation",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_ed_ch_send_copy_kam"),"copy_kam",
                where)){
            return false;
        }


        //NEW LOVS

        //LOV ATALAS CO
/*
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_atlas_co", getElements("configuration_by_clients_rating_ed_b_delete_atlas_co")}, //element to click
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co", getElements("configuration_by_clients_rating_ed_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_b_pass", getElements("configuration_by_clients_rating_ed_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_co_b_ok", getElements("configuration_by_clients_rating_ed_lov_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_atlas_co", getElements("configuration_by_clients_rating_ed_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_atlas_co", getElements("configuration_by_clients_rating_ed_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                where)) {
            return false;
        }


        //LOV ATALAS OFFICE


        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_atlas_office", getElements("configuration_by_clients_rating_ed_b_delete_atlas_office")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office", getElements("configuration_by_clients_rating_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_atlas_office_b_pass", getElements("configuration_by_clients_rating_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_atlas_office_b_ok", getElements("configuration_by_clients_rating_ed_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_atalas_office", getElements("configuration_by_clients_rating_ed_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_destination", getElements("configuration_by_clients_rating_ed_b_delete_destination")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination", getElements("configuration_by_clients_rating_ed_lov_destination")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_b_pass", getElements("configuration_by_clients_rating_ed_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_b_ok", getElements("configuration_by_clients_rating_ed_lov_destination_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_destination", getElements("configuration_by_clients_rating_ed_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_destination_zone", getElements("configuration_by_clients_rating_ed_b_delete_destination_zone")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone", getElements("configuration_by_clients_rating_ed_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_destination_zone_b_pass", getElements("configuration_by_clients_rating_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_destination_zone_b_ok", getElements("configuration_by_clients_rating_ed_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_destination_zone", getElements("configuration_by_clients_rating_ed_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_destination_zone", getElements("configuration_by_clients_rating_ed_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                where)) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_b_delete_hotel_category", getElements("configuration_by_clients_rating_ed_b_delete_hotel_category")}, //element to click
                where)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_lov_hotel_category", getElements("configuration_by_clients_rating_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                " on EDIT")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_b_pass", getElements("configuration_by_clients_rating_ed_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_ed_lov_hotel_category_b_ok", getElements("configuration_by_clients_rating_ed_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_ed_i_hotel_category", getElements("configuration_by_clients_rating_ed_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_ed_i_hotel_category", getElements("configuration_by_clients_rating_ed_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
*/
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_clients_rating_ed_b_save",getElements("configuration_by_clients_rating_ed_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                where)){
            return false;
        }
        return true;
    }

    private boolean Search_configuration_by_clients (TestDriver driver){
        String where = " on SEARCH IN CONFIGURATION BY CLIENTS ";
        driver.getReport().addHeader("SEARCH IN CONFIGURATION BY CLIENTS",3,false);

        if(!Functions.clickQbE(driver,
                new String[]{"configuration_by_clients_rating_b_qbe",getElements("configuration_by_clients_rating_b_qbe")},// query button
                new String[]{"configuration_by_clients_rating_i_client_rating",getElements("configuration_by_clients_rating_i_client_rating")},//any query input
                where)){
            return false;
        }
        if(!Functions.zoomOut(driver,3)){
            return false;
        }

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_client_rating",getElements("configuration_by_clients_rating_i_client_rating")},
                "se_client_rating",data.getData().get("client_rating"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_sale_value",getElements("configuration_by_clients_rating_i_sale_value")},
                "se_sale_value",data.getData().get("sale_value"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_arrival_date_from",getElements("configuration_by_clients_rating_i_arrival_date_from")},
                "se_arrivale_from",data.getData().get("arrival_from"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_arrival_date_to",getElements("configuration_by_clients_rating_i_arrival_date_to")},
                "se_arrival_to",data.getData().get("arrival_to"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_stay_date_from",getElements("configuration_by_clients_rating_i_stay_date_from")},
                "se_stay_from",data.getData().get("Stay_from"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_stay_date_to",getElements("configuration_by_clients_rating_i_stay_date_to")},
                "se_stay_to",data.getData().get("stay_to"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_chase_from",getElements("configuration_by_clients_rating_i_chase_from")},
                "se_chase_from",data.getData().get("chase_from"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_chase_until",getElements("configuration_by_clients_rating_i_chase_until")},
                "se_chase_to",data.getData().get("chase_to"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_rechase_days",getElements("configuration_by_clients_rating_i_rechase_days")},
                "se_rechase_days",data.getData().get("rechase_days"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_atlas_co",getElements("configuration_by_clients_rating_i_atlas_co")},
                "se_atlas_co",data.getData().get("atlas_co"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_atlas_office",getElements("configuration_by_clients_rating_i_atlas_office")},
                "se_atlas_office",data.getData().get("atlas_office"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_destination",getElements("configuration_by_clients_rating_i_destination")},
                "se_destination",data.getData().get("destination"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_destination_zone",getElements("configuration_by_clients_rating_i_destination_zone")},
                "se_destination_zone",data.getData().get("destination_zone"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_hotel_category",getElements("configuration_by_clients_rating_i_hotel_category")},
                "se_hotel_category",data.getData().get("hotel_category"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_last_minute_days",getElements("configuration_by_clients_rating_i_last_minute_days")},
                "se_last_minute",data.getData().get("last_minute"),where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_i_project_name",getElements("configuration_by_clients_rating_i_project_name")},
                "se_project_name",data.getData().get("project_name"),where)){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_dnd_hotels",getElements("configuration_by_clients_rating_sl_include_dnd_hotels")},
                getData("include_dnc_hotels"),"se_include_dnc_hotels",where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_bms",getElements("configuration_by_clients_rating_sl_include_bms")},
                data.getData().get("include_bms"),"se_include_bms",where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_integrations",getElements("configuration_by_clients_rating_sl_include_integrations")},
                data.getData().get("integrations"),"se_integrations",where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_include_ref_to_client",getElements("configuration_by_clients_rating_sl_include_ref_to_client")},
                getData("include_ref_to_client"),"se_to_clients",where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_client_confirmation",getElements("configuration_by_clients_rating_sl_client_confirmation")},
                getData("client_confirmation"),"se_client_confirmation",where)){
            return false;
        }
        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_send_copy_kam",getElements("configuration_by_clients_rating_sl_send_copy_kam")},
                getData("copy_kam"),"se_copy_kam",where)){
            return false;
        }

        if(!Functions.selectText(driver,
                new String[]{"configuration_by_clients_rating_sl_active",getElements("configuration_by_clients_rating_sl_active")},
                getData("active"),"se_active",where)){
            return false;
        }

        Functions.break_time(driver,6,500);
        if(!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_clients_rating_i_client_rating",getElements("configuration_by_clients_rating_i_client_rating")}, //search button
                new String[]{"configuration_by_clients_rating_e_result",getElements("configuration_by_clients_rating_e_result")}, //result element
                where)){
            return false;
        }

        if(!Functions.zoomIn(driver)){
            return false;
        }

        return true;
    }

    private boolean Add_configuration_by_clients (TestDriver driver){

        String where = " on ADD IN CONFIGURATION BY CLIENTS ";
        driver.getReport().addHeader(" ADD IN CONFIGURATION BY CLIENTS",3,false);
        Functions.break_time(driver,250,500);

        if(!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_b_add",getElements("configuration_by_clients_rating_add_b_add")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_client_rating",getElements("configuration_by_clients_rating_add_lov_client_rating")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.createLov(driver,
                new String[]{"configuration_by_clients_rating_add_lov_client_rating",getElements("configuration_by_clients_rating_add_lov_client_rating")}, // b_lov
                new String[]{"configuration_by_clients_rating_add_i_client_rating",getElements("configuration_by_clients_rating_add_i_client_rating")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "client_rating", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_arrival_date_from",getElements("configuration_by_clients_rating_add_i_arrival_date_from")},
                "arrival_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_stay_date_from",getElements("configuration_by_clients_rating_add_i_stay_date_from")},
                "Stay_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_chase_from",getElements("configuration_by_clients_rating_add_i_chase_from")},
                "chase_from",(Integer.toString(DataGenerator.random(501,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_rechase_days",getElements("configuration_by_clients_rating_add_i_rechase_days")},
                "rechase_days",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        String list_options3[] = {"Exclude BMS","Auto confirm BMS","Reconfirm BMS"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_clients_rating_add_sl_include_bms",getElements("configuration_by_clients_rating_add_sl_include_bms")},
                list_options3,"include_bms",where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_add_ch_include_dns_hotels"),"include_dnc_hotels",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_add_ch_include_ref_to_client"),"include_ref_to_client",
                where)){
            return false;
        }

        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_project_name",getElements("configuration_by_clients_rating_add_i_project_name")},
                "project_name","PRUEBA1",where)){
            return false;
        }
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_add_ch_active"),"active",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_sale_value",getElements("configuration_by_clients_rating_add_i_sale_value")},
                "sale_value",(Integer.toString(DataGenerator.random(1,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_arrival_date_to",getElements("configuration_by_clients_rating_add_i_arrival_date_to")},
                "arrival_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(2,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_stay_date_to",getElements("configuration_by_clients_rating_add_i_stay_date_to")},
                "stay_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(2,1),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_chase_to",getElements("configuration_by_clients_rating_add_i_chase_to")},
                "chase_to",(Integer.toString(DataGenerator.random(1,500))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_clients_rating_add_i_last_minute_day",getElements("configuration_by_clients_rating_add_i_last_minute_day")},
                "last_minute",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        String list_options4[] = {"Exclude B2B","Auto confirm B2B","Reconfirm B2B"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_clients_rating_add_sl_include_integrations",getElements("configuration_by_clients_rating_add_sl_include_integrations")},
                list_options4,"integrations",where)){
            return false;
        }

        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_add_ch_client_confirmation"),"client_confirmation",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_clients_rating_add_ch_send_copy_kam"),"copy_kam",
                where)){
            return false;
        }

/*
        //NEW LOVS

        //LOV ATLAS CO

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co", getElements("configuration_by_clients_rating_add_lov_atlas_co")}, //element to click
                new String[]{"configuration_by_clients_rating_add_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_add_atlas_co_e_company_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_atlas_co_e_company_name_tb1", getElements("configuration_by_clients_rating_add_atlas_co_e_company_name_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co_b_pass", getElements("configuration_by_clients_rating_add_lov_atlas_co_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_co_e_company_name_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_co_e_company_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_atlas_co_b_ok", getElements("configuration_by_clients_rating_add_atlas_co_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_atlas_co", getElements("configuration_by_clients_rating_add_i_atlas_co")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_atlas_co", getElements("configuration_by_clients_rating_add_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                where)) {
            return false;
        }


        //LOV ATALAS OFFICE
        Functions.break_time(driver, 6, 500);
        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office", getElements("configuration_by_clients_rating_add_lov_atlas_office")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_b_pass", getElements("configuration_by_clients_rating_add_lov_atlas_office_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2", getElements("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2")}, // element path
                "atlas_office", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_atlas_office_b_ok", getElements("configuration_by_clients_rating_add_lov_atlas_office_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_atalas_office", getElements("configuration_by_clients_rating_add_i_atalas_office")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }


        // LOV DESTINATION
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination", getElements("configuration_by_clients_rating_add_lov_destination")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1", getElements("configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_b_pass", getElements("configuration_by_clients_rating_add_lov_destination_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_add_destination_e_destination_name_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_destination_e_destination_name_tb2", getElements("configuration_by_clients_rating_add_destination_e_destination_name_tb2")}, // element path
                "destination", // key for data value (the name)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_destination_b_ok", getElements("configuration_by_clients_rating_add_destination_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_destination", getElements("configuration_by_clients_rating_add_i_destination")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }


        // LOV DESTINATION ZONE
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone", getElements("configuration_by_clients_rating_add_lov_destination_zone")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_b_pass", getElements("configuration_by_clients_rating_add_lov_destination_zone_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb2", getElements("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_destination_zone_b_ok", getElements("configuration_by_clients_rating_add_lov_destination_zone_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_destination_zone", getElements("configuration_by_clients_rating_add_i_destination_zone")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_destination_zone", getElements("configuration_by_clients_rating_add_i_destination_zone")}, // element path
                "destination_zone", // key for data value (the name)
                where)) {
            return false;
        }

        //LOV HOTEL CATEGORY
        Functions.break_time(driver, 6, 500);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category", getElements("configuration_by_clients_rating_add_lov_hotel_category")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);

        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1")}, //element to click
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_b_pass", getElements("configuration_by_clients_rating_add_lov_hotel_category_b_pass")}, //element to click
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb2", getElements("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb2")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_clients_rating_add_lov_hotel_category_b_ok", getElements("configuration_by_clients_rating_add_lov_hotel_category_b_ok")}, //element to click
                new String[]{"configuration_by_clients_rating_add_i_hotel_category", getElements("configuration_by_clients_rating_add_i_hotel_category")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }

        if (!Functions.getText(driver, new String[]{"configuration_by_clients_rating_add_i_hotel_category", getElements("configuration_by_clients_rating_add_i_hotel_category")}, // element path
                "hotel_category", // key for data value (the name)
                where)) {
            return false;
        }
        Functions.break_time(driver, 6, 500);
*/
        if(!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_clients_rating_add_b_save",getElements("configuration_by_clients_rating_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30,500,
                where)){
            return false;
        }

        return true;
    }

    //CONFIGURATION BY TTO
    private boolean Delete_configuration_by_tto (TestDriver driver){

        String where = " on DELETE IN CONFIGURATION BY TTOO";
        driver.getReport().addHeader("DELETE IN CONFIGURATION BY TTO",3,false);


        if(!Functions.doDeleteNCheck(driver,
                new String[]{"configuration_by_ttoo_b_delete",getElements("configuration_by_ttoo_b_delete")},
                new String[]{"configuration_by_ttoo_e_record",getElements("configuration_by_ttoo_e_record")},
                new String[]{"configuration_by_ttoo_b_delete_b_ok",getElements("configuration_by_ttoo_b_delete_b_ok")},
                where)){
            return false;
        }
        return true;

    }

    private boolean Other_actions_configuration_by_tto (TestDriver driver){

        String where = " on OTHER ACTIONS IN CONFIGURATION BY TTOO";

        driver.getReport().addHeader("OTHER ACTIONS IN CONFIGURATION BY TTO",3,false);


        if(!Functions.auditData(driver,
                new String[]{"configuration_by_ttoo_b_actions",getElements("configuration_by_ttoo_b_actions")}, //actions button
                new String[]{"configuration_by_ttoo_b_actions_b_data_history",getElements("configuration_by_ttoo_b_actions_b_data_history")}, //audit button
                new String[]{"configuration_by_ttoo_b_actions_b_data_history_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)){
            return false;

        }
        if(!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_b_actions",getElements("configuration_by_ttoo_b_actions")}, //element to click
                new String[]{"configuration_by_ttoo_b_historic",getElements("configuration_by_ttoo_b_historic")}, //element expected to appear
                250,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        if(!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_b_historic",getElements("configuration_by_ttoo_b_historic")}, //element to click
                new String[]{"configuration_by_ttoo_b_historic_b_qbe",getElements("configuration_by_ttoo_b_historic_b_qbe")}, //element expected to appear
                250,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        // where this operation occurs
        if(!Functions.clickQbE(driver,
                new String[]{"configuration_by_ttoo_b_historic_b_qbe",getElements("configuration_by_ttoo_b_historic_b_qbe")},// query button
                new String[]{"configuration_by_ttoo_b_historic_i_ttoo",getElements("configuration_by_ttoo_b_historic_i_ttoo")},//any query input
                where)){
            return false;
        }
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_result_ttoo", getElements("configuration_by_ttoo_b_historic_e_result_ttoo")}, // element path
                "ttoo", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_ttoo_shortname", getElements("configuration_by_ttoo_b_historic_e_ttoo_shortname")}, // element path
                "shortname", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_sale_value", getElements("configuration_by_ttoo_b_historic_e_sale_value")}, // element path
                "sale_value", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_arrival_date_from", getElements("configuration_by_ttoo_b_historic_e_arrival_date_from")}, // element path
                "date_from", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_arrival_date_to", getElements("configuration_by_ttoo_b_historic_e_arrival_date_to")}, // element path
                "date_to", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_stay_date_from", getElements("configuration_by_ttoo_b_historic_e_stay_date_from")}, // element path
                "stay_date_from", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_stay_date_to", getElements("configuration_by_ttoo_b_historic_e_stay_date_to")}, // element path
                "stay_date_to", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_ttoo",getElements("configuration_by_ttoo_b_historic_i_ttoo")},
                "ttoo", getData("ttoo"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_ttoo_shortname",getElements("configuration_by_ttoo_b_historic_i_ttoo_shortname")},
                "shortname","%"+ getData("shortname"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_sale_value",getElements("configuration_by_ttoo_b_historic_i_sale_value")},
                "sale_value", getData("sale_value"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_arrival_date_from",getElements("configuration_by_ttoo_b_historic_i_arrival_date_from")},
                "date_from", getData("date_from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_arrival_date_to",getElements("configuration_by_ttoo_b_historic_i_arrival_date_to")},
                "date_to",getData("date_to"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_stay_date_from",getElements("configuration_by_ttoo_b_historic_i_stay_date_from")},
                "stay_date_from", getData("stay_date_from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_stay_date_to",getElements("configuration_by_ttoo_b_historic_i_stay_date_to")},
                "stay_date_to", getData("stay_date_to"),where)){return false;}
        if(!Functions.navigateTable(driver,
                new String[]{"configuration_by_ttoo_b_historic_e_scroll",getElements("configuration_by_ttoo_b_historic_e_scroll")}, //scroller xpath
                "forward",where)){  //nav direction(just back or forward)
            return false;
        }
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_chase_from", getElements("configuration_by_ttoo_b_historic_e_chase_from")}, // element path
                "chase_from", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_chase_until", getElements("configuration_by_ttoo_b_historic_e_chase_until")}, // element path
                "chase_until", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_rechase_days", getElements("configuration_by_ttoo_b_historic_e_rechase_days")}, // element path
                "rechase_days", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_atlas_co", getElements("configuration_by_ttoo_b_historic_e_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_soficodofi", getElements("configuration_by_ttoo_b_historic_e_soficodofi")}, // element path
                "soficodfi", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_destination", getElements("configuration_by_ttoo_b_historic_e_destination")}, // element path
                "destination", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_chase_from",getElements("configuration_by_ttoo_b_historic_i_chase_from")},
                "chase_from", getData("chase_from"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_chase_until",getElements("configuration_by_ttoo_b_historic_i_chase_until")},
                "chase_until", getData("chase_until"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_rechase_days",getElements("configuration_by_ttoo_b_historic_i_rechase_days")},
                "rechase_days", getData("rechase_days"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_atlas_co",getElements("configuration_by_ttoo_b_historic_i_atlas_co")},
                "atlas_co", getData("atlas_co"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_soficodofi",getElements("configuration_by_ttoo_b_historic_i_soficodofi")},
                "soficodfi",getData("soficodfi"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_destination",getElements("configuration_by_ttoo_b_historic_i_destination")},
                "destination", getData("destination"),where)){return false;}
        if(!Functions.navigateTable(driver,
                new String[]{"configuration_by_ttoo_b_historic_e_scroll",getElements("configuration_by_ttoo_b_historic_e_scroll")}, //scroller xpath
                "forward",where)){  //nav direction(just back or forward)
            return false;
        }
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_deszonage", getElements("configuration_by_ttoo_b_historic_e_deszonage")}, // element path
                "deszonage", // key for data value
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_hotel_categori", getElements("configuration_by_ttoo_b_historic_e_hotel_categori")}, // element path
                "hotel_categori", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_last_minute_days", getElements("configuration_by_ttoo_b_historic_e_last_minute_days")}, // element path
                "last_minute_days", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_proyect_name", getElements("configuration_by_ttoo_b_historic_e_proyect_name")}, // element path
                "proyect_name", // key for data value (the name)
                where)){return false;}
        if(!Functions.getAttr(driver,new String[]{"configuration_by_ttoo_b_historic_e_include_dnc_hotels", getElements("configuration_by_ttoo_b_historic_e_include_dnc_hotels")}, // element path
                "title",
                "include_dnc_hotels", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_include_bms", getElements("configuration_by_ttoo_b_historic_e_include_bms")}, // element path
                "include_bms", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_deszonage",getElements("configuration_by_ttoo_b_historic_i_deszonage")},
                "deszonage", getData("deszonage"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_hotel_category",getElements("configuration_by_ttoo_b_historic_i_hotel_category")},
                "hotel_categori", getData("hotel_categori"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_last_minute_days",getElements("configuration_by_ttoo_b_historic_i_last_minute_days")},
                "last_minute_days", getData("last_minute_days"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_proyect_name",getElements("configuration_by_ttoo_b_historic_i_proyect_name")},
                "proyect_name", getData("proyect_name"),where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_i_include_bms",getElements("configuration_by_ttoo_b_historic_i_include_bms")},
                "include_bms",getData("include_bms"),where)){return false;}
        if(getData("include_dnc_hotels").equalsIgnoreCase("unchecked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_include_dnc_hotels",getElements("configuration_by_ttoo_b_historic_sl_include_dnc_hotels")},
                    "No","include_dnc_hotels",where)){
                return false;
            }
        } else if(getData("include_dnc_hotels").equalsIgnoreCase("checked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_include_dnc_hotels",getElements("configuration_by_ttoo_b_historic_sl_include_dnc_hotels")},
                    "Yes","include_dnc_hotels",where)){
                return false;
            }
        }
        if(!Functions.navigateTable(driver,
                new String[]{"configuration_by_ttoo_b_historic_e_scroll",getElements("configuration_by_ttoo_b_historic_e_scroll")}, //scroller xpath
                "forward",where)){  //nav direction(just back or forward)
            return false;
        }
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_b_historic_e_include_integrations", getElements("configuration_by_ttoo_b_historic_e_include_integrations")}, // element path
                "include_integrations", // key for data value
                where)){return false;}
        if(!Functions.getAttr(driver,new String[]{"configuration_by_ttoo_b_historic_e_include_ref_to_client", getElements("configuration_by_ttoo_b_historic_e_include_ref_to_client")}, // element path
                "title",
                "ref_to_client", // key for data value (the name)
                where)){return false;}
        if(!Functions.getAttr(driver,new String[]{"configuration_by_ttoo_b_historic_e_client_confirmation", getElements("configuration_by_ttoo_b_historic_e_client_confirmation")}, // element path
                "title",
                "client_confirmation", // key for data value (the name)
                where)){return false;}
        if(!Functions.getAttr(driver,new String[]{"configuration_by_ttoo_b_historic_e_send_copy_kam", getElements("configuration_by_ttoo_b_historic_e_send_copy_kam")}, // element path
                "title",
                "send_copy_kam", // key for data value (the name)
                where)){return false;}
        if(!Functions.getAttr(driver,new String[]{"configuration_by_ttoo_b_historic_e_active", getElements("configuration_by_ttoo_b_historic_e_active")}, // element path
                "title",
                "active", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_b_historic_sl_include_integrations",getElements("configuration_by_ttoo_b_historic_sl_include_integrations")},
                "include_integrations", getData("include_integrations"),where)){return false;}
        if(getData("ref_to_client").equalsIgnoreCase("unchecked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_include_ref_to_client",getElements("configuration_by_ttoo_b_historic_sl_include_ref_to_client")},
                    "No","ref_to_client",where)){
                return false;
            }
        } else if(getData("ref_to_client").equalsIgnoreCase("checked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_include_ref_to_client",getElements("configuration_by_ttoo_b_historic_sl_include_ref_to_client")},
                    "Yes","ref_to_client",where)){
                return false;
            }
        }
        if(getData("client_confirmation").equalsIgnoreCase("unchecked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_client_confirmation",getElements("configuration_by_ttoo_b_historic_sl_client_confirmation")},
                    "No","client_confirmation",where)){
                return false;
            }
        } else if(getData("client_confirmation").equalsIgnoreCase("checked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_client_confirmation",getElements("configuration_by_ttoo_b_historic_sl_client_confirmation")},
                    "Yes","client_confirmation",where)){
                return false;
            }
        }
        if(getData("send_copy_kam").equalsIgnoreCase("unchecked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_send_copy_kam",getElements("configuration_by_ttoo_b_historic_sl_send_copy_kam")},
                    "No","send_copy_kam",where)){
                return false;
            }
        } else if(getData("send_copy_kam").equalsIgnoreCase("checked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_sl_send_copy_kam",getElements("configuration_by_ttoo_b_historic_sl_send_copy_kam")},
                    "Yes","send_copy_kam",where)){
                return false;
            }
        }
        if(getData("active").equalsIgnoreCase("unchecked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_i_active",getElements("configuration_by_ttoo_b_historic_i_active")},
                    "No","active",where)){
                return false;
            }
        } else if(getData("active").equalsIgnoreCase("checked")){

            if(!Functions.selectText(driver,
                    new String[]{"configuration_by_ttoo_b_historic_i_active",getElements("configuration_by_ttoo_b_historic_i_active")},
                    "Yes","active",where)){
                return false;
            }
        }

        Functions.break_time(driver,250,500);
        if(!Functions.detachTable(driver,
                new String[]{"configuration_by_ttoo_b_historic_b_dtach",getElements("configuration_by_ttoo_b_historic_b_dtach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_ttoo_b_historic_b_exit", getElements("configuration_by_ttoo_b_historic_b_exit")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                250, 500,
                where)) {
            return false;
        }

        if(!Functions.detachTable(driver,
                new String[]{"configuration_by_ttoo_b_detach",getElements("configuration_by_ttoo_b_detach")}, //detach button
                true,     //screenshot??
                where)){
            return false;
        }
        return true;
    }


    private boolean Search_edit_configuration_by_tto(TestDriver driver) {

        String where=" on SEARCHQBE IN CONFIGURATION BY TTOO";
        driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_ttoo_se_b_qbe", getElements("configuration_by_ttoo_se_b_qbe")},// query button
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},//any query input
                where)) {
            return false;
        }
        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},
                "se_ttoo", data.getData().get("tto"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo_shortname", getElements("configuration_by_ttoo_se_i_ttoo_shortname")},
                "se_short_name", "%" + data.getData().get("ttoo_shortname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_sale_value", getElements("configuration_by_ttoo_se_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_from", getElements("configuration_by_ttoo_se_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_to", getElements("configuration_by_ttoo_se_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_from", getElements("configuration_by_ttoo_se_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_to", getElements("configuration_by_ttoo_se_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_from", getElements("configuration_by_ttoo_se_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_until", getElements("configuration_by_ttoo_se_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_rechase_days", getElements("configuration_by_ttoo_se_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_co", getElements("configuration_by_ttoo_se_i_atlas_co")},
                "se_atlas_co", getData("atlas_co"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_office", getElements("configuration_by_ttoo_se_i_atlas_office")},
                "se_atlas_office", getData("atlas_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination", getElements("configuration_by_ttoo_se_i_destination")},
                "se_destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination_zone", getElements("configuration_by_ttoo_se_i_destination_zone")},
                "se_destination_zone", getData("destination_zone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_hotel_category", getElements("configuration_by_ttoo_se_i_hotel_category")},
                "se_hotel_category", getData("hotel_category"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_last_minutes_days", getElements("configuration_by_ttoo_se_i_last_minutes_days")},
                "se_last_minute", getData("last_minute"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_project_name", getElements("configuration_by_ttoo_se_i_project_name")},
                "se_project_name", data.getData().get("project_name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_dnd_hotels", getElements("configuration_by_ttoo_se_sl_include_dnd_hotels")},
                getData("include_dns_hotels"), "se_dnd_hotels", where)) {

            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_bms", getElements("configuration_by_ttoo_se_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", where)) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_integrations", getElements("configuration_by_ttoo_se_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", where)) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_ref_to_clients", getElements("configuration_by_ttoo_se_sl_include_ref_to_clients")},
                getData("include_ref_to_client"), "se_to_clients", where)) {
            return false;
        }
        Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_client_confirmation", getElements("configuration_by_ttoo_se_sl_client_confirmation")},
                getData("client_confirmation"), "se_client_confirmation", where)) {
            return false;
        }Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_send_copy_kam", getElements("configuration_by_ttoo_se_sl_send_copy_kam")},
                getData("copy_kam"), "se_copy_kam", where)) {
            return false;
        }Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_active", getElements("configuration_by_ttoo_se_sl_active")},
                getData("active"), "se_active", where)) {
            return false;
        }

        Functions.break_time(driver, 250, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")}, //search button
                new String[]{"configuration_by_ttoo_se_e_result", getElements("configuration_by_ttoo_se_e_result")}, //result element
                where)) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }
        return true;
    }
    private boolean Edit_configuration_by_tto(TestDriver driver){

        String where = " on EDIT IN CONFIGURATION BY TTOO";

        driver.getReport().addHeader(" EDIT IN CONFIGURATION BY TTO",3,false);

        if(!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_edit",getElements("configuration_by_ttoo_ed_b_edit")}, //element to click
                new String[]{"configuration_by_ttoo_ed_lov_tto",getElements("configuration_by_ttoo_ed_lov_tto")}, //element expected to appear
                30,500, //seconds/miliseconds (driver wait)
                where)){
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"configuration_by_ttoo_add_lov_tto",getElements("configuration_by_ttoo_add_lov_tto")}, // b_lov
                new String[]{"configuration_by_ttoo_add_i_tto",getElements("configuration_by_ttoo_add_i_tto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_arrival_date_from",getElements("configuration_by_ttoo_add_i_arrival_date_from")},
                "arrival_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,2),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_stay_date_from",getElements("configuration_by_ttoo_add_i_stay_date_from")},
                "Stay_from",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,2),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_chase_from",getElements("configuration_by_ttoo_add_i_chase_from")},
                "chase_from",(Integer.toString(DataGenerator.random(501,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_rechase_days",getElements("configuration_by_ttoo_add_i_rechase_days")},
                "rechase_days",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        String list_options[] = {"Auto confirm B","Exclude BMS","Reconfirm BMS"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_bms",getElements("configuration_by_ttoo_add_sl_include_bms")},
                list_options,"include_bms",where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_include_dns_hotels"),"include_dns_hotels",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_include_ref_to_client"),"include_ref_to_client",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_project_name",getElements("configuration_by_ttoo_add_i_project_name")},
                "project_name","PRUEBA1",where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_active"),"active",
                where)){
            return false;
        }
        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_sale_value",getElements("configuration_by_ttoo_add_i_sale_value")},
                "sale_value",(Integer.toString(DataGenerator.random(1,1000))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);


        if(!Functions.getValue(driver,new String[]{"configuration_by_ttoo_add_i_ttoo_shortname",getElements("configuration_by_ttoo_add_i_ttoo_shortname")}, // element path
                "ttoo_shortname", // key for data value (the name)
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_arrival_date_to",getElements("configuration_by_ttoo_add_i_arrival_date_to")},
                "arrival_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,2),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_stay_date_to",getElements("configuration_by_ttoo_add_i_stay_date_to")},
                "stay_to",DataGenerator.getRelativeDateToday("MM/dd/yyyy",0,DataGenerator.random(0,2),0),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_chase_to",getElements("configuration_by_ttoo_add_i_chase_to")},
                "chase_to",(Integer.toString(DataGenerator.random(1,500))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);

        if(!Functions.insertInput(driver,new String[]{"configuration_by_ttoo_add_i_last_minute_day",getElements("configuration_by_ttoo_add_i_last_minute_day")},
                "last_minute",(Integer.toString(DataGenerator.random(1,10))),where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        String list_options2[] = {"Auto confirm B2B","Exclude B2B","Reconfirm B2B"};
        if(!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_integrations",getElements("configuration_by_ttoo_add_sl_include_integrations")},
                list_options2,"integrations",where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_client_confirmation"),"client_confirmation",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_send_copy_kam"),"copy_kam",
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.randomCheck(driver,getElements("configuration_by_ttoo_add_ch_active"),"active",
                where)){
            return false;
        }
    /*    if(!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_hotel_category",getElements("configuration_by_ttoo_ed_b_delete_hotel_category")}, //element to click
                where)){
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_destination_zone", getElements("configuration_by_ttoo_ed_b_delete_destination_zone")}, //element to click
                where)) {
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_atlas_office",getElements("configuration_by_ttoo_ed_b_delete_atlas_office")}, //element to click
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_atlas_co",getElements("configuration_by_ttoo_ed_b_delete_atlas_co")}, //element to click
                where)){
            return false;
        }
        if(!Functions.simpleClick(driver,
                new String[]{"configuration_by_ttoo_ed_b_delete_destination",getElements("configuration_by_ttoo_ed_b_delete_destination")}, //element to click
                where)){
            return false;
        }
        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination",getElements("configuration_by_ttoo_add_lov_destination")},
                true, //like this selects the 1º record
                where)){
            return false;
        }

        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co",getElements("configuration_by_ttoo_add_lov_atlas_co")},
                false, //like this selects the 1º record
                where)){
            return false;
        }
        Functions.break_time(driver,250,500);
        if(!Functions.getText(driver,new String[]{"configuration_by_ttoo_add_i_atlas_co",getElements("configuration_by_ttoo_add_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                where)){
            return false;
        }


        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office",getElements("configuration_by_ttoo_add_lov_atlas_office")},
                false, //like this selects the 1º record
                where)){
            return false;
        }

        Functions.break_time(driver, 250, 500);

        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone", getElements("configuration_by_ttoo_add_lov_destination_zone")},
                false, //like this selects the 1º record
                where)){
            return false;
        }

        Functions.break_time(driver, 250, 500);
        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category", getElements("configuration_by_ttoo_add_lov_hotel_category")},
                false, //like this selects the 1º record
                where)){
            return false;
        }
        Functions.break_time(driver, 250, 500);
*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_ttoo_add_b_save", getElements("configuration_by_ttoo_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }

        return true;
    }
    private boolean Search_configuratons_by_tto(TestDriver driver) {
        String where=" on SEARCH IN CONFIGURATION BY TTOO";
        driver.getReport().addHeader(" SEARCH IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.clickQbE(driver,
                new String[]{"configuration_by_ttoo_se_b_qbe", getElements("configuration_by_ttoo_se_b_qbe")},// query button
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},//any query input
                where)) {
            return false;
        }
        if (!Functions.zoomOut(driver, 3)) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")},
                "se_ttoo", data.getData().get("tto"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_ttoo_shortname", getElements("configuration_by_ttoo_se_i_ttoo_shortname")},
                "se_short_name", "%" + data.getData().get("ttoo_shortname"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_sale_value", getElements("configuration_by_ttoo_se_i_sale_value")},
                "se_sale_value", data.getData().get("sale_value"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_from", getElements("configuration_by_ttoo_se_i_arrival_date_from")},
                "se_arrivale_from", data.getData().get("arrival_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_arrival_date_to", getElements("configuration_by_ttoo_se_i_arrival_date_to")},
                "se_arrival_to", data.getData().get("arrival_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_from", getElements("configuration_by_ttoo_se_i_stay_date_from")},
                "se_stay_from", data.getData().get("Stay_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_stay_date_to", getElements("configuration_by_ttoo_se_i_stay_date_to")},
                "se_stay_to", data.getData().get("stay_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_from", getElements("configuration_by_ttoo_se_i_chase_from")},
                "se_chase_from", data.getData().get("chase_from"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_chase_until", getElements("configuration_by_ttoo_se_i_chase_until")},
                "se_chase_to", data.getData().get("chase_to"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_rechase_days", getElements("configuration_by_ttoo_se_rechase_days")},
                "se_rechase_days", data.getData().get("rechase_days"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_co", getElements("configuration_by_ttoo_se_i_atlas_co")},
                "se_atlas_co", getData("atlas_co"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_atlas_office", getElements("configuration_by_ttoo_se_i_atlas_office")},
                "se_atlas_office", getData("atlas_office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination", getElements("configuration_by_ttoo_se_i_destination")},
                "se_destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_destination_zone", getElements("configuration_by_ttoo_se_i_destination_zone")},
                "se_destination_zone", getData("destination_zone"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_hotel_category", getElements("configuration_by_ttoo_se_i_hotel_category")},
                "se_hotel_category", getData("hotel_category"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_last_minutes_days", getElements("configuration_by_ttoo_se_i_last_minutes_days")},
                "se_last_minute", getData("last_minute"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_se_i_project_name", getElements("configuration_by_ttoo_se_i_project_name")},
                "se_project_name", data.getData().get("project_name"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_dnd_hotels", getElements("configuration_by_ttoo_se_sl_include_dnd_hotels")},
                getData("include_dns_hotels"), "se_dnd_hotels", where)) {

            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_bms", getElements("configuration_by_ttoo_se_sl_include_bms")},
                data.getData().get("include_bms"), "se_include_bms", where)) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_integrations", getElements("configuration_by_ttoo_se_sl_include_integrations")},
                data.getData().get("integrations"), "se_integrations", where)) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_include_ref_to_clients", getElements("configuration_by_ttoo_se_sl_include_ref_to_clients")},
                getData("include_ref_to_client"), "se_to_clients", where)) {
            return false;
        }
        Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_client_confirmation", getElements("configuration_by_ttoo_se_sl_client_confirmation")},
                getData("client_confirmation"), "se_client_confirmation", where)) {
            return false;
        }Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_send_copy_kam", getElements("configuration_by_ttoo_se_sl_send_copy_kam")},
                getData("copy_kam"), "se_copy_kam", where)) {
            return false;
        }Functions.break_time(driver,250,500);
        if (!Functions.selectText(driver,
                new String[]{"configuration_by_ttoo_se_sl_active", getElements("configuration_by_ttoo_se_sl_active")},
                getData("active"), "se_active", where)) {
            return false;
        }

        Functions.break_time(driver, 250, 500);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"configuration_by_ttoo_se_i_ttoo", getElements("configuration_by_ttoo_se_i_ttoo")}, //search button
                new String[]{"configuration_by_ttoo_se_e_result", getElements("configuration_by_ttoo_se_e_result")}, //result element
                where)) {
            return false;
        }

        if (!Functions.zoomIn(driver)) {
            return false;
        }
        return true;
    }
    private boolean Add_cofiguration_by_tto(TestDriver driver) {

        String where=" on ADD IN CONFIGURATION BY TTOO";
        driver.getReport().addHeader(" ADD IN CONFIGURATION BY TTO", 3, false);

        if (!Functions.checkClick(driver,
                new String[]{"configuration_by_ttoo_add_b_add", getElements("configuration_by_ttoo_add_b_add")}, //element to click
                new String[]{"configuration_by_ttoo_add_lov_tto", getElements("configuration_by_ttoo_add_lov_tto")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.createLov(driver,
                new String[]{"configuration_by_ttoo_add_lov_tto", getElements("configuration_by_ttoo_add_lov_tto")}, // b_lov
                new String[]{"configuration_by_ttoo_add_i_tto", getElements("configuration_by_ttoo_add_i_tto")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "tto", //Data name
                where)) {
            return false;
        }
        Functions.break_time(driver, 250, 500);
        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_arrival_date_from", getElements("configuration_by_ttoo_add_i_arrival_date_from")},
                "arrival_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(0, 1), 0), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_stay_date_from", getElements("configuration_by_ttoo_add_i_stay_date_from")},
                "Stay_from", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(0, 1), 0), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_chase_from", getElements("configuration_by_ttoo_add_i_chase_from")},
                "chase_from", (Integer.toString(DataGenerator.random(501, 1000))), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_rechase_days", getElements("configuration_by_ttoo_add_i_rechase_days")},
                "rechase_days", (Integer.toString(DataGenerator.random(1, 10))), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);
        String list_options[] = {"Auto confirm B", "Exclude BMS", "Reconfirm BMS"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_bms", getElements("configuration_by_ttoo_add_sl_include_bms")},
                list_options, "include_bms", where)) {
            return false;
        }Functions.break_time(driver, 250, 500);
        if (!Functions.randomCheck(driver, getElements("configuration_by_ttoo_add_ch_include_dns_hotels"), "include_dns_hotels",
                where)){return false;}Functions.break_time(driver, 250, 500);

        if (!Functions.randomCheck(driver, getElements("configuration_by_ttoo_add_ch_include_ref_to_client"), "include_ref_to_client",
                where)){return false;}Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_project_name", getElements("configuration_by_ttoo_add_i_project_name")},
                "project_name", "PRUEBA1", where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.checkboxValue(driver,
                getElements("configuration_by_ttoo_add_ch_active"), "active", true, true, where)) {
            return false;
        }//where

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_sale_value", getElements("configuration_by_ttoo_add_i_sale_value")},
                "sale_value", (Integer.toString(DataGenerator.random(1, 1000))), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);


        if (!Functions.getValue(driver, new String[]{"configuration_by_ttoo_add_i_ttoo_shortname", getElements("configuration_by_ttoo_add_i_ttoo_shortname")}, // element path
                "ttoo_shortname", // key for data value (the name)
                where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_arrival_date_to", getElements("configuration_by_ttoo_add_i_arrival_date_to")},
                "arrival_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(0, 1), 0), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_stay_date_to", getElements("configuration_by_ttoo_add_i_stay_date_to")},
                "stay_to", DataGenerator.getRelativeDateToday("MM/dd/yyyy", 0, DataGenerator.random(0, 1), 0), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_chase_to", getElements("configuration_by_ttoo_add_i_chase_to")},
                "chase_to", (Integer.toString(DataGenerator.random(1, 500))), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);

        if (!Functions.insertInput(driver, new String[]{"configuration_by_ttoo_add_i_last_minute_day", getElements("configuration_by_ttoo_add_i_last_minute_day")},
                "last_minute", (Integer.toString(DataGenerator.random(1, 10))), where)) {
            return false;
        }Functions.break_time(driver, 250, 500);
        String list_options2[] = {"Auto confirm B2B", "Exclude B2B", "Reconfirm B2B"};
        if (!Functions.selectTextRandom(driver,
                new String[]{"configuration_by_ttoo_add_sl_include_integrations", getElements("configuration_by_ttoo_add_sl_include_integrations")},
                list_options2, "integrations", where)) {
            return false;
        }Functions.break_time(driver, 250, 500);
        if (!Functions.randomCheck(driver, getElements("configuration_by_ttoo_add_ch_client_confirmation"), "client_confirmation",
                where)){return false;}Functions.break_time(driver, 250, 500);
        if (!Functions.randomCheck(driver, getElements("configuration_by_ttoo_add_ch_send_copy_kam"), "copy_kam",
                where)){return false;}
        Functions.break_time(driver, 250, 500);
        if (!Functions.randomCheck(driver, getElements("configuration_by_ttoo_add_ch_active"), "active",
                where)){return false;}
        Functions.break_time(driver, 250, 500);
   /*     if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination", getElements("configuration_by_ttoo_add_lov_destination")},
                false, //like this selects the 1º record
                where)){
            return false;
        }
        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_co", getElements("configuration_by_ttoo_add_lov_atlas_co")},
                false, //like this selects the 1º record
                where)){
            return false;
        }Functions.break_time(driver, 250, 500);
        if (!Functions.getText(driver, new String[]{"configuration_by_ttoo_add_i_atlas_co", getElements("configuration_by_ttoo_add_i_atlas_co")}, // element path
                "atlas_co", // key for data value (the name)
                " on ADD")) {
            return false;
        }

        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_atlas_office", getElements("configuration_by_ttoo_add_lov_atlas_office")},
                false, //like this selects the 1º record
                where)){
            return false;
        }Functions.break_time(driver, 250, 500);

        Functions.break_time(driver, 250, 500);

        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_destination_zone", getElements("configuration_by_ttoo_add_lov_destination_zone")},
                false, //like this selects the 1º record
                where)){
            return false;
        }
        Functions.break_time(driver, 250, 500);
        if(!Functions.lovMultiSelection(driver,
                new String[]{"configuration_by_ttoo_add_lov_hotel_category", getElements("configuration_by_ttoo_add_lov_hotel_category")},
                false, //like this selects the 1º record
                where)){
            return false;
        }
        Functions.break_time(driver, 250, 500);
*/
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"configuration_by_ttoo_add_b_save", getElements("configuration_by_ttoo_add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                30, 500,
                where)) {
            return false;
        }

        return true;
    }
}


