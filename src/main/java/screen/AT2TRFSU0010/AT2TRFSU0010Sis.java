package screen.AT2TRFSU0010;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by vsolis on 09/09/2016.
 */
public class AT2TRFSU0010Sis {
    protected AT2TRFSU0010Locators locators;
    protected AT2TRFSU0010Data data;

    public AT2TRFSU0010Sis() {

    }

    public AT2TRFSU0010Locators getLocators() {
        return locators;
    }

    public void setLocators(AT2TRFSU0010Locators locators) {
        this.locators = locators;
    }

    public AT2TRFSU0010Data getData() {
        return data;
    }

    public void setData(AT2TRFSU0010Data data) {
        this.data = data;
    }

    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }

    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Transfers");
        driver.getTestdetails().setSubmenu("Setup");
        driver.getTestdetails().setScreen("TTOO Quality Groups");
    }

    protected String getElements(String key) {
        String value = this.locators.getElements().get(key);
        return value;
    }

    protected String getData(String key) {
        String value = this.data.getData().get(key);
        return value;
    }

    protected boolean testCSED(TestDriver driver) {


        return false;
    }
}
