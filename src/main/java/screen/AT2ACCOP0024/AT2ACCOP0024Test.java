package screen.AT2ACCOP0024;

import core.CommonActions.CommonProcedures;
import core.CommonActions.Functions;
import core.ErrorManager.ErrorManager;
import core.TestDriver.TestDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.SystemClock;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/**
 * @author ajvirgili  Created on 29/06/2016.
 */
@SuppressWarnings({"unused", "RedundantIfStatement", ""})
public class AT2ACCOP0024Test {

    protected AT2ACCOP0024Locators locators;
    protected AT2ACCOP0024Data data;
    protected Exception exception;

    public AT2ACCOP0024Test() {

    }

    /**
     * @return an AT2ACCOP0024Locators object
     */
    public AT2ACCOP0024Locators getLocators() {
        return locators;
    }

    /**
     * @param locators Gets the locators given in the ATACCOP0024Locators, a Hashmap with locator_name[0], xpath[1]
     *                 and puts it in the locators variable
     */
    public void setLocators(AT2ACCOP0024Locators locators) {
        this.locators = locators;
    }

    /**
     * @return an AT2ACCOP0024Data object
     */
    public AT2ACCOP0024Data getData() {
        return data;
    }

    /**
     * @param data ATACCOP0024Data data, that has a Hashmap with data_name[0], xpath[1]
     *             and puts it in the data object of this class
     */
    public void setData(AT2ACCOP0024Data data) {
        this.data = data;
    }

    /**
     * This function calls the setScreenInfo to establish some data and then the goToScreen function
     *
     * @param driver Object that manages the core of the test
     * @see CommonProcedures#goToScreen(TestDriver)
     * @see #setScreenInfo(TestDriver)
     */
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    /**
     * This function sets the test details for the report created
     *
     * @param driver Object that manages the core of the test
     * @see TestDriver#getTestdetails()
     */
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Accommodations");
        driver.getTestdetails().setSubmenu("Operations");
        driver.getTestdetails().setScreen("Financial Monitoring 2.0");
    }

    /**
     * @param key String with the locator_name to get
     * @return String with an xpath
     */
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }

    /**
     * @param key String with the data_name to get
     * @return String with an xpath
     */
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    /**
     * In this function we call the funtions that we want to do in a full test
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean testCSED(TestDriver driver) {
        // TODO: 05/07/2016 hacer bien
        if (!newAction(driver)) {
            return false;
        }
        if (!gettingData(driver)) {
            return false;
        }
        if (!search(driver)) {
            return false;
        }
        if (!detachTable(driver)) {
            return false;
        }
        if (!reset(driver)) {
            return false;
        }
        if (!qbe(driver)) {
            return false;
        }
        if (!exportAction(driver)) {
            return false;
        }
        if (!modifyAction(driver)) {
            return false;
        }
        if (!reprocessAction(driver)) {
            return false;
        }
        return false;
    }

    /**
     * Gets the data of the first 3 rows after arrange the table by financial date <br>
     * In this component of the Atlas2.0 proyect we can't randomize data so we get it directly from the table
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#sleep(int)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#getText(TestDriver, String[], String, String)
     * @see core.HTMLReport.AutoReport#addContent(String)
     */
    protected boolean gettingData(TestDriver driver) {
        driver.getReport().addContent("Getting data to test:", "h4", "");
        Functions.sleep(4500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on Get data")) {
            return false;
        }
        Functions.sleep(4500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_qbe_financial_status", getElements("record_interaction_b_qbe_financial_status")},
                " on Get data")) {
            return false;
        }
        Functions.sleep(4500);
        //ToDo optimizsce this
        String[] fields = {"", "report", "file", "type", "financial_date", "financial_status", "merchant", "settelment", "currency", "modification_user", "modification_date"};
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                //'pc1:resId1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]
                //el primer num (tbody/tr[n]) es la fila y el ultimo (tr/td[n]) la columna
                Functions.getText(driver,
                        new String[]{fields[j], "//*[contains(@id, 'pc1:resId1::db')]/table/tbody/tr[" + i + "]/td[2]/div/table/tbody/tr/td[" + j + "]"},
                        fields[j] + "_" + Integer.toString(i), " on Getting Data");
            }
        }
        return true;
    }

    /**
     * This function tries to execute the EXPORT action that downloads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#sleep(int)
     * @see Functions#screenshot(TestDriver)
     * @see Robot#keyPress(int)
     */
    protected boolean exportAction(TestDriver driver) {
        Functions.sleep(3500);
        driver.getReport().addContent("Action Export:", "h4", "");
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_export", getElements("record_interaction_b_export")},
                " on export")) {
            return false;
        }
        Functions.sleep(1500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_export", getElements("record_interaction_b_export")},
                " on export")) {
            return false;
        }
        Functions.sleep(3000);
        if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
            if (!getData("info_text_export").equals("The report will be process in the next execution")) {
                ErrorManager.process(driver, "Cannot complete the ~Export~ Action");
            }
            Functions.simpleClick(driver,
                    new String[]{"alert_b_ok", getElements("alert_b_ok")},
                    " on export");
            if (!Functions.getText(driver,
                    new String[]{"alert_e_info", getElements("alert_e_info")},
                    "info_text_export",
                    " on export")) {
                return false;
            }
            return true;
        }
        try {// pulsamos enter para descargar el archivo con robot de java
            Robot r = new Robot();
            Functions.screenshot(driver);
            r.keyPress(KeyEvent.VK_ENTER);
            driver.getReport().addContent("Enter pressed on export");
            driver.getReport().addContent("File downloaded on export");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the MODIFY action that uploads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#sleep(int)
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#fileUploader(TestDriver, String[], String[], String)
     * @see #modifyActionFileCreator(TestDriver)
     */
    protected boolean modifyAction(TestDriver driver) {
        Functions.sleep(2500);
        driver.getReport().addContent("Action Modify:", "h4", "");
        modifyActionFileCreator(driver);
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_modify", getElements("record_interaction_b_modify")},
                " on modify")) {
            return false;
        }
        Functions.sleep(3500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_modify", getElements("record_interaction_b_modify")},
                " on modify")) {
            return false;
        }
        if (!Functions.fileUploader(driver,
                new String[]{"record_interaction_b_modify_b_file", getElements("record_interaction_b_modify_b_file")},
                new String[]{"test", "C:\\ProjectAutotest\\src\\main\\resources\\" + getData("file_3")},
                " on modify")) {
            return false;
        }
        Functions.sleep(2500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_modify_b_save", getElements("record_interaction_b_modify_b_save")},
                " on modify")) {
            return false;
        }
        try {
            Functions.sleep(4500);
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Modify~ Action");
                Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on modify");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * For the MODIFY action we need a file to upload that has the same name as the previous, so we create one
     * Cheking it's previous exitence
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see File#createNewFile()
     */
    protected boolean modifyActionFileCreator(TestDriver driver) {
        driver.getReport().addContent("Crafting the file:", "h6", "");
        try {
            File actionFile = new File("C:\\ProjectAutotest\\src\\main\\resources\\" + getData("file_3"));
            if (actionFile.createNewFile()) {
                System.out.println("The file was crafted!");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the REPROCESS action, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#checkClick(TestDriver, String[], String[], String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#screenshot(TestDriver)
     */
    protected boolean reprocessAction(TestDriver driver) {
        driver.getReport().addContent("Action Reprocess:", "h4", "");
        if (!Functions.checkClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                new String[]{"record_interaction_b_reprocess", getElements("record_interaction_b_reprocess")},
                " on reprocess")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_reprocess", getElements("record_interaction_b_reprocess")},
                " on reprocess")) {
            return false;
        }
        try {
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Reprocess~ Action");
                Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on reprocess");

                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (!Functions.simpleClick(driver,
                    new String[]{"record_interaction_b_reprocess_b_ok", getElements("record_interaction_b_reprocess_b_ok")},
                    " on reprocess")) {
                return false;
            }
            if (!Functions.getText(driver,
                    new String[]{"alert_e_info", getElements("alert_e_info")},
                    "info_text_reprocess",
                    " on new")) {
                return false;
            }
            if (!getData("info_text_reprocess").equals("No such file")) {
                Functions.screenshot(driver);
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"alert_b_ok", getElements("alert_b_ok")},
                    " on reprocess")) {
                return false;
            }
            if (driver.getDriver().findElement(By.xpath(getElements("record_interaction_b_reprocess_b_cancel"))).isDisplayed()) {
                ErrorManager.process(driver, "Cannot complete the ~Reprocess~ Action");
                Functions.simpleClick(driver,
                        new String[]{"record_interaction_b_reprocess_b_cancel", getElements("record_interaction_b_reprocess_b_cancel")},
                        " on reprocess");
            }
        } catch (Exception p) {
            p.printStackTrace();
        }
        return true;
    }

    /**
     * This function tries to execute the NEW action that uploads a file, checking every fail or dialog that may happen
     *
     * @param driver Object that manages the core of the test
     * @return boolean Parameter used to control the process flow
     * @see Functions#simpleClick(TestDriver, String[], String)
     * @see Functions#selectText(TestDriver, String[], String, String, String)
     * @see Functions#fileUploader(TestDriver, String[], String[], String)
     * @see Functions#getText(TestDriver, String[], String, String)
     */
    protected boolean newAction(TestDriver driver) {
        driver.getReport().addContent("Action New:", "h4", "");
        Functions.sleep(1000);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_actions", getElements("record_interaction_b_actions")},
                " on new")) {
            return false;
        }
        Functions.sleep(1000);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_new", getElements("record_interaction_b_new")},
                " on new")) {
            return false;
        }
        Functions.sleep(2000);
        if (!Functions.selectText(driver,
                new String[]{"record_interaction_b_new_i_type", getElements("record_interaction_b_new_i_type")},
                "IPS",
                "type",
                " on new")) {
            return false;
        }
        //ToDo learn to use URLs for the files
        if (!Functions.fileUploader(driver,
                new String[]{"record_interaction_b_new_b_file", getElements("record_interaction_b_new_b_file")},
                new String[]{"test", getData("file_new")},
                " on new")) {
            return false;
        }
        Functions.sleep(2500);
        if (!Functions.simpleClick(driver,
                new String[]{"record_interaction_b_new_i_add", getElements("record_interaction_b_new_i_add")},
                " on new")) {
            return false;
        }
        try {
            Functions.sleep(2500);
            if (driver.getDriver().findElement(By.xpath(getElements("alert_b_ok"))).isDisplayed() || driver.getDriver().findElement(By.xpath(getElements("alert_b_x"))).isDisplayed()) {
                if (!Functions.getText(driver,
                        new String[]{"alert_e_info", getElements("alert_e_info")},
                        "info_text_new",
                        " on new")) {
                    return false;
                }
                if (!getData("info_text_new").equals("The report will be process in the next execution")) {
                    ErrorManager.process(driver, "Cannot complete the ~New~ Action");
                }
                Functions.simpleClick(driver,
                        new String[]{"alert_b_ok", getElements("alert_b_ok")},
                        " on new");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * Searches doing inputs of the previous recolected data
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#insertInput(TestDriver, String[], String, String, String)
     * @see Functions#selectText(TestDriver, String[], String, String, String)
     * @see Functions#createLovByValue(TestDriver, String[], String[], String[], String, String, String)
     */
    protected boolean search(TestDriver driver) {
        driver.getReport().addContent("Search:", "h4", "");
        try {
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_report", getElements("search_i_report")},
                    "report_2",
                    getData("report_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.selectText(driver,
                    new String[]{"search_financial_status", getElements("search_financial_status")},
                    getData("financial_status_2"),//ToDo financial status list not equal to results fields, so...
                    "financial_status_2",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_date_from", getElements("search_i_modification_date_from")},
                    "modification_date_2",
                    getData("modification_date_2"),
                    " on SEARCH")) {
                return false;
            }
            Functions.sleep(4500);
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_file", getElements("search_i_file")},
                    "file_2",
                    getData("file_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_merchant", getElements("search_i_merchant")},
                    "merchant_2",
                    getData("merchant_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_date_to", getElements("search_i_modification_date_to")},
                    "modification_date_2",
                    getData("modification_date_2"),
                    " on SEARCH")) {
                return false;
            }
            Functions.sleep(6500);
            if (!Functions.selectText(driver,
                    new String[]{"search_i_type", getElements("search_i_type")},
                    getData("type_2"),
                    "type_2",
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_settelment", getElements("search_i_settelment")},
                    "settelment_2",
                    getData("settelment_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_financial_date_from", getElements("search_i_financial_date_from")},
                    "financial_date_2",
                    getData("financial_date_2"),
                    " on SEARCH")) {
                return false;
            }
            Functions.sleep(4500);
            if (!getData("currency_2").equals(" ")) {
                if (!Functions.createLovByValue(driver,
                        new String[]{"search_lov_currency", getElements("search_lov_currency")},
                        new String[]{"search_i_currency", getElements("search_i_currency")},
                        new String[]{"search_lov_currency_i_currency", getElements("search_lov_currency_i_currency")},
                        getData("currency_2"),
                        "currency2",
                        " on SEARCH")) {
                    return false;
                }
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_financial_date_to", getElements("search_i_financial_date_to")},
                    "financial_date_2",
                    getData("financial_date_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.insertInput(driver,
                    new String[]{"search_i_modification_user", getElements("search_i_modification_user")},
                    "modification_user_2",
                    getData("modification_user_2"),
                    " on SEARCH")) {
                return false;
            }
            if (!Functions.simpleClick(driver,
                    new String[]{"search_b_search", getElements("search_b_search")},
                    " on SEARCH")) {
                return false;
            }
            Functions.sleep(4500);
            if (!Functions.simpleClick(driver,
                    new String[]{"search_e_result", getElements("search_e_result")},
                    " on SEARCH")) {
                return false;
            }
        } catch (Exception search) {
            search.printStackTrace();
        }
        return true;
    }

    /**
     * Does a search via the QBE using the previous recolected data
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#zoomOut(TestDriver, int)
     * @see Functions#clickQbE(TestDriver, String[], String[], String)
     * @see Functions#insertInput(TestDriver, String[], String, String, String)
     * @see Functions#simpleClick(TestDriver, String[], String)
     */
    protected boolean qbe(TestDriver driver) {
        driver.getReport().addContent("QBE Search:", "h4", "");
        Functions.zoomOut(driver, 2);
        if (!Functions.clickQbE(driver,
                new String[]{"record_interaction_b_qbe", getElements("record_interaction_b_qbe")},
                new String[]{"record_interaction_b_qbe_i_report", getElements("record_interaction_b_qbe_i_report")},
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_report", getElements("record_interaction_b_qbe_i_report")},
                "report_3",
                getData("report_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_file", getElements("record_interaction_b_qbe_i_file")},
                "file_3",
                getData("file_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_type", getElements("record_interaction_b_qbe_i_type")},
                "type_3",
                getData("type_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_financial_date", getElements("record_interaction_b_qbe_i_financial_date")},
                "financial_date_3",
                getData("financial_date_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_financial_status", getElements("record_interaction_b_qbe_i_financial_status")},
                "financial_status_3",
                getData("financial_status_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_merchant", getElements("record_interaction_b_qbe_i_merchant")},
                "merchant_3",
                getData("merchant_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_settelment", getElements("record_interaction_b_qbe_i_settelment")},
                "settelment_3",
                getData("settelment_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_currency", getElements("record_interaction_b_qbe_i_currency")},
                "currency_3",
                getData("currency_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_modification_user", getElements("record_interaction_b_qbe_i_modification_user")},
                "modification_user_3",
                getData("modification_user_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.insertInput(driver,
                new String[]{"record_interaction_b_qbe_i_modification_date", getElements("record_interaction_b_qbe_i_modification_date")},
                "modification_date_3",
                getData("modification_date_3"),
                " on QBE")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on QBE")) {
            return false;
        }
        Functions.sleep(4500);
        if (!Functions.simpleClick(driver,
                new String[]{"search_e_result", getElements("search_e_result")},
                " on QBE")) {
            return false;
        }
        return true;
    }

    /**
     * Calls the detachtable function
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#detachTable(TestDriver, String[], boolean, String)
     */
    protected boolean detachTable(TestDriver driver) {
        if (!Functions.detachTable(driver,
                new String[]{"record_interaction_b_detach_table", getElements("record_interaction_b_detach_table")},
                false, " on Detach table")
                ) {
            return false;
        }
        return true;
    }

    /**
     * Click on the Reset button
     *
     * @param driver Object that manages the core of the test
     * @return boolean to control the process flow
     * @see Functions#simpleClick(TestDriver, String[], String)
     */
    protected boolean reset(TestDriver driver) {
        driver.getReport().addContent("Reset:", "h5", "");
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                " on RESET")) {
            return false;
        }
        return true;
    }

    /**
     * Cleans the form and fills the table with results
     *
     * @param driver TestDriver that manages the core of the test
     * @return boolean to control the process flow
     */
    protected boolean enabler(TestDriver driver) {
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")},
                " on SEARCH")) {
            return false;
        }
        if (!Functions.simpleClick(driver,
                new String[]{"search_b_search", getElements("search_b_search")},
                " on SEARCH")) {
            return false;
        }
        return true;
    }

}