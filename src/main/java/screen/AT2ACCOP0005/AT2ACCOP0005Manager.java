package screen.AT2ACCOP0005;

import core.TestDriver.TestDriver;
import screen.AT2ACCOP0005.AT2ACCOP0005Data;
import screen.AT2ACCOP0005.AT2ACCOP0005Locators;
import screen.AT2ACCOP0005.AT2ACCOP0005Sis;
import screen.AT2ACCOP0005.AT2ACCOP0005Test;
import screen.AT2Test;

import java.util.Map;

/**
 * Created by lchacartegui on 31/08/2016.
 */
public class AT2ACCOP0005Manager implements AT2Test {
    AT2ACCOP0005Test test;
    AT2ACCOP0005Sis sis;
    String[] procedure;
    String entorno;

    public AT2ACCOP0005Manager(String enviroment) {
        if (enviroment.equalsIgnoreCase("test")) {
            entorno = "test";
            setTest(new AT2ACCOP0005Test());
            this.test.setData(new AT2ACCOP0005Data(enviroment));
            this.test.setLocators(new AT2ACCOP0005Locators(enviroment));
        } else {
            entorno = "sis";
            setTestSis(new AT2ACCOP0005Sis());
            this.sis.setData(new AT2ACCOP0005Data(enviroment));
            this.sis.setLocators(new AT2ACCOP0005Locators(enviroment));
        }
    }

    public String[] getProcedure() {
        return procedure;
    }

    public void setProcedure(String[] procedure) {
        this.procedure = procedure;
    }

    public AT2ACCOP0005Test getTest() {
        return test;
    }

    public void setTest(AT2ACCOP0005Test test) {
        this.test = test;
    }

    public AT2ACCOP0005Sis getTestSis() {
        return sis;
    }

    public void setTestSis(AT2ACCOP0005Sis sis) {
        this.sis = sis;
    }

    public Map<String, String> getData() {
        if (entorno.equalsIgnoreCase("test")) {
            return this.test.getData().getData();
        } else {
            return this.sis.getData().getData();
        }
    }

    public boolean start(TestDriver driver) {
        setProcedure(driver.getTestdetails().getCsedProcedure().split(""));
        if (entorno.equalsIgnoreCase("sis")) {
            getTestSis().start(driver);
        } else {
            getTest().start(driver);
        }
        return csedIteration(driver);
    }

    private boolean csedIteration(TestDriver driver) {
        String[] procedure = getProcedure();
        for (int i = 0; i < procedure.length; i++) {
            if (getProcedure()[i].equals("c")) {
            }
            if (getProcedure()[i].equals("s")) {
            }
            if (getProcedure()[i].equals("e")) {
            }
            if (getProcedure()[i].equals("d")) {
            }
            if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("test"))) {
                if (!getTest().testCSED(driver)) {
                    return false;
                }
            } else if (getProcedure()[i].equals("x") && (driver.getTestdetails().getEnvironment().equalsIgnoreCase("sis"))) {
                if (!getTestSis().testCSED(driver)) {
                    return false;
                }
            }
        }
        return true;
    }
}
