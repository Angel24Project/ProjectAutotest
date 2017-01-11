package screen.AT2BOOSA1002;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * @author acarrillo on 18/05/2016.
 * @author avirgili on 01/12/2016.
 */
@SuppressWarnings("all")
class AT2BOOSA1002Test {
    protected AT2BOOSA1002Locators locators;
    protected AT2BOOSA1002Data data;

    public AT2BOOSA1002Test(String enviroment) {
        setLocators(new AT2BOOSA1002Locators(enviroment));
        setData(new AT2BOOSA1002Data(enviroment));
    }

    public AT2BOOSA1002Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2BOOSA1002Locators locators) {
        this.locators = locators;
    }

    public AT2BOOSA1002Data getData() {
        return data;
    }

    public void setData(AT2BOOSA1002Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("BOOKINGS");
        driver.getTestdetails().setSubmenu("SALE");
        driver.getTestdetails().setScreen("Bookings Maintenance 2.0");
    }

    protected String getElements(String key) {
        return this.locators.getElements().get(key);
    }

    public void putData(String key, String value) {
        data.getData().put(key, value);
        System.out.println("The value is save in " + key + " (" + value + ")");
    }

    protected String getData(String key) {
        return this.data.getData().get(key);
    }

    protected boolean testCSED(TestDriver driver) {
        if (!create_header(driver)) {
            return false;
        }
        if (!header_actions(driver)) {
            return false;
        }
        if (!header_consult(driver)) {
            return false;
        }
        if (!hotel(driver)) {
            return false;
        }
        //ToDo a partir de aqui
        if (!transfers(driver)) {
            return false;
        }
        if (!activities(driver)) {
            return false;
        }
        if (!extra(driver)) {
            return false;
        }
        if (!fees(driver)) {
            return false;
        }
        return true;
    }

    //<editor-fold desc="Fees CSED">
    private boolean fees(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"fees_tab_tab", getElements("fees_tab_tab")}, //element to click
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs
        if (!create_fees(driver)) {
            return false;
        }
        //TODO EDITION
        if (!query_fees(driver)) {
            return false;
        }
        if (!actions_fees(driver)) {
            return false;
        }
//TODO OTHER TABLES (?)
        return true;
    }

    private boolean actions_fees(TestDriver driver) {
        if (fees_audit(driver)) {
            return true;
        }
        return false;
    }

    private boolean fees_audit(TestDriver driver) {


        if (!Functions.auditData(driver,
                new String[]{"fees_b_actions", getElements("fees_b_actions")}, //actions button
                new String[]{"fees_b_actions_b_audit", getElements("fees_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on BOOSA1002 Fees")) {
            return false;
        }

        return true;
    }

    private boolean query_fees(TestDriver driver) {

        if (!Functions.clickQbE(driver,
                new String[]{"fees_b_query", getElements("fees_b_query")},// query button
                new String[]{"fees_b_query_i_startdate", getElements("fees_b_query_i_startdate")},//any query input
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_startdate", getElements("fees_b_query_i_startdate")},
                "fees_startdate", getData("fees_startdate"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_fees", getElements("extra_b_add_i_fees")},
                "extra_fees", getData("extra_fees"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_supplier", getElements("fees_b_query_i_supplier")},
                "fees_supplier", getData("fees_supplier"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_units", getElements("fees_b_query_i_units")},
                "fees_units", getData("fees_units"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_adults", getElements("fees_b_query_i_adults")},
                "fees_adults", getData("fees_adults"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_childs", getElements("fees_b_query_i_childs")},
                "fees_childs", getData("fees_childs"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"fees_b_query_i_pax", getElements("fees_b_query_i_pax")},
                getData("fees_pax"), "fees_pax", " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.selectText(driver, new String[]{"fees_b_query_i_type", getElements("fees_b_query_i_type")},
                getData("fees_type"), "fees_type", " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_costperunit", getElements("fees_b_query_i_costperunit")},
                "fees_costperunit", getData("fees_costperunit"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_currency", getElements("fees_b_query_i_currency")},
                "fees_currency", getData("fees_currency"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_saleperunit", getElements("fees_b_query_i_saleperunit")},
                "fees_saleperunit", getData("fees_saleperunit"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_officeproduct", getElements("fees_b_query_i_officeproduct")},
                "fees_officeproduct", getData("fees_officeproduct"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_query_i_product", getElements("fees_b_query_i_product")},
                "fees_product", getData("fees_product"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"fees_b_query_i_product", getElements("fees_b_query_i_product")}, //element to click
                new String[]{"fees_e_result", getElements("fees_e_result")}, //element to click
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        return true;

    }

    private boolean create_fees(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"fees_b_add", getElements("fees_b_add")}, //element to click
                recursiveXPaths.glass, //element to click
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_startdate", getElements("fees_b_add_i_startdate")},
                "fees_startdate", getData("fees_startdate"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_fees", getElements("extra_b_add_lov_fees")}, // b_lov
                new String[]{"extra_b_add_i_fees", getElements("extra_b_add_i_fees")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_fees", //Data name
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.createLov(driver,
                new String[]{"fees_b_add_lov_supplier", getElements("fees_b_add_lov_supplier")}, // b_lov
                new String[]{"fees_b_add_i_supplier", getElements("fees_b_add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fees_supplier", //Data name
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_units", getElements("fees_b_add_i_units")},
                "fees_units", getData("fees_units"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_adults", getElements("fees_b_add_i_adults")},
                "fees_adults", getData("fees_adults"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_childs", getElements("fees_b_add_i_childs")},
                "fees_childs", getData("fees_childs"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"fees_b_add_i_pax", getElements("fees_b_add_i_pax")},
                "Person",
                "fees_pax",
                " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"fees_b_add_i_type", getElements("fees_b_add_i_type")},
                "Person", "fees_type", " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_costperunit", getElements("fees_b_add_i_costperunit")},
                "fees_costperunit", getData("fees_costperunit"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"fees_b_add_lov_currency", getElements("fees_b_add_lov_currency")}, // b_lov
                new String[]{"fees_b_add_i_currency", getElements("fees_b_add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fees_currency", //Data name
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"fees_b_add_i_saleperunit", getElements("fees_b_add_i_saleperunit")},
                "fees_saleperunit", getData("fees_saleperunit"), " on BOOSA1002 Fees")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"fees_b_add_lov_officeproduct", getElements("fees_b_add_lov_officeproduct")}, // b_lov
                new String[]{"fees_b_add_i_officeproduct", getElements("fees_b_add_i_officeproduct")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fees_officeproduct", //Data name
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.createLov(driver,
                new String[]{"fees_b_add_lov_product", getElements("fees_b_add_lov_product")}, // b_lov
                new String[]{"fees_b_add_i_product", getElements("fees_b_add_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "fees_product", //Data name
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"fees_b_add_b_save", getElements("fees_b_add_b_save")}, //element to click
                recursiveXPaths.glass, //element to click
                " on BOOSA1002 Fees")) {
            return false;
        } // where the operation occurs

        return true;
    }

    //</editor-fold>
    // <editor-fold desc="Extra CSED">
    private boolean extra(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"activities_tab_tab", getElements("activities_tab_tab")}, //element to click
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs
        if (!create_extra(driver)) {
            return false;
        }
        //TODO EDITION
        if (!query_extra(driver)) {
            return false;
        }
        if (!actions_extra(driver)) {
            return false;
        }
//TODO OTHER TABLES (?)
        return true;
    }

    private boolean actions_extra(TestDriver driver) {
        if (!extra_audit(driver)) {
            return false;
        }
        //TODO FIXINFO ETC
        return true;
    }

    private boolean extra_audit(TestDriver driver) {

        if (!Functions.auditData(driver,
                new String[]{"extra_b_actions", getElements("extra_b_actions")}, //actions button
                new String[]{"extra_b_actions_b_audit", getElements("extra_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                "where")) {
            return false;
        }

        return true;
    }

    private boolean query_extra(TestDriver driver) {

        if (!Functions.clickQbE(driver,
                new String[]{"extra_b_query", getElements("extra_b_query")},// query button
                new String[]{"extra_b_query_i_startdate", getElements("extra_b_query_i_startdate")},//any query input
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_startdate", getElements("extra_b_query_i_startdate")},
                "extra_startdate", getData("extra_startdate"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_extra", getElements("extra_b_add_i_extra")},
                "extra_extra", getData("extra_extra"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_supplier", getElements("extra_b_query_i_supplier")},
                "extra_supplier", getData("extra_supplier"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_units", getElements("extra_b_query_i_units")},
                "extra_units", getData("extra_units"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_adults", getElements("extra_b_query_i_adults")},
                "extra_adults", getData("extra_adults"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_childs", getElements("extra_b_query_i_childs")},
                "extra_childs", getData("extra_childs"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"extra_b_query_i_pax", getElements("extra_b_query_i_pax")},
                getData("extra_pax"), "extra_pax", " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.selectText(driver, new String[]{"extra_b_query_i_type", getElements("extra_b_query_i_type")},
                getData("extra_type"), "extra_type", " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_costperunit", getElements("extra_b_query_i_costperunit")},
                "extra_costperunit", getData("extra_costperunit"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_currency", getElements("extra_b_query_i_currency")},
                "extra_currency", getData("extra_currency"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_saleperunit", getElements("extra_b_query_i_saleperunit")},
                "extra_saleperunit", getData("extra_saleperunit"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_officeproduct", getElements("extra_b_query_i_officeproduct")},
                "extra_officeproduct", getData("extra_officeproduct"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_query_i_product", getElements("extra_b_query_i_product")},
                "extra_product", getData("extra_product"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"extra_b_query_i_product", getElements("extra_b_query_i_product")}, //element to click
                new String[]{"extra_e_result", getElements("extra_e_result")}, //element to click
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        return true;
    }

    private boolean create_extra(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"extra_b_add", getElements("extra_b_add")}, //element to click
                recursiveXPaths.glass, //element to click
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_startdate", getElements("extra_b_add_i_startdate")},
                "extra_startdate", getData("extra_startdate"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_extra", getElements("extra_b_add_lov_extra")}, // b_lov
                new String[]{"extra_b_add_i_extra", getElements("extra_b_add_i_extra")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_extra", //Data name
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_supplier", getElements("extra_b_add_lov_supplier")}, // b_lov
                new String[]{"extra_b_add_i_supplier", getElements("extra_b_add_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_supplier", //Data name
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_units", getElements("extra_b_add_i_units")},
                "extra_units", getData("extra_units"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_adults", getElements("extra_b_add_i_adults")},
                "extra_adults", getData("extra_adults"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_childs", getElements("extra_b_add_i_childs")},
                "extra_childs", getData("extra_childs"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"extra_b_add_i_pax", getElements("extra_b_add_i_pax")},
                "Person",
                "extra_pax",
                " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"extra_b_add_i_type", getElements("extra_b_add_i_type")},
                "Person", "extra_type", " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_costperunit", getElements("extra_b_add_i_costperunit")},
                "extra_costperunit", getData("extra_costperunit"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_currency", getElements("extra_b_add_lov_currency")}, // b_lov
                new String[]{"extra_b_add_i_currency", getElements("extra_b_add_i_currency")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_currency", //Data name
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"extra_b_add_i_saleperunit", getElements("extra_b_add_i_saleperunit")},
                "extra_saleperunit", getData("extra_saleperunit"), " on BOOSA1002 Extra")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_officeproduct", getElements("extra_b_add_lov_officeproduct")}, // b_lov
                new String[]{"extra_b_add_i_officeproduct", getElements("extra_b_add_i_officeproduct")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_officeproduct", //Data name
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.createLov(driver,
                new String[]{"extra_b_add_lov_product", getElements("extra_b_add_lov_product")}, // b_lov
                new String[]{"extra_b_add_i_product", getElements("extra_b_add_i_product")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "extra_product", //Data name
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"extra_b_add_b_save", getElements("extra_b_add_b_save")}, //element to click
                recursiveXPaths.glass, //element to click
                " on BOOSA1002 Extra")) {
            return false;
        } // where the operation occurs

        return true;
    }

    //</editor-fold">
    //<editor-fold desc="Activities CSED">
    private boolean activities(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"activities_tab_tab", getElements("activities_tab_tab")}, //element to click
                " on BOOSA1002 Activities")) {
            return false;
        } // where the operation occurs
        if (!create_activites(driver)) {
            return false;
        }
        //TODO EDITION
        if (!query_activites(driver)) {
            return false;
        }
        if (!actions_activites(driver)) {
            return false;
        }
//TODO OTHER TABLES (?)


        return true;
    }

    private boolean actions_activites(TestDriver driver) {
        if (!actions_audit(driver)) {
            return false;
        }
        //TODO OTHER ACTIONS
        return true;
    }

    private boolean actions_audit(TestDriver driver) {

        if (!Functions.auditData(driver,
                new String[]{"activities_b_actions", getElements("activities_b_actions")}, //actions button
                new String[]{"activities_b_actions_b_audit", getElements("activities_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok", recursiveXPaths.audit_b_ok}, //audit_b_ok
                " on BOOSA1002 Transfer")) {
            return false;
        }

        return true;
    }

    private boolean query_activites(TestDriver driver) {

        if (!Functions.clickQbE(driver,
                new String[]{"activities_b_query", getElements("activities_b_query")}, //element to click
                new String[]{"activities_b_query_i_service", getElements("activities_b_query_i_service")}, //element expected to appear
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_startdate", getElements("activities_b_query_i_startdate")},
                "activities_startdate", getData("activities_startdate"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_enddate", getElements("activities_b_query_i_enddate")},
                "activities_enddate", getData("activities_enddate"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_service", getElements("activities_b_query_i_service")},
                "activities_service", getData("activities_service"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_modality", getElements("activities_b_query_i_modality")},
                "activities_modality", getData("activities_modality"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_contract", getElements("activities_b_query_i_contract")},
                "activities_contract", getData("activities_contract"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_supplier", getElements("activities_b_query_i_supplier")},
                "activities_supplier", getData("activities_supplier"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_origin", getElements("activities_b_query_i_origin")},
                "activities_origin", getData("activities_origin"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_destination", getElements("activities_b_query_i_destination")},
                "activities_destination", getData("activities_destination"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_adults", getElements("activities_b_query_i_adults")},
                "activities_adults", getData("activities_adults"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_query_i_children", getElements("activities_b_query_i_children")},
                "activities_children", getData("activities_children"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"activities_b_query_i_children", getElements("activities_b_query_i_children")}, //any query input
                new String[]{"activities_e_result", getElements("activities_e_result")}, //table result
                "where")) {
            return false;
        } // where this operation occurs

        return true;
    }

    private boolean create_activites(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"activities_b_add", getElements("activities_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.selectText(driver,
                new String[]{"activities_b_add_select_activity", getElements("activities_b_add_select_activity")},
                "Car hire",
                "activities_activity",
                " on BOOSA1002 Activities")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_startdate", getElements("activities_b_add_select_i_startdate")},
                "activities_startdate", getData("activities_startdate"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_enddate", getElements("activities_b_add_select_i_enddate")},
                "activities_enddate", getData("activities_enddate"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_service", getElements("activities_b_add_select_lov_service")}, // b_lov
                new String[]{"activities_b_add_select_i_service", getElements("activities_b_add_select_i_service")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_service", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_modality", getElements("activities_b_add_select_lov_modality")}, // b_lov
                new String[]{"activities_b_add_select_i_modality", getElements("activities_b_add_select_i_modality")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_modality", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_contract", getElements("activities_b_add_select_lov_contract")}, // b_lov
                new String[]{"activities_b_add_select_i_contract", getElements("activities_b_add_select_i_contract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_contract", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_supplier", getElements("activities_b_add_select_lov_supplier")}, // b_lov
                new String[]{"activities_b_add_select_i_supplier", getElements("activities_b_add_select_i_supplier")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_supplier", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_origin", getElements("activities_b_add_select_lov_origin")}, // b_lov
                new String[]{"activities_b_add_select_i_origin", getElements("activities_b_add_select_i_origin")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_origin", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.createLov(driver,
                new String[]{"activities_b_add_select_lov_destination", getElements("activities_b_add_select_lov_destination")}, // b_lov
                new String[]{"activities_b_add_select_i_destination", getElements("activities_b_add_select_i_destination")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "activities_destination", //Data name
                " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_adults", getElements("activities_b_add_select_i_adults")},
                "activities_adults", getData("activities_adults"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"activities_b_add_select_i_children", getElements("activities_b_add_select_i_children")},
                "activities_children", getData("activities_children"), " on BOOSA1002 Activities")) {
            return false;
        }

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"activities_b_add_select_b_save", getElements("activities_b_add_select_b_save")},// query button
                recursiveXPaths.glass,//any query input
                " on BOOSA1002 Activities")) {
            return false;
        } // where the operation occurs

        return true;
    }

    //</editor-fold>
    //<editor-fold desc="Transfers CSED">
    private boolean transfers(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_tab_tab", getElements("transfer_tab_tab")}, //element to click
                " on BOOSA1002 Transfer")) {
            return false;
        } // where the operation occurs
        if (!create_transfer_flight(driver)) {
            return false;
        }
        if (!create_transfer(driver)) {
            return false;
        }
        if (!query_transfer(driver)) {
            return false;
        }
        if (!actions_transfer(driver)) {
            return false;
        }
        //edit
        //TODO


        return true;
    }

    private boolean actions_transfer(TestDriver driver) {
        return true;
    }

    private boolean query_transfer(TestDriver driver) {

        if (!Functions.clickQbE(driver,
                new String[]{"transfer_b_query", getElements("transfer_b_query")},// query button
                new String[]{"transfer_b_query_i_date", getElements("transfer_b_query_i_date")},//any query input
                " on BOOSA1002 Transfer")) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_date", getElements("transfer_b_query_i_date")},
                "transfer_date", getData("transfer_date"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_fromzone", getElements("transfer_b_query_i_fromzone")},
                "transfer_fromzone", getData("transfer_fromzone"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_hotel", getElements("transfer_b_query_i_hotel")},
                "transfer_hotel", getData("transfer_hotel"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_tozone", getElements("transfer_b_query_i_tozone")},
                "transfer_tozone", getData("transfer_tozone"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_tohotel", getElements("transfer_b_query_i_tohotel")},
                "transfer_tohotel", getData("transfer_tohotel"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_salecontract", getElements("transfer_b_query_i_salecontract")},
                "transfer_salecontract", getData("transfer_salecontract"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_purchasecontract", getElements("transfer_b_query_i_purchasecontract")},
                "transfer_purchasecontract", getData("transfer_purchasecontract"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_mastertype", getElements("transfer_b_query_i_mastertype")},
                "transfer_mastertype", getData("transfer_mastertype"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_vehicletype", getElements("transfer_b_query_i_vehicletype")},
                "transfer_vehicletype", getData("transfer_vehicletype"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_flight", getElements("transfer_b_query_i_flight")},
                "transfer_flight", getData("transfer_flight"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_flighthour", getElements("transfer_b_query_i_flighthour")},
                "transfer_flighthour", getData("transfer_flighthour"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_depart", getElements("transfer_b_query_i_depart")},
                "transfer_depart", getData("transfer_depart"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_arrival", getElements("transfer_b_query_i_arrival")},
                "transfer_arrival", getData("transfer_arrival"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_pickupdate", getElements("transfer_b_query_i_pickupdate")},
                "transfer_pickupdate", getData("transfer_pickupdate"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_pickupoint", getElements("transfer_b_query_i_pickupoint")},
                "transfer_pickupoint", getData("transfer_pickupoint"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_ticketn", getElements("transfer_b_query_i_ticketn")},
                "transfer_ticketn", getData("transfer_ticketn"), " on BOOSA1002 Hotel")) {
            return false;
        }

        if (!Functions.insertInput(driver, new String[]{"transfer_b_query_i_ref", getElements("transfer_b_query_i_ref")},
                "transfer_ref", getData("transfer_ref"), " on BOOSA1002 Hotel")) {
            return false;
        }


        return true;
    }

    private boolean create_transfer_flight(TestDriver driver) {
        String on = " on BOOSA1002 Transfer -> Creation 1º";
        if (!Functions.checkClick(driver,
                new String[]{"transfer_b_add", getElements("transfer_b_add")}, //element to click
                new String[]{"transfer_e_result", getElements("transfer_e_result")}, //element expected to appear
                on)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_date", getElements("transfer_e_result_i_date")},
                "transfer_date", getData("transfer_date"), on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_e_result_lov_fromzone", getElements("transfer_e_result_lov_fromzone")}, // b_lov
                new String[]{"transfer_e_result_i_fromzone", getElements("transfer_e_result_i_fromzone")}, // i_lov
                new String[]{"transfer_e_result_lov_fromzone_i_code", getElements("transfer_e_result_lov_fromzone_i_code")}, // lov_i
                recursiveXPaths.lov_e_result, // lov result
                getData("from_zone"), //lov b ok
                "transfer_fromzone", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_e_result_lov_tozone", getElements("transfer_e_result_lov_tozone")}, // b_lov
                new String[]{"transfer_e_result_i_tozone", getElements("transfer_e_result_i_tozone")}, // i_lov
                new String[]{"transfer_e_result_lov_tozone_i_code", getElements("transfer_e_result_lov_tozone_i_code")}, // lov_i
                recursiveXPaths.lov_e_result, // lov result
                getData("to_zone"), //lov b ok
                "transfer_tozone", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_tohotel", getElements("transfer_e_result_lov_tohotel")}, // b_lov
                new String[]{"transfer_e_result_i_tohotel", getElements("transfer_e_result_i_tohotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_tohotel", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_salecontract", getElements("transfer_e_result_lov_salecontract")}, // b_lov
                new String[]{"transfer_e_result_i_salecontract", getElements("transfer_e_result_i_salecontract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_salecontract", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_purchasecontract", getElements("transfer_e_result_lov_purchasecontract")}, // b_lov
                new String[]{"transfer_e_result_i_purchasecontract", getElements("transfer_e_result_i_purchasecontract")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_purchasecontract", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_vehicle", getElements("transfer_e_result_lov_vehicle")}, // b_lov
                new String[]{"transfer_e_result_i_vehicle", getElements("transfer_e_result_i_vehicle")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_vehicle", //Data name
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"transfer_e_result_lov_flight", getElements("transfer_e_result_lov_flight")},
                recursiveXPaths.glass,
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight", getElements("transfer_e_result_lov_flight_b_create_flight")},
                new String[]{"transfer_e_result_lov_flight_b_create_flight_i_flight_name", getElements("transfer_e_result_lov_flight_b_create_flight_i_flight_name")},
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_i_flight_name", getElements("transfer_e_result_lov_flight_b_create_flight_i_flight_name")},
                "transfer_flight_name",
                DataGenerator.getRandomAlphanumericSequence(5, true),
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_lov_arrival", getElements("transfer_e_result_lov_flight_b_create_flight_lov_arrival")}, // b_lov
                new String[]{"transfer_e_result_lov_flight_b_create_flight_i_arrival", getElements("transfer_e_result_lov_flight_b_create_flight_i_arrival")}, // i_lov
                new String[]{"transfer_e_result_lov_flight_b_create_flight_lov_arrival_i_description", getElements("transfer_e_result_lov_flight_b_create_flight_lov_arrival_i_description")}, // lov_i
                recursiveXPaths.lov_e_result, // lov result
                "PALMA DE MALLORCA", //lov b ok
                "transfer_flight_arrival", //Data name
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_i_hour", getElements("transfer_e_result_lov_flight_b_create_flight_i_hour")},
                "transfer_flight_hour",
                "12:45",
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_b_acept", getElements("transfer_e_result_lov_flight_b_create_flight_b_acept")},
                new String[]{"transfer_e_result_lov_flight_b_create_flight_i_hour", getElements("transfer_e_result_lov_flight_b_create_flight_i_hour")},
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_b_acept", getElements("transfer_e_result_lov_flight_b_create_flight_b_acept")},
                new String[]{"transfer_e_result_lov_flight_b_create_flight_b_acept", getElements("transfer_e_result_lov_flight_b_create_flight_b_acept")},
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_search", getElements("transfer_e_result_lov_flight_b_search")},
                new String[]{"transfer_e_result_lov_flight_b_create_flight_e_result", getElements("transfer_e_result_lov_flight_b_create_flight_e_result")},
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_e_result", getElements("transfer_e_result_lov_flight_b_create_flight_e_result")},
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_ok", getElements("transfer_e_result_lov_flight_b_ok")},
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_b_save", getElements("transfer_b_save")}, //element to click
                on)) {
            return false;
        }
        return true;
    }

    private boolean create_transfer(TestDriver driver) {
        String on = " on BOOSA1002 Transfer -> Creation 2º";
        if (!Functions.checkClick(driver,
                new String[]{"transfer_b_add", getElements("transfer_b_add")}, //element to click
                new String[]{"transfer_e_result", getElements("transfer_e_result")}, //element expected to appear
                on)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"transfer_e_result_i_date", getElements("transfer_e_result_i_date")},
                "transfer_date2", getData("transfer_date"), on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_e_result_lov_fromzone", getElements("transfer_e_result_lov_fromzone")}, // b_lov
                new String[]{"transfer_e_result_i_fromzone", getElements("transfer_e_result_i_fromzone")}, // i_lov
                new String[]{"transfer_e_result_lov_fromzone_i_code", getElements("transfer_e_result_lov_fromzone_i_code")}, // lov_i
                recursiveXPaths.lov_e_result, // lov result
                getData("from_zone"), //lov b ok
                "transfer_fromzone2", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_fromhotel", getElements("transfer_e_result_lov_fromhotel")}, // b_lov
                new String[]{"transfer_e_result_i_fromhotel", getElements("transfer_e_result_i_fromhotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_fromhotel2", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"transfer_e_result_lov_tozone", getElements("transfer_e_result_lov_tozone")}, // b_lov
                new String[]{"transfer_e_result_i_tozone", getElements("transfer_e_result_i_tozone")}, // i_lov
                new String[]{"transfer_e_result_lov_tozone_i_code", getElements("transfer_e_result_lov_tozone_i_code")}, // lov_i
                recursiveXPaths.lov_e_result, // lov result
                getData("to_zone"), //lov b ok
                "transfer_tozone2", //Data name
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"transfer_error_b_ok", getElements("transfer_error_b_ok")},
                new String[]{"transfer_error_b_ok", getElements("transfer_error_b_ok")},
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_tohotel", getElements("transfer_e_result_lov_tohotel")}, // b_lov
                new String[]{"transfer_e_result_i_tohotel", getElements("transfer_e_result_i_tohotel")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_tohotel2", //Data name
                on)) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"transfer_e_result_lov_vehicle", getElements("transfer_e_result_lov_vehicle")}, // b_lov
                new String[]{"transfer_e_result_i_vehicle", getElements("transfer_e_result_i_vehicle")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "transfer_vehicle2", //Data name
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_e_result_i_flighthour", getElements("transfer_e_result_i_flighthour")},
                "transfer_flight_hour2",
                "01:03",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"transfer_e_result_i_ticketn", getElements("transfer_e_result_i_ticketn")},
                "transfer_flight_ticketn",
                DataGenerator.getRandomAlphanumericSequence(5, false),
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_create_flight_e_result", getElements("transfer_e_result_lov_flight_b_create_flight_e_result")},
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_e_result_lov_flight_b_ok", getElements("transfer_e_result_lov_flight_b_ok")},
                on)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"transfer_b_save", getElements("transfer_b_save")}, //element to click
                on)) {
            return false;
        }
        return true;
    }

    //</editor-fold >
    //<editor-fold desc="Hotel CSED">
    private boolean hotel(TestDriver driver) {
        Functions.zoomIn(driver);
        driver.getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.PAGE_DOWN));
        if (!create_hotel(driver)) {
            return false;
        }
        if (!query_hotel(driver)) {
            return false;
        }
        //TODO Hotel edition 05/12/2016
        if (!hotel_actions(driver)) {
            return false;
        }
        //TODO Hotel delete¿? 05/12/2016
        return true;
    }

    private boolean hotel_actions(TestDriver driver) {

        if (!hotel_actions_audit(driver)) {
            return false;
        }
        if (!hotel_actions_supplier(driver)) {
            return false;
        }
        if (!hotel_actions_fixinfo(driver)) {
            return false;
        }
        if (!service_notifications(driver)) {
            return false;
        }


        return true;
    }

    private boolean service_notifications(TestDriver driver) {
        String on = " on BOOSA1002 Hotel -> Service Notifications";
        if (!Functions.displayed(driver, getElements("hotel_b_notification"))) {
            if (!Functions.checkClick(driver,
                    new String[]{"hotel_b_arrow", getElements("hotel_b_arrow")}, //element to click
                    new String[]{"hotel_b_notification", getElements("hotel_b_notification")}, //element expected to appear
                    on)) {
                return false;
            }
        }
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_notification", getElements("hotel_b_notification")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        //<editor-fold desc="Getting values">
        //TODO No tenemos xpath porque no encuentro donde o como se crean registros
        //</editor-fold>
        // <editor-fold desc="QBE">// TODO NO datos NO QBE
        /*
        if(!Functions.clickQbE(driver,
                new String[]{"hotel_b_notification_b_qbe","hotel_b_notification_b_qbe"},
                new String[]{"hotel_b_notification_b_qbe_i_hotel_name","hotel_b_notification_b_qbe_i_hotel_name"},
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_hotel_name", getElements("hotel_b_notification_b_qbe_i_hotel_name")},
                "hotel_b_notification_b_qbe_i_hotel_name",
                getData("hotel_b_notification_b_qbe_i_hotel_name"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_supplier_name", getElements("hotel_b_notification_b_qbe_i_supplier_name")},
                "hotel_b_notification_b_qbe_i_supplier_name",
                getData("hotel_b_notification_b_qbe_i_supplier_name"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_fax", getElements("hotel_b_notification_b_qbe_i_fax")},
                "hotel_b_notification_b_qbe_i_fax",
                getData("hotel_b_notification_b_qbe_i_fax"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_mail", getElements("hotel_b_notification_b_qbe_i_mail")},
                "hotel_b_notification_b_qbe_i_mail",
                getData("hotel_b_notification_b_qbe_i_mail"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_language", getElements("hotel_b_notification_b_qbe_i_language")},
                "hotel_b_notification_b_qbe_i_language",
                getData("hotel_b_notification_b_qbe_i_language"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_view", getElements("hotel_b_notification_b_qbe_i_view")},
                "hotel_b_notification_b_qbe_i_view",
                getData("hotel_b_notification_b_qbe_i_view"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_notification_b_qbe_i_update_date", getElements("hotel_b_notification_b_qbe_i_update_date")},
                "hotel_b_notification_b_qbe_i_update_date",
                getData("hotel_b_notification_b_qbe_i_update_date"),
                on)) {
            return false;
        }
        */
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"hotel_b_notification_b_detach", getElements("hotel_b_notification_b_detach")},
                false,
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_notification_b_close", getElements("hotel_b_notification_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                on)) {
            return false;
        }
        return true;
    }

    private boolean hotel_actions_fixinfo(TestDriver driver) {
        String on = " on BOOSA1002 Hotel -> Fix info";
        if (!Functions.displayed(driver, getElements("hotel_b_fixinfo"))) {
            if (!Functions.checkClick(driver,
                    new String[]{"hotel_b_arrow", getElements("hotel_b_arrow")}, //element to click
                    new String[]{"hotel_b_fixinfo", getElements("hotel_b_fixinfo")}, //element expected to appear
                    on)) {
                return false;
            }
        }
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_fixinfo", getElements("hotel_b_fixinfo")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_telephone", getElements("hotel_b_fixinfo_i_telephone")},
                "hotel_fixinfo_phone", getData("hotel_fixinfo_phone"), on)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_email", getElements("hotel_b_fixinfo_i_email")},
                "hotel_fixinfo_mail", getData("hotel_fixinfo_mail"), on)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_fixinfo_i_comments", getElements("hotel_b_fixinfo_i_comments")},
                "hotel_fixinfo_comment", getData("hotel_fixinfo_comment"), on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_fixinfo_b_ok", getElements("hotel_b_fixinfo_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        return true;
    }

    private boolean hotel_actions_supplier(TestDriver driver) {
        String on = " on BOOSA1002 Hotel -> Supplier information";
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_actions", getElements("hotel_b_actions")},
                new String[]{"hotel_b_actions_b_supplierinfo", getElements("hotel_b_actions_b_supplierinfo")},
                on)) {
            return false;
        }
        //<editor-fold desc="Getting values">
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_hc", getElements("hotel_b_actions_b_supplierinfo_i_hc")},
                "hotel_supp_info_hc",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_i_supl_ref")},
                "hotel_supp_info_supl_ref",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_cancel_ref", getElements("hotel_b_actions_b_supplierinfo_i_cancel_ref")},
                "hotel_supp_info_cancel_ref",
                on)) {
            return false;
        }
        if (Functions.getAttr(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_ch_denied", getElements("hotel_b_actions_b_supplierinfo_ch_denied")},
                "checked",
                "hotel_supp_info_denied",
                on)) {
            putData("hotel_supp_info_denied", "Yes");
        } else {
            putData("hotel_supp_info_denied", "No");
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_den_comments", getElements("hotel_b_actions_b_supplierinfo_i_den_comments")},
                "hotel_supp_info_den_commments",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_creation_user", getElements("hotel_b_actions_b_supplierinfo_i_creation_user")},
                "hotel_supp_info_creation_user",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_creation_date", getElements("hotel_b_actions_b_supplierinfo_i_creation_date")},
                "hotel_supp_info_creation_date",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_mod_user", getElements("hotel_b_actions_b_supplierinfo_i_mod_user")},
                "hotel_supp_info_mod_user",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_i_mod_date", getElements("hotel_b_actions_b_supplierinfo_i_mod_date")},
                "hotel_supp_info_mod_date",
                on)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="First QBE">
        if (!Functions.clickQbE(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe", getElements("hotel_b_actions_b_supplierinfo_b_qbe")},
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_hc", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_hc")},
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_hc", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_hc")},
                "hotel_supp_info_hc",
                getData("hotel_supp_info_hc"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_supl_ref")},
                "hotel_supp_info_supl_ref",
                getData("hotel_supp_info_supl_ref"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_cancel_ref", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_cancel_ref")},
                "hotel_supp_info_cancel_ref",
                getData("hotel_supp_info_cancel_ref"),
                on)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_sl_denied", getElements("hotel_b_actions_b_supplierinfo_b_qbe_sl_denied")},
                "hotel_supp_info_denied",
                getData("hotel_supp_info_denied"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_den_comments", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_den_comments")},
                "hotel_supp_info_den_commments",
                getData("hotel_supp_info_den_commments"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_creation_user", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_user")},
                "hotel_supp_info_creation_user",
                getData("hotel_supp_info_creation_user"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_creation_date", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_date")},
                "hotel_supp_info_creation_date",
                getData("hotel_supp_info_creation_date"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_mod_user", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_user")},
                "hotel_supp_info_mod_user",
                getData("hotel_supp_info_mod_user"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_mod_date", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_date")},
                "hotel_supp_info_mod_date",
                getData("hotel_supp_info_mod_date"),
                on)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="Edit">
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit", getElements("hotel_b_actions_b_supplierinfo_b_edit")},
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref")},
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref")},
                "hotel_supp_info_supl_ref",
                DataGenerator.getRandomAlphanumericSequence(5, true),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_i_cancel_ref", getElements("hotel_b_actions_b_supplierinfo_b_edit_i_cancel_ref")},
                "hotel_supp_info_cancel_ref",
                DataGenerator.getRandomAlphanumericSequence(5, true),
                on)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("hotel_b_actions_b_supplierinfo_b_edit_i_denied"),
                "hotel_supp_info_denied",
                false,
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_i_den_comments", getElements("hotel_b_actions_b_supplierinfo_b_edit_i_den_comments")},
                "hotel_supp_info_den_commments",
                DataGenerator.getRandomAlphanumericSequence(15, true),
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_b_save", getElements("hotel_b_actions_b_supplierinfo_b_edit_b_save")},
                new String[]{"hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref")},
                on)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="Second QBE">
        if (!Functions.clickQbE(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe", getElements("hotel_b_actions_b_supplierinfo_b_qbe")},
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_hc", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_hc")},
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_hc", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_hc")},
                "hotel_supp_info_hc",
                getData("hotel_supp_info_hc"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_supl_ref")},
                "hotel_supp_info_supl_ref",
                getData("hotel_supp_info_supl_ref"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_cancel_ref", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_cancel_ref")},
                "hotel_supp_info_cancel_ref",
                getData("hotel_supp_info_cancel_ref"),
                on)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_sl_denied", getElements("hotel_b_actions_b_supplierinfo_b_qbe_sl_denied")},
                "hotel_supp_info_denied",
                getData("hotel_supp_info_denied"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_den_comments", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_den_comments")},
                "hotel_supp_info_den_commments",
                getData("hotel_supp_info_den_commments"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_creation_user", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_user")},
                "hotel_supp_info_creation_user",
                getData("hotel_supp_info_creation_user"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_creation_date", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_date")},
                "hotel_supp_info_creation_date",
                getData("hotel_supp_info_creation_date"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_mod_user", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_user")},
                "hotel_supp_info_mod_user",
                getData("hotel_supp_info_mod_user"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_qbe_i_mod_date", getElements("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_date")},
                "hotel_supp_info_mod_date",
                getData("hotel_supp_info_mod_date"),
                on)) {
            return false;
        }
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_detach", getElements("hotel_b_actions_b_supplierinfo_b_detach")},
                false,
                on)) {
            return false;
        }
        //<editor-fold desc="History QBE"> TODO Get some record to test
        /*
        if(!Functions.clickQbE(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe",getElements("hotel_b_actions_b_supplierinfo_history_b_qbe")},
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord",getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord")},
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_supl_ref", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_supl_ref")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_i_supl_ref",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_i_supl_ref"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_cancel_ref", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_cancel_ref")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_i_cancel_ref",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_i_cancel_ref"),
                on)) {
            return false;
        }
        if (!Functions.selectText(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_sl_denied", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_sl_denied")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_sl_denied",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_sl_denied"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_den_comments", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_den_comments")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_i_den_comments",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_i_den_comments"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_qbe_i_mod_user", getElements("hotel_b_actions_b_supplierinfo_history_b_qbe_i_mod_user")},
                "hotel_b_actions_b_supplierinfo_history_b_qbe_i_mod_user",
                getData("hotel_b_actions_b_supplierinfo_history_b_qbe_i_mod_user"),
                on)) {
            return false;
        }
        */
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_history_b_detach", getElements("hotel_b_actions_b_supplierinfo_history_b_detach")},
                false,
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_actions_b_supplierinfo_b_ok", getElements("hotel_b_actions_b_supplierinfo_b_ok")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                on)) {
            return false;
        }
        return true;
    }

    private boolean hotel_actions_audit(TestDriver driver) {

        if (!Functions.auditData(driver,
                new String[]{"hotel_b_actions", getElements("hotel_b_actions")}, //actions button
                new String[]{"hotel_b_actions_b_audit", getElements("hotel_b_actions_b_audit")}, //audit button
                new String[]{"audit_b_ok", getElements("hotel_b_actions_b_audit_b_ok")}, //audit_b_ok
                " on BOOSA1002 Hotel")) {
            return false;
        } // where the operation occurs

        return true;
    }

    private boolean query_hotel(TestDriver driver) {

        if (!Functions.clickQbE(driver,
                new String[]{"hotel_b_query", getElements("hotel_b_query")},// query button
                new String[]{"hotel_b_query_i_startdate", getElements("hotel_b_query_i_startdate")},//any query input
                " on BOOSA1002 Hotel")) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_startdate", getElements("hotel_b_query_i_startdate")},
                "hotel_startdate", getData("hotel_startdate"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_night", getElements("hotel_b_query_i_night")},
                "hotel_night", getData("hotel_night"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_hotel", getElements("hotel_b_query_i_hotel")},
                "hotel_hotel", getData("hotel_hotel"), " on BOOSA1002 Hotel")) {
            return false;
        }
        //contract
        //uni
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_uni", getElements("hotel_b_query_i_uni")},
                "hotel_uni", getData("hotel_uni"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_room", getElements("hotel_b_query_i_room")},
                "hotel_room", getData("hotel_room"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_char", getElements("hotel_b_query_i_char")},
                "hotel_char", getData("hotel_char"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_board", getElements("hotel_b_query_i_board")},
                "hotel_board", getData("hotel_board"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_adult", getElements("hotel_b_query_i_adult")},
                "hotel_adult", getData("hotel_adult"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_child", getElements("hotel_b_query_i_child")},
                "hotel_child", getData("hotel_child"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_infant", getElements("hotel_b_query_i_infant")},
                "hotel_infant", getData("hotel_infant"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_prod", getElements("hotel_b_query_i_prod")},
                "hotel_prod", getData("hotel_prod"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_b_query_i_prod_ofi", getElements("hotel_b_query_i_prod_ofi")},
                "hotel_prod_ofi", getData("hotel_prod_ofi"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"hotel_b_query_i_prod_ofi", getElements("hotel_b_query_i_prod_ofi")}, //any query input
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //table result
                "where")) {
            return false;
        }
        return true;
    }

    private boolean create_hotel(TestDriver driver) {
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_add", getElements("hotel_b_add")}, //element to click
                new String[]{"hotel_e_result", getElements("hotel_e_result")}, //element expected to appear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"hotel_e_result_i_startdate", getElements("hotel_e_result_i_startdate")},
                "hotel_startdate", getData("hotel_startdate"), " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"hotel_e_result_i_night", getElements("hotel_e_result_i_night")},
                "hotel_night", getData("hotel_night"), " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"hotel_e_result_lov_hotel", getElements("hotel_e_result_lov_hotel")}, //LoV button
                new String[]{"hotel_e_result_i_hotel", getElements("hotel_e_result_i_hotel")}, //external LoV input
                new String[]{"lovinput", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("hotel_name"), // value to search
                "hotel_name", //name of the data
                " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"hotel_e_result_b_contract", getElements("hotel_e_result_b_contract")}, //element to click
                recursiveXPaths.glass,//element expected to appear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.simpleClick(driver,
                new String[]{"hotel_e_result_b_contract_e_result", getElements("hotel_e_result_b_contract_e_result")},
                " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.getText(driver,
                new String[]{"hotel_e_result_b_contract_e_result_e_hotel", getElements("hotel_e_result_b_contract_e_result_e_hotel")},
                "hotel_in_contract",
                " on BOOSA1002 Hotel")) {
            return false;
        }
        Functions.break_time(driver, 30, 500);
        String[] xpathClick;
        boolean contract = false;
        if (getData("hotel_in_contract") != null && !getData("hotel_in_contract").isEmpty()) {
            xpathClick = new String[]{"hotel_e_result_b_contract_b_book", getElements("hotel_e_result_b_contract_b_book")};
            contract = true;
        } else {
            xpathClick = new String[]{"hotel_e_result_b_contract_b_exit", getElements("hotel_e_result_b_contract_b_exit")};
        }
        if (!Functions.checkClick(driver,
                xpathClick, //element to click
                new String[]{"hotel_e_result_b_contract_b_book_b_ok", getElements("hotel_e_result_b_contract_b_book_b_ok")},//element expected to appear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        if (contract) {
            if (!Functions.simpleClick(driver,
                    new String[]{"hotel_e_result_b_contract_b_book_e_regim", getElements("hotel_e_result_b_contract_b_book_e_regim")},
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"hotel_e_result_b_contract_b_book_b_ok", getElements("hotel_e_result_b_contract_b_book_b_ok")}, //element to click
                    new String[]{"hotel_e_result_b_contract_b_book_b_ok", getElements("hotel_e_result_b_contract_b_book_b_ok")},//element expected to appear
                    " on BOOSA1002 Hotel")) {
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.insertInput(driver, new String[]{"hotel_e_result_i_uni", getElements("hotel_e_result_i_uni")},
                "hotel_uni", getData("hotel_uni"), " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!contract) {
            Functions.break_time(driver, 30, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"hotel_e_result_lov_room", getElements("hotel_e_result_lov_room")}, //element to click
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"hotel_e_result_lov_room", getElements("hotel_e_result_lov_room")}, //LoV button
                    new String[]{"hotel_e_result_i_room", getElements("hotel_e_result_i_room")}, //external LoV input
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_result, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "room_name", //name of the data
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            Functions.break_time(driver, 30, 500);
            if (!Functions.createLov(driver,
                    new String[]{"hotel_e_result_lov_char", getElements("hotel_e_result_lov_char")}, //LoV button
                    new String[]{"hotel_e_result_i_char", getElements("hotel_e_result_i_char")}, //external LoV input
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_result, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "char_name", //name of the data
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            Functions.break_time(driver, 30, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"hotel_e_result_lov_board", getElements("hotel_e_result_lov_board")}, //element to click
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            if (!Functions.createLov(driver,
                    new String[]{"hotel_e_result_lov_board", getElements("hotel_e_result_lov_board")}, //LoV button
                    new String[]{"hotel_e_result_i_board", getElements("hotel_e_result_i_board")}, //external LoV input
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_result, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "board_name", //name of the data
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            Functions.break_time(driver, 30, 500);
            if (!Functions.navigateTable(driver,
                    new String[]{"hotel_e_scroller", getElements("hotel_e_scroller")}, //scroller xpath
                    "forward",
                    " on BOOSA1002 Hotel")) {
                return false;
            }
            Functions.break_time(driver, 30, 500);
            if (!Functions.createLov(driver,
                    new String[]{"hotel_e_result_lov_prod_ofi", getElements("hotel_e_result_lov_prod_ofi")}, //LoV button
                    new String[]{"hotel_e_result_i_prod_ofi", getElements("hotel_e_result_i_prod_ofi")}, //external LoV input
                    recursiveXPaths.lov_b_search, // lov b search
                    recursiveXPaths.lov_e_result, // lov result
                    recursiveXPaths.lov_b_ok, //lov b ok
                    "board_name", //name of the data
                    " on BOOSA1002 Hotel")) {
                return false;
            }
        }
        Functions.break_time(driver, 30, 500);
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_save", getElements("hotel_b_save")}, //element to click
                new String[]{"hotel_b_save_b_save", getElements("hotel_b_save_b_save")}, //expected element to appear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"hotel_b_save_b_actions", getElements("hotel_b_save_b_actions")}, //element to click
                new String[]{"hotel_b_save_b_actions_auto", getElements("hotel_b_save_b_actions_auto")}, //expected element to appear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"hotel_b_save_b_actions_auto", getElements("hotel_b_save_b_actions_auto")}, //element to click
                " on BOOSA1002 Hotel")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"hotel_b_save_b_save", getElements("hotel_b_save_b_save")}, //element to click
                new String[]{"hotel_b_save_b_save", getElements("hotel_b_save_b_save")}, //expected element to disappear
                " on BOOSA1002 Hotel")) {
            return false;
        }
        // ToDo aqui hay bug de PL que ya arreglarrán según Miguel Angel Martín Villalvilla
        return true;
    }

    //</editor-fold>
    //<editor-fold desc="Header">
    //<editor-fold desc="C&H">
    private boolean header_consult(TestDriver driver) {

        if (!header_booking_cases(driver)) {
            return false;
        }
        if (!header_cancelation(driver)) {
            return false;
        }
        if (!header_headerhistoric(driver)) {
            return false;
        }
        if (!header_headeroperationhistoric(driver)) {
            return false;
        }
        if (!header_generalhistoric(driver)) {
            return false;
        }
        if (!create_remarks(driver)) {
            return false;
        }
        if (!header_generalremarks(driver)) {
            return false;
        } //posterior
        if (!header_audit(driver)) {
            return false;
        }
        if (!header_canco(driver)) {
            return false;
        }

        return true;
    }

    //<editor-fold desc="CANCO">
    private boolean header_canco(TestDriver driver) {
        String on = "on BOOSA1002 Header -> CANCO";
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_canco", getElements("header_b_consult_b_canco")}, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_canco", getElements("header_b_consult_b_canco")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe", getElements("header_b_consult_b_canco_t_currency_b_qbe")},
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_tip", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_tip")},
                on)) {
            return false;
        }
        //<editor-fold desc="Currency qbe">
        /*if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_tip", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_tip")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_tip",
                "header_b_consult_b_canco_t_currency_b_qbe_i_tip",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_ord", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_ord")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_ord",
                "header_b_consult_b_canco_t_currency_b_qbe_i_ord",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_service", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_service")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_service",
                "header_b_consult_b_canco_t_currency_b_qbe_i_service",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_canco_cost", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_canco_cost")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_cost",
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_cost",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_canco_sale", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_canco_sale")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_sale",
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_sale",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_canco_cpa", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_canco_cpa")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_cpa",
                "header_b_consult_b_canco_t_currency_b_qbe_i_canco_cpa",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_taxC_vta", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_taxC_vta")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxC_vta",
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxC_vta",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_taxC_margin", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_taxC_margin")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxC_margin",
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxC_margin",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_ch_cost", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_ch_cost")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_cost",
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_cost",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_ch_sale", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_ch_sale")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_sale",
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_sale",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_ch_cpa", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_ch_cpa")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_cpa",
                "header_b_consult_b_canco_t_currency_b_qbe_i_ch_cpa",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_taxB_vta", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_taxB_vta")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxB_vta",
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxB_vta",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_qbe_i_taxB_margin", getElements("header_b_consult_b_canco_t_currency_b_qbe_i_taxB_margin")},
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxB_margin",
                "header_b_consult_b_canco_t_currency_b_qbe_i_taxB_margin",
                on)) {
            return false;
        }*/
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"header_b_consult_b_canco_t_currency_b_detach", getElements("header_b_consult_b_canco_t_currency_b_detach")},
                false,
                on)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe", getElements("header_b_consult_b_canco_t_endowments_b_qbe")},
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_from", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_from")},
                on)) {
            return false;
        }
        //<editor-fold desc="Endowments QBE">
        /*
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_from", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_from")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_from",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_from",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_to", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_to")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_to",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_to",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_description", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_description")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_description",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_description",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_total_cost", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_total_cost")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_total_cost",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_total_cost",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_currency", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_currency")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_currency",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_currency",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_trp", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_trp")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_trp",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_trp",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_rv", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_rv")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_rv",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_rv",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_qbe_i_mod", getElements("header_b_consult_b_canco_t_endowments_b_qbe_i_mod")},
                "header_b_consult_b_canco_t_endowments_b_qbe_i_mod",
                "header_b_consult_b_canco_t_endowments_b_qbe_i_mod",
                on)) {
            return false;
        }
        */
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"header_b_consult_b_canco_t_endowments_b_detach", getElements("header_b_consult_b_canco_t_endowments_b_detach")},
                false,
                on)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_canco_b_exit", getElements("header_b_consult_b_canco_b_exit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }

        return true;
    }
    //</editor-fold>

    private boolean header_audit(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_audit", getElements("header_b_consult_b_audit")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_audit", getElements("header_b_consult_b_audit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_audit_b_close", getElements("header_b_consult_b_audit_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_generalremarks(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_generalremarks", getElements("header_b_consult_b_generalremarks")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_generalremarks", getElements("header_b_consult_b_generalremarks")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_generalremarks_b_close", getElements("header_b_consult_b_generalremarks_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_generalhistoric(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_generalhistoric", getElements("header_b_consult_b_generalhistoric")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_generalhistoric", getElements("header_b_consult_b_generalhistoric")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_generalhistoric_b_close", getElements("header_b_consult_b_generalhistoric_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    //<editor-fold desc="Header Operation Historic">
    private boolean header_headeroperationhistoric(TestDriver driver) {
        String on = " on BOOSA1002 Header Operation Historic Action";
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_headeroperationhistoric", getElements("header_b_consult_b_headeroperationhistoric")}, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric", getElements("header_b_consult_b_headeroperationhistoric")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_ord", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_ord")},
                "hoh_ord",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_op", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_op")},
                "hoh_op",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_app", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_app")},
                "hoh_app",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_server", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_server")},
                "hoh_server",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_credential", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_credential")},
                "hoh_credential",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_user_atlas", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_user_atlas")},
                "hoh_user_atlas",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_user_web", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_user_web")},
                "hoh_user_web",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_id_web", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_id_web")},
                "hoh_id_web",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_ip", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_ip")},
                "hoh_ip",
                on)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_e_domain", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_e_domain")},
                "hoh_domain",
                on)) {
            return false;
        }
        //\\
        if (!Functions.clickQbE(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe", getElements("header_b_consult_b_headeroperationhistoric_b_qbe")},
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_ord", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_ord")},
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_ord", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_ord")},
                "hoh_ord",
                getData("hoh_ord"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_op", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_op")},
                "hoh_op",
                getData("hoh_op"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_app", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_app")},
                "hoh_app",
                getData("hoh_app"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_server", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_server")},
                "hoh_server",
                getData("hoh_server"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_credential", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_credential")},
                "hoh_credential",
                getData("hoh_credential"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_user_atlas", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_user_atlas")},
                "hoh_user_atlas",
                getData("hoh_user_atlas"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_user_web", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_user_web")},
                "hoh_user_web",
                getData("hoh_user_web"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_id_web", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_id_web")},
                "hoh_id_web",
                getData("hoh_id_web"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_ip", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_ip")},
                "hoh_ip",
                getData("hoh_ip"),
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_domain", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_domain")},
                "hoh_domain",
                getData("hoh_domain"),
                on)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_qbe_i_server", getElements("header_b_consult_b_headeroperationhistoric_b_qbe_i_server")},
                new String[]{"header_b_consult_b_headeroperationhistoric_e_result", getElements("header_b_consult_b_headeroperationhistoric_e_result")},
                on)) {
            return false;
        }
        Functions.screenshot(driver);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_headeroperationhistoric_b_close", getElements("header_b_consult_b_headeroperationhistoric_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }

        return true;
    }

    //</editor-fold>
    //<editor-fold desc="Header-historic">
    private boolean header_headerhistoric(TestDriver driver) {
        String on = " on BOOSA1002 Header";
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric", getElements("header_b_consult_b_headerhistoric")}, //element expected to appear
                on)) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headerhistoric", getElements("header_b_consult_b_headerhistoric")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }

        if (!Functions.clickQbE(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO")}, //element expected to appear
                on + "-> Open QBE Booking Tab")) {
            return false;
        }
        //Esta QBE no tiene ni un resultado ergo esta comentada pero "programada"
        //<editor-fold desc="header historic bookings qbe">
        /*if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_date", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_date")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_date",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_date",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOCompany", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOCompany")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOCompany",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOCompany",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOName", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOName")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOName",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOName",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TOdesc", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TOdesc")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TOdesc",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TOdesc",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_branchoffice", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_branchoffice")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_branchoffice",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_branchoffice",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_description", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_description")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_description",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_description",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_main_passenger_name", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_main_passenger_name")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_main_passenger_name",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_main_passenger_name",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_adults", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_adults")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_adults",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_adults",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_children", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_children")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_children",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_children",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_babies", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_babies")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_babies",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_babies",
                on)){
            return false;
        }
        WebElement scroll = driver.getDriver().findElement(By.xpath("//div[contains(@id, 'pt1:dyntdc:r2:1:r2:0:r3:0:pc1:t1')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('pt1:dyntdc:r2:1:r2:0:r3:0:pc1:t1').scrollLeft += 250", "");
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_credit_type", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_credit_type")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_credit_type",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_credit_type",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_interface", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_interface")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_interface",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_interface",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_company", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_company")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_company",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_company",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_user", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_user")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_user",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_user",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_agent", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_agent")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_agent",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_agent",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_user", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_user")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_user",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_user",
                on)){
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date")},
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date",
                "header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date",
                on)){
            return false;
        }
        //Sin registros no puedo coger xpath del 1º registro oO
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date")},
                new String[]{"", getElements("")},
                on)){
            return false;
        }
        */
        //</editor-fold>
        Functions.screenshot(driver);
        if (!Functions.detachTable(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_booking_tab_b_detach", getElements("header_b_consult_b_headerhistoric_e_booking_tab_b_detach")}, //element to click
                false,
                on + "-> Detach Booking Tab")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab", getElements("header_b_consult_b_headerhistoric_e_supp_tab")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe")},
                on + "-> Change to Suppliers Tab")) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code")},
                on + "-> Open QBE Suppliers Tab")) {
            return false;
        }
        //Esta, como la otra QBE, tampoco tiene registros
        //<editor-fold desc="header historic suppliers qbe">
        /*
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_supplier", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_supplier")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_supplier",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_supplier",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_date", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_date")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_date",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_date",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_type", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_type")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_type",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_type",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_status", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_status")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_status",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_status",
                on)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_address", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_address")},
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_address",
                "header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_address",
                on)) {
            return false;
        }
        //Sin registros no puedo coger xpath del 1º registro oO
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel")},
                new String[]{"", getElements("")},
                on)) {
            return false;
        }
        */
        //</editor-fold>
        if (!Functions.detachTable(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_detach", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_detach")}, //element to click
                false,
                on + "-> Detach Suppliers Tab")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_action", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_action")}, //element to click
                new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_action_b_query_sendings", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_action_b_query_sendings")},
                on + "-> Actions Suppliers Tab")) {
            return false;
        }
        /** No se dde donde salen los registros de esta pestaña asi que no puedo dejar que haga la QBE y pete sin ser bug
         if (!Functions.checkClickByAbsence(driver,
         new String[]{"header_b_consult_b_headerhistoric_e_supp_tab_b_action_b_query_sendings", getElements("header_b_consult_b_headerhistoric_e_supp_tab_b_action_b_query_sendings")}, //element to click
         new String[]{"workingclasshero", "//*[contains(@id, 'si7')]/img"},
         on + "-> Actions Suppliers Tab")) {
         return false;
         }*/
        Functions.break_time(driver, 30, 100);
        Functions.screenshot(driver);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_headerhistoric_b_close", getElements("header_b_consult_b_headerhistoric_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        return true;
    }
    //</editor-fold>

    private boolean header_cancelation(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_cancelation", getElements("header_b_consult_b_cancelation")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_cancelation", getElements("header_b_consult_b_cancelation")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_cancelation_b_close", getElements("header_b_consult_b_cancelation_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    private boolean header_booking_cases(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult", getElements("header_b_consult")}, //element to click
                new String[]{"header_b_consult_b_cases", getElements("header_b_consult_b_cases")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_consult_b_cases", getElements("header_b_consult_b_cases")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_consult_b_cases_b_close", getElements("header_b_consult_b_cases_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    //</editor-fold>
    //<editor-fold desc="Actions">
    private boolean header_actions(TestDriver driver) {

        if (!header_to_booking(driver)) {
            return false;
        }
        if (!header_paxes(driver)) {
            return false;
        }
        if (!header_collectiondata(driver)) {
            return false;
        }
        /**
         //ToDo No se conseguir que se active esta opción
         if (!header_hotelopiaclient(driver)) {
         return false;
         }*/
        return true;
    }

    //<editor-fold desc="Hotelopia Client">
 /*    private boolean header_hotelopiaclient(TestDriver driver) {
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient", getElements("header_b_actions_b_hotelopiaclient")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_hotelopiaclient", getElements("header_b_actions_b_hotelopiaclient")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps", getElements("header_b_actions_b_hotelopiaclient_b_chargecps")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        Functions.screenshot(driver);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element to click
                new String[]{"header_b_actions_b_hotelopiaclient_b_chargecps_b_close", getElements("header_b_actions_b_hotelopiaclient_b_chargecps_b_close")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_hotelopiaclient_b_close", getElements("header_b_actions_b_hotelopiaclient_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        return true;
    }*/
    //</editor-fold>

    private boolean header_collectiondata(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_collectiondata", getElements("header_b_actions_b_collectiondata")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_collectiondata", getElements("header_b_actions_b_collectiondata")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        Functions.screenshot(driver);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_collectiondata_b_close", getElements("header_b_actions_b_collectiondata_b_close")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }
        return true;
    }

    //<editor-fold desc="Paxes CSED">
    private boolean header_paxes(TestDriver driver) {
        String on = " on BOOSA1002 Header Paxes Action";
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_paxes", getElements("header_b_actions_b_paxes")}, //element expected to appear
                on)) {
            return false;
        }
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_paxes", getElements("header_b_actions_b_paxes")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                on)) {
            return false;
        }
        if (!header_paxes_creationEdit(driver, true, on)) {
            return false;
        }
        if (!header_paxes_qbe(driver, true, on)) {
            return false;
        }
        if (!header_paxes_creationEdit(driver, false, on)) {
            return false;
        }
        if (!header_paxes_qbe(driver, false, on)) {
            return false;
        }
        // Después de hacer el detach el xpath de close cambia
        /**
         if (!Functions.detachTable(driver,
         new String[]{"header_b_actions_b_paxes_b_detach", getElements("header_b_actions_b_paxes_b_detach")}, //element to click
         true,
         on)) {
         return false;
         }*/
        if (!header_paxes_delete(driver, on)) {
            return false;
        }
        while (!Functions.displayed(driver, getElements("header_b_actions_b_paxes_b_close"))
                && Functions.displayed(driver, getElements("header_b_actions_b_paxes_b_detach_b_close"))) {
            System.out.println("Searching love in ADF");
            if (!Functions.checkClickByAbsence(driver,
                    new String[]{"header_b_actions_b_paxes_b_detach_b_close", getElements("header_b_actions_b_paxes_b_detach_b_close")}, //element to click
                    new String[]{"header_b_actions_b_paxes_b_detach_b_close", getElements("header_b_actions_b_paxes_b_detach_b_close")},
                    180, 500, on)) {
                return false;
            }
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_paxes_b_save", getElements("header_b_actions_b_paxes_b_save")}, //element to click
                new String[]{"header_b_actions_b_paxes_b_close", getElements("header_b_actions_b_paxes_b_close")},
                180, 500, on)) {
            return false;
        }
        return true;
    }

    private boolean header_paxes_creationEdit(TestDriver driver, boolean type, String on) {
        String onplus, edit = "";
        if (type) {
            onplus = on + "-> Record creation";
            Functions.break_time(driver, 10, 500);
            if (!Functions.checkClick(driver,
                    new String[]{"header_b_actions_b_paxes_b_add", getElements("header_b_actions_b_paxes_b_add")},
                    new String[]{"header_b_actions_b_paxes_b_add_i_name", getElements("header_b_actions_b_paxes_b_add_i_name")},
                    onplus)) {
                return false;
            }
        } else {
            onplus = on + "-> Record edition";
            edit = "_edit";
            Functions.break_time(driver, 10, 500);
            if (!Functions.simpleClick(driver,
                    new String[]{"header_b_actions_b_paxes_e_record", getElements("header_b_actions_b_paxes_e_record")},
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.checkClick(driver,
                    new String[]{"header_b_actions_b_paxes_b_edit", getElements("header_b_actions_b_paxes_b_edit")},
                    new String[]{"header_b_actions_b_paxes_b_add_i_name", getElements("header_b_actions_b_paxes_b_add_i_name")},
                    onplus)) {
                return false;
            }
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_name", getElements("header_b_actions_b_paxes_b_add_i_name")},
                "header_paxes_name",
                DataGenerator.getRandomAlphanumericSequence(4, false),
                onplus)) {
            return false;
        }
        Functions.break_time(driver, 10, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"header_b_actions_b_paxes_b_add_lov_type", getElements("header_b_actions_b_paxes_b_add_lov_type")},
                new String[]{"header_b_actions_b_paxes_b_add_i_type", getElements("header_b_actions_b_paxes_b_add_i_type")},
                new String[]{"header_b_actions_b_paxes_b_add_lov_type_i", getElements("header_b_actions_b_paxes_b_add_lov_type_i")},
                getData("da_header_paxes_type" + edit),
                "header_paxes_type",
                onplus)) {
            return false;
        }
        Functions.break_time(driver, 10, 500);
        if (!Functions.createLovByValue(driver,
                new String[]{"header_b_actions_b_paxes_b_add_lov_type2", getElements("header_b_actions_b_paxes_b_add_lov_type2")},
                new String[]{"header_b_actions_b_paxes_b_add_i_type2", getElements("header_b_actions_b_paxes_b_add_i_type2")},
                new String[]{"header_b_actions_b_paxes_b_add_lov_type2_i", getElements("header_b_actions_b_paxes_b_add_lov_type2_i")},
                getData("da_header_paxes_type2" + edit),
                "header_paxes_type2",
                onplus)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_surnames", getElements("header_b_actions_b_paxes_b_add_i_surnames")},
                "header_paxes_surname",
                DataGenerator.getRandomAlphanumericSequence(5, false),
                onplus)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_birth_date", getElements("header_b_actions_b_paxes_b_add_i_birth_date")},
                "header_paxes_birth_date",
                DataGenerator.getRelativeDateToday("dd/MM/yyyy", -5, DataGenerator.random(8, 3), 0),
                onplus)) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"header_b_actions_b_paxes_b_add_lov_country", getElements("header_b_actions_b_paxes_b_add_lov_country")},
                new String[]{"header_b_actions_b_paxes_b_add_i_country", getElements("header_b_actions_b_paxes_b_add_i_country")},
                new String[]{"header_b_actions_b_paxes_b_add_lov_country_i", getElements("header_b_actions_b_paxes_b_add_lov_country_i")},
                getData("header_paxes_country" + edit),
                "header_paxes_country",
                onplus)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_age", getElements("header_b_actions_b_paxes_b_add_i_age")},
                "header_paxes_age",
                String.valueOf(DataGenerator.random(12, 18)),
                onplus)) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_passport", getElements("header_b_actions_b_paxes_b_add_i_passport")},
                "header_paxes_passport",
                "",
                onplus)) {
            return false;
        }
        try {
            if (Functions.displayed(driver,
                    getElements("header_b_actions_b_paxes_b_add_e_bar_alert"))) {
                if (!Functions.simpleClick(driver,
                        new String[]{"header_b_actions_b_paxes_b_add_e_bar_alert", getElements("header_b_actions_b_paxes_b_add_e_bar_alert")},
                        onplus)) {
                    return false;
                }
                if (Functions.displayed(driver,
                        getElements("header_b_actions_b_paxes_b_add_b_ok_alert"))) {
                    if (!Functions.simpleClick(driver,
                            new String[]{"header_b_actions_b_paxes_b_add_b_ok_alert", getElements("header_b_actions_b_paxes_b_add_b_ok_alert")},
                            onplus)) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!Functions.insertInput(driver,
                new String[]{"header_b_actions_b_paxes_b_add_i_passport", getElements("header_b_actions_b_paxes_b_add_i_passport")},
                "header_paxes_passport",
                DataGenerator.getRandomAlphanumericSequence(7, false),
                onplus)) {
            return false;
        }
        if (!Functions.getValue(driver,
                new String[]{"header_b_actions_b_paxes_b_add_e_country_desc", getElements("header_b_actions_b_paxes_b_add_e_country_desc")},
                "header_paxes_country_desc",
                onplus)) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"header_b_actions_b_paxes_b_add_b_save", getElements("header_b_actions_b_paxes_b_add_b_save")},
                onplus)) {
            return false;
        }
        return true;
    }

    private boolean header_paxes_qbe(TestDriver driver, boolean first, String on) {
        String edit = "", onplus = on + "-> QBE";
        if (!first) {
            edit = "_edit";
        }
        if (Functions.displayed(driver, getElements("header_b_actions_b_paxes_b_qbe"))) {
            if (!Functions.clickQbE(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe", getElements("header_b_actions_b_paxes_b_qbe")},
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_order", getElements("header_b_actions_b_paxes_b_qbe_i_order")},
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_order", getElements("header_b_actions_b_paxes_b_qbe_i_order")},
                    "header_paxes_order",
                    "",
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_name", getElements("header_b_actions_b_paxes_b_qbe_i_name")},
                    "header_paxes_name",
                    getData("header_paxes_name"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_surnames", getElements("header_b_actions_b_paxes_b_qbe_i_surnames")},
                    "header_paxes_surname",
                    getData("header_paxes_surname"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_age", getElements("header_b_actions_b_paxes_b_qbe_i_age")},
                    "header_paxes_age",
                    getData("header_paxes_age"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_type", getElements("header_b_actions_b_paxes_b_qbe_i_type")},
                    "header_paxes_type",
                    getData("da_header_paxes_type" + edit),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_type2", getElements("header_b_actions_b_paxes_b_qbe_i_type2")},
                    "header_paxes_type2",
                    getData("da_header_paxes_type2" + edit),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_birth_date", getElements("header_b_actions_b_paxes_b_qbe_i_birth_date")},
                    "header_paxes_birth_date",
                    getData("header_paxes_birth_date"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_passport", getElements("header_b_actions_b_paxes_b_qbe_i_passport")},
                    "header_paxes_passport",
                    getData("header_paxes_passport"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_country", getElements("header_b_actions_b_paxes_b_qbe_i_country")},
                    "header_paxes_country",
                    getData("header_paxes_country"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.insertInput(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_country_description", getElements("header_b_actions_b_paxes_b_qbe_i_country_description")},
                    "header_paxes_country_desc",
                    getData("header_paxes_country_desc"),
                    onplus)) {
                return false;
            }
            Functions.break_time(driver, 10, 500);
            if (!Functions.enterQueryAndClickResult(driver,
                    new String[]{"header_b_actions_b_paxes_b_qbe_i_name", getElements("header_b_actions_b_paxes_b_qbe_i_name")},
                    new String[]{"header_b_actions_b_paxes_e_record", getElements("header_b_actions_b_paxes_e_record")},
                    onplus)) {
                return false;
            }
        }
        return true;
    }

    private boolean header_paxes_delete(TestDriver driver, String on) {
        String onplus = on + "-> Delete";
        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_paxes_b_delete", getElements("header_b_actions_b_paxes_b_delete")},
                new String[]{"header_b_actions_b_paxes_b_delete_b_ok", getElements("header_b_actions_b_paxes_b_delete_b_ok")},
                onplus)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_paxes_b_delete_b_ok", getElements("header_b_actions_b_paxes_b_delete_b_ok")},
                new String[]{"header_b_actions_b_paxes_b_delete_b_ok", getElements("header_b_actions_b_paxes_b_delete_b_ok")},
                onplus)) {
            return false;
        }
        return true;
    }

    //</editor-fold>
    private boolean header_to_booking(TestDriver driver) {

        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions", getElements("header_b_actions")}, //element to click
                new String[]{"header_b_actions_b_tobooking", getElements("header_b_actions_b_tobooking")}, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        if (!Functions.checkClick(driver,
                new String[]{"header_b_actions_b_tobooking", getElements("header_b_actions_b_tobooking")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        Functions.screenshot(driver);

        if (!Functions.checkClickByAbsence(driver,
                new String[]{"header_b_actions_b_tobooking_b_accept", getElements("header_b_actions_b_tobooking_b_accept")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                " on BOOSA1002 Header")) {
            return false;
        }

        return true;
    }

    //</editor-fold>
    private boolean create_remarks(TestDriver driver) {
        if (!bookingadmin_comments(driver)) {
            return false;
        }
        if (!to_comments(driver)) {
            return false;
        }
        if (!various_comments(driver)) {
            return false;
        }

        return true;
    }

    private boolean various_comments(TestDriver driver) {


        return true;
    }

    private boolean to_comments(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_tab", getElements("remmarks_to_tab")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_i_commentsadd", getElements("remmarks_to_i_commentsadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"remmarks_to_i_commentsadd", getElements("remmarks_to_i_commentsadd")},
                "comments_remmarks", getData("booking_remmarks"), " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_to_b_commentsadd", getElements("remmarks_to_b_commentsadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        Functions.screenshot(driver);
        return true;
    }

    private boolean bookingadmin_comments(TestDriver driver) {

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_tab_booking", getElements("remmarks_tab_booking")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_i_bookingadd", getElements("remmarks_booking_i_bookingadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"remmarks_booking_i_bookingadd", getElements("remmarks_booking_i_bookingadd")},
                "booking_remmarks", getData("booking_remmarks"), " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_b_bookingadd", getElements("remmarks_booking_b_bookingadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }

        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_tab_booking", getElements("remmarks_tab_booking")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_i_adminadd", getElements("remmarks_booking_i_adminadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"remmarks_booking_i_adminadd", getElements("remmarks_booking_i_adminadd")},
                "admin_remmarks", getData("booking_remmarks"), " on BOOSA1002 REMARKS")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"remmarks_booking_b_adminadd", getElements("remmarks_booking_b_adminadd")}, //element to click
                " on BOOSA1002 REMARKS")) {
            return false;
        }
        Functions.screenshot(driver);
        return true;
    }

    private boolean create_header(TestDriver driver) {
        driver.getReport().addHeader("CREATE NEW BOOKING", 2, true);
        Functions.zoomOut(driver);
        if (!Functions.checkClick(driver,
                new String[]{"header_add", getElements("header_add")}, //element to click
                new String[]{"header_add_i_interface", getElements("header_add_i_interface")}, //element expected to appear
                " on CREATION HEADER")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_interface", getElements("header_add_lov_interface")}, // b_lov
                new String[]{"header_add_i_interface", getElements("header_add_i_interface")}, // i_lov
                new String[]{"header_add_lov_i_interface", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_interface"),
                "header_interface", //Data name
                " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_to", getElements("header_add_lov_to")}, //LoV button
                new String[]{"header_add_i_to", getElements("header_add_i_to")}, //external LoV input
                new String[]{"header_add_lov_to_i_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                getData("header_to"), // value to search
                "header_to", //name of the data
                " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"header_add_lov_branch", getElements("header_add_lov_branch")}, //LoV button
                new String[]{"header_add_i_branch", getElements("header_add_i_branch")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "header_branch", //name of the data
                " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.createLov(driver,
                new String[]{"header_add_lov_user", getElements("header_add_lov_user")}, //LoV button
                new String[]{"header_add_i_user", getElements("header_add_i_user")}, //external LoV input
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok,
                "header_user", //name of the data
                " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.createLovByValue(driver,
                new String[]{"header_add_lov_booking_type", getElements("header_add_lov_booking_type")}, //LoV button
                new String[]{"header_add_i_booking_type", getElements("header_add_i_booking_type")}, //external LoV input
                new String[]{"header_add_lov_booking_type_i_desc", getElements("header_add_lov_booking_type_i_desc")}, //internal LoV input
                getData("header_booking_type"), // value to search
                "header_booking_type", //name of the data
                " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"header_add_i_ag_ref", getElements("header_add_i_ag_ref")},
                "header_ag_ref", getData("header_ag_ref"), " on HEADER CREATION")) {
            return false;
        }
        try {
            if (!Functions.selectText(driver,
                    new String[]{"header_add_i_despt", getElements("header_add_i_despt")},
                    getData("header_despt"),
                    "header_despt",
                    " on HEADER CREATION")) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!Functions.insertInput(driver, new String[]{"header_add_i_adults", getElements("header_add_i_adults")},
                "header_adults", getData("header_adults"), " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"header_add_i_child", getElements("header_add_i_child")},
                "header_child", getData("header_child"), " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"header_add_i_baby", getElements("header_add_i_baby")},
                "header_baby", getData("header_baby"), " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"header_add_i_pax_mane", getElements("header_add_i_pax_mane")},
                "header_pax_name", getData("header_pax_name"), " on HEADER CREATION")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"header_add_b_save", getElements("header_add_b_save")}, //element to click
                " on CREATION HEADER")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"header_add_b_save", getElements("header_add_b_save")}, //element to click
                " on CREATION HEADER")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"header_add_b_save", getElements("header_add_b_save")}, //element to click
                " on CREATION HEADER")) {
            return false;
        }
        Functions.break_time(driver, 5, 500);
        if (!Functions.getText(driver, new String[]{"header_edit_booking_tab", getElements("header_edit_booking_tab")}, // element path
                "booking_value", // key for data value (the name)
                " on BOOKING CREATED")) {
            return false;
        }
        Functions.break_time(driver, 60, 500);
        String mystring = getData("booking_value");
        System.out.println(mystring);
        try {
            String bookings_value[] = mystring.split("-");
            System.out.println(bookings_value);
            putData("booking", bookings_value[1]);
            String recep_value[] = bookings_value[0].split(" ");
            System.out.println(recep_value);
            putData("receptive", recep_value[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
//</editor-fold >
}