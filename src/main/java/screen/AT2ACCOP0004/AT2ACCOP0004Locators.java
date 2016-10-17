package screen.AT2ACCOP0004;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmrios on 17/10/2016.
 */
public class AT2ACCOP0004Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2ACCOP0004Locators(String enviroment) {
        setElements();
    }
    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        /*elements.put("","//*[contains(@id, '')]");*/
        //GENERALS
        elements.put("accommodation_b_actions","//*[contains(@id, 'pc1:pcgm1:dc_m1')]");
        elements.put("accommodation_b_actions_audit_data","//*[contains(@id, 'pcgm1:dc_cmi1')]/td[2]");
        elements.put("accommodation_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("accommodation_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]");
        elements.put("accommodation_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("accommodation_e_records", "//*[contains(@id, 'pc1:ot26')]");
        //SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'r1:1:cb1')]");
        elements.put("search_i_TO", "//*[contains(@id, 'r1:1:nomTtooId::content')]");
        elements.put("search_lov_TO", "//*[contains(@id, 'r1:1:nomTtooId::lovIconId')]");
        elements.put("search_i_interface", "//*[contains(@id, 'r1:1:codInterfaceId::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'r1:1:codInterfaceId::lovIconId')]");
        elements.put("search_i_email", "//*[contains(@id, 'r1:1:it1::content')]");
        elements.put("search_i_telephone", "//*[contains(@id, 'r1:1:it5::content')]");
        elements.put("search_i_ip_adress", "//*[contains(@id, 'r1:1:it8::content')]");
        elements.put("search_i_hash", "//*[contains(@id, 'r1:1:it2::content')]");
        elements.put("search_i_card_holder_name", "//*[contains(@id, 'r1:1:it6::content')]");
        elements.put("search_i_amount", "//*[contains(@id, 'r1:1:it7::content')]");
        elements.put("search_i_general_name", "//*[contains(@id, ':r1:1:it4::content')]");
        elements.put("search_i_partner", "//*[contains(@id, 'r1:1:nomPartnerId::content')]");
        elements.put("search_i_creation_date_from", "//*[contains(@id, 'r1:1:id2::content')]");
        elements.put("search_i_creation_date_to", "//*[contains(@id, 'r1:1:id4::content')]");
        elements.put("search_i_service_date_from", "//*[contains(@id, 'r1:1:id3::content')]");
        elements.put("search_i_service_date_to", "//*[contains(@id, 'r1:1:id1::content')]");
        //QBE
        elements.put("qbe_i_interface", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_TO", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_general_name", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_TO_reference", "//*[contains(@id, 'afr_resId1c4::content')]");

        elements.put("qbe_i_partner", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_ip", "//*[contains(@id, 'afr_resId1c4::content')]");

        elements.put("qbe_i_partner", "//*[contains(@id, 'afr_resId1c3::content')]");
        elements.put("qbe_i_hotel", "//*[contains(@id, 'afr_resId1c2::content')]");
        elements.put("qbe_i_destination", "//*[contains(@id, 'afr_resId1c1::content')]");
        elements.put("qbe_i_ip", "//*[contains(@id, 'afr_resId1c4::content')]");

    }
}
