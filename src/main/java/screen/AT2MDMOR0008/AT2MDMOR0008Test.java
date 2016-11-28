package screen.AT2MDMOR0008;

import core.CommonActions.CommonProcedures;
import core.CommonActions.DataGenerator;
import core.CommonActions.Functions;
import core.TestDriver.TestDriver;
import core.recursiveData.recursiveXPaths;

/**
 * Created by aibanez on 25/11/2016.
 */
public class AT2MDMOR0008Test {
    protected AT2MDMOR0008Locators locators;
    protected AT2MDMOR0008Data data;
    public AT2MDMOR0008Test() {
    }
    public AT2MDMOR0008Locators getLocators() {
        return locators;
    }
    public void setLocators(AT2MDMOR0008Locators locators) {
        this.locators = locators;
    }
    public AT2MDMOR0008Data getData() {
        return data;
    }
    public void setData(AT2MDMOR0008Data data) {
        this.data = data;
    }
    public void start(TestDriver driver) {
        setScreenInfo(driver);
        CommonProcedures.goToScreen(driver);
    }
    protected void setScreenInfo(TestDriver driver) {
        driver.getTestdetails().setMainmenu("Master Data Management");
        driver.getTestdetails().setSubmenu("Organization");
        driver.getTestdetails().setScreen("Incoming Offices - Marketing");
    }
    protected String getElements(String key) {
        return String.valueOf(this.locators.getElements().get(key));
    }
    protected String getData(String key) {
        return String.valueOf(this.data.getData().get(key));
    }

    protected boolean testCSED(TestDriver driver) {
        if (!getData(driver)) return false;
        if (!search_t1(driver)) return false;
        if (!qbe_t1(driver)) return false;
        if (!others_actions_t1(driver)) return false;
        if (!interaction_record_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!interaction_edit_t2(driver)) return false;
        if (!qbe_t2(driver)) return false;
        if (!others_actions_t2(driver)) return false;
        if (!interaction_record_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!interaction_edit_t3(driver)) return false;
        if (!qbe_t3(driver)) return false;
        if (!others_actions_t3(driver)) return false;
        if (!delete_t3(driver)) return false;
        if (!delete_t2(driver)) return false;
        return true;
    }

    /**
     * TABLE INCOMING
     */
    private boolean getData (TestDriver driver) {
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"office_e_result", getElements("office_e_result")}, //result element
                "GET DATA")) {
            return false;
        }
        String[] columns = {"company", "c_name", "office", "o_inc", "o_inb"};
        Functions.collectTableData(driver,
                columns,
                "//*[contains(@id, 'pc2:table1::db')]",
                3, // row to give values
                "GET DATA");
        return true;
    }
    private boolean search_t1(TestDriver driver) {
        driver.getReport().addHeader("SEARCH RECORD", 3, false);
        String where = " on SEARCH 1";
        if (!Functions.insertInput(driver, new String[]{"search_i_company",getElements("search_i_company")},
                "company", getData("company"), where)){return false;}
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_search", getElements("search_b_search")}, //search button
                new String[]{"office_e_result", getElements("office_e_result")}, //result element
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t1(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 1";
        if (!Functions.clickSearchAndResult(driver,
                new String[]{"search_b_reset", getElements("search_b_reset")}, //search button
                new String[]{"office_e_result", getElements("office_e_result")}, //result element
                where)) {
            return false;
        }
        if (!Functions.clickQbE(driver,
                new String[]{"office_b_qbe", getElements("office_b_qbe")},// query button
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")},
                "company", getData("company"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_company_name", getElements("qbe_i_company_name")},
                "c_name", getData("c_name"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office", getElements("qbe_i_office")},
                "office", getData("office"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_incoming", getElements("qbe_i_office_incoming")},
                "o_inc", getData("o_inc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_office_inbound", getElements("qbe_i_office_inbound")},
                "o_inb", getData("o_inb"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t1(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 1";
        if (!Functions.auditData(driver,
                new String[]{"office_b_actions", getElements("office_b_actions")}, //actions button
                new String[]{"office_b_actions_b_audit_data", getElements("office_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", getElements("audit_ok1")}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 1";
        if (!Functions.detachTable(driver,
                new String[]{"office_b_detach", getElements("office_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE ADDRESS
     */
    private boolean interaction_record_t2(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"address_b_add", getElements("address_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_head"),"head",true,true,where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"add_b_data", getElements("add_b_data")}, //element to click
                new String[]{"add_e_country_code", getElements("add_e_country_code")}, //element expected to appear
                where)) {return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_country_code", getElements("add_e_country_code")}, // element path
                "c_code", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_e_country_name", getElements("add_e_country_name")}, // element path
                "c_name2", // key for data value (the name)
                where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_street_type", getElements("add_i_street_type")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "street", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"add_i_street", getElements("add_i_street")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "street_desc", // key for data value (the name)
                where);
        if (!Functions.insertInput(driver, new String[]{"add_i_number",getElements("add_i_number")},
                "number", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_door", getElements("add_i_door")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "door", // key for data value (the name)
                where);
        if (!Functions.insertInput(driver, new String[]{"add_i_door",getElements("add_i_door")},
                "door", String.valueOf(DataGenerator.random(1,25)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_floor",getElements("add_i_floor")},
                "floor", String.valueOf(DataGenerator.random(1,25)), where)){return false;}
/*        if (!Functions.insertInput(driver, new String[]{"add_i_postal_code",getElements("add_i_postal_code")},
                "postal", "01524", where)){return false;}*/
        Functions.getAttr(driver,
                new String[]{"add_i_postal_code", getElements("add_i_postal_code")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "postal", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"add_i_town", getElements("add_i_town")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "town", // key for data value (the name)
                where);
/*        if (!Functions.insertInput(driver, new String[]{"add_i_town",getElements("add_i_town")},
                "town", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}*/
        if(!Functions.createLovByValue(driver,
                new String[]{"add_lov_county",getElements("add_lov_county")}, // b_lov
                new String[]{"add_i_county", getElements("add_i_county")}, // i_lov
                new String[]{"add_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result,
                "07", // value to search
                "country", //name of the data
                where)) {return false;}
/*        Functions.getAttr(driver,
                new String[]{"add_i_county", getElements("add_i_county")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "country", // key for data value (the name)
                where);*/
        if(!Functions.getText(driver,new String[]{"add_i_county_desc", getElements("add_i_county_desc")}, // element path
                "country_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone",getElements("add_i_telephone")},
                "tel", String.valueOf(DataGenerator.random(111111111, 999999999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_fax",getElements("add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111, 999999999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(6, false)+"@email.com", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_email",getElements("add_i_booking_email")},
                "b_mail", DataGenerator.getRandomAlphanumericSequence(6, false)+"@book.com", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_banner",getElements("add_i_banner")},
                "banner", DataGenerator.getRandomAlphanumericSequence(9, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_1",getElements("add_i_image_1")},
                "image1", DataGenerator.getRandomAlphanumericSequence(4, false)+"img1", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_2",getElements("add_i_image_2")},
                "image2", DataGenerator.getRandomAlphanumericSequence(4, false)+"img2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_3",getElements("add_i_image_3")},
                "image3", DataGenerator.getRandomAlphanumericSequence(4, false)+"img3", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_link_camera",getElements("add_i_link_camera")},
                "link", DataGenerator.getRandomAlphanumericSequence(8, false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_position_code",getElements("add_lov_position_code")}, // b_lov
                new String[]{"add_i_position_code", getElements("add_i_position_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "position", //Data name
                where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_position_desc", getElements("add_i_position_desc")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "pos_desc", // key for data value (the name)
                where);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t2(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 2";
        if (!Functions.checkClick(driver,
                new String[]{"address_b_edit", getElements("address_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.checkboxValue(driver,
                getElements("add_ck_head"),"head",false,true,where)){return false;}
        if (!Functions.checkClick(driver,
                new String[]{"add_b_data", getElements("add_b_data")}, //element to click
                new String[]{"add_e_country_code", getElements("add_e_country_code")}, //element expected to appear
                where)) {return false;}
        if(!Functions.getValue(driver,new String[]{"add_e_country_code", getElements("add_e_country_code")}, // element path
                "c_code", // key for data value (the name)
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_e_country_name", getElements("add_e_country_name")}, // element path
                "c_name2", // key for data value (the name)
                where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_street_type", getElements("add_i_street_type")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "street", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"add_i_street", getElements("add_i_street")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "street_desc", // key for data value (the name)
                where);
        if (!Functions.insertInput(driver, new String[]{"add_i_number",getElements("add_i_number")},
                "number", String.valueOf(DataGenerator.random(1,5)), where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_door", getElements("add_i_door")}, // element path
                "title", // atribute to get data (class, value, id, style, etc...)
                "door", // key for data value (the name)
                where);
        if (!Functions.insertInput(driver, new String[]{"add_i_door",getElements("add_i_door")},
                "door", String.valueOf(DataGenerator.random(1,25)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_floor",getElements("add_i_floor")},
                "floor", String.valueOf(DataGenerator.random(1,25)), where)){return false;}
/*        if (!Functions.insertInput(driver, new String[]{"add_i_postal_code",getElements("add_i_postal_code")},
                "postal", "01524", where)){return false;}*/
        Functions.getAttr(driver,
                new String[]{"add_i_postal_code", getElements("add_i_postal_code")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "postal", // key for data value (the name)
                where);
        Functions.getAttr(driver,
                new String[]{"add_i_town", getElements("add_i_town")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "town", // key for data value (the name)
                where);
/*        if (!Functions.insertInput(driver, new String[]{"add_i_town",getElements("add_i_town")},
                "town", DataGenerator.getRandomAlphanumericSequence(6, false), where)){return false;}*/
        if(!Functions.createLovByValue(driver,
                new String[]{"add_lov_county",getElements("add_lov_county")}, // b_lov
                new String[]{"add_i_county", getElements("add_i_county")}, // i_lov
                new String[]{"add_lov_country_code", recursiveXPaths.lov_i_genericinput}, //internal LoV input
                recursiveXPaths.lov_e_result,
                "09", // value to search
                "country", //name of the data
                where)) {return false;}
/*        Functions.getAttr(driver,
                new String[]{"add_i_county", getElements("add_i_county")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "country", // key for data value (the name)
                where);*/
        if(!Functions.getText(driver,new String[]{"add_i_county_desc", getElements("add_i_county_desc")}, // element path
                "country_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_telephone",getElements("add_i_telephone")},
                "tel", String.valueOf(DataGenerator.random(111111111, 999999999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_fax",getElements("add_i_fax")},
                "fax", String.valueOf(DataGenerator.random(111111111, 999999999)), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_email",getElements("add_i_email")},
                "mail", DataGenerator.getRandomAlphanumericSequence(6, false)+"@email.com", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_booking_email",getElements("add_i_booking_email")},
                "b_mail", DataGenerator.getRandomAlphanumericSequence(6, false)+"@book.com", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_banner",getElements("add_i_banner")},
                "banner", DataGenerator.getRandomAlphanumericSequence(9, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_1",getElements("add_i_image_1")},
                "image1", DataGenerator.getRandomAlphanumericSequence(4, false)+"img1", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_2",getElements("add_i_image_2")},
                "image2", DataGenerator.getRandomAlphanumericSequence(4, false)+"img2", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_image_3",getElements("add_i_image_3")},
                "image3", DataGenerator.getRandomAlphanumericSequence(4, false)+"img3", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_link_camera",getElements("add_i_link_camera")},
                "link", DataGenerator.getRandomAlphanumericSequence(8, false), where)){return false;}
        if(!Functions.createLov(driver,
                new String[]{"add_lov_position_code",getElements("add_lov_position_code")}, // b_lov
                new String[]{"add_i_position_code", getElements("add_i_position_code")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_altresult2, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "position", //Data name
                where)){return false;}
        Functions.getAttr(driver,
                new String[]{"add_i_position_desc", getElements("add_i_position_desc")}, // element path
                "value", // atribute to get data (class, value, id, style, etc...)
                "pos_desc", // key for data value (the name)
                where);
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save1", getElements("add_b_save1")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t2(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 2";
        Functions.zoomOut(driver);
        if (!Functions.clickQbE(driver,
                new String[]{"address_b_qbe", getElements("address_b_qbe")},// query button
                new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")},//any query input
                where)) {
            return false;
        } // where the operation occurs
        if (!Functions.selectText(driver,
                new String[]{"qbe_i_head",getElements("qbe_i_head")},
                getData("head"), "head", where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")},
                "c_code", getData("c_code"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_country_name", getElements("qbe_i_country_name")},
                "c_name2", getData("c_name2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_street_type", getElements("qbe_i_street_type")},
                "street", getData("street"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_street", getElements("qbe_i_street")},
                "street_desc", getData("street_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_number", getElements("qbe_i_number")},
                "number", getData("number"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_door", getElements("qbe_i_door")},
                "door", getData("door"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_floor", getElements("qbe_i_floor")},
                "floor", getData("floor"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_postal_code", getElements("qbe_i_postal_code")},
                "postal", getData("postal"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_town", getElements("qbe_i_town")},
                "town", getData("town"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_county", getElements("qbe_i_county")},
                "country", getData("country"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_county_desc", getElements("qbe_i_county_desc")},
                "country_desc", getData("country_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_telephone", getElements("qbe_i_telephone")},
                "tel", getData("tel"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_fax", getElements("qbe_i_fax")},
                "fax", getData("fax"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_email", getElements("qbe_i_email")},
                "mail", getData("mail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_booking_email", getElements("qbe_i_booking_email")},
                "b_mail", getData("b_mail"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_banner", getElements("qbe_i_banner")},
                "banner", getData("banner"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_image_1", getElements("qbe_i_image_1")},
                "image1", getData("image1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_image_2", getElements("qbe_i_image_2")},
                "image2", getData("image2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_image_3", getElements("qbe_i_image_3")},
                "image3", getData("image3"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_link_camera", getElements("qbe_i_link_camera")},
                "link", getData("link"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_position_code", getElements("qbe_i_position_code")},
                "position", getData("position"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_position_desc", getElements("qbe_i_position_desc")},
                "pos_desc", getData("pos_desc"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")}, //any query input
                new String[]{"address_e_result", getElements("address_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t2(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 2";
        if (!Functions.auditData(driver,
                new String[]{"address_b_actions", getElements("address_b_actions")}, //actions button
                new String[]{"address_b_actions_b_audit_data", getElements("address_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok", getElements("audit_ok2")}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 2";
        if (!Functions.detachTable(driver,
                new String[]{"address_b_detach", getElements("address_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t2(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 2";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"address_b_delete", getElements("address_b_delete")},
                new String[]{"address_e_records", getElements("address_e_records")},
                where)) {
            return false;
        }
        return true;
    }

    /**
     * TABLE LANGUAGE
     */
    private boolean interaction_record_t3(TestDriver driver) {
        driver.getReport().addHeader("CREATTION RECORD", 3, false);
        String where = " on CREATTION 3";
        if (!Functions.checkClick(driver,
                new String[]{"language_b_add", getElements("language_b_add")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if(!Functions.createLov(driver,
                new String[]{"add_lov_language",getElements("add_lov_language")}, // b_lov
                new String[]{"add_i_language", getElements("add_i_language")}, // i_lov
                recursiveXPaths.lov_b_search, // lov b search
                recursiveXPaths.lov_e_result, // lov result
                recursiveXPaths.lov_b_ok, //lov b ok
                "lang", //Data name
                where)){return false;}
        if(!Functions.getText(driver,new String[]{"add_i_language_des", getElements("add_i_language_des")}, // element path
                "lang_desc", // key for data value (the name)
                where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_desc",getElements("add_i_destination_desc")},
                "dest1", DataGenerator.getRandomAlphanumericSequence(10, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_desc2",getElements("add_i_destination_desc2")},
                "dest2", DataGenerator.getRandomAlphanumericSequence(10, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name",  DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean interaction_edit_t3(TestDriver driver) {
        driver.getReport().addHeader("EDIT RECORD", 3, false);
        String where = " on EDITTION 3";
        if (!Functions.checkClick(driver,
                new String[]{"language_b_edit", getElements("language_b_edit")}, //element to click
                recursiveXPaths.glass, //element expected to appear
                where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_desc",getElements("add_i_destination_desc")},
                "dest1", DataGenerator.getRandomAlphanumericSequence(10, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_destination_desc2",getElements("add_i_destination_desc2")},
                "dest2", DataGenerator.getRandomAlphanumericSequence(10, false), where)){return false;}
        if (!Functions.insertInput(driver, new String[]{"add_i_name",getElements("add_i_name")},
                "name",  DataGenerator.getRandomAlphanumericSequence(5, false), where)){return false;}
        if (!Functions.checkClickByAbsence(driver,
                new String[]{"add_b_save2", getElements("add_b_save2")}, //element to click
                recursiveXPaths.glass, //element expected to disappear
                where)) {
            return false;
        }
        return true;
    }
    private boolean qbe_t3(TestDriver driver) {
        driver.getReport().addHeader("QBE RECORD", 3, false);
        String where = " on QBE 3";
        if (!Functions.clickQbE(driver,
                new String[]{"language_b_qbe", getElements("language_b_qbe")},// query button
                new String[]{"qbe_i_language", getElements("qbe_i_language")},//any query input
                where)) {
            return false;
        } // where the operation occurs

        if (!Functions.insertInput(driver, new String[]{"qbe_i_language", getElements("qbe_i_language")},
                "lang", getData("lang"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_language_des", getElements("qbe_i_language_des")},
                "lang_desc", getData("lang_desc"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_desc", getElements("qbe_i_destination_desc")},
                "dest1", getData("dest1"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_destination_desc2", getElements("qbe_i_destination_desc2")},
                "dest2", getData("dest2"), where)) {
            return false;
        }
        if (!Functions.insertInput(driver, new String[]{"qbe_i_name", getElements("qbe_i_name")},
                "name", getData("name"), where)) {
            return false;
        }
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_company_code", getElements("qbe_i_company_code")}, //any query input
                new String[]{"office_e_result", getElements("office_e_result")}, //table result
                where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_country_code", getElements("qbe_i_country_code")}, //any query input
                new String[]{"address_e_result", getElements("address_e_result")}, //table result
                where)){return false;}
        if (!Functions.enterQueryAndClickResult(driver,
                new String[]{"qbe_i_language", getElements("qbe_i_language")}, //any query input
                new String[]{"language_e_result", getElements("language_e_result")}, //table result
                where)){return false;}
        return true;
    }
    private boolean others_actions_t3(TestDriver driver) {
        driver.getReport().addHeader("OTHER ACTIONS AUDIT DATA", 3, false);
        String where = " on OTHER AUDIT DATA 3";
        if (!Functions.auditData(driver,
                new String[]{"language_b_actions", getElements("language_b_actions")}, //actions button
                new String[]{"language_b_actions_b_audit_data", getElements("language_b_actions_b_audit_data")}, //audit button
                new String[]{"audit_b_ok",  getElements("audit_ok3")}, //audit_b_ok
                where)) {
            return false;
        }
        driver.getReport().addHeader("OTHER DETACH", 3, false);
        where = " on OTHER DETACH 3";
        if (!Functions.detachTable(driver,
                new String[]{"language_b_detach", getElements("language_b_detach")}, //detach button
                true,     //screenshot??
                where)) {
            return false;
        }
        return true;
    }
    private boolean delete_t3(TestDriver driver) {
        driver.getReport().addHeader("DELETE DATA", 3, false);
        String where = " on DELETE DATA 3";
        if (!Functions.doDeleteNCheck(driver,
                new String[]{"language_b_delete", getElements("language_b_delete")},
                new String[]{"language_e_records", getElements("language_e_records")},
                where)) {
            return false;
        }
        return true;
    }
}
