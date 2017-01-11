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
        elements.put("configuration_by_ttoo_add_ch_active", "//*[contains(@id, '0:sbc23::content')]");
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
        elements.put("configuration_by_ttoo_ed_ch_active", "//*[contains(@id, '0:sbc23::content')]");
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
        elements.put("configuration_by_ttoo_b_historic","//*[contains(@id, 'pc1:pdm12:dc_cmi1')]/td[2]");
        elements.put("configuration_by_ttoo_b_historic_b_qbe","//*[contains(@id, 'pc3:_qbeTbr')]/a");
        elements.put("configuration_by_ttoo_b_historic_i_ttoo","//*[contains(@id, 'pc3:t5:inputText10::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_ttoo_shortname","//*[contains(@id, 'pc3_afr_t5_afr_c54::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_sale_value","//*[contains(@id, 'pc3:t5:inputText11::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_arrival_date_from","//*[contains(@id, 'pc3:t5:id12::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_arrival_date_to","//*[contains(@id, 'pc3:t5:id14::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_stay_date_from","//*[contains(@id, 'pc3:t5:id9::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_stay_date_to","//*[contains(@id, 'pc3:t5:id11::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_chase_from","//*[contains(@id, 'pc3:t5:inputText12::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_chase_until","//*[contains(@id, 'pc3:t5:inputText13::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_rechase_days","//*[contains(@id, 'pc3:t5:inputText14::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_atlas_co","//*[contains(@id, 'pc3_afr_t5_afr_c48::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_soficodofi","//*[contains(@id, 'pc3:t5:inputText15::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_destination","//*[contains(@id, 'pc3_afr_t5_afr_c72::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_deszonage","//*[contains(@id, 'pc3_afr_t5_afr_c56::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_hotel_category","//*[contains(@id, 'pc3_afr_t5_afr_c66::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_last_minute_days","//*[contains(@id, 'pc3:t5:inputText16::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_proyect_name","//*[contains(@id, 'pc3_afr_t5_afr_c62::content')]");
        elements.put("configuration_by_ttoo_b_historic_sl_include_dnc_hotels","//*[contains(@id, 'pc3:t5:soc12::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_include_bms","//*[contains(@id, 'pc3_afr_t5_afr_c70::content')]");
        elements.put("configuration_by_ttoo_b_historic_sl_include_integrations","//*[contains(@id, 'pc3_afr_t5_afr_c61::content')]");
        elements.put("configuration_by_ttoo_b_historic_sl_include_ref_to_client","//*[contains(@id, 'pc3:t5:soc13::content')]");
        elements.put("configuration_by_ttoo_b_historic_sl_client_confirmation","//*[contains(@id, 'pc3:t5:soc14::content')]");
        elements.put("configuration_by_ttoo_b_historic_sl_send_copy_kam","//*[contains(@id, 'pc3:t5:soc15::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_active","//*[contains(@id, 'pc3:t5:soc16::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_fecinv","//*[contains(@id, 'pc3:t5:id10::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_fecfinv","//*[contains(@id, 'pc3:t5:id13::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_usuiniv","//*[contains(@id, 'pc3_afr_t5_afr_c74::content')]");
        elements.put("configuration_by_ttoo_b_historic_i_usufinv","//*[contains(@id, 'pc3_afr_t5_afr_c60::content')]");
        elements.put("configuration_by_ttoo_b_historic_e_scroll","//*[contains(@id, 'pc3:t5::scroller')]");
        elements.put("configuration_by_ttoo_b_historic_b_exit","//*[contains(@id, '0:d2::close')]");
        elements.put("configuration_by_ttoo_b_historic_b_dtach","//*[contains(@id, 'pc3:_dchTbr')]");
        elements.put("configuration_by_ttoo_b_historic_e_result_ttoo","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[1]");
        elements.put("configuration_by_ttoo_b_historic_e_ttoo_shortname","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[2]");
        elements.put("configuration_by_ttoo_b_historic_e_sale_value","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[3]");
        elements.put("configuration_by_ttoo_b_historic_e_arrival_date_from","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("configuration_by_ttoo_b_historic_e_arrival_date_to","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[5]");
        elements.put("configuration_by_ttoo_b_historic_e_stay_date_from","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[6]");
        elements.put("configuration_by_ttoo_b_historic_e_stay_date_to","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[7]");
        elements.put("configuration_by_ttoo_b_historic_e_chase_from","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[8]");
        elements.put("configuration_by_ttoo_b_historic_e_chase_until","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[9]");
        elements.put("configuration_by_ttoo_b_historic_e_rechase_days","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[10]");
        elements.put("configuration_by_ttoo_b_historic_e_atlas_co","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[11]");
        elements.put("configuration_by_ttoo_b_historic_e_soficodofi","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[12]");
        elements.put("configuration_by_ttoo_b_historic_e_destination","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[13]");
        elements.put("configuration_by_ttoo_b_historic_e_deszonage","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[14]");
        elements.put("configuration_by_ttoo_b_historic_e_hotel_categori","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[15]");
        elements.put("configuration_by_ttoo_b_historic_e_last_minute_days","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[16]");
        elements.put("configuration_by_ttoo_b_historic_e_proyect_name","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[17]");
        elements.put("configuration_by_ttoo_b_historic_e_include_dnc_hotels","//*[contains(@id, 'pc3:t5:0:sbc11::content')]/span/img");
        elements.put("configuration_by_ttoo_b_historic_e_include_bms","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[19]");
        elements.put("configuration_by_ttoo_b_historic_e_include_integrations","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[20]");
        elements.put("configuration_by_ttoo_b_historic_e_include_ref_to_client","//*[contains(@id, 'pc3:t5:0:sbc14::content')]/span/img");
        elements.put("configuration_by_ttoo_b_historic_e_client_confirmation","//*[contains(@id, 'pc3:t5:0:sbc15::content')]/span/img");
        elements.put("configuration_by_ttoo_b_historic_e_send_copy_kam","//*[contains(@id, 'pc3:t5:0:sbc13::content')]/span/img");
        elements.put("configuration_by_ttoo_b_historic_e_active","//*[contains(@id, 'pc3:t5:0:sbc12::content')]/span/img");
        elements.put("configuration_by_ttoo_b_historic_feciniv","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[25]");
        elements.put("configuration_by_ttoo_b_historic_e_fecfinv","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[26]");
        elements.put("configuration_by_ttoo_b_historic_e_usuiniv","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[27]");
        elements.put("configuration_by_ttoo_b_historic_e_usufinv","//*[contains(@id, 'pc3:t5::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[28]");




        //DELETE

        elements.put("configuration_by_ttoo_b_delete", "//*[contains(@id, 'tConfigurationByTtoo:boton_remove')]");
        elements.put("configuration_by_ttoo_b_delete_b_ok", "//*[contains(@id, 'r1:0:d5::yes')]");
        elements.put("configuration_by_ttoo_e_record", "//*[contains(@id, '0:pc1:outputText4')]");


        //CONFIGURATION BY CLIENT RATING

        //ADD

        elements.put("configuration_by_clients_rating_add_b_add", "//*[contains(@id, 'tConfByClientRateId:boton_add')]");
        elements.put("configuration_by_clients_rating_add_lov_client_rating", "//*[contains(@id, 'codSegmentoId::lovIconId')]");
        elements.put("configuration_by_clients_rating_add_i_client_rating", "//*[contains(@id, 'codSegmentoId::content')]");
        elements.put("configuration_by_clients_rating_add_i_arrival_date_from", "//*[contains(@id, '0:id21::content')]");
        elements.put("configuration_by_clients_rating_add_i_stay_date_from", "//*[contains(@id, '0:id23::content')]");
        elements.put("configuration_by_clients_rating_add_i_chase_from", "//*[contains(@id, '0:it11::content')]");
        elements.put("configuration_by_clients_rating_add_i_rechase_days", "//*[contains(@id, '0:it7::content')]");
        elements.put("configuration_by_clients_rating_add_sl_include_bms", "//*[contains(@id, '0:soc2::content')]");
        elements.put("configuration_by_clients_rating_add_ch_include_dns_hotels", "//*[contains(@id, '0:sbc24::content')]");
        elements.put("configuration_by_clients_rating_add_ch_include_ref_to_client", "//*[contains(@id, '0:sbc25::content')]");
        elements.put("configuration_by_clients_rating_add_i_project_name", "//*[contains(@id, '0:it10::content')]");
        elements.put("configuration_by_clients_rating_add_ch_active", "//*[contains(@id, '0:sbc23::content')]");
        elements.put("configuration_by_clients_rating_add_i_sale_value", "//*[contains(@id, '0:it8::content')]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_add_atlas_co_e_company_name_tb1", "//*[contains(@id, '0:msilovCodEmp:dc_t2::db')]/table/tbody/tr[1]/td[2]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_co_b_pass", "//*[contains(@id, '0:msilovCodEmp:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_co_e_company_name_tb2", "//*[contains(@id, '0:msilovCodEmp:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_clients_rating_add_atlas_co_b_ok", "//*[contains(@id, '0:msilovCodEmp:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_add_i_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_add_lov_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb1", "//*[contains(@id, '0:msilovCodOfi:dc_t2::db')]/table/tbody/tr/td[4]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_office_b_pass", "//*[contains(@id, '0:msilovCodOfi:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_office_e_office_code_tb2", "//*[contains(@id, '0:msilovCodOfi:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_clients_rating_add_lov_atlas_office_b_ok", "//*[contains(@id, '0:msilovCodOfi:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_add_i_atalas_office", "//*[contains(@id, '0:msilovCodOfi:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_add_lov_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_destination_e_destination_name_tb1", "//*[contains(@id, '0:msilovCodDestino:dc_t2::db')]/table/tbody/tr[1]/td[2]");
        elements.put("configuration_by_clients_rating_add_lov_destination_b_pass", "//*[contains(@id, '0:msilovCodDestino:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_add_destination_e_destination_name_tb2", "//*[contains(@id, '0:msilovCodDestino:dc_t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_by_clients_rating_add_destination_b_ok", "//*[contains(@id, '0:msilovCodDestino:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_add_i_destination", "//*[contains(@id, '0:msilovCodDestino:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_add_lov_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb1", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t2::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_clients_rating_add_lov_destination_zone_b_pass", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_destination_zone_e_zone_description_tb2", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_clients_rating_add_lov_destination_zone_b_ok", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_add_i_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_add_lov_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb1", "//*[contains(@id, '0:msilovCodCateg:dc_t2::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_clients_rating_add_lov_hotel_category_b_pass", "//*[contains(@id, '0:msilovCodCateg:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_add_lov_hotel_category_hotel_category_code_tb2", "//*[contains(@id, '0:msilovCodCateg:dc_t1::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_clients_rating_add_lov_hotel_category_b_ok", "//*[contains(@id, '0:msilovCodCateg:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_add_i_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_add_i_arrival_date_to", "//*[contains(@id, '0:id24::content')]");
        elements.put("configuration_by_clients_rating_add_i_stay_date_to", "//*[contains(@id, '0:id22::content')]");
        elements.put("configuration_by_clients_rating_add_i_chase_to", "//*[contains(@id, '0:it4::content')]");
        elements.put("configuration_by_clients_rating_add_i_last_minute_day", "//*[contains(@id, '0:it3::content')]");
        elements.put("configuration_by_clients_rating_add_sl_include_integrations", "//*[contains(@id, '0:soc1::content')]");
        elements.put("configuration_by_clients_rating_add_ch_client_confirmation", "//*[contains(@id, '0:sbc22::content')]");
        elements.put("configuration_by_clients_rating_add_ch_send_copy_kam", "//*[contains(@id, '0:sbc21::content')]");
        elements.put("configuration_by_clients_rating_add_b_save", "//*[contains(@id, '0:pcgt45:boton_commit')]");


        //SEARCH

        elements.put("configuration_by_clients_rating_b_qbe", "//*[contains(@id, 'pc2:_qbeTbr')]/a");
        elements.put("configuration_by_clients_rating_i_client_rating", "//*[contains(@id, 'tCbcr_afr_c31::content')]");
        elements.put("configuration_by_clients_rating_i_sale_value", "//*[contains(@id, 'tCbcr_afr_c27::content')]");
        elements.put("configuration_by_clients_rating_i_arrival_date_from", "//*[contains(@id, 'tCbcr:inputDate1::content')]");
        elements.put("configuration_by_clients_rating_i_arrival_date_to", "//*[contains(@id, 'tCbcr:id5::content')]");
        elements.put("configuration_by_clients_rating_i_stay_date_to", "//*[contains(@id, 'tCbcr:id8::content')]");
        elements.put("configuration_by_clients_rating_i_stay_date_from", "//*[contains(@id, 'tCbcr:id7::content')]");
        elements.put("configuration_by_clients_rating_i_chase_from", "//*[contains(@id, 'tCbcr:inputText5::content')]");
        elements.put("configuration_by_clients_rating_i_chase_until", "//*[contains(@id, 'tCbcr:inputText6::content')]");
        elements.put("configuration_by_clients_rating_i_rechase_days", "//*[contains(@id, 'tCbcr:inputText8::content')]");
        elements.put("configuration_by_clients_rating_i_atlas_co", "//*[contains(@id, 'tCbcr_afr_c36::content')]");
        elements.put("configuration_by_clients_rating_i_atlas_office", "//*[contains(@id, 'tCbcr_afr_c40::content')]");
        elements.put("configuration_by_clients_rating_i_destination", "//*[contains(@id, 'tCbcr_afr_c38::content')]");
        elements.put("configuration_by_clients_rating_i_destination_zone", "//*[contains(@id, 'tCbcr_afr_c42::content')]");
        elements.put("configuration_by_clients_rating_i_hotel_category", "//*[contains(@id, 'tCbcr_afr_c29::content')]");
        elements.put("configuration_by_clients_rating_i_last_minute_days", "//*[contains(@id, 'tCbcr_afr_c26::content')]");
        elements.put("configuration_by_clients_rating_i_project_name", "//*[contains(@id, 'tCbcr_afr_c20::content')]");
        elements.put("configuration_by_clients_rating_sl_include_dnd_hotels", "//*[contains(@id, 'tCbcr:soc7::content')]");
        elements.put("configuration_by_clients_rating_sl_include_bms", "//*[contains(@id, 'tCbcr:selectOneChoice6::content')]");
        elements.put("configuration_by_clients_rating_sl_include_integrations", "//*[contains(@id, 'tCbcr:selectOneChoice7::content')]");
        elements.put("configuration_by_clients_rating_sl_include_ref_to_client", "//*[contains(@id, 'tCbcr:selectOneChoice8::content')]");
        elements.put("configuration_by_clients_rating_sl_send_copy_kam", "//*[contains(@id, 'tCbcr:soc11::content')]");
        elements.put("configuration_by_clients_rating_sl_client_confirmation", "//*[contains(@id, 'tCbcr:soc9::content')]");
        elements.put("configuration_by_clients_rating_sl_active", "//*[contains(@id, 'tCbcr:soc10::content')]");
        elements.put("configuration_by_clients_rating_e_result", "//*[contains(@id, 'tCbcr::db')]/table/tbody/tr/td[1]");


        //EDIT

        elements.put("configuration_by_clients_rating_ed_b_edit", "//*[contains(@id, 'tConfByClientRateId:boton_edit')]");
        elements.put("configuration_by_clients_rating_ed_lov_client_rating", "//*[contains(@id, 'codSegmentoId::lovIconId')]");
        elements.put("configuration_by_clients_rating_ed_i_client_rating", "//*[contains(@id, 'codSegmentoId::content')]");
        elements.put("configuration_by_clients_rating_ed_i_arrival_date_from", "//*[contains(@id, '0:id21::content')]");
        elements.put("configuration_by_clients_rating_ed_i_stay_date_from", "//*[contains(@id, '0:id23::content')]");
        elements.put("configuration_by_clients_rating_ed_i_chase_from", "//*[contains(@id, '0:it11::content')]");
        elements.put("configuration_by_clients_rating_ed_i_rechase_days", "//*[contains(@id, '0:it7::content')]");
        elements.put("configuration_by_clients_rating_ed_sl_include_bms", "//*[contains(@id, '0:soc2::content')]");
        elements.put("configuration_by_clients_rating_ed_ch_include_dns_hotels", "//*[contains(@id, '0:sbc24::content')]");
        elements.put("configuration_by_clients_rating_ed_ch_include_ref_to_client", "//*[contains(@id, '0:sbc25::content')]");
        elements.put("configuration_by_clients_rating_ed_i_project_name", "//*[contains(@id, '0:it10::content')]");
        elements.put("configuration_by_clients_rating_ed_ch_active", "//*[contains(@id, '0:sbc23::content')]");
        elements.put("configuration_by_clients_rating_ed_i_sale_value", "//*[contains(@id, '0:it8::content')]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb1", "//*[contains(@id, '0:msilovCodEmp:dc_t2::db')]/table/tbody/tr[2]/td[2]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_co_b_pass", "//*[contains(@id, '0:msilovCodEmp:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_co_e_company_name_tb2", "//*[contains(@id, '0:msilovCodEmp:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_co_b_ok", "//*[contains(@id, '0:msilovCodEmp:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_ed_i_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_lov_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb1", "//*[contains(@id, '0:msilovCodOfi:dc_t2::db')]/table/tbody/tr/td[4]");
        elements.put("configuration_by_clients_rating_lov_atlas_office_b_pass", "//*[contains(@id, '0:msilovCodOfi:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_lov_atlas_office_e_office_code_tb2", "//*[contains(@id, '0:msilovCodOfi:dc_t1::db')]/table/tbody/tr/td[2]");
        elements.put("configuration_by_clients_rating_ed_lov_atlas_office_b_ok", "//*[contains(@id, '0:msilovCodOfi:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_ed_i_atalas_office", "//*[contains(@id, '0:msilovCodOfi:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_ed_lov_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb1", "//*[contains(@id, '0:msilovCodDestino:dc_t2::db')]/table/tbody/tr[2]/td[2]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_b_pass", "//*[contains(@id, '0:msilovCodDestino:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_e_destination_name_tb2", "//*[contains(@id, '0:msilovCodDestino:dc_t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_b_ok", "//*[contains(@id, '0:msilovCodDestino:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_ed_i_destination", "//*[contains(@id, '0:msilovCodDestino:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_ed_lov_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb1", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t2::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_clients_rating_lov_destination_zone_b_pass", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_zone_e_zone_description_tb2", "//*[contains(@id, '0:msilovSeqZonaGe:dc_t1::db')]/table/tbody/tr/td[3]");
        elements.put("configuration_by_clients_rating_ed_lov_destination_zone_b_ok", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_ed_i_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_lov_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb1::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb1", "//*[contains(@id, '0:msilovCodCateg:dc_t2::db')]/table/tbody/tr[2]/td");
        elements.put("configuration_by_clients_rating_ed_lov_hotel_category_b_pass", "//*[contains(@id, '0:msilovCodCateg:dc_ctb4::icon')]");
        elements.put("configuration_by_clients_rating_ed_lov_hotel_category_hotel_category_code_tb2", "//*[contains(@id, '0:msilovCodCateg:dc_t1::db')]/table/tbody/tr[1]/td");
        elements.put("configuration_by_clients_rating_ed_lov_hotel_category_b_ok", "//*[contains(@id, '0:msilovCodCateg:dc_ctb5')]");
        elements.put("configuration_by_clients_rating_ed_i_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_pgl4')]/div");
        elements.put("configuration_by_clients_rating_ed_i_arrival_date_to", "//*[contains(@id, '0:id24::content')]");
        elements.put("configuration_by_clients_rating_ed_i_stay_date_to", "//*[contains(@id, '0:id22::content')]");
        elements.put("configuration_by_clients_rating_ed_i_chase_to", "//*[contains(@id, '0:it4::content')]");
        elements.put("configuration_by_clients_rating_ed_i_last_minute_day", "//*[contains(@id, '0:it3::content')]");
        elements.put("configuration_by_clients_rating_ed_sl_include_integrations", "//*[contains(@id, '0:soc1::content')]");
        elements.put("configuration_by_clients_rating_ed_ch_client_confirmation", "//*[contains(@id, '0:sbc22::content')]");
        elements.put("configuration_by_clients_rating_ed_ch_send_copy_kam", "//*[contains(@id, '0:sbc21::content')]");
        elements.put("configuration_by_clients_rating_ed_b_save", "//*[contains(@id, '0:pcgt45:boton_commit')]");
        elements.put("configuration_by_clients_rating_ed_b_delete_atlas_co", "//*[contains(@id, '0:msilovCodEmp:dc_ctb3::icon')]");
        elements.put("configuration_by_clients_rating_ed_b_delete_atlas_office", "//*[contains(@id, '0:msilovCodOfi:dc_ctb3::icon')]");
        elements.put("configuration_by_clients_rating_ed_b_delete_destination", "//*[contains(@id, '0:msilovCodDestino:dc_ctb3::icon')]");
        elements.put("configuration_by_clients_rating_ed_b_delete_destination_zone", "//*[contains(@id, '0:msilovSeqZonaGe:dc_ctb3::icon')]");
        elements.put("configuration_by_clients_rating_ed_b_delete_hotel_category", "//*[contains(@id, '0:msilovCodCateg:dc_ctb3::icon')]");


        //OTHER ACTIONS
        elements.put("configuration_by_clients_rating_b_actions", "//*[contains(@id, 'PCGenericMenu1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("configuration_by_clients_rating_b_actions_b_data_history", "//*[contains(@id, 'PCGenericMenu1:dc_cmi0')]/td[2]");
        elements.put("configuration_by_clients_rating_b_actions_b_data_history_b_ok", "//*[contains(@id, 'PCGenericMenu1:d22::ok')]");
        elements.put("configuration_by_clients_rating_b_detach", "//*[contains(@id, 'pc2:_dchTbr')]/a");
        elements.put("configuration_by_clients_rating_b_actions_b_historic", "//*[contains(@id, 'pc2:PCGenericMenu1:dc_cmi1')]/td[2]");
        elements.put("configuration_by_clients_b_historic_b_qbe","//*[contains(@id, 'pc4:_qbeTbr')]/a");
        elements.put("configuration_by_clients_b_historic_i_codsegmento","//*[contains(@id, 'pc4_afr_t6_afr_c101::content')]");
        elements.put("configuration_by_clients_b_historic_i_sale_value","//*[contains(@id, 'pc4:t6:inputText17::content')]");
        elements.put("configuration_by_clients_b_historic_i_arrival_date_from","//*[contains(@id, 'pc4:t6:id16::content')]");
        elements.put("configuration_by_clients_b_historic_i_arrival_date_to","//*[contains(@id, 'pc4:t6:id20::content')]");
        elements.put("configuration_by_clients_b_historic_i_stay_date_from","//*[contains(@id, 'pc4:t6:id17::content')]");
        elements.put("configuration_by_clients_b_historic_i_stay_date_to","//*[contains(@id, 'pc4:t6:id18::content')]");
        elements.put("configuration_by_clients_b_historic_i_chase_from","//*[contains(@id, 'pc4:t6:inputText18::content')]");
        elements.put("configuration_by_clients_b_historic_i_chase_until","//*[contains(@id, 'pc4:t6:inputText19::content')]");
        elements.put("configuration_by_clients_b_historic_i_rechase_days","//*[contains(@id, 'pc4:t6:inputText20::content')]");
        elements.put("configuration_by_clients_b_historic_i_atlas_co","//*[contains(@id, 'pc4_afr_t6_afr_c97::content')]");
        elements.put("configuration_by_clients_b_historic_i_soficodofi","//*[contains(@id, 'pc4:t6:inputText21::content')]");
        elements.put("configuration_by_clients_b_historic_i_destination","//*[contains(@id, 'pc4_afr_t6_afr_c94::content')]");
        elements.put("configuration_by_clients_b_historic_i_deszonage","//*[contains(@id, 'pc4_afr_t6_afr_c85::content')]");
        elements.put("configuration_by_clients_b_historic_i_hotel_category","//*[contains(@id, 'pc4_afr_t6_afr_c90::content')]");
        elements.put("configuration_by_clients_b_historic_i_last_minute_days","//*[contains(@id, 'pc4:t6:inputText22::content')]");
        elements.put("configuration_by_clients_b_historic_i_proyect_name","//*[contains(@id, 'pc4_afr_t6_afr_c102::content')]");
        elements.put("configuration_by_clients_b_historic_sl_include_dnc_hotels","//*[contains(@id, 'pc4:t6:soc17::content')]");
        elements.put("configuration_by_clients_b_historic_i_include_bms","//*[contains(@id, 'pc4_afr_t6_afr_c81::content')]");
        elements.put("configuration_by_clients_b_historic_sl_include_integrations","//*[contains(@id, 'pc4_afr_t6_afr_c91::content')]");
        elements.put("configuration_by_clients_b_historic_sl_include_ref_to_client","//*[contains(@id, 'pc4:t6:soc18::content')]");
        elements.put("configuration_by_clients_b_historic_sl_client_confirmation","//*[contains(@id, 'pc4:t6:soc21::content')]");
        elements.put("configuration_by_clients_b_historic_sl_send_copy_kam","//*[contains(@id, 'pc4:t6:soc20::content')]");
        elements.put("configuration_by_clients_b_historic_i_active","//*[contains(@id, 'pc4:t6:soc19::content')]");
        elements.put("configuration_by_clients_b_historic_i_fecinv","//*[contains(@id, 'pc4:t6:id19::content')]");
        elements.put("configuration_by_clients_b_historic_i_fecfinv","//*[contains(@id, 'pc4:t6:id15::content')]");
        elements.put("configuration_by_clients_b_historic_i_usuiniv","//*[contains(@id, 'pc4_afr_t6_afr_c84::content')]");
        elements.put("configuration_by_clients_b_historic_i_usufinv","//*[contains(@id, 'pc4_afr_t6_afr_c78::content')]");

        //DELETE

        elements.put("configuration_by_clients_rating_b_delete", "//*[contains(@id, 'tConfByClientRateId:boton_remove')]");
        elements.put("configuration_by_clients_rating_b_delete_b_ok", "//*[contains(@id, '0:d5::yes')]");
        elements.put("configuration_by_clients_rating_e_record", "//*[contains(@id, '0:pc2:outputText6')]");


        //SUPLIER/HOTEL EXCLUSIONS

        //GO TO
        elements.put("go_to_suplier_hotel_exclusions", "//*[contains(@id, 'sdi2::disAcr')]");


        //ADD

        elements.put("suplier_hotel_exclusions_add_b_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("suplier_hotel_exclusions_add_lov_company", "//*[contains(@id, 'pcgt1:companyId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_add_i_company", "//*[contains(@id, 'pcgt1:companyId::content')]");
        elements.put("suplier_hotel_exclusions_add_lov_suplier_code", "//*[contains(@id, 'pcgt1:codProveId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_add_i_suplier_code", "//*[contains(@id, 'pcgt1:codProveId::content')]");
        elements.put("suplier_hotel_exclusions_add_lov_hotel_code", "//*[contains(@id, 'pcgt1:cId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_add_i_hotel_code", "//*[contains(@id, 'pcgt1:cId::content')]");
        elements.put("suplier_hotel_exclusions_add_lov_chain", "//*[contains(@id, 'pcgt1:codCadenaId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_add_i_chain", "//*[contains(@id, 'pcgt1:codCadenaId::content')]");
        elements.put("suplier_hotel_exclusions_add_lov_office", "//*[contains(@id, 'pcgt1:officeId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_add_i_office", "//*[contains(@id, 'pcgt1:officeId::content')]");
        elements.put("suplier_hotel_exclusions_add_e_suplier_name", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("suplier_hotel_exclusions_add_e_hotel_name", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("suplier_hotel_exclusions_add_e_chain_name", "//*[contains(@id, 'pcgt1:it7::content')]");
        elements.put("suplier_hotel_exclusions_add_e_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("suplier_hotel_exclusions_add_suplier_short_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("suplier_hotel_exclusions_add_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("suplier_hotel_exclusions_add_b_save_b_ok", "//*[contains(@id, '0:d2::yes')]");
        elements.put("suplier_hotel_exclusions_add_b_save_b_ok_sl_status", "//*[contains(@id, '0:soc3::content')]");
        elements.put("suplier_hotel_exclusions_add_b_save_b_ok_b_status_ok", "//*[contains(@id, '0:cb1')]");


        //SEARCH

        elements.put("suplier_hotel_exclusions_se_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");
        elements.put("suplier_hotel_exclusions_se_i_suplier_code", "//*[contains(@id, 'afr_c3::content')]");
        elements.put("suplier_hotel_exclusions_se_i_suplier_name", "//*[contains(@id, 'afr_c5::content')]");
        elements.put("suplier_hotel_exclusions_se_i_chain", "//*[contains(@id, 'afr_c4::content')]");
        elements.put("suplier_hotel_exclusions_se_i_hotel_code", "//*[contains(@id, 't1:inputText7::content')]");
        elements.put("suplier_hotel_exclusions_se_i_hotel_name", "//*[contains(@id, 'afr_c2::content')]");
        elements.put("suplier_hotel_exclusions_se_e_result", "//*[contains(@id, 't1::db')]/table/tbody/tr[1]/td[1]");


        //EDIT

        elements.put("suplier_hotel_exclusions_ed_b_edit", "//*[contains(@id, 'pcgt1:boton_edit')]");
        elements.put("suplier_hotel_exclusions_ed_lov_company", "//*[contains(@id, 'pcgt1:companyId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_ed_i_company", "//*[contains(@id, 'pcgt1:companyId::content')]");
        elements.put("suplier_hotel_exclusions_ed_lov_suplier_code", "//*[contains(@id, 'pcgt1:codProveId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_ed_i_suplier_code", "//*[contains(@id, 'pcgt1:codProveId::content')]");
        elements.put("suplier_hotel_exclusions_ed_lov_hotel_code", "//*[contains(@id, 'pcgt1:cId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_ed_i_hotel_code", "//*[contains(@id, 'pcgt1:cId::content')]");
        elements.put("suplier_hotel_exclusions_ed_lov_chain", "//*[contains(@id, 'pcgt1:codCadenaId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_ed_i_chain", "//*[contains(@id, 'pcgt1:codCadenaId::content')]");
        elements.put("suplier_hotel_exclusions_ed_lov_office", "//*[contains(@id, 'pcgt1:officeId::lovIconId')]");
        elements.put("suplier_hotel_exclusions_ed_i_office", "//*[contains(@id, 'pcgt1:officeId::content')]");
        elements.put("suplier_hotel_exclusions_ed_e_suplier_name", "//*[contains(@id, 'pcgt1:it3::content')]");
        elements.put("suplier_hotel_exclusions_ed_e_hotel_name", "//*[contains(@id, 'pcgt1:it2::content')]");
        elements.put("suplier_hotel_exclusions_ed_e_chain_name", "//*[contains(@id, 'pcgt1:it7::content')]");
        elements.put("suplier_hotel_exclusions_ed_e_description", "//*[contains(@id, 'pcgt1:it4::content')]");
        elements.put("suplier_hotel_exclusions_ed_suplier_short_name", "//*[contains(@id, 'pcgt1:it1::content')]");
        elements.put("suplier_hotel_exclusions_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("suplier_hotel_exclusions_ed_b_save", "//*[contains(@id, 'pcgt1:btn_commitExit')]");
        elements.put("suplier_hotel_exclusions_ed_b_save_b_ok", "//*[contains(@id, '0:d2::yes')]");
        elements.put("suplier_hotel_exclusions_ed_b_save_b_ok_sl_status", "//*[contains(@id, '0:soc3::content')]");
        elements.put("suplier_hotel_exclusions_ed_b_save_b_ok_b_status_ok", "//*[contains(@id, '1:r2:0:cb1')]");

        //OTHER ACTIONS
        elements.put("suplier_hotel_exclusions_b_actions", "//*[contains(@id, 'pdm12:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("suplier_hotel_exclusions_b_actions_b_data_history", "//*[contains(@id, 'pdm12:dc_cmi0')]/td[2]");
        elements.put("suplier_hotel_exclusions_b_actions_b_data_history_b_ok", "//*[contains(@id, 'pdm12:d22::ok')]");
        elements.put("suplier_hotel_exclusions_b_detach", "//*[contains(@id, 'pc1:_dchTbr')]/a");


        //DELETE

        elements.put("suplier_hotel_exclusions_b_delete", "//*[contains(@id, 'pcgt1:boton_remove')]");
        elements.put("suplier_hotel_exclusions_b_delete_ok", "//*[contains(@id, 'outputText4')]");
        elements.put("suplier_hotel_exclusions_e_records", "//*[contains(@id, 'pcgt1:cbt1')]");


    }
}

