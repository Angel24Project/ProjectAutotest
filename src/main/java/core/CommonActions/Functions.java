package core.CommonActions;

import com.google.common.base.Function;
import core.ErrorManager.ErrorManager;
import core.FileGestor.ReportFile;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * This class has all the actions commonly used to test a component
 *
 * @author otorandell on 08/02/2016
 * @author ajvirgili on 04/07/2016
 */
@SuppressWarnings("all")
public class Functions {

    /**
     * This the basic main operation, just does a click on the desired element, whitout waiting for any response from driver.
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     * @param path   String[] - Info reffered to the path of the element to be clicked [0] reffers to path name and [1] to the value
     * @param where  String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean simpleClick(TestDriver driver, String path[], String where) {
        //HOW TO CALL THIS METHOD
        /* if (!Functions.simpleClick(driver,
                new String[]{"header_add", getElements("header_add")}, //element to click
                " on CREATION HEADER")){return false;}*/
        try {
            driver.getDriver().findElement(By.xpath(path[1])).click();
            driver.getReport().addContent(path[0] + " clicked " + where);
        } catch (Exception e) {
            String ecode = "--ERROR: simpleClick(): Unable to click the element " + path[0] + " with xpath: " + path[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method clicks an element expecting another element to be visible, otherwise catches an exception.
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @param path1  String[] - Info reffered to the path of the element to be clicked [0] reffers to path name and [1] to the value
     * @param path2  String[] - Info reffered to the path of the expected element [0] reffers to path name and [1] to the value
     * @param where  String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see WebDriverWait#until(Function)
     * @see ExpectedConditions#presenceOfElementLocated(By)
     * @see ExpectedConditions#elementToBeClickable(By)
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean checkClick(TestDriver driver, String path1[], String path2[], String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.checkClick(driver,
                new String[]{"x", getElements("x")}, //element to click
                new String[]{"y", getElements("x")}, //element expected to appear
                " on WHERE")){return false;}*/
        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), 60, 500);
        WebDriverWait breathetime = new WebDriverWait(driver.getDriver(), 30, 500);
        try {
            breathetime.until(ExpectedConditions.elementToBeClickable(By.xpath(path1[1])));
            driver.getDriver().findElement(By.xpath(path1[1])).click();
        } catch (Exception e) {
            String ecode = "--ERROR: checkClick(): Unable to click the element " + path1[0] + " with xpath: " + path1[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            //catch
            wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path2[1])));
            driver.getReport().addContent(path1[0] + " clicked " + where);

        } catch (Exception e) {
            String ecode = "--ERROR: checkClick(): Unable to check that the element " + path2[0] + " with xpath: " + path2[1] + where + "is visible after clicking " + path1[0] + "(" + path1[1] + ")";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method clicks an element expecting another element to be visible waiting an amount of time, otherwise catches an exception.
     *
     * @param driver      TestDriver - This class manages all the information referent to the current test.
     * @param path1       String - Info reffered to the path of the element to be clicked [0] reffers to path name and [1] to the value
     * @param path2       String[] - Info reffered to the path of the expected element [0] reffers to path name and [1] to the value
     * @param seconds     Integer - Seconds the WebDriverWait element will wait before an exception is thrown
     * @param miliseconds Long - Time in miliseconds between condition checking
     * @param where       String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see WebDriverWait#until(Function)
     * @see ExpectedConditions#elementToBeClickable(By)
     * @see ExpectedConditions#presenceOfElementLocated(By)
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean checkClick(TestDriver driver, String path1[], String path2[], int seconds, long miliseconds, String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.checkClick(driver,
                new String[]{"x", getElements("x")}, //element to click
                new String[]{"y", getElements("x")}, //element expected to appear
                30, 500, //seconds/miliseconds (driver wait)
                " on where")){return false;}*/
        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), seconds, miliseconds);
        WebDriverWait breathetime = new WebDriverWait(driver.getDriver(), 30, 500);
        try {
            breathetime.until(ExpectedConditions.elementToBeClickable(By.xpath(path1[1])));
            driver.getDriver().findElement(By.xpath(path1[1])).click();
        } catch (Exception e) {
            String ecode = "--ERROR: checkClick(): Unable to click the element " + path1[0] + " with xpath: " + path1[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path2[1])));
            driver.getReport().addContent(path1[0] + " clicked " + where);

        } catch (Exception e) {
            String ecode = "--ERROR: checkClick(): Unable to check that the element " + path2[0] + " with xpath: " + path2[1] + where + "is visible after clicking " + path1[0] + "(" + path1[1] + ")";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method clicks an element expecting another element to disappear, otherwise catches an exception.
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @param path1  String[] - Info reffered to the path of the element to be clicked [0] reffers to path name and [1] to the value
     * @param path2  String[] - Info reffered to the path of the expected element [0] reffers to path name and [1] to the value
     * @param where  String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see WebDriverWait#until(Function)
     * @see ExpectedConditions#elementToBeClickable(By)
     * @see ExpectedConditions#invisibilityOfElementLocated(By)
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean checkClickByAbsence(TestDriver driver, String path1[], String path2[], String where) {
        //HOW TO CALL THIS METHOD
        /*   if (!Functions.checkClickByAbsence(driver,
                new String[]{"x", getElements("x")}, //element to click
                new String[]{"y", getElements("x")}, //element expected to disappear
                " on where")){return false;}*/

        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), 30, 1000);
        WebDriverWait breathetime = new WebDriverWait(driver.getDriver(), 30, 500);

        try {
            breathetime.until(ExpectedConditions.elementToBeClickable(By.xpath(path1[1])));
            driver.getDriver().findElement(By.xpath(path1[1])).click();
        } catch (Exception e) {
            String ecode = "--ERROR: checkClickByAbscence(): Unable to click the element " + path1[0] + " with xpath: " + path1[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            wdw.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path2[1])));
            driver.getReport().addContent(path1[0] + " clicked " + where);

        } catch (Exception e) {
            String ecode = "--ERROR: checkClickByAbscence(): Unable to check that the element " + path2[0] + " with xpath: " + path2[1] + where + "has disappeared after clicking " + path1[0] + "(" + path1[1] + ")";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method clicks an element expecting another element to disappear waiting an amount of time, otherwise catches an exception.
     *
     * @param driver      TestDriver - This class manages all the information referent to the current test.
     * @param path1       String[] - Info reffered to the path of the element to be clicked [0] reffers to path name and [1] to the value
     * @param path2       String[] - Info reffered to the path of the expected element [0] reffers to path name and [1] to the value
     * @param seconds     Integer - Seconds the WebDriverWait element will wait before an exception is thrown
     * @param miliseconds Integer - Time in miliseconds between condition checking
     * @param where       String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see WebDriverWait#until(Function)
     * @see ExpectedConditions#elementToBeClickable(By)
     * @see ExpectedConditions#invisibilityOfElementLocated(By)
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean checkClickByAbsence(TestDriver driver, String path1[], String path2[], int seconds, int miliseconds, String where) {
        //HOW TO CALL THIS METHOD
        /* Functions.checkClickByAbsence(driver,
                new String[]{"x", getElements("x")}, //element to click
                new String[]{"y", getElements("x")}, //element expected to disappear
                90, 500,
                " on where");*/

        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), seconds, miliseconds);
        WebDriverWait breathetime = new WebDriverWait(driver.getDriver(), 30, 500);

        try {
            breathetime.until(ExpectedConditions.elementToBeClickable(By.xpath(path1[1])));
            driver.getDriver().findElement(By.xpath(path1[1])).click();
        } catch (Exception e) {
            String ecode = "--ERROR: checkClickByAbscence(): Unable to click the element " + path1[0] + " with xpath: " + path1[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            wdw.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(path2[1])));
            driver.getReport().addContent(path1[0] + " clicked " + where);

        } catch (Exception e) {
            String ecode = "--ERROR: checkClickByAbscence(): Unable to check that the element " + path2[0] + " with xpath: " + path2[1] + where + "has disappeared after clicking " + path1[0] + "(" + path1[1] + ")";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method clicks (or not) QbE button if its not deployed yet, otherwise just checks if it's deployed
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param b_qbe     String[] - Xpath referent to the qbe button, [0] is the data name, [1] is the value
     * @param qbe_input String[] - Xpath referent to the qbe input, [0] is the data name, [1] is the value
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */

    public static boolean clickQbE(TestDriver driver, String[] b_qbe, String[] qbe_input, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.clickQbE(driver,
                new String[]{"x", getElements("x")},// query button
                new String[]{"y", getElements("y")},//any query input
                "where")){return false;} // where the operation occurs
                */
        driver.getReport().addContent("QbE Deployment: ", "h5", "");
        if (driver.getDriver().findElements(By.xpath(qbe_input[1])).size() > 0) {
            driver.getReport().addContent("QbE is already deployed");
        } else {
            driver.getReport().addContent("QbE is not deployed (" + qbe_input[0] + " is not visible), proceeding to click it.");
            if (!checkClick(driver, b_qbe, qbe_input, where)) {
                return false;
            }
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method does a check click and a simple click, intended to do click and search actions which are very common
     *
     * @param driver   TestDriver - This object gathers all the info refferent to the current test
     * @param b_search String[] - [0] is the data name, [1] is the xpath
     * @param e_result String[] - [0] is the data name, [1] is the xpath
     * @param where    String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean clickSearchAndResult(TestDriver driver, String[] b_search, String[] e_result, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.clickSearchAndResult(driver,
                new String[]{"x", getElements("x")}, //search button
                new String[]{"y", getElements("y")}, //result element
                " on SEARCH")){return false;}*/ // where
        if (!checkClick(driver, b_search, e_result, where)) {
            return false;
        }
        break_time(driver, 250, 500);
        if (!simpleClick(driver, e_result, where)) {
            return false;
        }
        return true;
    }

    /**
     * This method does a check click and a simple click, intended to do click and search actions which are very common
     *
     * @param driver   TestDriver - This object gathers all the info refferent to the current test
     * @param b_search String[] - [0] is the data name, [1] is the xpath
     * @param e_result String[] - [0] is the data name, [1] is the xpath
     * @param where    String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean clickSearchAndResult(TestDriver driver, String[] b_search, String[] e_result, int segundos, int milisegundos, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.clickSearchAndResult(driver,
                new String[]{"x", getElements("x")}, //search button
                new String[]{"y", getElements("y")}, //result element
                " on SEARCH")){return false;}*/ // where
        if (!checkClick(driver, b_search, e_result, segundos, milisegundos, where)) {
            return false;
        }
        //break_time(driver, segundos, milisegundos);
        if (!simpleClick(driver, e_result, where)) {
            return false;
        }
        return true;
    }

    /**
     * This method is used to insert strings into the desired input, also checks that is done correctly
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param path      String[] - Path of the input to be filled
     * @param data_name String - Key for the data to be stored
     * @param value     String - Value for the data to be stored
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see WebDriverWait#until(Function)
     * @see ErrorManager#process(TestDriver, String)
     * @see ExpectedConditions#elementToBeClickable(By)
     */
    public static boolean insertInput(TestDriver driver, String path[], String data_name, String value, String where) {
        //HOW TO CALL THIS METHOD:
        /*
        if (!Functions.insertInput(driver, new String[]{"inputname",getElements("inputvalue")},
                "dataname", ""," on where")){return false;}
        */
        driver.getReport().addContent("Insert Input:", "h5", "");
        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), 30, 1000);
        try {
            wdw.until(ExpectedConditions.elementToBeClickable(By.xpath(path[1])));
            if (!simpleClick(driver, path, where)) {
                return false;
            }
            break_time(driver, 30, 500);
            driver.getDriver().findElement(By.xpath(path[1])).clear();
            break_time(driver, 30, 500);
            driver.getDriver().findElement(By.xpath(path[1])).sendKeys(value);
            break_time(driver, 30, 500);
            driver.getTest().getData().put(data_name, driver.getDriver().findElement(By.xpath(path[1])).getAttribute("value"));
            if (!driver.getTest().getData().get(data_name).equals("") && !(driver.getTest().getData().get(data_name) == null)) {

                if (data_name.contains("password")) {
                    driver.getReport().addContent(data_name + " (******) inserted" + where + ".");
                } else {
                    driver.getReport().addContent(data_name + " (" + value + ") inserted" + where + ".");
                }
            }
        } catch (Exception e) {
            String ecode = "--ERROR: insertInput(): Unable to insert " + data_name + " with value: \"" + value + "\" into " + path[0] + " (xpath " + path[1] + ") on " + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        driver.getReport().addContent("", "br", "");
        sleep(1000);
        return true;
    }

    /**
     * Takes a screenshot of the web browser current content
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @return {@code boolean} to control the process flow
     * @see WebElement#sendKeys(CharSequence...)
     * @see Keys#chord(CharSequence...)
     * @see DateFormat#format(Date)
     * @see ReportFile#getFilepath()
     * @see FileUtils#copyFile(File, OutputStream)
     * @see TakesScreenshot#getScreenshotAs(OutputType)
     */
    public static boolean screenshot(TestDriver driver, boolean zoom) {
        //HOW TO CALL THIS METHOD
        //Functions.screenshot(driver);// where
        try {
            String name = driver.getTestdetails().getTestname();
            WebElement html = driver.getDriver().findElement(By.tagName("html"));
            if (zoom) {
                html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
                sleep(1000);
            } else { //CHROME AND IE HAVE ISSUES WITH ZOOM.
                driver.getReport().addContent("--WARNING: screenshot - Chrome and IE Web Drivers have issues with zooming. Method WILL NOT ZOOM!!<br>"
                        + "Keep in mind this might cause problems with screenshot area captured.", "p", "class='warning'");
            }
            Date mydate = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            String date = dateFormat.format(mydate);
            File scrFile = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);
            name = name + "_picture_at_" + date + ".png";
            ReportFile reportfile = new ReportFile(driver);
            String path = reportfile.getFilepath();
            FileUtils.copyFile(scrFile, new File(path + name));
            driver.getReport().addImage(name, "");


        } catch (IOException e) {
            String message = "--ERROR: screenshot(): Unable to screnshot, probably driver doesent exist anymore or was never created";
            e.printStackTrace();
            ErrorManager.process(driver, message);
            return false;
        }
        return true;
    }

    public static boolean screenshot(TestDriver driver) {
        //HOW TO CALL THIS METHOD
        //Functions.screenshot(driver);// where
        try {
            String name = driver.getTestdetails().getTestname();
            WebElement html = driver.getDriver().findElement(By.tagName("html"));
            if (driver.getDriverdetails().getBrowser().equals("ff")) {
                html.sendKeys(Keys.chord(Keys.CONTROL, "0"));
                sleep(1000);
            } else { //CHROME AND IE HAVE ISSUES WITH ZOOM.
                driver.getReport().addContent("--WARNING: screenshot - Chrome and IE Web Drivers have issues with zooming. Method WILL NOT ZOOM!!<br>"
                        + "Keep in mind this might cause problems with screenshot area captured.", "p", "class='warning'");
            }
            Date mydate = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            String date = dateFormat.format(mydate);
            File scrFile = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);
            name = name + "_picture_at_" + date + ".png";
            ReportFile reportfile = new ReportFile(driver);
            String path = reportfile.getFilepath();
            FileUtils.copyFile(scrFile, new File(path + name));
            driver.getReport().addImage(name, "");


        } catch (IOException e) {
            String message = "--ERROR: screenshot(): Unable to screnshot, probably driver doesent exist anymore or was never created";
            e.printStackTrace();
            ErrorManager.process(driver, message);
            return false;
        }
        return true;
    }

    /**
     * This method does the auditData process entirely, even clicks the actions button first.
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param b_actions String[] - Xpath referent to the actions button, [0] is the data name, [1] is the value
     * @param b_audit   String[] - Xpath referent to the audit button, [0] is the data name, [1] is the value
     * @param b_ok      String[] - Xpath referent to the pop up ok button, [0] is the data name, [1] is the value
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean auditData(TestDriver driver, String[] b_actions, String[] b_audit, String[] b_ok, boolean zoom, String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.auditData(driver,
                new String[]{"x",getElements("x")}, //actions button
                new String[]{"y",getElements("y")}, //audit button
                new String[]{"z",getElements("z")}, //audit_b_ok
                true/false, //zoom in??
                "where")){return false;}*/ //where this occurs
        driver.getReport().addContent("Audit Data:", "h5", "");
        if (!checkClick(driver, b_actions, b_audit, where)) {
            return false;
        }
        if (!checkClick(driver, b_audit, recursiveXPaths.glass, where)) {
            return false;
        }
        screenshot(driver, zoom);
        if (!checkClickByAbsence(driver, b_ok, recursiveXPaths.glass, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    public static boolean auditData(TestDriver driver, String[] b_actions, String[] b_audit, String[] b_ok, String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.auditData(driver,
                new String[]{"x",getElements("x")}, //actions button
                new String[]{"y",getElements("y")}, //audit button
                new String[]{"audit_b_ok",recursiveXPaths.audit_b_ok}, //audit_b_ok
                "where")){return false;}*/ //where this occurs
        driver.getReport().addContent("Audit Data:", "h5", "");
        if (!checkClick(driver, b_actions, b_audit, where)) {
            return false;
        }
        if (!checkClick(driver, b_audit, recursiveXPaths.glass, where)) {
            return false;
        }
        screenshot(driver);
        if (!checkClickByAbsence(driver, b_ok, recursiveXPaths.glass, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * this method fills a LoV field by searching in the internal lov search for a value, and saves it into data for a further usage
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param b_lov     String[] - Xpath referent to the LoV button, [0] is the data name, [1] is the value
     * @param i_lov     String[] - Xpath referent to the LoV input, [0] is the data name, [1] is the value
     * @param b_search  String[] - Xpath referent to the LoV internal search button, [0] is the data name, [1] is the value
     * @param e_result  String[] - Xpath referent to the LoV internal result, [0] is the data name, [1] is the value
     * @param b_ok      String[] - Xpath referent to the LoV internal ok button, [0] is the data name, [1] is the value
     * @param data_name String - The data name value to search in the lov
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean createLov(TestDriver driver, String[] b_lov, String[] i_lov, String[] b_search, String[] e_result, String[] b_ok, String data_name, String where) {
        // HOW TO CALL THIS METHOD
        /* if(!Functions.createLov(driver,
                new String[]{"x",getElements("y")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "", //Data name
                "")){return false;} */ // where the operation occurs
        driver.getReport().addContent("LoV Creation: ", "h5", "");
        String attr;
        if (!simpleClick(driver, i_lov, where)) {
            return false;
        }
        if (!checkClick(driver, b_lov, b_search, where)) {
            return false;
        }
        if (!clickSearchAndResult(driver, b_search, e_result, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver, b_ok, recursiveXPaths.lov_e_result, where)) {
            return false;
        }
        try {
            attr = driver.getDriver().findElement(By.xpath(i_lov[1])).getAttribute("value");
            if (!attr.equals("") && !attr.equals(null)) {
                driver.getTest().getData().put(data_name, attr);
            } else {
                String ecode = "--ERROR: createLov - Unable to check that the correct value was inserted in " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ". Value is blank or null.";
                ErrorManager.process(driver, ecode);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String ecode = "--ERROR: createLov - Unable to get the selected " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ".";
            ErrorManager.process(driver, ecode);
            return false;
        }

        driver.getReport().addContent("", "br", "");
        return true;

    }

    /**
     * this method fills a LoV field by searching in the internal lov search for a value, and saves it into data for a further usage
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param b_lov     String[] - Xpath referent to the LoV button, [0] is the data name, [1] is the value
     * @param i_lov     String[] - Xpath referent to the LoV input, [0] is the data name, [1] is the value
     * @param b_search  String[] - Xpath referent to the LoV internal search button, [0] is the data name, [1] is the value
     * @param e_result  String[] - Xpath referent to the LoV internal result, [0] is the data name, [1] is the value
     * @param b_ok      String[] - Xpath referent to the LoV internal ok button, [0] is the data name, [1] is the value
     * @param data_name String - The data name value to search in the lov
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean createLov(TestDriver driver, String[] b_lov, String[] i_lov, String[] b_search, String[] e_result, String[] b_ok, String data_name, int segundos, int milisegundos, String where) {
        // HOW TO CALL THIS METHOD
        /* if(!Functions.createLov(driver,
                new String[]{"x",getElements("y")}, // b_lov
                new String[]{"", getElements("")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "", //Data name
                120,500,
                "")){return false;} */ // where the operation occurs
        driver.getReport().addContent("LoV Creation: ", "h5", "");
        String attr;
        if (!simpleClick(driver, i_lov, where)) {
            return false;
        }
        if (!checkClick(driver, b_lov, b_search, where)) {
            return false;
        }
        if (!clickSearchAndResult(driver, b_search, e_result, segundos, milisegundos, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver, b_ok, recursiveXPaths.lov_e_result, where)) {
            return false;
        }
        try {
            attr = driver.getDriver().findElement(By.xpath(i_lov[1])).getAttribute("value");
            if (!attr.equals("") && !attr.equals(null)) {
                driver.getTest().getData().put(data_name, attr);
            } else {
                String ecode = "--ERROR: createLov - Unable to check that the correct value was inserted in " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ". Value is blank or null.";
                ErrorManager.process(driver, ecode);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            String ecode = "--ERROR: createLov - Unable to get the selected " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ".";
            ErrorManager.process(driver, ecode);
            return false;
        }

        driver.getReport().addContent("", "br", "");
        return true;

    }

    /**
     * This method catches the value of the attribute "value" from a WebElement and puts it into the data map.
     *
     * @param driver    TestDriver -Gathers all the info refferent to the current test
     * @param path      String[] - Xpath referent to the target WebElement, [0] is the data name, [1] is the value
     * @param data_name String - Name of the data that is included in the data map
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean getValue(TestDriver driver, String[] path, String data_name, String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.getValue(driver,new String[]{"x", getElements("x")}, // element path
                "dataname", // key for data value (the name)
                " on where")){return false;}*/ // where this operation occurs
        WebElement element = findElement(driver, path, where);
        String attr;
        try {
            break_time(driver, 30, 500);
            attr = element.getAttribute("value");
        } catch (Exception e) {
            String ecode = "--ERROR:getValue(): Unable to get the value of " + path[0] + " with xpath: " + path[1] + " " + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        driver.getTest().getData().put(data_name, attr);
        driver.getReport().addContent("HTML value (" + attr + ") taken from " + path[0] + where);
        return true;
    }

    /**
     * This method catches the value of the attribute passed by parameters from a WebElement and puts it into the data map.
     *
     * @param driver    TestDriver - Gathers all the info refferent to the current test
     * @param path      String[] - Xpath referent to the target WebElement, [0] is the data name, [1] is the value
     * @param attr      String - name of the attribute that give the value
     * @param data_name String - Name of the data that is included in the data map
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean getAttr(TestDriver driver, String[] path, String attr, String data_name, String where) {
        //HOW TO CALL THIS METHOD
        /*Functions.getAttr(driver,
                new String[]{"x", getElements("x")}, // element path
                "attr", // atribute to get data (class, value, id, style, etc...)
                "data_name", // key for data value (the name)
                "where");*/ // where this operation occurs
        WebElement element = findElement(driver, path, where);
        String varx;
        try {
            varx = element.getAttribute(attr);
        } catch (Exception e) {
            String ecode = "--ERROR:getValue(): Unable to get the value of " + path[0] + " with xpath: " + path[1] + " " + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        driver.getTest().getData().put(data_name, varx);
        driver.getReport().addContent("HTML " + attr + " (" + varx + ") taken from " + path[0] + where);
        return true;
    }

    /**
     * This method catches the text value from a WebElement and puts it into the data map.
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param path      String[] - [0] is the data name to asign, [1] is the Xpath referent to the target WebElement
     * @param data_name String - Name of the data that is included in the data map
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean getText(TestDriver driver, String[] path, String data_name, String where) {
        //HOW TO CALL THIS METHOD
        /* if(!Functions.getText(driver,new String[]{"x", getElements("x")}, // element path
                "dataname", // key for data value (the name)
                " on where")){return false;}*/ // where this operation occurs
        WebElement element = findElement(driver, path, where);
        String text;
        try {
            text = element.getText();
        } catch (Exception e) {
            String ecode = "--ERROR:getText(): Unable to get the value of " + path[0] + " with xpath: " + path[1] + " " + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        driver.getTest().getData().put(data_name, text);
        driver.getReport().addContent("Content (" + text + ") taken from " + path[0] + where);
        return true;
    }

    /**
     * This method fills a LoV field by searching in the internal lov search for a specific value, and saves it into the data map for a further usage
     *
     * @param driver       TestDriver - This object gathers all the info refferent to the current test
     * @param b_lov        String[] - Xpath referent to the LoV button, [0] is the data name, [1] is the value
     * @param i_lov        String[] - Xpath referent to the LoV input, [0] is the data name, [1] is the value
     * @param i_inside_lov String[] - Xpath referent to the internal LoV input, [0] is the data name, [1] is the value
     * @param value        String - This is what will be searched into the lov
     * @param data_name    String - Name of the data that is included in the data map
     * @param where        String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean createLovByValue(TestDriver driver, String[] b_lov, String[] i_lov, String[] i_inside_lov, String value, String data_name, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.createLovByValue(driver,
                new String[]{"x", getElements("x")}, //LoV button
                new String[]{"y", getElements("y")}, //external LoV input
                new String[]{"z", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                "value", // value to search
                "data_name", //name of the data
                " on where")){return false;}*/ //where this operation occurs
        driver.getReport().addContent("LoV by value Creation: ", "h5", "");
        String attr;
        if (!simpleClick(driver, i_lov, where)) {
            return false;
        }
        if (!checkClick(driver, b_lov, recursiveXPaths.lov_b_search, where)) {
            return false;
        }
        try {
            break_time(driver, 30, 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!insertInput(driver, i_inside_lov, "ref" + data_name, value, where)) {
            return false;
        }
        if (!clickSearchAndResult(driver, recursiveXPaths.lov_b_search, recursiveXPaths.lov_e_result, where)) {
            return false;
        }

        if (!checkClickByAbsence(driver, recursiveXPaths.lov_b_ok, recursiveXPaths.lov_b_search, where)) {
            return false;
        }
        break_time(driver, 2, 500);
        try {
            attr = driver.getDriver().findElement(By.xpath(i_lov[1])).getAttribute("value");
            if (!attr.equals("") && !attr.equals(null)) {
                driver.getTest().getData().put(data_name, attr);
            } else {
                String ecode = "--ERROR: createLov - Unable to check that the correct value was inserted in " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ". Value is blank or null.";
                ErrorManager.process(driver, ecode);
                return false;

            }
        } catch (Exception e) {
            String ecode = "--ERROR: createLov - Unable to get the selected " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }

        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This functions allows you to use createLovByValue specifying whith result to choose from the result list(first, second, etc)
     *
     * @param driver
     * @param b_lov
     * @param i_lov
     * @param i_inside_lov
     * @param e_result
     * @param value
     * @param dataName
     * @param where
     * @return
     */
    public static boolean createLovByValue(TestDriver driver, String[] b_lov, String[] i_lov, String[] i_inside_lov, String[] e_result, String value, String dataName, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.createLovByValue(driver,
                new String[]{"x", getElements("x")}, //LoV button
                new String[]{"y", getElements("y")}, //external LoV input
                new String[]{"z", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "value", // value to search
                "data_name", //name of the data
                " on where")){return false;}*/ //where this operation occurs

        driver.getReport().addContent("LoV by value Creation: ", "h5", "");
        String attr = "";
        if (!simpleClick(driver, i_lov, where)) {
            return false;
        }
        if (!checkClick(driver, b_lov, recursiveXPaths.lov_b_search, where)) {
            return false;
        }
        if (!insertInput(driver, i_inside_lov, "ref" + dataName, value, where)) {
            return false;
        }
        Functions.sleep(1000);
        if (!clickSearchAndResult(driver, recursiveXPaths.lov_b_search, e_result, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver, recursiveXPaths.lov_b_ok, recursiveXPaths.lov_b_search, where)) {
            return false;
        }

        try {
            attr = driver.getDriver().findElement(By.xpath(i_lov[1])).getAttribute("value");
            if (!attr.equals("") && !attr.equals(null)) {
                driver.getTest().getData().put(dataName, attr);
            } else {
                String ecode = "--ERROR: createLov - Unable to check that the correct value was inserted in " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ". Value is blank or null.";
                ErrorManager.process(driver, ecode);
                return false;
            }
        } catch (Exception e) {
            String ecode = "--ERROR: createLov - Unable to get the selected " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }

        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method presses the enter button to do a query search, and then tries to click a result
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param qbe_input String[] - Xpath referent to the query input, [0] is the data name, [1] is the value
     * @param e_result  String[] - Xpath referent to the result, [0] is the data name, [1] is the value
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean enterQueryAndClickResult(TestDriver driver, String[] qbe_input, String[] e_result, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"x", getElements("x")}, //any query input
                new String[]{"y", getElements("y")}, //table result
                "where")){return false;} // where this operation occurs
                */
        if (!simpleClick(driver, qbe_input, where)) {
            return false;
        }
        try {
            driver.getDriver().findElement(By.xpath(qbe_input[1])).sendKeys(Keys.RETURN);
        } catch (Exception e) {
            String ecode = "--ERROR: enterQueryAndClickResult - Unable to enter the data in the query.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        break_time(driver, 120, 500);
        if (!simpleClick(driver, e_result, where)) {
            return false;
        }
        return true;
    }

    /**
     * This method presses the enter button to do a query search, and then tries to click a result
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param qbe_input String[] - Xpath referent to the query input, [0] is the data name, [1] is the value
     * @param e_result  String[] - Xpath referent to the result, [0] is the data name, [1] is the value
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean enterQueryAndClickResult(TestDriver driver, String[] qbe_input, String[] e_result, int seconds, long miliseconds, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"x", getElements("x")}, //any query input
                new String[]{"y", getElements("y")}, //table result
                "where")){return false;} // where this operation occurs
                */
        if (!simpleClick(driver, qbe_input, where)) {
            return false;
        }
        try {
            driver.getDriver().findElement(By.xpath(qbe_input[1])).sendKeys(Keys.RETURN);
        } catch (Exception e) {
            String ecode = "--ERROR: enterQueryAndClickResult - Unable to enter the data in the query.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        break_time(driver, seconds, miliseconds);
        if (!simpleClick(driver, e_result, where)) {
            return false;
        }
        return true;
    }

    /**
     * This method chooses the wanted option form dropdown menus
     *
     * @param driver     TestDriver - This object gathers all the info refferent to the current test
     * @param pathselect String[] - Xpath referent to the select WebElement, [0] is the data name, [1] is the value
     * @param content    String - Value of the element we are searching for
     * @param dataname   String - Name of the data that is included in the data map
     * @param where      String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     * @see Select#getOptions()
     * @see List
     * @see WebElement
     */
    public static boolean selectText(TestDriver driver, String[] pathselect, String content, String dataname, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.selectText(driver,
                new String[]{"x",getElements("x")},
                "content", "dataname", " on where")){return false;}*/
        boolean found = false;
        Select e_select;
        List<WebElement> options;
        try {
            e_select = new Select(driver.getDriver().findElement(By.xpath(pathselect[1])));
            options = e_select.getOptions();
        } catch (Exception f) {
            String ecode = "--ERROR: selectText(): Unable to find the element " + pathselect[0] + " with xpath: " + pathselect[1] + where + ".";
            f.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            for (WebElement option : options) {
                String optiontext = option.getText();
                if (optiontext.contains(content)) {
                    option.click();
                   /* sleep(2000);*/
                    driver.getReport().addContent("Option (" + content + ") selected on " + pathselect[0] + ".");
                    found = true;
                    driver.getTest().getData().put(dataname, content);
                    break;
                }
            }
            if (!found) {
                String ecode = "--ERROR: selectText(): Unable to find the target option " + content + " into " + pathselect[0] + " with xpath: " + pathselect[1] + where + ".";
                ErrorManager.process(driver, ecode);
                return false;
            }
        } catch (Exception e) {
            String ecode = "--ERROR: selectText(): Unable to find the target option " + content + " into " + pathselect[0] + " with xpath: " + pathselect[1] + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This method chooses the random option form dropdown menus, you have indicate an array with values.
     *
     * @param driver     TestDriver - This object gathers all the info refferent to the current test
     * @param pathselect String[] - Xpath referent to the select WebElement, [0] is the data name, [1] is the value
     * @param content    array - array of values
     * @param dataname   String - Name of the data that is included in the data map
     * @param where      String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     * @see ErrorManager#process(TestDriver, String)
     * @see Select#getOptions()
     * @see List
     * @see WebElement
     */
    public static boolean selectTextRandom(TestDriver driver, String[] pathselect, String[] content, String dataname, String where) {
        //HOW TO CALL THIS METHOD
        /*  String list_options[] = {"value1", "value2", "value3"};
            if (!Functions.selectTextRandom(driver,
                new String[]{"x", getElements("x")},
                list_options, "data name", "where")){return false;}*/

        String option = (content[new Random().nextInt(content.length)]);
        if (!Functions.selectText(driver, pathselect, option, dataname, where)) {
            return false;
        }
        return true;
    }

    /**
     * This method does the process of the detach table testing
     *
     * @param driver     String - This object gathers all the info refferent to the current test
     * @param path       String[] - Xpath referent to the detach button, [0] is the data name, [1] is the value
     * @param screenshot Boolean - Value that indicates if the process has or not to do an screenshot
     * @param where      String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean detachTable(TestDriver driver, String[] path, boolean screenshot, boolean zoom, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.detachTable(driver,
                new String[]{"x",getElements("x")}, //detach button
                true/false,     //screenshot??
                true/false,    //zoom in??
                "where")){return false;}*/     //where this occurs
        driver.getReport().addContent("Detach Table:", "h5", "");
        if (!simpleClick(driver, path, where)) {
            return false;
        }
        if (screenshot) {
            screenshot(driver, zoom);
        }
        if (!simpleClick(driver, path, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    public static boolean detachTable(TestDriver driver, String[] path, boolean screenshot, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.detachTable(driver,
                new String[]{"x",getElements("x")}, //detach button
                true/false,     //screenshot??
                "where")){return false;}*/     //where this occurs
        driver.getReport().addContent("Detach Table:", "h5", "");
        if (!simpleClick(driver, path, where)) {
            return false;
        }
        if (screenshot) {
            screenshot(driver);
        }
        if (!simpleClick(driver, path, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method manages all the delete process in Atlas 2.0
     *
     * @param driver   TestDriver - This object gathers all the info refferent to the current test
     * @param b_delete String[] - Xpath referent to the delete button, [0] is the data name, [1] is the value
     * @param where    String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean doDelete(TestDriver driver, String[] b_delete, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.doDelete(driver,
                new String[]{"x", getElements("x")},//delete button
                "where")){return false;}*/
        driver.getReport().addContent("Deleting Record:", "h5", "");
        if (!checkClick(driver, b_delete, recursiveXPaths.glass, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver, new String[]{"b_delete_yes",
                recursiveXPaths.delete_b_yes}, recursiveXPaths.glass, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method manages all the delete process in Atlas 2.0 overrides with the b_delete_yes param
     *
     * @param driver       TestDriver - This object gathers all the info refferent to the current test
     * @param b_delete     String[] - Xpath referent to the delete button, [0] is the data name, [1] is the value
     * @param b_delete_yes String[] - Xpath referent to the confirmation delete button, [0] is the data name, [1] is the value
     * @param where        String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean doDelete(TestDriver driver, String[] b_delete, String[] b_delete_yes, String where) {
        //HOW TO CALL THIS METHOD
        /*if(!Functions.doDelete(driver,
                new String[]{"x", getElements("x")},//delete button
                new String[]{"x", getElements("x")},//delete button
                "where")){return false;}*/
        driver.getReport().addContent("Deleting Record:", "h5", "");
        if (!checkClick(driver, b_delete, recursiveXPaths.glass, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver,
                b_delete_yes,
                recursiveXPaths.glass, where)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method manages all the delete process in Atlas 2.0, also checks the records to check if was successful
     *
     * @param driver    TestDriver - This object gathers all the info refferent to the current test
     * @param b_delete  String[] - Xpath referent to the delete button, [0] is the data name, [1] is the value
     * @param n_records String[] - Xpath referent to the record values, [0] is the data name, [1] is the value
     * @param where     String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    //TODO check this function|out
    public static boolean doDeleteNCheck(TestDriver driver, String[] b_delete, String[] n_records, String where) {
        /*
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"x", getElements("x")},
                new String[]{"x", getElements("x")},
                " where")){return false;}
         */

        driver.getReport().addContent("Deleting Record:", "h5", "");
        if (!zoomOut(driver)) {
            return false;
        }
        int recordsbefore = 0;
        int recordsafter = 0;
        try {
            recordsbefore = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
        } catch (Exception e) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer before delete was done.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        if (!checkClick(driver, b_delete, recursiveXPaths.glass, where)) {
            return false;
        }
        if (!checkClickByAbsence(driver, new String[]{"b_delete_yes",
                recursiveXPaths.delete_b_yes}, recursiveXPaths.glass, where)) {
            return false;
        }
        try {
            recordsafter = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
        } catch (Exception f) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer after delete was done.";
            f.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        if ((recordsbefore - recordsafter) == 1) {
            driver.getReport().addContent("Delete successful, records changed from: " + recordsbefore + " to: " + recordsafter + ".");
        } else if ((recordsbefore - recordsafter) != 0) {
            driver.getReport().addContent("Oops seems like mutiple operations occured during test, cannot confirm delete was or not successful, records from: " + recordsbefore + " to: " + recordsafter + ".", "p", "class='warning'");
        } else if ((recordsbefore - recordsafter) == 0) {
            String message = "Delete Unsuccessful, records didn't change (from: " + recordsbefore + " to: " + recordsafter + ").";
            ErrorManager.process(driver, message);
            return false;
        }
        if (!zoomIn(driver)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * This method manages all the delete process in Atlas 2.0, also checks the records to check if was successful
     *
     * @param driver       TestDriver - This object gathers all the info refferent to the current test
     * @param b_delete     String[] - Xpath referent to the delete button, [0] is the data name, [1] is the value
     * @param n_records    String[] - Xpath referent to the record values, [0] is the data name, [1] is the value
     * @param delete_b_yes String[] - Xpath referent to the yes button (confirmation deletion), [0] is the data name, [1] is the value
     * @param where        String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean doDeleteNCheck(TestDriver driver, String[] b_delete, String[] n_records, String[] delete_b_yes, String where) {
        /*
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"x", getElements("x")}, //button delete
                new String[]{"x", getElements("x")}, // result
                new String[]{"delete_b_yes", getElements("delete_b_yes")}, //delete button yes
                " where")){return false;}
         */

        driver.getReport().addContent("Deleting Record:", "h5", "");
        if (!zoomOut(driver)) {
            return false;
        }
        int recordsbefore = 0;
        int recordsafter = 0;
        int expected = 1;
        int unexpected = 0;
        try {
            if (driver.getDriver().findElement(By.xpath(n_records[1])).getText().contains("Records")) {
                String algo = driver.getDriver().findElement(By.xpath(n_records[1])).getText();
                String[] algo3 = driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:");
                recordsbefore = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:")[1]);
            } else {
                recordsbefore = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
            }
        } catch (Exception e) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer before delete was done.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        checkClick(driver, b_delete, recursiveXPaths.glass, where);
        checkClickByAbsence(driver,
                new String[]{"b_delete_yes", delete_b_yes[1]},
                recursiveXPaths.glass,
                120, 500,
                where);
        try {
            if (driver.getDriver().findElement(By.xpath(n_records[1])).getText().contains("Records")) {
                recordsafter = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:")[1]);
            } else {
                recordsafter = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
            }
        } catch (Exception f) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer after delete was done.";
            f.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        if (recordsbefore - recordsafter == expected) {
            driver.getReport().addContent("Delete successful, records changed from: " + recordsbefore + " to: " + recordsafter + ".");
        } else if (recordsbefore - recordsafter != unexpected) {
            driver.getReport().addContent("Oops seems like mutiple operations happened during test, cannot confirm delete was or not successful, records from: " + recordsbefore + " to: " + recordsafter + ".", "p", "class='warning'");
        } else if (recordsbefore - recordsafter == unexpected) {
            String message = "Delete Unsuccessful, records didn't change (from: " + recordsbefore + " to: " + recordsafter + ").";
            ErrorManager.process(driver, message);
            return false;
        }
        if (!zoomIn(driver)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;

    }
    /**
     * This method manages all the delete process in Atlas 2.0, also checks the records to check if was successful
     *
     * @param driver       TestDriver - This object gathers all the info refferent to the current test
     * @param b_delete     String[] - Xpath referent to the delete button, [0] is the data name, [1] is the value
     * @param n_records    String[] - Xpath referent to the record values, [0] is the data name, [1] is the value
     * @param delete_b_yes String[] - Xpath referent to the yes button (confirmation deletion), [0] is the data name, [1] is the value
     * @param where        String - Tells where the operation is taking effect
     * @return {@code boolean} to control the process flow
     */
    public static boolean doDeleteNCheck(TestDriver driver, String[] b_delete, String[] n_records, String[] delete_b_yes,int seconds, int miliseconds, String where) {
        /*
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"x", getElements("x")}, //button delete
                new String[]{"x", getElements("x")}, // result
                new String[]{"delete_b_yes", getElements("delete_b_yes")}, //delete button yes
                120,500,
                " where")){return false;}
         */

        driver.getReport().addContent("Deleting Record:", "h5", "");
        if (!zoomOut(driver)) {
            return false;
        }
        int recordsbefore = 0;
        int recordsafter = 0;
        int expected = 1;
        int unexpected = 0;
        try {
            if (driver.getDriver().findElement(By.xpath(n_records[1])).getText().contains("Records")) {
                String algo = driver.getDriver().findElement(By.xpath(n_records[1])).getText();
                String[] algo3 = driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:");
                recordsbefore = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:")[1]);
            } else {
                recordsbefore = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
            }
        } catch (Exception e) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer before delete was done.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        checkClick(driver, b_delete, recursiveXPaths.glass, seconds,miliseconds,where);
        checkClickByAbsence(driver,
                new String[]{"b_delete_yes", delete_b_yes[1]},
                recursiveXPaths.glass,
                seconds, miliseconds,
                where);
        try {
            if (driver.getDriver().findElement(By.xpath(n_records[1])).getText().contains("Records")) {
                recordsafter = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText().split("Records:")[1]);
            } else {
                recordsafter = Integer.parseInt(driver.getDriver().findElement(By.xpath(n_records[1])).getText());
            }
        } catch (Exception f) {
            String ecode = "--ERROR: doDeleteNCheck(): Unable to find " + n_records[0] + " or cast it to integer after delete was done.";
            f.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        if (recordsbefore - recordsafter == expected) {
            driver.getReport().addContent("Delete successful, records changed from: " + recordsbefore + " to: " + recordsafter + ".");
        } else if (recordsbefore - recordsafter != unexpected) {
            driver.getReport().addContent("Oops seems like mutiple operations happened during test, cannot confirm delete was or not successful, records from: " + recordsbefore + " to: " + recordsafter + ".", "p", "class='warning'");
        } else if (recordsbefore - recordsafter == unexpected) {
            String message = "Delete Unsuccessful, records didn't change (from: " + recordsbefore + " to: " + recordsafter + ").";
            ErrorManager.process(driver, message);
            return false;
        }
        if (!zoomIn(driver)) {
            return false;
        }
        driver.getReport().addContent("", "br", "");
        return true;

    }

    /**
     * Zooms out the WebDriver
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @return {@code boolean} to control the process flow
     * @see WebElement#sendKeys(CharSequence...)
     * @see Keys
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean zoomOut(TestDriver driver) {

        /*
         if (!Functions.zoomOut(driver )){return false;}
         */

        try {
            WebElement html = driver.getDriver().findElement(By.tagName("html"));
            html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            driver.getReport().addContent("Screen zoomed out");
        } catch (Exception e) { // by the way, this error "should never" be shown, zoom cannot fail (unless something really weird happens)
            String ecode = "--ERROR:zoomOut(): Not possible to zoom out.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * Zooms out the WebDriver an amount of times determined by parmeters
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @param times  Integer - Controls how many times we zoomOut
     * @return {@code boolean} to control the process flow
     * @see WebElement#sendKeys(CharSequence...)
     * @see Keys
     * @see ErrorManager#process(TestDriver, String)
     */

    public static boolean zoomOut(TestDriver driver, int times) {

        /*
           if (!Functions.zoomOut(driver, 2)){return false;}
        */

        try {
            WebElement html = driver.getDriver().findElement(By.tagName("html"));
            for (int i = 0; i < times + 1; i++) {
                html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
            }
            driver.getReport().addContent("Screen zoomed out " + times + " times.");
        } catch (Exception e) { // by the way, this error "should never" be shown, zoom cannot fail (unless something really weird happens)
            String ecode = "--ERROR:zoomOut(): Not possible to zoom out.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * Zooms in the WebDriver
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     * @return {@code boolean} to control the process flow
     * @see WebElement#sendKeys(CharSequence...)
     * @see Keys
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean zoomIn(TestDriver driver) {

         /*
         if (!Functions.zoomIn(driver )){return false;}
         */

        try {
            WebElement html = driver.getDriver().findElement(By.tagName("html"));
            html.sendKeys(Keys.chord(Keys.CONTROL, Keys.NUMPAD0));

            driver.getReport().addContent("Screen zoomed in to default");
        } catch (Exception e) { // by the way, this error "should never" be shown, zoom cannot fail (unless something really weird happens)
            String ecode = "--ERROR:zoomIn(): Not possible to zoom in.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }


    /**
     * This function insert a value random in a input and search if the value appers in the result table.
     * If appears, change the value inserted and
     * try again to search the value and stop when the value no exist in the table result.
     *
     * @param driver
     * @param value
     * @param dataname
     * @param input
     * @param button
     * @param result
     * @param randtype
     * @param length
     * @param where
     * @return
     */
    public static boolean checkExistence(TestDriver driver, String value, String dataname, String[] input, String button[], String result[], String randtype, int length, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.checkExistence(driver,
                "", //value
                "x",//data name (x)
                new String[]{"y", getElements("y")},//input
                new String[]{"z", getElements("z")},//search button
                new String[]{"w", getElements("w")},//expected not found result
                "integer/string/both",//type of input
                2, //value length
                "")){return false;}//where
                */
        driver.getReport().addContent("Check Existence:", "h5", "");
        String myrand;
        String newvalue;
        String replacement = "";
        int i = 0;
        driver.getReport().addRawText("<!--Start-->");
        do {
            switch (randtype.toLowerCase()) {
                case "integer":
                    String zeros = "00000000000000000000";
                    String nines = "99999999999999999999";
                    int min = Integer.valueOf("1" + zeros.substring(0, length - 1));
                    int max = Integer.valueOf(nines.substring(0, length));
                    myrand = Integer.toString(DataGenerator.random(min, max));
                    break;
                case "string":
                    myrand = DataGenerator.getRandomAlphanumericSequence(length, false);
                    break;
                default:
                    myrand = DataGenerator.getRandomAlphanumericSequence(length, true);
                    break;
            }
            newvalue = value + myrand;
            if (!insertInput(driver, input, dataname, newvalue, where)) {
                return false;
            }
            if (!simpleClick(driver, button, where)) {
                return false;
            }
            i++;
        } while (driver.getDriver().findElements(By.xpath(result[1])).size() > 0 || i >= 30);

        driver.getReport().addRawText("<!--End-->");
        int startIndex = driver.getReport().getContent().indexOf("<!--Start-->", 0);
        int endIndex = driver.getReport().getContent().indexOf("<!--End-->", 9);
        String str = driver.getReport().getContent().substring(startIndex, endIndex);
        driver.getReport().getContent().replace(str, replacement);

        if (i >= 30) {
            String message = "--ERROR: checkExistence(): Unable to not overlap other records after " + i + " tries";
            ErrorManager.process(driver, message);
            return false;
        } else {
            driver.getTest().getData().put(dataname, newvalue);
            driver.getReport().addContent(newvalue + " choosen to fill " + dataname + "value.");

        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    public static boolean checkExistence(TestDriver driver, String value, String dataname, String[] input, String button[], String result[], String randtype, String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.checkExistence(driver,
                "", //value
                "x",//data name (x)
                new String[]{"y", getElements("y")},//input
                new String[]{"z", getElements("z")},//search button
                new String[]{"w", getElements("w")},//expected not found result
                "integer/string/both",//type of input
                "")){return false;}//where
                */
        driver.getReport().addContent("Check Existence:", "h5", "");
        String myrand;
        String newvalue;
        String replacement = "";
        int i = 0;
        driver.getReport().addRawText("<!--Start-->");
        do {
            switch (randtype.toLowerCase()) {
                case "integer":
                    myrand = Integer.toString(DataGenerator.random(1, 999));
                    break;
                case "string":
                    myrand = DataGenerator.getRandomAlphanumericSequence(5, false);
                    break;
                default:
                    myrand = DataGenerator.getRandomAlphanumericSequence(5, true);
                    break;
            }
            newvalue = value + myrand;
            if (!insertInput(driver, input, dataname, newvalue, where)) {
                return false;
            }
            if (!simpleClick(driver, button, where)) {
                return false;
            }
            i++;
        } while (driver.getDriver().findElements(By.xpath(result[1])).size() > 0 || i >= 30);

        driver.getReport().addRawText("<!--End-->");
        int startIndex = driver.getReport().getContent().indexOf("<!--Start-->", 0);
        int endIndex = driver.getReport().getContent().indexOf("<!--End-->", 9);
        String str = driver.getReport().getContent().substring(startIndex, endIndex);
        driver.getReport().getContent().replace(str, replacement);

        if (i >= 30) {
            String message = "--ERROR: checkExistence(): Unable to not overlap other records after " + i + " tries";
            ErrorManager.process(driver, message);
            return false;
        } else {
            driver.getTest().getData().put(dataname, newvalue);
            driver.getReport().addContent(newvalue + " choosen to fill " + dataname + "value.");

        }
        driver.getReport().addContent("", "br", "");
        return true;
    }

    /**
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @param path   String[] - Xpath referent to the input where the value has to be inserted, [0] is the data name, [1] is the value
     * @param where  String - Tells where the operation is taking effect
     * @return returns the found {@code WebElement}
     * @see ErrorManager#process(TestDriver, String)
     */
    public static WebElement findElement(TestDriver driver, String[] path, String where) {
        WebElement element = null;
        try {
            element = driver.getDriver().findElement(By.xpath(path[1]));
        } catch (Exception e) {
            String ecode = "--ERROR:findElement(): Unable to find the element " + path[0] + " with xpath: " + path[1] + " " + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
        return element;
    }

    // this function was implemented from Swissknife recently(04/07/2016)

    /**
     * This function finds the element to browse files and sends the path of the file we want to upload
     *
     * @param driver       TestDriver - This object gathers all the info refferent to the current test
     * @param inputPath    String[] - The [0] contains the alias of the component and [1] the xpath reference (the same normally)
     * @param fileToUpload String[] - The [0] contains the alias of the file and [1] the url
     * @param where        String - Tells where the operation is taking effect
     * @return {@code boolean}
     * @see WebElement#sendKeys(CharSequence...)
     * @see ErrorManager#process(TestDriver, String)
     */
    public static boolean fileUploader(TestDriver driver, String[] inputPath, String[] fileToUpload, String where) {
        try {
            WebElement upload = findElement(driver, inputPath, where);
            upload.sendKeys(fileToUpload[1]);
            driver.getReport().addContent("File: " + fileToUpload[0] + " with path " + fileToUpload[1] + " inserted in " + inputPath[0] + " on " + where);
        } catch (Exception e) {
            String ecode = "--ERROR: fileUploader(): Unable to interact with " + inputPath[0] + " with xPath " + inputPath[1];
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This function calls Thread.sleep with a try/catch
     *
     * @param milisec {@code Integer} - Determines how much the process will sleep
     * @see Thread#sleep(long)
     */
    public static void sleep(int milisec) {
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This function is to verify that element by xpath appears in the screen
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @param xpath  String - Xpath referent to the element that verify that appaers
     * @return {@code boolean}
     */
    public static boolean displayed(TestDriver driver, String xpath) {
        try {
            return (driver.getDriver().findElement(By.xpath(xpath)).isDisplayed());
        } catch (NoSuchElementException e) {
            // Returns false because the element is not present in DOM. The
            // try block checks if the element is present but is invisible.
            return false;
        } catch (StaleElementReferenceException e) {
            // Returns false because stale element reference implies that element
            // is no longer visible.
            return false;
        }
    }

    /**
     * this function verify a checkbox field and active or desactive by @param active value.
     *
     * @param driver   TestDriver - This object gathers all the info refferent to the current test
     * @param Xpath    String[] - Xpath referent to the input where the value has to be inserted
     * @param dataname String - Name of the data that is included in the data map
     * @param active   boolean - value that we want to have
     * @param where    String - Tells where the operation is taking effectw
     * @return {@code boolean}
     * @see ErrorManager#process(TestDriver, String)
     * @see DataGenerator
     */
    public static boolean checkboxValue(TestDriver driver, String Xpath, String dataname, boolean active, String where) {
        //HOW TO CALL THIS METHOD
        /*
        if (!Functions.checkboxValue(driver,
                getElements("xpath"),"datanme",true/false," where")){return false;}//where
         */
        try {
            boolean checkbox;
            checkbox = driver.getDriver().findElement(By.xpath(Xpath)).isSelected();
            while (checkbox != active) {
                simpleClick(driver, new String[]{"xpath_checkbox", Xpath}, where);
                break_time(driver, 5, 1000);
                checkbox = driver.getDriver().findElement(By.xpath(Xpath)).isSelected();
            }

            driver.getTest().getData().put(dataname, String.valueOf(checkbox));
            System.out.println("The checkbox is equals to " + checkbox + " on Xpath " + Xpath);
        } catch (Exception e) {
            String ecode = "--ERROR: error to give value in the checkbox in " + where;
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * this function verify a checkbox field and active or desactive by @param active value.
     *
     * @param driver         TestDriver - This object gathers all the info refferent to the current test
     * @param Xpath          String[] - Xpath referent to the input where the value has to be inserted
     * @param dataname       String - Name of the data that is included in the data map
     * @param active         boolean - The value that we want to have
     * @param convert_yes_no - if is true, convert the values true or false to yes or no and save in the map with dataname
     * @param where          String - Tells where the operation is taking effectw
     * @return {@code boolean}
     * @see ErrorManager#process(TestDriver, String)
     * @see DataGenerator
     */
    public static boolean checkboxValue(TestDriver driver, String Xpath, String dataname, boolean active, boolean convert_yes_no, String where) {
        //HOW TO CALL THIS METHOD
        /*
        if (!Functions.checkboxValue(driver,
                getElements("xpath"),"datanme",true/false,true/false," where")){return false;}//where
         */
        try {
            boolean checkbox;
            checkbox = driver.getDriver().findElement(By.xpath(Xpath)).isSelected();
            if (checkbox != active) {
                simpleClick(driver, new String[]{"xpath_checkbox", Xpath}, where);
                break_time(driver, 5, 500);
                checkbox = driver.getDriver().findElement(By.xpath(Xpath)).isSelected();
            }
            if (convert_yes_no) {
                if (active) {
                    driver.getTest().getData().put(dataname, String.valueOf("Yes"));
                } else {
                    driver.getTest().getData().put(dataname, String.valueOf("No"));
                }
                System.out.println("The checkbox is equals to " + checkbox + " on Xpath " + Xpath);
                System.out.println("The system save the checkbox with value " + driver.getTest().getData().get(dataname));
            } else {
                driver.getTest().getData().put(dataname, String.valueOf(checkbox));
                System.out.println("The checkbox is equals to " + checkbox + " on Xpath " + Xpath);
            }
        } catch (Exception e) {
            String ecode = "--ERROR: error to give value in the checkbox in " + where;
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This function makes a random boolean for the checkboxes
     *
     * @param driver   {@code TestDriver} - This object gathers all the info refferent to the current test
     * @param checkbox {@code String} -
     * @param dataname {@code String} - Name of the data that is included in the data map
     * @param where    {@code String} - Tells where the operation is taking effect
     * @return
     */
    public static boolean randomCheck(TestDriver driver, String checkbox, String dataname, String where) {
        /*
        //Creación|Edición
        if (!Functions.randomCheck(driver, getElements("inputvalue"), "dataname",
                where)){return false;}

        //Busqueda
        boolean check_box_nombre;
        if (getData("").equalsIgnoreCase("yes")) {
            check_box_nombre = true;
        } else {
            check_box_nombre = false;
        }
        */
        Random randomBoolean = new Random();
        boolean getRandomBoolean = randomBoolean.nextBoolean();
        String RandomBoolean;
        if (!Functions.checkboxValue(driver,
                checkbox, dataname, getRandomBoolean, true, where)) {
            return false;
        }
        return true;
    }

    /**
     * This function waits for the working image to dissapear in the adf screeen
     *
     * @param driver      TestDriver - This object gathers all the info refferent to the current test
     * @param seconds     {@code Integer} - Determines how much the process will wait
     * @param miliseconds {@code Integer} - verify each miliseconds that working dissapears.
     * @see Thread#sleep(long)
     */
    public static void break_time(TestDriver driver, int seconds, long miliseconds) {
        /*
        Functions.break_time(driver,3,500);
         */
        WebDriverWait wdw = new WebDriverWait(driver.getDriver(), seconds, miliseconds);
        try {
            if (displayed(driver, "//*[contains(@id, 'si7')]/img")) {
                System.out.println("working");
                wdw.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@id, 'si7')]/img")));
                System.out.println("working finished");
            }
        } catch (Exception e) {
            String ecode = "--ERROR: Timed out after " + seconds + " seconds waiting and the system continue in working. ";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }
    }

    /**
     * @param driver     {@code TestDriver} This object gathers and provides all the info refferent to the current test
     * @param columns    {@code String[]} The names of the columns of the table to get
     * @param xpathtable {@code String} First part of the xpath of the table until the number of the row
     * @param rows       {@code Integer} Rows that you want to be stored
     * @param where      {@code String} Tells where the operation is taking effect
     * @return {@code boolean}
     */
    public static boolean collectTableData(TestDriver driver, String[] columns, String xpathtable, int rows, String where) {
        /*
        String[] columns = {"variable1","variable2",...};
        if (!Functions.collectTableData(driver,columns,getElements("tabla"),1,where))return false;

         */
        String xpathBegin = "/table/tbody/tr[";
        String xpathMid = "]/td[2]/div/table/tbody/tr/td[";
        String xpathEnd = "]";
        if (xpathtable.isEmpty()) {
            String ecode = "--ERROR: The xpath table is null " + where;
            ErrorManager.process(driver, ecode);
            return false;
        }
        try {
            for (int j = 1; j < columns.length + 1; j++) {
                getText(driver,
                        new String[]{columns[j - 1], xpathtable + xpathBegin + rows + xpathMid + j + xpathEnd},
                        columns[j - 1], where);
            }
        } catch (Exception e) {
            String ecode = "--ERROR: error to retrieve values " + where;
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }
        return true;
    }

    /**
     * This function works with multiselection value lovs and searches and select the first or second record depending of a boolean
     *
     * @param driver      {@code TestDriver} - This TestDriver gathers all the info refferent to the current test
     * @param b_lov       {@code String[]} - Xpath referent to the LoV button, [0] is the data name, [1] is the value
     * @param altreresult {@code boolean} - Switches to select between the first and second record
     * @param value_qbe   {@code String} - This is the value that will save to search later in he QBE
     * @param where       {@code String} - Tells where the operation is taking effect
     * @return {@code boolean}
     */
    public static boolean lovMultiSelection(TestDriver driver, String[] b_lov, boolean altreresult, String value_qbe, String where) {
        /*
          if(!Functions.lovMultiSelection(driver,
            new String[]{"", getElements("")},
            false, //like this selects the 1º record
            "data_name",
            "where")){
                return false;
            }
         */

        driver.getReport().addContent("Lov with Multiselection values:", "h5", "");

        try {
            checkClick(driver, b_lov, recursiveXPaths.msilov_b_arrow, 4, 500, where);
            checkClick(driver, recursiveXPaths.msilov_b_search, recursiveXPaths.msilov_e_result, 4, 500, where);
            if (altreresult) {
                simpleClick(driver, recursiveXPaths.msilov_e_altresult, where);
            } else {
                simpleClick(driver, recursiveXPaths.msilov_e_result, where);
            }
            getText(driver, recursiveXPaths.msilov_e_data, value_qbe, where);
            checkClick(driver, recursiveXPaths.msilov_b_arrow, recursiveXPaths.msilov_e_result_2, 1, 500, where);
            checkClickByAbsence(driver, recursiveXPaths.msilov_b_ok, recursiveXPaths.msilov_b_ok, 2, 500, where);
        } catch (Exception e) {
            String message = "--ERROR: to select values in multiselection lov on" + where;
            e.printStackTrace();
            ErrorManager.process(driver, message);
            return false;
        }

        return true;
    }

    /**
     * This function searches on a lov of multiselection a record by 1(code) or 2(code and description) values.
     *
     * @param driver         {@code TestDriver} - This TestDriver gathers all the info refferent to the current test
     * @param b_lov          {@code String[]} - Xpath referent to the LoV button, [0] is the data name, [1] is the value
     * @param data_name      {@code String} - Name of the data that will be included in the data map
     * @param value          {@code String} - This is the code that will be searched into the lov
     * @param data_name_desc {@code String} - Name of the data that will be included in the data map
     * @param value_desc     {@code String} - This is the description that will be searched into the lov
     * @param value_qbe      {@code String} - This is the value that will save to search later in he QBE
     * @param where          {@code String} - Tells where the operation is taking effect
     * @return {@code boolean}
     */
    public static boolean lovMultiSelectionByValue(TestDriver driver, String[] b_lov, String data_name, String value,
                                                   String data_name_desc, String value_desc, String value_qbe, String where) {
        driver.getReport().addContent("Lov with Multiselection values:", "h5", "");
        /*
        if (!Functions.lovMultiSelectionByValue(driver,
                new String[]{"", getElements("")},
                "dataname_code", "value_code",
                "dataname_desc", "value_desc", //if you leave both of these empty it will escape them
                "value_qbe",
                "where")) {
            return false;
        }
         */
        try {
            checkClick(driver, b_lov, recursiveXPaths.msilov_b_arrow, 2, 500, where);
            insertInput(driver, recursiveXPaths.msilov_i_genericinput, data_name, value, where);
            if (!data_name_desc.isEmpty() && !value_desc.isEmpty()) {
                insertInput(driver, recursiveXPaths.msilov_i_genericinput2, data_name_desc, value_desc, where);
            }
            checkClick(driver, recursiveXPaths.msilov_b_search, recursiveXPaths.msilov_e_result, 5, 500, where);
            simpleClick(driver, recursiveXPaths.msilov_e_result, where);
            checkClick(driver, recursiveXPaths.msilov_b_arrow, recursiveXPaths.msilov_e_result_2, 1, 500, where);
            getText(driver, recursiveXPaths.msilov_e_data, value_qbe, where);
            checkClickByAbsence(driver, recursiveXPaths.msilov_b_ok, recursiveXPaths.glass, 2, 500, where);
        } catch (Exception e) {
            String message = "--ERROR: to select values in multiselection lov on" + where;
            e.printStackTrace();
            ErrorManager.process(driver, message);
            return false;
        }

        return true;
    }

    /**
     *
     *
     * @param driver
     * @param scrollBar
     * @param distance
     * @param where
     * @return
     */
    public static boolean navigateTable(TestDriver driver, String scrollBar[], String direction, String where) {
      /*
      if(!Functions.navigateTable(driver,
                new String[]{"scrollBar", getElements("scrollBar")}, //scroller xpath
                "back/forward", where)){ //nav direction(just back or forward)
        return false;
        }
        */
        try {
            switch (direction) {
                case "forward":
                    driver.getDriver().findElement(By.xpath(scrollBar[1])).sendKeys(Keys.chord(Keys.ALT, Keys.PAGE_UP)); //FOWARD
                    break;
                case "back":
                    driver.getDriver().findElement(By.xpath(scrollBar[1])).sendKeys(Keys.chord(Keys.ALT, Keys.PAGE_DOWN)); //BACK
                    break;
                default:
                    driver.getReport().addContent("Definition for direction introuced is wron: " + direction);
            }
        } catch (Exception e) {
            String ecode = "--ERROR: navigateTable(): An unexpected error has occurred, please check.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
        }


     /*   WebElement scroll = driver.getDriver().findElement(By.xpath(scrollBar[1]));

        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].scrollLeft: '0, -" + distance + "');", scroll);
*/


        /*try {
            switch (direction) {
                case "forward":
                    driver.getDriver().findElement(By.xpath(scrollBar[1])).sendKeys(Keys.chord(Keys.ALT, Keys.RIGHT)); //FOWARD
                    break;
                case "back":
                    driver.getDriver().findElement(By.xpath(scrollBar[1])).sendKeys(Keys.chord(Keys.ALT, Keys.LEFT)); //BACK
                    break;
                default:
                    driver.getReport().addContent("Definition for direction introuced is wron: " + direction);
            }
        } catch (Exception e) {
            String ecode = "--ERROR: navigateTable(): An unexpected error has occurred, please check.";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return true;
        }*/
        return true;
    }
    /**
     *  This functions is to search advance inside to lov
     * @param driver
     * @param b_lov
     * @param i_lov
     * @param i_inside_lov
     * @param e_result
     * @param value
     * @param dataName
     * @param value_list_advanced
     * @param where
     * @return
     */
    public static boolean createLovByValueAdvanced(TestDriver driver, String[] b_lov, String[] i_lov, String[] i_inside_lov, String[] e_result,
                                                   String value, String dataName,String value_list_advanced,String where) {
        //HOW TO CALL THIS METHOD
        /*if (!Functions.createLovByValue(driver,
                new String[]{"x", getElements("x")}, //LoV button
                new String[]{"y", getElements("y")}, //external LoV input
                new String[]{"z", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result, // lov internal result
                "value", // value to search
                "data_name", //name of the data
                "Start with"
                " on where")){return false;}*/ //where this operation occurs

        driver.getReport().addContent("LoV by value Creation: ", "h5", "");
        String attr = "";
        if (!Functions.simpleClick(driver, i_lov, where)) {
            return false;
        }
        if (!Functions.checkClick(driver, b_lov, recursiveXPaths.lov_b_search, where)) {
            return false;
        }
        if (!Functions.displayed(driver,recursiveXPaths.lov_ls_genericlist[1])){
            if (!Functions.checkClick(driver, recursiveXPaths.lov_b_advanced, recursiveXPaths.lov_ls_genericlist, where))return false;
        }
        if (!Functions.selectText(driver,
                recursiveXPaths.lov_ls_genericlist,value_list_advanced, "lov_ls_genericlist", where)){return false;}

        if (!Functions.insertInput(driver, i_inside_lov, "ref" + dataName, value, where)) {
            return false;
        }
        Functions.sleep(1000);
        if (!Functions.clickSearchAndResult(driver, recursiveXPaths.lov_b_search, e_result, where)) {
            return false;
        }
        if (!Functions.checkClickByAbsence(driver, recursiveXPaths.lov_b_ok, recursiveXPaths.lov_b_search, where)) {
            return false;
        }

        try {
            attr = driver.getDriver().findElement(By.xpath(i_lov[1])).getAttribute("value");
            if (!attr.equals("") && !attr.equals(null)) {
                driver.getTest().getData().put(dataName, attr);
            } else {
                String ecode = "--ERROR: createLov - Unable to check that the correct value was inserted in " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ". Value is blank or null.";
                ErrorManager.process(driver, ecode);
                return false;
            }
        } catch (Exception e) {
            String ecode = "--ERROR: createLov - Unable to get the selected " + i_lov[0] + " (xpath: " + i_lov[1] + ")" + where + ".";
            e.printStackTrace();
            ErrorManager.process(driver, ecode);
            return false;
        }

        driver.getReport().addContent("", "br", "");
        return true;
    }
}
