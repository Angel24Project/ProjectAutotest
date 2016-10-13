package screen.AT2BOOSU1004;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by vsolis on 05/10/2016.
 */
public class AT2BOOSU1004Locators {

    Map<String, String> elements = new HashMap<>();

    public AT2BOOSU1004Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }


    public void setElements() {

        //ADD
        elements.put("configuration_by_ttoo_add_b_add", "//*[contains(@id, 'tConfigurationByTtoo:boton_add')]");
        elements.put("configuration_by_ttoo_add_lov_tto", "//*[contains(@id, '0:seqTtooId::lovIconId')]");
        elements.put("configuration_by_ttoo_add_i_tto", "//*[contains(@id, '0:seqTtooId::content')]");
        elements.put("configuration_by_ttoo_add_i_arrival_date_from", "//*[contains(@id, '0:id21::content')]");
        elements.put("configuration_by_ttoo_add_i_stay_date_from", "//*[contains(@id, '0:id23::content')]");
        elements.put("configuration_by_ttoo_add_i_chase_from", "//*[contains(@id, '0:it11::content')]");
        elements.put("configuration_by_ttoo_add_i_rechase_days", "//*[contains(@id, '0:it7::content')]");
        elements.put("configuration_by_ttoo_add_sl_include_bms", "//*[contains(@id, '0:soc2::content')]");
        elements.put("configuration_by_ttoo_add_ch_include_dns_hotels", "//*[contains(@id, '0:sbc24::content')]");
        elements.put("configuration_by_ttoo_add_ch_include_ref_to_client", "//*[contains(@id, '0:sbc25::content')]");
        elements.put("configuration_by_ttoo_add_i_project_name", "//*[contains(@id, '0:it10::content')]");
        elements.put("configuration_by_ttoo_add_ch_active", "//*[contains(@id, '0:sbc23::content')]");
        elements.put("configuration_by_ttoo_add_i_sale_value", "//*[contains(@id, '0:it8::content')]");
        elements.put("configuration_by_ttoo_add_lov_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb1", "//*[contains(@id, '0:msilovCodEmp:dc_t2::db')]/table/tbody/tr[1]/td[2]");
        elements.put("configuration_by_ttoo_add_lov_atlas_co_b_pass", "//*[contains(@id, '0:msilovCodEmp:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_add_lov_atlas_co_e_company_name_tb2", "//*[contains(@id, '0:msilovCodEmp:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_ttoo_add_lov_atlas_co_b_ok", "//*[contains(@id, '0:msilovCodEmp:dc_ctb5')]");
        elements.put("configuration_by_ttoo_add_i_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_add_lov_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb1", "//*[contains(@id, '0:msilovCodOfi:dc_t2::db')]/table/tbody/tr/td[4]");
        elements.put("configuration_by_ttoo_add_lov_atlas_office_b_pass", "//*[contains(@id, '0:msilovCodOfi:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_add_lov_atlas_office_e_office_code_tb2", "//*[contains(@id, '0:msilovCodOfi:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_add_lov_atlas_office_b_ok", "//*[contains(@id, '0:msilovCodOfi:dc_ctb5')]");
        elements.put("configuration_by_ttoo_add_i_atalas_office", "//*[contains(@id, '0:msilovCodOfi:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_add_lov_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_add_lov_destination_e_destination_name_tb1", "//*[contains(@id, '0:msilovCodDestino:dc_t2::db')]/table/tbody/tr[1]/td[2]");
        elements.put("configuration_by_ttoo_add_lov_destination_b_pass", "//*[contains(@id, '0:msilovCodDestino:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_add_lov_destination_e_destination_name_tb2", "//*[contains(@id, '0:msilovCodDestino:dc_t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_by_ttoo_add_lov_destination_b_ok", "//*[contains(@id, '0:msilovCodDestino:dc_ctb5')]");
        elements.put("configuration_by_ttoo_add_i_destination", "//*[contains(@id, '0:msilovCodDestino:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_add_lov_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb1", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t2::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_add_lov_destination_zone_b_pass", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_add_lov_destination_zone_e_zone_description_tb2", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_add_lov_destination_zone_b_ok", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb5')]");
        elements.put("configuration_by_ttoo_add_i_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_add_lov_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb1", "//*[contains(@id, '0:msilovCodCateg:dc_t2::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_ttoo_add_lov_hotel_category_b_pass", "//*[contains(@id, '0:msilovCodCateg:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_add_lov_hotel_category_hotel_category_code_tb2", "//*[contains(@id, '0:msilovCodCateg:dc_t1::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_ttoo_add_lov_hotel_category_b_ok", "//*[contains(@id, '0:msilovCodCateg:dc_ctb5')]");
        elements.put("configuration_by_ttoo_add_i_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_add_i_ttoo_shortname", "//*[contains(@id, '0:it9::content')]");
        elements.put("configuration_by_ttoo_add_i_arrival_date_to", "//*[contains(@id, '0:id24::content')]");
        elements.put("configuration_by_ttoo_add_i_stay_date_to", "//*[contains(@id, '0:id22::content')]");
        elements.put("configuration_by_ttoo_add_i_chase_to", "//*[contains(@id, '0:it4::content')]");
        elements.put("configuration_by_ttoo_add_i_last_minute_day", "//*[contains(@id, '0:it3::content')]");
        elements.put("configuration_by_ttoo_add_sl_include_integrations", "//*[contains(@id, '0:soc1::content')]");
        elements.put("configuration_by_ttoo_add_ch_client_confirmation", "//*[contains(@id, '0:sbc22::content')]");
        elements.put("configuration_by_ttoo_add_ch_send_copy_kam", "//*[contains(@id, '0:sbc21::content')]");
        elements.put("configuration_by_ttoo_add_b_save", "//*[contains(@id, '0:pcgt45:boton_commit')]");


        //SEARCH

        elements.put("configuration_by_ttoo_se_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("configuration_by_ttoo_se_b_reset", "//*[contains(@id, '0:pc1:tTtoo::ch::t')]/tbody/tr[2]/th/a");
        elements.put("configuration_by_ttoo_se_i_ttoo", "//*[contains(@id, 'tTtoo:inputText7::content')]");
        elements.put("configuration_by_ttoo_se_i_ttoo_shortname", "//*[contains(@id, 'tTtoo_afr_c108::content')]");
        elements.put("configuration_by_ttoo_se_i_sale_value", "//*[contains(@id, 'tTtoo:inputText23::content')]");
        elements.put("configuration_by_ttoo_se_i_arrival_date_from", "//*[contains(@id, 'tTtoo:id28::content')]");
        elements.put("configuration_by_ttoo_se_i_arrival_date_to", "//*[contains(@id, 'tTtoo:id25::content')]");
        elements.put("configuration_by_ttoo_se_i_stay_date_from", "//*[contains(@id, 'tTtoo:id27::content')]");
        elements.put("configuration_by_ttoo_se_i_stay_date_to", "//*[contains(@id, 'tTtoo:id26::content')]");
        elements.put("configuration_by_ttoo_se_i_chase_from", "//*[contains(@id, 'tTtoo:inputText1::content')]");
        elements.put("configuration_by_ttoo_se_i_chase_until", "//*[contains(@id, 'tTtoo:inputText2::content')]");
        elements.put("configuration_by_ttoo_se_rechase_days", "//*[contains(@id, 'tTtoo:inputText3::content')]");
        elements.put("configuration_by_ttoo_se_i_atlas_co", "//*[contains(@id, 'tTtoo_afr_c119::content')]");
        elements.put("configuration_by_ttoo_se_i_atlas_office", "//*[contains(@id, 'tTtoo_afr_c110::content')]");
        elements.put("configuration_by_ttoo_se_i_destination", "//*[contains(@id, 'tTtoo_afr_c106::content')]");
        elements.put("configuration_by_ttoo_se_i_destination_zone", "//*[contains(@id, 'tTtoo_afr_c125::content')]");
        elements.put("configuration_by_ttoo_se_i_hotel_category", "//*[contains(@id, 'tTtoo_afr_c120::content')]");
        elements.put("configuration_by_ttoo_se_i_last_minutes_days", "//*[contains(@id, 'tTtoo:inputText4::content')]");
        elements.put("configuration_by_ttoo_se_i_project_name", "//*[contains(@id, 'tTtoo_afr_c107::content')]");
        elements.put("configuration_by_ttoo_se_sl_include_dnd_hotels", "//*[contains(@id, 'tTtoo:selectOneChoice5::content')]");
        elements.put("configuration_by_ttoo_se_sl_include_bms", "//*[contains(@id, 'tTtoo:selectOneChoice9::content')]");
        elements.put("configuration_by_ttoo_se_sl_include_integrations", "//*[contains(@id, 'tTtoo:selectOneChoice10::content')]");
        elements.put("configuration_by_ttoo_se_sl_include_ref_to_clients", "//*[contains(@id, 'tTtoo:selectOneChoice4::content')]");
        elements.put("configuration_by_ttoo_se_sl_client_confirmation", "//*[contains(@id, 'tTtoo:selectOneChoice3::content')]");
        elements.put("configuration_by_ttoo_se_sl_send_copy_kam", "//*[contains(@id, 'tTtoo:selectOneChoice2::content')]");
        elements.put("configuration_by_ttoo_se_sl_active", "//*[contains(@id, 'tTtoo:selectOneChoice1::content')]");
        elements.put("configuration_by_ttoo_se_e_result", "//*[contains(@id, 'pc1:tTtoo::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("configuration_by_ttoo_ed_b_edit", "//*[contains(@id, 'tConfigurationByTtoo:boton_edit')]");
        elements.put("configuration_by_ttoo_ed_lov_tto", "//*[contains(@id, '0:seqTtooId::lovIconId')]");
        elements.put("configuration_by_ttoo_ed_i_tto", "//*[contains(@id, '0:seqTtooId::content')]");
        elements.put("configuration_by_ttoo_ed_i_arrival_date_from", "//*[contains(@id, '0:id21::content')]");
        elements.put("configuration_by_ttoo_ed_i_stay_date_from", "//*[contains(@id, '0:id23::content')]");
        elements.put("configuration_by_ttoo_ed_i_chase_from", "//*[contains(@id, '0:it11::content')]");
        elements.put("configuration_by_ttoo_ed_i_rechase_days", "//*[contains(@id, '0:it7::content')]");
        elements.put("configuration_by_ttoo_ed_sl_include_bms", "//*[contains(@id, '0:soc2::content')]");
        elements.put("configuration_by_ttoo_ed_ch_include_dns_hotels", "//*[contains(@id, '0:sbc24::content')]");
        elements.put("configuration_by_ttoo_ed_ch_include_ref_to_client", "//*[contains(@id, '0:sbc25::content')]");
        elements.put("configuration_by_ttoo_ed_i_project_name", "//*[contains(@id, '0:it10::content')]");
        elements.put("configuration_by_ttoo_ed_ch_active", "//*[contains(@id, '0:sbc23::content')]");
        elements.put("configuration_by_ttoo_ed_i_sale_value", "//*[contains(@id, '0:it8::content')]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb1", "//*[contains(@id, '0:msilovCodEmp:dc_t2::db')]/table/tbody/tr[2]/td[2]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_co_b_pass", "//*[contains(@id, '0:msilovCodEmp:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_co_e_company_name_tb2", "//*[contains(@id, '0:msilovCodEmp:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_co_b_ok", "//*[contains(@id, '0:msilovCodEmp:dc_ctb5')]");
        elements.put("configuration_by_ttoo_ed_i_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_ed_lov_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb1", "//*[contains(@id, '0:msilovCodOfi:dc_t2::db')]/table/tbody/tr/td[4]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_office_b_pass", "//*[contains(@id, '0:msilovCodOfi:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_office_e_office_code_tb2", "//*[contains(@id, '0:msilovCodOfi:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_ttoo_ed_lov_atlas_office_b_ok", "//*[contains(@id, '0:msilovCodOfi:dc_ctb5')]");
        elements.put("configuration_by_ttoo_ed_i_atalas_office", "//*[contains(@id, '0:msilovCodOfi:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_ed_lov_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb1", "//*[contains(@id, '0:msilovCodDestino:dc_t2::db')]/table/tbody/tr[2]/td[2]");
        elements.put("configuration_by_ttoo_ed_lov_destination_b_pass", "//*[contains(@id, '0:msilovCodDestino:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_destination_e_destination_name_tb2", "//*[contains(@id, '0:msilovCodDestino:dc_t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_by_ttoo_ed_lov_destination_b_ok", "//*[contains(@id, '0:msilovCodDestino:dc_ctb5')]");
        elements.put("configuration_by_ttoo_ed_i_destination", "//*[contains(@id, '0:msilovCodDestino:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_ed_lov_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb1", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t2::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_ed_lov_destination_zone_b_pass", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_destination_zone_e_zone_description_tb2", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_ed_lov_destination_zone_b_ok", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb5')]");
        elements.put("configuration_by_ttoo_ed_i_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_ed_lov_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb1::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb1", "//*[contains(@id, '0:msilovCodCateg:dc_t2::db')]/table/tbody/tr[2]/td");
        elements.put("configuration_by_ttoo_ed_lov_hotel_category_b_pass", "//*[contains(@id, '0:msilovCodCateg:dc_ctb4::icon')]");
        elements.put("configuration_by_ttoo_ed_lov_hotel_category_hotel_category_code_tb2", "//*[contains(@id, '0:msilovCodCateg:dc_t1::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_ttoo_ed_lov_hotel_category_b_ok", "//*[contains(@id, '0:msilovCodCateg:dc_ctb5')]");
        elements.put("configuration_by_ttoo_ed_i_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_pgl4')]/div");
        elements.put("configuration_by_ttoo_ed_i_ttoo_shortname", "//*[contains(@id, '0:it9::content')]");
        elements.put("configuration_by_ttoo_ed_i_arrival_date_to", "//*[contains(@id, '0:id24::content')]");
        elements.put("configuration_by_ttoo_ed_i_stay_date_to", "//*[contains(@id, '0:id22::content')]");
        elements.put("configuration_by_ttoo_ed_i_chase_to", "//*[contains(@id, '0:it4::content')]");
        elements.put("configuration_by_ttoo_ed_i_last_minute_day", "//*[contains(@id, '0:it3::content')]");
        elements.put("configuration_by_ttoo_ed_sl_include_integrations", "//*[contains(@id, '0:soc1::content')]");
        elements.put("configuration_by_ttoo_ed_ch_client_confirmation", "//*[contains(@id, '0:sbc22::content')]");
        elements.put("configuration_by_ttoo_ed_ch_send_copy_kam", "//*[contains(@id, '0:sbc21::content')]");
        elements.put("configuration_by_ttoo_ed_b_save", "//*[contains(@id, '0:pcgt45:boton_commit')]");
        elements.put("configuration_by_ttoo_ed_b_delete_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb3::icon')]");
        elements.put("configuration_by_ttoo_ed_b_delete_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb3::icon')]");
        elements.put("configuration_by_ttoo_ed_b_delete_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb3::icon')]");
        elements.put("configuration_by_ttoo_ed_b_delete_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb3::icon')]");
        elements.put("configuration_by_ttoo_ed_b_delete_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb3::icon')]");

        //OTHER ACTIONS

        elements.put("configuration_by_ttoo_b_actions", "//*[contains(@id, 'pdm12:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("configuration_by_ttoo_b_actions_b_data_history", "//*[contains(@id, 'pdm12:dc_cmi0')]/td[2]");
        elements.put("configuration_by_ttoo_b_actions_b_data_history_b_ok", "//*[contains(@id, ':pdm12:d22::ok']");
        elements.put("configuration_by_ttoo_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE

        elements.put("configuration_by_ttoo_b_delete", "//*[contains(@id, 'tConfigurationByTtoo:boton_remove')]");
        elements.put("configuration_by_ttoo_b_delete_b_ok", "//*[contains(@id, 'r1:0:d5::yes')]");
        elements.put("configuration_by_ttoo_e_record", "//*[contains(@id, '0:pc1:outputText4')]");




    }
}
