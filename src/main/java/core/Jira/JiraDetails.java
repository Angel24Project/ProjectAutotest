package core.Jira;

import core.CommonActions.DataGenerator;
import core.FileGestor.DataHarvester;
import core.TestDriver.TestDetails;
import core.TestDriver.TestDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author otorandell on 12/02/2016.
 * @see HashMap
 * @see DataHarvester
 */
public class JiraDetails {

    public String jiraVersion = "none";
    public String jiraCycle = "AUTOMATIC REGRESSION ";
    public String jiraCycleDate = "";
    public String jiraBuildNumber = "";
    public String jiraCycleFrom = "";
    public String jiraCycleTo = "";
    public String jiratrunk = "";
    public String environment = "";
    JiraDriver jiradriver;
    //<editor-fold desc="ATTRIBUTES">
    boolean jiraloop = false;
    Map<String, String> elements = new HashMap<>();
    String url = "https://agile.hotelbeds.com/jira/login.jsp";
    String urlcycle1 = "https://agile.hotelbeds.com/jira/projects/";
    String urlcycle2 = "?selectedItem=com.thed.zephyr.je%3Azephyr-tests-page#test-cycles-tab";
    String urlbrowse = "https://agile.hotelbeds.com/jira/browse/";
    String teststatus = "PASS";
    String project;
    DataHarvester harvester = new DataHarvester("C:/SisVersion.txt");
    //</editor-fold>

    /**
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public JiraDetails(TestDriver driver) {
        this.jiradriver = new JiraDriver(driver);
        setElements();
        setVersionDetails(driver);
        setProject(driver);
        setStatus(driver);
    }

    public TestDriver getDriver() {
        return this.jiradriver.getDriver();
    }
    /**
     * Gets the variable elements
     *
     * @return {@code Map}
     */
    public Map<String, String> getElements() {
        return elements;
    }

    /**
     * Gets the url variable
     *
     * @return {@code String}
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the url of the browser
     *
     * @return {@code String}
     */
    public String getUrlbrowse() {
        return urlbrowse;
    }

    /**
     * Gets the current version of JIRA
     *
     * @return {@code String}
     */
    public String getJiraVersion() {
        return jiraVersion;
    }

    /**
     * Gets the current cycle of JIRA
     *
     * @return {@code String}
     */
    public String getJiraCycle() {
        return jiraCycle;
    }
    /**
     * Gets the current cycle of JIRA
     *
     * @return {@code String}
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Gets the current date of the JIRA cycle
     *
     * @return {@code String}
     */
    public String getJiraCycleDate() {
        return jiraCycleDate;
    }

    /**
     * Gets the build number of JIRA
     *
     * @return {@code String}
     */
    public String getJiraBuildNumber() {
        return jiraBuildNumber;
    }

    /**
     * ToDo
     *
     * @return {@code String}
     */
    public String getJiraCycleFrom() {
        return jiraCycleFrom;
    }

    /**
     * ToDo
     *
     * @return {@code String}
     */
    public String getJiraCycleTo() {
        return jiraCycleTo;
    }

    /**
     * Gets the status of the test
     *
     * @return {@code String}
     */
    public String getTeststatus() {
        return teststatus;
    }

    /**
     * Gets the status of the test
     *
     * @return {@code String}
     */

    public String getJiratrunk() {
        return jiratrunk;
    }

    /**
     * Sets the string variable {@code project}
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    public void setProject(TestDriver driver) {
        String[] project = driver.getTestdetails().getIssue().split("-");
        this.project = project[0];
    }

    /**
     * Sets the details of the current version
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    public void setVersionDetails(TestDriver driver) {
        this.jiratrunk = harvester.harvest(driver.getTestdetails().getTestname());
        this.jiraVersion = harvester.harvest("Version");
        this.jiraCycleDate = harvester.harvest("Date");
        this.jiraBuildNumber = harvester.harvest("Build");
        this.jiraCycleFrom = harvester.harvest("From");
        this.jiraCycleTo = harvester.harvest("To");
        this.environment = DataGenerator.caseConversion(getDriver().getTestdetails().getEnvironment(), "uppercase");
        this.jiraCycle = getJiraCycle() + getEnvironment() + " " + getJiratrunk() + " " + getJiraCycleDate();
    }

    /**
     * Sets to the var elements all the items we would use
     */
    public void setElements() {
        //Attach (is not implemented)
        this.elements.put("component", "components-field");
        this.elements.put("addCross", "//*[contains(@id, 'add-attachments-link')]");
        this.elements.put("attachExaminar", "ignore-inline-attach"); //Examinar
        this.elements.put("attachPopUpOk", "//*[contains(@id, 'attach-file-submit1')]");
        this.elements.put("comment", "//*[contains(@id, 'schedule-comment-area')]");
        this.elements.put("commentReadOnly", "//*[contains(@id, 'readonly-comment-div')]");
        this.elements.put("commentPencil", "//*[contains(@id, 'comment-click-pencil')]");
        this.elements.put("commentUpdate", "//*[contains(@id, 'schedule-comment-area-update')]");

        //log out
        this.elements.put("logout", "//*[contains(@id, 'log_out')]");
        this.elements.put("logInAgain", "//*[contains(@id, 'content')]/div/div/section");

        //cycle
        //this.elements.put("firstCycle", "//*[@id='cycle--1']");
        this.elements.put("firstCycle", ".//*[@id='pdb-create-cycle-dialog']");
        this.elements.put("cycleVersionDropDown", "//*[@id='cycle_version']");
        this.elements.put("cycleMenuVersionDropDown", "//*[@id='select-version2-field']");
        this.elements.put("cycleName", "//*[@id='cycle_name']");
        this.elements.put("buildNumber", ".//*[@id='cycle_build']");
        this.elements.put("environment", ".//*[@id='cycle_environment']");
        this.elements.put("dateFrom", ".//*[@id='cycle_startDate']");
        this.elements.put("dateTo", ".//*[@id='cycle_endDate']");
        this.elements.put("saveButtonCreateCycle", "//*[contains(@id, 'cycle-create-form-submit')]");//.//*[@id='cycle-create-form-submit-12601']

        //Execute
        this.elements.put("execute_button", "//*[contains(@id, 'zephyr-je-add-execute')]");
        this.elements.put("add_test_cycle_radio", "//*[contains(@id, 'zephyr-je-execute-existing')]");
        this.elements.put("add_version_select", "//*[contains(@id, 'project_version')]");
        this.elements.put("add_version_option", "//*[contains(@id, 'project_version')]/option[204]");
        this.elements.put("add_test_cycle_select", "//*[contains(@id, 'cycle_names')]");
        this.elements.put("add_test_cycle_option", "//*[contains(@id, 'cycle_names')]/option[2]");
        this.elements.put("execute_button_popup_button", ".//*[@id='zephyr-je-add-execute']/div/div/a[2]");
        //this.elements.put("execute_button_popup_button", "//*[contains(@id, 'zephyr-je-add-execute')]/div/div[2]/a[2]");

        //status
        this.elements.put("currentStatus", "//*[contains(@id, 'current-execution-status-dd-schedule')]");
        this.elements.put("listStatus", "//*[contains(@id, 'exec_status-schedule')]");
        this.elements.put("updateStatus", "//*[contains(@id, 'exec_status_update-schedule')]");

        //TRUE DATA
        this.elements.put("test_e_dropdown", "//*[@id='zephyr_je.topnav.tests']");
        this.elements.put("test_e_dropdown_e_plantestcycle", "//*[@id='zephyr-je.topnav.tests.plan.cycle']");
        this.elements.put("plantestycle_select_version", "//*[@id='select-version2-field']");
        this.elements.put("existingCycles", "versionBanner-name");
    }

    /**
     * Checks the test status and establishes the var {@code teststatus} as FAIL if it's different from 0
     *
     * @param driver TestDriver - This TestDriver gathers all the info refferent to the current test
     */
    private void setStatus(TestDriver driver) {
        if (driver.getTeststatus() != 0) {
            this.teststatus = "FAIL";
        }
    }
}
