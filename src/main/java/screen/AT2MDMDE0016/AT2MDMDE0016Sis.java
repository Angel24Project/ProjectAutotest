package screen.AT2MDMDE0016;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 24/10/2016.
 */
/**
 * OVERLAP - ANTES DE EJECUTAR COMPROBAR QUE LOS REGISTROS SELECCIONADOS NO ESTAN.
 * EL CAMPO RECEPTIVE Y RECEPTIVE DESCRIPTION NO SE GUARDAN
 * EL CAMPO B2B NO TIENE REGISTROS
 */
public class AT2MDMDE0016Sis {
    protected AT2MDMDE0016Locators locators;
    protected AT2MDMDE0016Data data;
    public AT2MDMDE0016Sis() {
    }
    public AT2MDMDE0016Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMDE0016Locators locators) {
        this.locators = locators;
    }
    public AT2MDMDE0016Data getData() {
        return data;
    }
    public void setData(AT2MDMDE0016Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("B2B Tickets destinations 2.0");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_b2b(driver)) return false;
        if (!search_b2b(driver)) return false;
        if (!qbe_b2b(driver)) return false;
        if (!others_actions_b2b(driver)) return false;
        return true;
    }
    private boolean interaction_record_b2b(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkClick(driver,
                new String[]{"b2b_b_add", getElements("b2b_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver,
                new String[]{"add_sl_type",getElements("add_sl_type")},
                "Destination and Zone", "type", where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_destination", getElements("add_lov_destination")}, //LoV button
                new String[]{"add_i_destination", getElements("add_i_destination")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "destination", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_info_des", getElements("add_i_info_des")}, // element path
                "info_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_agency", getElements("add_lov_agency")}, //LoV button
                new String[]{"add_i_agency", getElements("add_i_agency")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "agency", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_info_age", getElements("add_i_info_age")}, // element path
                "info_age", // key for data value (the name)
                where)){return false;}
        if (!Functions.createLov(driver,
                new String[]{"add_lov_receptive", getElements("add_lov_receptive")}, //LoV button
                new String[]{"add_i_receptive", getElements("add_i_receptive")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "receptive", //name of the data
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_info_rec", getElements("add_i_info_rec")}, // element path
                "info_rec", // key for data value (the name)
                where)){return false;}
/*        if (!Functions.createLov(driver,
                new String[]{"add_lov_b2b", getElements("add_lov_b2b")}, //LoV button
                new String[]{"add_i_b2b", getElements("add_i_b2b")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "b2b", //name of the data
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_info_b2b", getElements("add_i_info_b2b")}, // element path
                "info_b2b", // key for data value (the name)
                where)){return false;}*/
        if (!Functions.insertInput(driver, new String[]{"add_i_zone",getElements("add_i_zone")},
                "zone", "1", where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_active"),"active",true,true,where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save", getElements("add_b_save")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean search_b2b(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.selectText(driver,
                new String[]{"search_sl_type", getElements("search_sl_type")},
                getData("type"), "type", where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_destination", getElements("search_lov_destination")}, //LoV button
                new String[]{"search_i_destination", getElements("search_i_destination")}, //external LoV input
                new String[]{"search_lov_des_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("destination"), // value to search
                "destination", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_agency", getElements("search_lov_agency")}, //LoV button
                new String[]{"search_i_agency", getElements("search_i_agency")}, //external LoV input
                new String[]{"search_lov_agency_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("agency"), // value to search
                "agency", //name of the data
                where)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_receptive", getElements("search_lov_receptive")}, //LoV button
                new String[]{"search_i_receptive", getElements("search_i_receptive")}, //external LoV input
                new String[]{"search_lov_receptive_i_code", getElements("lov_i_altgenericinput2")}, //internal LoV input
                getData("receptive"), // value to search
                "receptive", //name of the data
                where)) {
            return false;
        }
/*        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_b2b", getElements("search_lov_b2b")}, //LoV button
                new String[]{"search_i_b2b", getElements("search_i_b2b")}, //external LoV input
                new String[]{"search_lov_b2b_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("b2b"), // value to search
                "b2b", //name of the data
                where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"search_i_zone",getElements("search_i_zone")},
                "zone", getData("zone"), where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"), getData("search_ck_active"), true, where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_b2b(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"b2b_b_qbe", getElements("b2b_b_qbe")},// query button
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_type",getElements("qbe_sl_type")},
                getData("type"), "type", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination", getElements("qbe_i_destination")},
                "destination", getData("destination"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_info_des", getElements("qbe_i_info_des")},
                "info_des", getData("info_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_agency", getElements("qbe_i_agency")},
                "agency", getData("agency"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_info_age", getElements("qbe_i_info_age")},
                "info_age", getData("info_age"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_receptive", getElements("qbe_i_receptive")},
                "receptive", getData("receptive"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_info_rec", getElements("qbe_i_info_rec")},
                "info_rec", getData("info_rec"), where)) {
            return false;
        }
        /*if (!Functions.insertInput(driver, new String[]{"qbe_i_b2b", getElements("qbe_i_b2b")},
                "b2b", getData("b2b"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_info_b2b", getElements("qbe_i_info_b2b")},
                "info_b2b", getData("info_b2b"), where)) {
            return false;
        }*/
        if (!Functions.insertInput(driver, new String[]{"qbe_i_zone", getElements("qbe_i_zone")},
                "zone", getData("zone"), where)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"qbe_sl_active",getElements("qbe_sl_active")},
                getData("active"), "type", where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_destination", getElements("qbe_i_destination")}, //any query input
                new String[]{"b2b_e_result", getElements("b2b_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_b2b(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"b2b_b_actions", getElements("b2b_b_actions")}, //actions button
                new String[]{"b2b_b_actions_b_audit_data", getElements("b2b_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"b2b_b_detach", getElements("b2b_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
}
