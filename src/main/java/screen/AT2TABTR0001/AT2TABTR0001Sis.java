package screen.AT2TABTR0001;

import core.CommonActions.CommonProcedures;
import core.TestDriver.TestDriver;

/**
 * Created by aibanez on 24/11/2016.
 */
public class AT2TABTR0001Sis {
    protected AT2TABTR0001Locators locators;
    protected AT2TABTR0001Data data;

    public AT2TABTR0001Sis() {
    }
    public AT2TABTR0001Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2TABTR0001Locators locators) {
        this.locators = locators;
    }
    public AT2TABTR0001Data getData() {
        return data;
    }
    public void setData(AT2TABTR0001Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Tab");
        driver.getTestdetails().setSubmenu("Transfer");
        driver.getTestdetails().setScreen("Content Factsheet");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        CommonProcedures.styleGuide(driver);
        return false;
    }
}
