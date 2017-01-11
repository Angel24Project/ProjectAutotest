package core.recursiveData;

/**
 * This class has a determined number of elements which xpath is the same.
 * And to avoid redundant information we make them here
 *
 * @author otorandell on 10/02/2016
 * @author edition avirgili 13/10/2016
 */
public class recursiveXPaths {
    //<editor-fold desc="GLASS">
    public final static String[] glass = {"glass", "//*[contains(@class,'AFModalGlassPane')]"};
    //</editor-fold>
    //<editor-fold desc="LOV XPATHS">
    public static final String[] lov_b_search = {"lov_b_search", "//*[contains(@id, '_afrLovInternalQueryId::search')]"};
    public static final String[] lov_b_advanced = {"lov_b_advanced", "//*[contains(@id, '_afrLovInternalQueryId::mode')]"};
    public static final String[] lov_ls_genericlist = {"lov_ls_genericlist", "//*[contains(@id, '_afrLovInternalQueryId:operator0::content')]"};
    public static final String lov_i_genericinput = "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]";
    public static final String lov_i_altgenericinput = "//*[contains(@id, '_afrLovInternalQueryId:value10::content')]";
    public static final String lov_i_altgenericinput2 = "//*[contains(@id, '_afrLovInternalQueryId:value20::content')]";
    public static final String[] lov_e_result = {"lov_e_result", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]"};
    public static final String[] lov_e_altresult = {"lov_e_altresult", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[2]/td[1]"};
    public static final String[] lov_e_altresult2 = {"lov_e_altresult2", "//*[contains(@id, '_afrLovInternalTableId::db')]/table/tbody/tr[3]/td[1]"};
    public static final String[] lov_b_ok = {"lov_b_ok", "//*[contains(@id, 'lovDialogId::ok')]"};
    //</editor-fold>
    //<editor-fold desc="MULTISELECTION LOV XPATHS">
    public static final String[] msilov_b_search = {"msilov_b_search", "//*[contains(@id, 'dc_q1::search')]"};
    public static final String[] msilov_i_genericinput = {"msi_i_generic", "//*[contains(@id, 'dc_q1:value00::content')]"};
    public static final String[] msilov_i_genericinput2 = {"msi_i_generic2", "//*[contains(@id, 'dc_q1:value10::content')]"};
    public static final String[] msilov_e_result = {"msilov_e_result", "//*[contains(@id, 'dc_t2::db')]/table/tbody/tr[1]/td[1]"};
    public static final String[] msilov_e_result_2 = {"msilov_e_result_2", "//*[contains(@id, 'dc_t1::db')]/table/tbody/tr[1]/td[1]"};
    public static final String[] msilov_e_altresult = {"msilov_e_altresult", "//*[contains(@id, 'dc_t2::db')]/table/tbody/tr[2]/td[1]"};
    public static final String[] msilov_e_altresult2 = {"msilov_e_altresult2", "//*[contains(@id, 'dc_t2::db')]/table/tbody/tr[3]/td[1]"};
    public static final String[] msilov_b_ok = {"msilov_b_ok", "//*[contains(@id, 'dc_ctb5')]"};
    public static final String[] msilov_b_arrow = {"msilov_b_arrow", "//*[contains(@id, 'dc_ctb4::icon')]"};
    public static final String[] msilov_e_data = {"msilov_e_data", "//*[contains(@id, 'msilov') and contains(@id, ':dc_t2::db')]/table/tbody/tr[1]/td[1]"};
    //</editor-fold>
    //<editor-fold desc="DELETE XPATHS">
    //public static final String delete_b_yes = "//*[contains(@id, 'dConfirmDelete::yes')]";
    public static final String delete_b_yes = "//*[contains(@id, ':cbt1')]";
    public static final String audit_b_ok = "//*[contains(@id, '::ok')]";
    //</editor-fold>
    //<editor-fold desc="LOG IN XPATHS">
    public static final String userinput = "//*[@id='username']";
    public static final String passinput = "//*[@id='password']";
    public static final String logout = "//*[@id='pt1:cblog1']";
    public static final String loginbutton = "//*[@id='inputs']/div/input";
    //</editor-fold>
    //<editor-fold desc="COMPONENT SEARCH">
    public static final String searchicon = "//*[contains(@id, 'pt1:searchminimenu::icon')]";
    public static final String componentinput = "//*[contains(@id, 'j_id__ctru158::content')]";
    public static final String searchcomponent = "//*[contains(@id, 'pt_i2::icon')]";
    public static final String result = "//div[contains(@id, 'j_id__ctru154')]//a[contains(@id, 'cl3')]";// now search an non so specific element within his father
    //</editor-fold>
    //<editor-fold desc="JIRA">
    public static final String[] jirauserinput = {"username", "//*[contains(@id, 'login-form-username')]"};
    public static final String[] jirapassimput = {"password", "//*[contains(@id, 'login-form-password')]"};
    public static final String[] jiraloginbutton = {"login", "//*[contains(@id, 'login-form-submit')]"};
    public static final String[] jiralogoutbutton = {"userLogOut", "//*[contains(@id, 'header-details-user-fullname')]"};
    //</editor-fold>
}