package screen.AT2MDMOR0011;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

import java.util.Random;

/**
 * Created by aibanez on 25/10/2016.
 */
public class AT2MDMOR0011Sis {
    protected AT2MDMOR0011Locators locators;
    protected AT2MDMOR0011Data data;
    public AT2MDMOR0011Sis() {
    }
    public AT2MDMOR0011Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0011Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0011Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0011Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data");
        driver.getTestdetails().setSubmenu("Destination");
        driver.getTestdetails().setScreen("Departments (General)");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!interaction_record_departments(driver)) return false;
        if (!search_departments(driver)) return false;
        if (!interaction_edit_departments(driver)) return false;
        if (!qbe_departments(driver)) return false;
        if (!others_actions_departments(driver)) return false;
        if (!delete_departments(driver)) return false;
        return true;
    }

    private boolean interaction_record_departments(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION";
        if (!Functions.checkExistence(driver,
                "",
                "code",//data name (x)
                new String[]{"search_i_code", getElements("search_i_code")},//input
                new String[]{"search_b_search", getElements("search_b_search")},//search button
                new String[]{"departments_e_result", getElements("departments_e_result")},//expected not found result
                "String",//type of input
                2, //value length
                where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"departments_b_add", getElements("departments_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_code",getElements("add_i_code")},
                "code", getData("code"), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_department",getElements("add_lov_department")}, // b_lov
                new String[]{"add_i_department", getElements("add_i_department")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "department", //Data name
                where)){return false;}
        if(!Functions.getValue(driver,new String[]{"add_i_department_des", getElements("add_i_department_des")}, // element path
                "department_des", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_activity",getElements("add_i_activity")},
                "activity", randomActivity(driver), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_group"),"group",true,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_excursions"),"excursions",true,true,where)){return false;}
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
    private boolean search_departments(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH";
        if (!Functions.insertInput(driver, new String[]{"search_i_code",getElements("search_i_code")},
                "code", getData("code"), where)){return false;}
        if (!Functions.createLovByValue(driver,
                new String[]{"search_lov_department", getElements("search_lov_department")}, //LoV button
                new String[]{"search_i_department", getElements("search_i_department")}, //external LoV input
                new String[]{"search_lov_department_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                getData("department"), // value to search
                "department", //name of the data
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"search_i_activity",getElements("search_i_activity")},
                "activity", getData("activity"), where)){return false;}
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_group"), "group", true, where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_internet"), "internet", false, where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_excursions"), "excursions", true, where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.checkboxValue(driver,
                getElements("search_ck_active"), "active", true, where)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"departments_e_result", getElements("departments_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_departments(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION";
        if (!Functions.checkClick(driver,
                new String[]{"departments_b_edit", getElements("departments_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_activity",getElements("add_i_activity")},
                "activity", randomActivity(driver), where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_group"),"group",false,true,where)){return false;}
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_excursions"),"excursions",false,true,where)){return false;}
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
    private boolean qbe_departments(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"departments_e_result", getElements("departments_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"departments_b_qbe", getElements("departments_b_qbe")},// query button
                new String[]{"qbe_i_code", getElements("qbe_i_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_code", getElements("qbe_i_code")},
                "code", getData("code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department", getElements("qbe_i_department")},
                "department", getData("department"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_department_des", getElements("qbe_i_department_des")},
                "department_des", getData("department_des"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_activity", getElements("qbe_i_activity")},
                "activity", getData("activity"), where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_group", getElements("qbe_sl_group")},
                getData("group"), "group", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_excursions", getElements("qbe_sl_excursions")},
                getData("excursions"),"excursions", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.selectText(driver, new String[]{"qbe_sl_active", getElements("qbe_sl_active")},
                getData("active"), "active", where)) {
            return false;
        }
        Functions.break_time(driver, 3, 400);
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_code", getElements("qbe_i_code")}, //any query input
                new String[]{"departments_e_result", getElements("departments_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_departments(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA";
        if (!Functions.auditData(driver,
                new String[]{"departments_b_actions", getElements("departments_b_actions")}, //actions button
                new String[]{"departments_b_actions_b_audit_data", getElements("departments_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH";
        if (!Functions.detachTable(driver,
                new String[]{"departments_b_detach", getElements("departments_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_departments(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"departments_b_delete", getElements("departments_b_delete")},
                new String[]{"departments_e_records", getElements("departments_e_records")},
                where)) {
            return false;
        }
        return true;
    }
    private String randomActivity (TestDriver driver) {
        String valores [] = {"TO", "MI", "GR", "HX", "BO", "CR"};
        String result = (valores[new Random().nextInt(valores.length)]);
        return result;
    }
}
