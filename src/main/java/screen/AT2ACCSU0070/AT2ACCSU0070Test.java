package screen.AT2ACCSU0070;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * The data was selected by query on the database
 *
 * @author ajvirgili on 19/07/2016
 */
@SuppressWarnings({"unused", "RedundantIfStatement"})
public class AT2ACCSU0070Test {

    protected AT2ACCSU0070Locators locators;
    protected AT2ACCSU0070Data data;

    public AT2ACCSU0070Test(String enviroment) {
        setData(new AT2ACCSU0070Data(enviroment));
        setLocators(new AT2ACCSU0070Locators(enviroment));
    }

    public AT2ACCSU0070Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2ACCSU0070Locators locators) {
        this.locators = locators;
    }

    public AT2ACCSU0070Data getData() {
        return data;
    }

    public void setData(AT2ACCSU0070Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("SI Checking tool 2.0");
    }

    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        //<editor-fold desc="searchByAllFields">
        if (!searchFull(driver)) {
            return false;
        }
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="searchByHotel">
        if (!searchHotel(driver)) {
            return false;
        }
        Functions.break_time(driver, 10, 1000);
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="searchByBrand">
        if (!searchBrand(driver)) {
            return false;
        }
        Functions.break_time(driver, 10, 1000);
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="searchByChainHotel">
        if (!searchCadena(driver)) {
            return false;
        }
        Functions.break_time(driver, 10, 1000);
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="searchByExternalHotel">
        if (!searchExternal(driver)) {
            return false;
        }
        Functions.break_time(driver, 10, 1000);
        if (!checkRecord(driver)) {
            return false;
        }
        if (!cleanSearch(driver)) {
            return false;
        }
        //</editor-fold>
        //<editor-fold desc="searchNone">
        driver.getReport().addHeader("Search without fields", 4, true);
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                " On: Simple search without inputs")) {
            return false;
        }
        Functions.break_time(driver, 10, 1000);
        if (!checkRecord(driver)) {
            return false;
        }
        //</editor-fold>
        return false;
    }

    protected boolean searchFull(TestDriver driver) {
        String on = " On: Complete search";
        driver.getReport().addHeader("Complete search (using all fields)", 3, true);
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")},
                "hotel_code", "472",
                "hotel_desc", "VINCCI BOSC DE MAR",
                "hotel",
                on)) {
            return false;
        }
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_brand", getElements("search_lov_brand")},
                "brand_code", "INDEPEND",
                "brand_desc", "INDEPEND",
                "brand",
                on)) {
            return false;
        }
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_cadena_hotel", getElements("search_lov_cadena_hotel")},
                "chain_code", "VINCC",
                "chain_desc", "VINCCI HOTELES",
                "cadena_hotel",
                on)) {
            return false;
        }
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_external_hotel", getElements("search_lov_external_hotel")},
                "ex_hotel_code", "472",
                "ex_hotel_desc", "Vincci Bosc de Mar",
                "external_hotel",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchHotel(TestDriver driver) {
        driver.getReport().addHeader("Search by Hotel", 4, true);
        String on = " On: Search by Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_hotel", getElements("search_lov_hotel")},
                "hotel_code", "1100",
                "hotel_desc", "ESCORSO",
                "hotel1",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchBrand(TestDriver driver) {
        driver.getReport().addHeader("Search by Brand", 4, true);
        String on = " On: Search by Brand";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_brand", getElements("search_lov_brand")},
                "brand_code", "MELHOT",
                "brand_desc", "Melia Hotels Urbano",
                "brand1",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchCadena(TestDriver driver) {
        driver.getReport().addHeader("Search by Cadena Hotel", 4, true);
        String on = " On: Search by Cadena Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_cadena_hotel", getElements("search_lov_cadena_hotel")},
                "chain_code", "CATA",
                "chain_desc", "CATALONIA HOTELS",
                "cadena_hotel1",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean searchExternal(TestDriver driver) {
        driver.getReport().addHeader("Search by External Hotel", 4, true);
        String on = " On: Search by Exernal Hotel";
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"search_lov_external_hotel", getElements("search_lov_external_hotel")},
                "ex_hotel_code", "66512",
                "ex_hotel_desc", "St Olaves",
                "external_hotel1",
                on)) {
            return false;
        }
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                new String[]{"hotel_desc_e_record", getElements("hotel_desc_e_record")},
                on)) {
            return false;
        }
        return true;
    }

    protected boolean cleanSearch(TestDriver driver) {
        driver.getReport().addHeader("Clean Search Block", 3, true);
        String on = " On: Clean search block";
        String noVal = "No selected values";
        String[] inputs = {"hotel", "brand", "cadena_hotel", "external_hotel"};

        for (String button : inputs) {
            if (!Functions.checkClick(driver,
                    new String[]{"search_b_delete_" + button, getElements("search_b_delete_" + button)},
                    new String[]{"logout_button", recursiveXPaths.logout},
                    on)) {
                return false;
            }
        }
        for (String input : inputs) {
            if (!Functions.getText(driver,
                    new String[]{"search_e_" + input + "_selected", getElements("search_e_" + input + "_selected")},
                    input + "_values",
                    on)) {
                return false;
            }
        }
        if (getData("hotel_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)
                && getData("brand_values").equalsIgnoreCase(noVal)) {
            driver.getReport().addContent("Search block cleaned", "h5", "");
            System.out.println("Search block cleaned");
        }
        return true;
    }

    protected boolean checkRecord(TestDriver driver) {
        String on = " On: Check record";
        if (!Functions.getText(driver,
                new String[]{"hotel_desc_e_num_records", getElements("hotel_desc_e_num_records")},
                "record_value", on)) {
            return false;
        }
        if (getData("record_value").equalsIgnoreCase("1")) {
            System.out.println("Correct check value");
            driver.getReport().addContent("Correct check value", "p", "");
        }
        Functions.screenshot(driver);
        return true;
    }

}
