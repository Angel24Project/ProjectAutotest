package screen.AT2BOOSA0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsolis on 18/11/2016.
 */
public class AT2BOOSA0001Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA0001Locators (String enviroment){
        setElements();
    }

    public Map<String, String> getElements (){
        return elements;
    }

    public void setElements (){

         //ADVANCED SEARCH

        elements.put("advanced_search_ch_client", "//*[contains(@id, 'gttoSeqTtooId::lovIconId')]");
        elements.put("advanced_search_lov_client", "//*[contains(@id, 'gttoSeqTtooId::dropdownPopup::popupsearch')]");
        elements.put("advanced_search_lov_client_i_client", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("advanced_search_i_client", "//*[contains(@id, 'gttoSeqTtooId::content')]");
        elements.put("advanced_search_lov_interface", "//*[contains(@id, 'bookingInterfaceId::lovIconId')]");
        elements.put("advanced_search_lov_interface_i_code", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("advanced_search_sl_crc", "//*[contains(@id, 'soc6::content')]");
        elements.put("advanced_search_i_client_reference", "//*[contains(@id, 'it12::content')]");
        elements.put("advanced_search_lov_group_ttoo", "//*[contains(@id, 'grupoTtooId::lovIconId')]");
        elements.put("advanced_search_lov_group_ttoo_i_name", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("advanced_search_i_group_ttoo", "//*[contains(@id, 'grupoTtooId::content')]");
        elements.put("advanced_search_lov_integration_name", "//*[contains(@id, 'agencyB2BId::lovIconId']");
        elements.put("advanced_search_lov_integration_name_i_name", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("advanced_search_i_integration_name", "//*[contains(@id, 'agencyB2BId::content')]");
        elements.put("advanced_search_lov_suplier_b2b", "//*[contains(@id, 'supplierB2BId::lovIconId')]");
        elements.put("advanced_search_lov_suplier_b2b_i_name", "//*[contains(@id, 'afrLovInternalQueryId:value10::content')]");
        elements.put("advanced_search_i_suplier_b2b", "//*[contains(@id, 'supplierB2BId::content')]");
        elements.put("advanced_search_i_suplier_booking_reference", "//*[contains(@id, 'it5::content')]");
        elements.put("advanced_search_i_temporart_booking_reference", "//*[contains(@id, 'it10::content')]");
        elements.put("advanced_search_multilov_market", "//*[contains(@id, 'msilov1:dc_ctb1::icon')]");
        elements.put("advanced_search_multilov_market_i_name", "//*[contains(@id, 'dc_q1:value10::content')]");
        elements.put("advanced_search_lov_destination", "//*[contains(@id, 'destinoId::lovIconId')]");
        elements.put("advanced_search_i_destination", "//*[contains(@id, 'destinoId::content')]");
        elements.put("advanced_search_lov_hotel_zone", "//*[contains(@id, 'hotelZoneId::lovIconId')]");
        elements.put("advanced_search_i_hotel_zone", "//*[contains(@id, 'hotelZoneId::content')]");
        elements.put("advanced_search_e_hotelzone", "//*[contains(@id, 'it3::content')]");
        elements.put("advanced_search_i_pax_name", "//*[contains(@id, 'it14::content')]");
        elements.put("advanced_search_i_pax_surname", "//*[contains(@id, 'it8::content')]");
        elements.put("advanced_search_sl_insurance", "//*[contains(@id, 'soc1::content')]");
        elements.put("advanced_search_sl_canceled", "//*[contains(@id, 'soc5::content')]");
        elements.put("advanced_search_sl_confirmed", "//*[contains(@id, 'soc7::content')]");
        elements.put("advanced_search_i_contract", "//*[contains(@id, 'it18::content')]");
        elements.put("advanced_search_lov_booking_type", "//*[contains(@id, 'bookingTypeId::lovIconId')]");
        elements.put("advanced_search_i_booking_type", "//*[contains(@id, 'bookingTypeId::content')]");
        elements.put("advanced_search_lov_department", "//*[contains(@id, 'departmentId::lovIconId')]");
        elements.put("advanced_search_i_department", "//*[contains(@id, 'departmentId::content']");
        elements.put("advanced_search_i_creation_user", "//*[contains(@id, 'it7::content')]");
        elements.put("advanced_search_i_ticked_num", "//*[contains(@id, 'it16::content')]");
        elements.put("advanced_search_lov_ivoiced_company", "//*[contains(@id, 'empFacturadoraId::lovIconId')]");
        elements.put("advanced_search_i_invoiced_company", "//*[contains(@id, 'empFacturadoraId::content')]");
        elements.put("advanced_search_sl_credit_type", "//*[contains(@id, 'soc4::content')]");
        elements.put("advanced_search_sl_invoiced", "//*[contains(@id, 'soc8::content')]");
        elements.put("advanced_search_i_vip", "//*[contains(@id, 'soc36::content')]");
        elements.put("advanced_search_ch_transfer", "//*[contains(@id, 'it17::content')]");
        elements.put("advanced_search_lov_from", "//*[contains(@id, 'transferFromId::lovIconId')]");
        elements.put("advanced_search_i_from", "//*[contains(@id, 'transferFromId::content')]");
        elements.put("advanced_search_lov_to", "//*[contains(@id, 'transferToId::lovIconId')]");
        elements.put("advanced_search_i_to", "//*[contains(@id, 'transferToId::content')]");
        elements.put("advanced_search_i_stay_date_from", "//*[contains(@id, 'id9::content')]");
        elements.put("advanced_search_i_stay_date_to", "//*[contains(@id, 'id10::content')]");
        elements.put("advanced_search_i_sending_date_from", "//*[contains(@id, 'id5::content')]");
        elements.put("advanced_search_i_sending_date_to", "//*[contains(@id, 'id7::content')]");
        elements.put("advanced_search_i_cancel_fee_from", "//*[contains(@id, 'id1::content')]");
        elements.put("advanced_search_i_cancel_fee_to", "//*[contains(@id, 'id8::content')]");
        elements.put("advanced_search_ch_extra", "//*[contains(@id, 'it9::content')]");
        elements.put("advanced_search_lov_extra", "//*[contains(@id, 'extraId::lovIconId')]");
        elements.put("advanced_search_i_extra", "//*[contains(@id, 'extraId::content')]");
        elements.put("advanced_search_ch_only_hotel", "//*[contains(@id, 'r2:1:it20::content')]");
        elements.put("advanced_search_ch_pay_associated", "//*[contains(@id, 'it11::content')]");
        elements.put("advanced_search_ch_other", "//*[contains(@id, 'it13::content')]");
        elements.put("advanced_search_sl_other", "//*[contains(@id, 'soc3::content')]");
        elements.put("advanced_search_b_reset", "//*[contains(@id, '1:cb4')]");
        elements.put("advanced_search_i_interface", "//*[contains(@id, 'bookingInterfaceId::content')]");


          // SEARCH
        elements.put("search_b_search", "//*[contains(@id, 'dyntdc:r1:1:cb3')]");
        elements.put("search_i_creation", "//*[contains(@id, 'r1:1:id4::content')]");
        elements.put("search_i_from", "//*[contains(@id, 'r1:1:id3::content')]");
        elements.put("search_i_to", "//*[contains(@id, 'r1:1:id6::content')]");
        elements.put("search_i_receptive", "//*[contains(@id, 'grecSeqRecId::content')]");
        elements.put("search_lov_receptive", "//*[contains(@id, 'grecSeqRecId::lovIconId')]");

        elements.put("search_i_interface", "//*[contains(@id, 'bookingInterfaceId::content')]");
        elements.put("search_lov_interface", "//*[contains(@id, 'bookingInterfaceId::lovIconId')]");
        elements.put("search_i_interface_code", "//*[contains(@id, '_afrLovInternalQueryId:value00::content')]");
        elements.put("search_i_hotel", "//*[contains(@id, 'nomCortoNomHotId::content')]");
        elements.put("search_i_cancellation_date", "//*[contains(@id, 'id2::content')]");


        // ADVANCED SEARCH
        elements.put("search_b_advanced_search", " //*[contains(@id, 'dyntdc:r1:1:cb2')]");
        elements.put("advanced_search_b_show", "//*[contains(@id, 'pb3::_afrDscl')]");
        elements.put("advanced_search_sel_cancelled", "//*[contains(@id, 'soc5::content')]");
        elements.put("keys_advances_search", "//*[contains(@id, 'pb2')]/div");
        elements.put("search_b_advanced_search_2", " //*[contains(@id, 'dyntdc:r2:1:cb2')]");

        //SIMPLE SEARACH
        elements.put("query_lov_receptive", "//*[contains(@id, '1:grecSeqRecId::lovIconId')]");
        elements.put("query_lov_i_receptive", "//*[contains(@id, 'afrLovInternalQueryId:value00::content')]");
        elements.put("query_simple_i_receptive", "//*[contains(@id, '1:grecSeqRecId::content')]");
        elements.put("query_simple_i_creation_date", "//*[contains(@id, '1:id4::content')]");
        elements.put("query_b_search", "//*[contains(@id, '1:cb3')]");
        elements.put("query_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("query_e_result_real", "pc1:t1::db')]");
        elements.put("query_b_reset", "1:cb4')]");


        // QUERY
        elements.put("query_b_qbe", "//*[contains(@id, 'pc1:_qbeTbr')]/a");

        elements.put("query_i_receptive", "//*[contains(@id, 'pc1_afr_t1_afr_c17::content')]");
        elements.put("query_i_atlas_company", "//*[contains(@id, '_afr_t1_afr_c37::content')]");
        elements.put("query_i_atlas_office", "//*[contains(@id, '_afr_t1_afr_c16::content')]");
        elements.put("query_i_booking_reference", "//*[contains(@id, '_afr_t1_afr_c30::content')]");
        elements.put("query_i_creation_date", "//*[contains(@id, 'pc1:t1:id14::content')]");
        elements.put("query_i_client", "//*[contains(@id, '_afr_t1_afr_c43::content')]");
        elements.put("query_i_branch", "//*[contains(@id, '_afr_t1_afr_c23::content')]");
        elements.put("query_i_crc", "//*[contains(@id, '_afr_t1_afr_c31::content')]");
        elements.put("query_i_pax_name", "//*[contains(@id, '_afr_t1_afr_c36::content')]");
        elements.put("query_i_adults", "//*[contains(@id, '_afr_t1_afr_c48::content')]");
        elements.put("query_i_children", "//*[contains(@id, '_afr_t1_afr_c22::content')]");
        elements.put("query_i_babies", "//*[contains(@id, '_afr_t1_afr_c59::content')]");
        elements.put("query_i_hotel_code", "//*[contains(@id, '_afr_t1_afr_c46::content')]");
        elements.put("query_i_first_hotel", "//*[contains(@id, '_afr_t1_afr_c56::content')]");
        elements.put("query_i_arrival_booking", "//*[contains(@id, 'pc1:t1:id12::content')]");
        elements.put("query_i_departure_booking", "//*[contains(@id, 'pc1:t1:id19::content')]");
        elements.put("query_i_hotel_send", "//*[contains(@id, 'pc1:t1:id20::content')]");
        elements.put("query_id_booking", "//*[contains(@id, 'pc1_afr_t1_afr_c113::content')]");
        elements.put("query_i_client_reference", "//*[contains(@id, '_afr_t1_afr_c39::content')]");
        elements.put("query_i_interface", "//*[contains(@id, '_afr_t1_afr_c28::content')]");
        elements.put("query_i_booking_status", "//*[contains(@id, '_afr_t1_afr_c15::content')]");
        elements.put("query_i_description", "//*[contains(@id, '_afr_t1_afr_c4::content')]");
        elements.put("query_i_canrec_status", "//*[contains(@id, '_afr_t1_afr_c54::content')]");
        elements.put("query_i_canrec_description", "//*[contains(@id, '_afr_t1_afr_c29::content')]");
        elements.put("query_i_invoiced_company", "//*[contains(@id, '_afr_t1_afr_c18::content')]");
        elements.put("query_i_cost", "//*[contains(@id, '_afr_t1_afr_c38::content')]");
        elements.put("query_i_sale", "//*[contains(@id, '_afr_t1_afr_c10::content')]");
        elements.put("query_i_profit", "//*[contains(@id, '_afr_t1_afr_c11::content')]");
        elements.put("query_i_profitability", "//*[contains(@id, '_afr_t1_afr_c24::content')]");
        elements.put("query_i_currency", "//*[contains(@id, '_afr_t1_afr_c53::content')]");
        elements.put("query_i_bm", "//*[contains(@id, 'selectOneChoice12::content')]");
        elements.put("query_i_bco", "//*[contains(@id, 't1:soc29::content')]");
        elements.put("query_i_ticket_number", "//*[contains(@id, '_afr_t1_afr_c3::content')]");
        elements.put("query_i_room", "//*[contains(@id, '_afr_t1_afr_c1::content')]");
        elements.put("query_i_type_of_room", "//*[contains(@id, '_afr_t1_afr_c5::content')]");
        elements.put("query_i_cancellation_date", "//*[contains(@id, 'pc1:t1:id15::content')]");
        elements.put("query_i_cancellation_fee_date", "//*[contains(@id, 'pc1:t1:id13::content')]");
        elements.put("query_i_auto_cancellation_date_time", "//*[contains(@id, 'pc1:t1:id11::content')]");
        elements.put("query_i_client_code", "//*[contains(@id, '_afr_t1_afr_c44::content')]");
        elements.put("query_i_customer", "//*[contains(@id, '_afr_t1_afr_c7::content')]");
        elements.put("query_i_sap_client_code", "//*[contains(@id, '_afr_t1_afr_c8::content')]");
        elements.put("query_i_destination", "//*[contains(@id, '_afr_t1_afr_c58::content')]");
        elements.put("query_i_country_market", "//*[contains(@id, '_afr_t1_afr_c55::content')]");
        elements.put("query_i_paid", "//*[contains(@id, 't1:soc351::content')]");
        elements.put("query_i_invoiced", "//*[contains(@id, 't1:soc31::content')]");
        elements.put("query_i_multi_destination", "//*[contains(@id, 't1:soc32::content')]");
        elements.put("query_i_transfer", "//*[contains(@id, 't1:soc33::content')]");
        elements.put("query_i_retailer", "//*[contains(@id, 't1:soc34::content')]");
        elements.put("query_i_refundable", "//*[contains(@id, 't1:soc35::content')]");
        elements.put("query_i_excluded_cancellation_process", "//*[contains(@id, '_afr_t1_afr_c14::content')]");
        elements.put("query_i_error_message", "//*[contains(@id, '_afr_t1_afr_c50::content')]");
        elements.put("query_i_n_attempts", "//*[contains(@id, '_afr_t1_afr_c57::content')]");
        elements.put("query_i_cancellation_reason", "//*[contains(@id, 'pc1:t1:soc30::content')]");
        elements.put("query_i_booking_type", "//*[contains(@id, '_afr_t1_afr_c60::content')]");
        elements.put("query_i_contract_code", "//*[contains(@id, '_afr_t1_afr_c62::content')]");
        elements.put("query_i_contract_name", "//*[contains(@id, '_afr_t1_afr_c61::content')]");

        // TOOLBAR
        elements.put("tb_b_actions", "//*[contains(@id, 'pc1:pcgm2:dc_m1')]/div/table/tbody/tr/td[3]/div");
        elements.put("tb_b_audit", "//*[contains(@id, 'pc1:pcgm2:dc_cmi0')]/td[2]");
        elements.put("tb_b_audit_b_ok", "//*[contains(@id, 'pc1:pcgm2:d22::ok')]");
        elements.put("tb_b_detach", "//*[contains(@id, 'dyntdc:r1:1:pc1:_dchTbr')]");

        // RESULT
        elements.put("result_e_result", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("result_n_records", "//*[contains(@id, 'pc1:outputText2')]");
        elements.put("result_e_receptive", "//*[contains(@id, 'ot50::content')]");
        elements.put("result_e_id_booking", "//*[contains(@id, 'it28::content')]");
        elements.put("result_e_atlas_company", "//*[contains(@id, 'ot40::content')]");
        elements.put("result_e_atlas_office", "//*[contains(@id, 'ot36::content')]");
        elements.put("result_e_booking_reference", "//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[2]/div/table/tbody/tr/td[4]");
        elements.put("result_e_creation_date", "//*[contains(@id, 'ot16::content')]");
        elements.put("result_e_client", "//*[contains(@id, 'ot23::content')]");
        elements.put("result_e_branch", "//*[contains(@id, 'ot45::content')]");
        elements.put("result_e_crc", "//*[contains(@id, 'ot42::content')]");
        elements.put("result_e_pax_name", "//*[contains(@id, 'ot20::content')]");
        elements.put("result_e_adults", "//*[contains(@id, 'ot24::content')]");
        elements.put("result_e_children", "//*[contains(@id, 'ot63::content')]");
        elements.put("result_e_babies", "//*[contains(@id, 'ot49::content')]");
        elements.put("result_e_hotel_code", "//*[contains(@id, 'ot29::content')]");
        elements.put("result_e_first_hotel", "//*[contains(@id, 'ot19::content')]");
        elements.put("result_e_arrival_booking", "//*[contains(@id, 'ot21::content')]");
        elements.put("result_e_departure_booking", "//*[contains(@id, 'ot55::content')]");
        elements.put("result_e_hotel_send", "//*[contains(@id, 'ot7')]");
        elements.put("result_e_client_reference", "//*[contains(@id, 'ot47::content')]");
        elements.put("result_e_interface", "//*[contains(@id, 'ot1::content')]");
        elements.put("result_e_booking_status", "//*[contains(@id, 'ot48::content')]");
        elements.put("result_e_description", "//*[contains(@id, 'ot30::content')]");
        elements.put("result_e_canrec_status", "//*[contains(@id, 'ot53::content')]");
        elements.put("result_e_canrec_description", "//*[contains(@id, 'ot34::content')]");
        elements.put("result_e_invoiced_company", "//*[contains(@id, 'ot3::content')]");
        elements.put("result_e_cost", "//*[contains(@id, 'ot26::content')]");
        elements.put("result_e_sale", "//*[contains(@id, 'ot2::content')]");
        elements.put("result_e_profit", "//*[contains(@id, 'ot12::content')]");
        elements.put("result_e_profitability", "//*[contains(@id, 'ot46::content')]");
        elements.put("result_e_currency", "//*[contains(@id, 'ot38::content')]");
        elements.put("result_e_bm", "//*[contains(@id, 'sbc2::content')]/span/img");
        elements.put("result_e_bco", "//*[contains(@id, 'sbc3::content')]/span/img");
        elements.put("result_e_ticket_number", "//*[contains(@id, 'ot57::content')]");
        elements.put("result_e_room", "//*[contains(@id, 'ot4::content')]");
        elements.put("result_e_type_of_room", "//*[contains(@id, 'ot6::content')]");
        elements.put("result_e_cancellation_date", "//*[contains(@id, 'ot5::content')]");
        elements.put("result_e_cancellation_fee_date", "//*[contains(@id, 'ot61::content')]");
        elements.put("result_e_auto_cancellation_date_time", "//*[contains(@id, 'ot10')]");
        elements.put("result_e_client_code", "//*[contains(@id, 'ot33::content')]");
        elements.put("result_e_customer", "//*[contains(@id, 'ot28::content')]");
        elements.put("result_e_sap_client_code", "//*[contains(@id, 'ot9::content')]");
        elements.put("result_e_destination", "//*[contains(@id, 'ot8::content')]");
        elements.put("result_e_country_market", "//*[contains(@id, 'ot31::content')]");
        elements.put("result_e_paid", "//*[contains(@id, 'sbc4::content')]/span/img");
        elements.put("result_e_invoiced", "//*[contains(@id, 'sbc5::content')]/span/img");
        elements.put("result_e_multi_destination", "//*[contains(@id, 'sbc6::content')]/span/img");
        elements.put("result_e_transfer", "//*[contains(@id, 'sbc7::content')]/span/img");
        elements.put("result_e_retailer", "//*[contains(@id, 'sbc8::content')]/span/img");
        elements.put("result_e_refundable", "//*[contains(@id, 'sbc9::content')]/span/img");
        elements.put("result_e_excluded_cancellation_process", "//*[contains(@id, 'ot11')]");
        elements.put("result_e_error_message", "//*[contains(@id, 'ot35::content')]");
        elements.put("result_e_n_attempts", "//*[contains(@id, 'ot32::content')]");
        elements.put("result_e_cancellation_reason", "//*[contains(@id, 'soc9::content')]");
        elements.put("result_e_booking_type", "//*[contains(@id, 'ot39::content')]");
        elements.put("result_e_contract_code", "//*[contains(@id, 'ot37::content')]");
        elements.put("result_e_contract_name", "//*[contains(@id, 'ot41::content')]");



        //GO TO BOOOSA1004

        elements.put("go_to_actions_b_bloqued_bookings", "//*[contains(@id, 'pc1:pcgm2:dc_cmi9')]/td[2]");
        elements.put("go_to_bloqued_bookings_b_qbe", "//*[contains(@id, 'pc1:pcgm2:dc_cmi9')]/td[2]");
        elements.put("go_to_bloqued_bookings_qbe_i_booking_reference", "//*[contains(@id, 'pc1:t2:inputText2::content')]");
        elements.put("go_to_bloqued_bookings_e_result", "//*[contains(@id, 'pc1:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("go_to_bloqued_bookings_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("go_to_bloqued_bookings_e_record", "//*[contains(@id, 'pc1:ot4count')]");
        elements.put("go_to_bloqued_bookings_b_delete_b_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        elements.put("go_to_bloqued_bookings_ch_select_all_gods", "//*[contains(@id, 'pc1:sbc1::content')]");
        elements.put("go_to_search_booking", "//*[contains(@id, 'Pane:1:tabIndex::disclosureAnchor')]");


        //SEND BOOKING

        elements.put("actions_b_send_booking", "//*[contains(@id, 'pc1:pcgm2:dc_cmi1')]/td[2]");
        elements.put("actions_send_booking_sl_format", "//*[contains(@id, 'pb1::content')]//*[contains(@id, 'r2:0:soc1::content')]");
        elements.put("actions_send_booking_i_from", "//*[contains(@id, 'pb1::content')]//*[contains(@id, 'r2:0:it1::content')]");
        elements.put("actions_send_booking_i_destination", "//*[contains(@id, 'pb1::content')]//*[contains(@id, 'r2:0:it2::content')]");
        elements.put("actions_send_booking_b_send", "//*[contains(@id, 'pb1::content')]//*[contains(@id, 'r2:0:cb1')]");
        elements.put("actions_send_booking_b_cancel", "//*[contains(@id, 'pb1::content')]//*[contains(@id, 'r2:0:cb2')]");
        elements.put("actions_send_booking_key", "//*[contains(@id, 'pb1::content')]");

        //SERVICE DETAILS
        elements.put("actions_b_service_details", "//*[contains(@id, 'pc1:pcgm2:dc_cmi2')]/td[2]");
        elements.put("actions_service_details_e_receptive_office", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'r1:0:pc1:t1:0:ot5::content')]");
        elements.put("actions_service_details_e_cost", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1:0:ot6::content')]");
        elements.put("action_service_detailse_e_sale", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1:0:ot7::content')]");
        elements.put("actions_service_detailse_e_profit", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1:0:ot8::content')]");
        elements.put("actions_service_details_e_profitability", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1:0:ot9::content')]");
        elements.put("actions_service_details_b_qbe", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("actions_service_details_i_receptive_office", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("actions_service_details_i_cost", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1_afr_t1_afr_c6::content')]");
        elements.put("actions_service_details_i_sale", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1_afr_t1_afr_c7::content')]");
        elements.put("actions_service_details_i_profit", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1_afr_t1_afr_c8::content')]");
        elements.put("actions_service_details_i_profitability", "//*[contains(@id, 'd1::contentContainer')]//*[contains(@id, 'pc1_afr_t1_afr_c9::content')]");
        elements.put("actions_service_details_b_detach", "//*[contains(@id, 'r1:1:r1:0:pb1::content')]//*[contains(@id, 'pc1:_dchTbr')]/a");
        elements.put("actions_service_details_b_ok", "//*[contains(@id, 'd1::ok')]");
        elements.put("actions_service_details_e_result", "//*[contains(@id, 'r1:1:r1:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr[1]/td[1]");

        //PRINT VOUCHERS
        elements.put("actions_b_print_vouchers", "//*[contains(@id, 'pc1:pcgm2:dc_cmi3')]/td[2]");
        elements.put("actions_print_vouchers_sl_format", "//*[contains(@id, 'r1:1:r4:0:pfl1')]//*[contains(@id, 'soc2::content')]");
        elements.put("actions_print_vouchers_sl_lenguage", "//*[contains(@id, 'r1:1:r4:0:pfl1')]//*[contains(@id, 'soc1::content')]");
        elements.put("actions_print_vouchers_i_destination", "//*[contains(@id, 'r1:1:r4:0:pfl1')]//*[contains(@id, 'it2::content')]");
        elements.put("actions_print_vouchers_ch_print_paxs", "//*[contains(@id, 'r1:1:r4:0:pfl1')]//*[contains(@id, 'sbc1::content')]");
        elements.put("actions_print_vouchers_ch_unified_vounchers", "//*[contains(@id, 'r1:1:r4:0:pfl1')]//*[contains(@id, 'sbc2::content')]");
        elements.put("actions_print_vouchers_b_qbe", "//*[contains(@id, 'r4:0:pc1:_tbx')]//div[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("actions_print_vouchers_qbe_e_company", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1') and contains(@id, 'ot20::content')]");
        elements.put("actions_print_vouchers_qbe_e_office", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1') and contains(@id, 'ot21::content')]");
        elements.put("actions_print_vouchers_qbe_e_locata", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot4::content')]");
        elements.put("actions_print_vouchers_qbe_e_type_of_service", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot15::content')]");
        elements.put("actions_print_vouchers_qbe_e_ord", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot7::content')]");
        elements.put("actions_print_vouchers_qbe_e_bundle", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot8::content')]");
        elements.put("actions_print_vouchers_qbe_e_service", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot25::content')]");
        elements.put("actions_print_vouchers_qbe_e_ini_date", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot18::content')]");
        elements.put("actions_print_vouchers_qbe_e_end_date", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot19::content')]");
        elements.put("actions_print_vouchers_qbe_e_units", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot24::content')]");
        elements.put("actions_print_vouchers_qbe_e_ad", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot22::content')]");
        elements.put("actions_print_vouchers_qbe_e_ch", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot23::content')]");
        elements.put("actions_print_vouchers_qbe_e_description", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot14::content')]");
        elements.put("actions_print_vouchers_qbe_e_cancel", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot16::content')]");
        elements.put("actions_print_vouchers_qbe_e_update", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot17::content')]");
        elements.put("actions_print_vouchers_qbe_e_last_print", "//*[contains(@id, 'r4:0:pc1:t1::db')]//*[contains(@id, 'ot1::content')]");
        elements.put("actions_print_vouchers_b_detach", "//*[contains(@id, 'r4:0:pc1:_dchTbr')]/a");
        elements.put("actions_print_vouchers_e_result", "//*[contains(@id, 'r4:0:pc1:t1')]//*[contains(@id, 'pc1:t1::db')]/table/tbody/tr/td[1]");
        elements.put("actions_print_vouchers_e_scroll", "//*[contains(@id, 'r4:0:pc1:t1')]//*[contains(@id, 'pc1:t1::scroller')]");

        elements.put("actions_print_vouchers_i_company", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c19::content')]");
        elements.put("actions_print_vouchers_i_office", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c20::content')]");
        elements.put("actions_print_vouchers_i_locata", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c12::content')]");
        elements.put("actions_print_vouchers_i_type_of_service", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c14::content')]");
        elements.put("actions_print_vouchers_i_ord", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c6::content')]");
        elements.put("actions_print_vouchers_i_bundle", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c3::content')]");
        elements.put("actions_print_vouchers_i_service", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c24::content')]");
        elements.put("actions_print_vouchers_i_ini_date", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'id3::content')]");
        elements.put("actions_print_vouchers_i_end_date", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'inputDate2::content')]");
        elements.put("actions_print_vouchers_i_units", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c23::content')]");
        elements.put("actions_print_vouchers_i_ad", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c21::content')]");
        elements.put("actions_print_vouchers_i_ch", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c22::content')]");
        elements.put("actions_print_vouchers_i_description", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'c13::content')]");
        elements.put("actions_print_vouchers_i_cancel", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'id1::content')]");
        elements.put("actions_print_vouchers_i_update", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'inputDate1::content')]");
        elements.put("actions_print_vouchers_i_last_print", "//*[contains(@id, 'r4:0:pb2::content')]//*[contains(@id, 'inputDate3::content')]");

        elements.put("actions_print_vouchers_b_ok", "//*[contains(@id, 'r4:0:cb2')]");
        elements.put("key_options", "//*[contains(@id, 'r1:1:r4:0:pfl1')]");
        elements.put("key_buttons", "//*[contains(@id, 'r4:0:pc1:_tbr')]/div[1]");
        elements.put("key_table", "//*[contains(@id, 'r4:0:pc1:t1::db')]");
        elements.put("key_table2", "//*[contains(@id, 'r4:0:pc1:t1')]");
        elements.put("key_popup", "//*[contains(@id, 'r4:0:pb2::content')]");
        //BOOKING CONFIRMATION

        elements.put("actions_b_booking_confirmation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi4')]/td[2]");
        elements.put("actions_booking_confirmation_b_qbe", "//*[contains(@id, 'r3:0:pc1:_tbx')]//div[contains(@id, 'pc1:_qbeTbr')]");
        elements.put("actions_booking_confirmation_i_office", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c18::content')]");
        elements.put("actions_booking_confirmation_i_locator", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c7::content')]");
        elements.put("actions_booking_confirmation_i_hotel", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c13::content')]");
        elements.put("actions_booking_confirmation_i_ttoo", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c14::content')]");
        elements.put("actions_booking_confirmation_i_room", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c2::content')]");
        elements.put("actions_booking_confirmation_i_type_of_room", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c4::content')]");
        elements.put("actions_booking_confirmation_i_total_rooms", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c1::content')]");
        elements.put("actions_booking_confirmation_i_name", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c9::content')]");
        elements.put("actions_booking_confirmation_i_arrival_booking", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'id2::content')]");
        elements.put("actions_booking_confirmation_i_departure_booking", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'id4::content')]");
        elements.put("actions_booking_confirmation_i_submitted_date", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'id5::content')]");
        elements.put("actions_booking_confirmation_i_creation_date", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'id3::content')]");
        elements.put("actions_booking_confirmation_i_cancelation_date", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c19::content')]");
        elements.put("actions_booking_confirmation_i_suplier_ref", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c16::content')]");
        elements.put("actions_booking_confirmation_i_cancelation_reference", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c12::content')]");
        elements.put("actions_booking_confirmation_i_refuse_comments", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c8::content')]");
        elements.put("actions_booking_confirmation_i_creation_user", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c10::content')]");
        elements.put("actions_booking_confirmation_i_modify_user", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'c3::content')]");
        elements.put("actions_booking_confirmation_i_modify_date", "//*[contains(@id, 'r3:0:pc1:t1')]//*[contains(@id, 'id1::content')]");
        elements.put("actions_booking_confirmation_e_office", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'pc1:t1:0:ot2::content')]");
        elements.put("actions_booking_confirmation_e_locator", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot12::content')]");
        elements.put("actions_booking_confirmation_e_hotel", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot13::content')]");
        elements.put("actions_booking_confirmation_e_ttoo", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot9::content')]");
        elements.put("actions_booking_confirmation_e_room", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot5::content')]");
        elements.put("actions_booking_confirmation_e_type_of_room", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot3::content')]");
        elements.put("actions_booking_confirmation_e_total_rooms", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot6::content')]");
        elements.put("actions_booking_confirmation_e_name", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot15::content')]");
        elements.put("actions_booking_confirmation_e_arrival_booking", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot4::content')]");
        elements.put("actions_booking_confirmation_e_departure_booking", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot7::content')]");
        elements.put("actions_booking_confirmation_e_submitted_date", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot11::content')]");
        elements.put("actions_booking_confirmation_e_creation_date", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot8::content')]");
        elements.put("actions_booking_confirmation_e_cancelation_date", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot16::content')]");
        elements.put("actions_booking_confirmation_e_suplier_ref", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'it1::content')]");
        elements.put("actions_booking_confirmation_e_cancelation_reference", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'it2::content')]");
        elements.put("actions_booking_confirmation_e_refuse_comments", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'it3::content')]");
        elements.put("actions_booking_confirmation_e_creation_user", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot10::content')]");
        elements.put("actions_booking_confirmation_e_modify_user", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot14::content')]");
        elements.put("actions_booking_confirmation_e_modify_date", "//*[contains(@id, 'r3:0:pc1:t1::db')]//*[contains(@id, 'ot1::content')]");
        elements.put("actions_booking_confirmation_b_ok", "//*[contains(@id, 'dialog2::_fcc')]//*[contains(@id, 'dialog2::ok')]");
        elements.put("actions_booking_confirmation_e_scroller", "//*[contains(@id, 'pc1:t1::scroller')]");
        elements.put("actions_booking_confirmation_e_key", "//*[contains(@id, 'r3:0:pc1:t1::db')]");
        elements.put("actions_booking_confirmation_e_key_table", "//*[contains(@id, '3:0:pc1:t1')]");
        elements.put("actions_booking_confirmation_e_key_buttons", "//*[contains(@id, 'r3:0:pc1:_tbx')]");

        //BOOKING CANCELATION
        elements.put("actions_b_booking_cancelation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi7')]/td[2]");
        elements.put("actions_b_booking_cancelation_key", "//*[contains(@id, 'pc2:_tbx')]");
        elements.put("actions_booking_cancelation_b_edit", "//*[contains(@id, 'pc2:_tbx')]//*[contains(@id, 'pc2:pcgt1:boton_edit')]");
        elements.put("actions_b_booking_cancelation_sl_action", "//*[contains(@id, 'pc2:pcgt1:soc112::content')]");
        elements.put("actions_b_booking_cancelation_b_save", "//*[contains(@id, 'pc2:pcgt1:btn_commitExit')]");
        elements.put("actions_b_booking_cancelation_e_result", "//*[contains(@id, 'pc2:table5::db')]/table/tbody/tr/td[1]");
        elements.put("actions_b_booking_cancelation_b_ok", "//*[contains(@id, 'cb17')]");
        elements.put("actions_b_booking_cancelation_b_close", "//*[contains(@id, 'cb16')]");
        elements.put("actions_b_booking_cancelation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi7')]/td[2]");
        elements.put("actions_b_booking_cancelation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi7')]/td[2]");
        elements.put("actions_b_booking_cancelation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi7')]/td[2]");
        elements.put("actions_b_booking_cancelation", "//*[contains(@id, 'pc1:pcgm2:dc_cmi7')]/td[2]");

        //IMPORT BOOKING DATA
        elements.put("actions_b_import_booking_data", "//*[contains(@id, 'pc1:pcgm2:dc_cmi8')]/td[2]");
        elements.put("actions_b_import_booking_data_b_update_file", "//*[contains(@id, 'if1::content')]");
        elements.put("actions_b_import_booking_data_b_import", "//*[contains(@id, 'cb15')]");

        //EXCLUDE FOR THE CANCELATION PROCES
        elements.put("actions_b_exclude_for_the_cancelation_proces", "//*[contains(@id, 'pc1:pcgm2:dc_cmi5')]/td[2]");
        elements.put("actions_b_exclude_for_the_cancelation_proces_b_cancel", "//*[contains(@id, 'msgDlg::cancel')]");
        //INCLUDE FOR THE CANCELATION PROCES
        elements.put("actions_b_include_for_the_cancelation_proces", "//*[contains(@id, 'pc1:pcgm2:dc_cmi6')]/td[2]");
        elements.put("actions_b_include_for_the_cancelation_proces_b_cancel", "//*[contains(@id, 'msgDlg::cancel')]");
        //PRINT PROFORMA
        elements.put("actions_b_print_proforma", "//*[contains(@id, 'pc1:pcgm2:dc_cmi10')]/td[2]");
        elements.put("actions_b_print_proforma_b_qbe", "//*[contains(@id, 'pc6:_tbr')]/div[1] //*[contains(@id, 'qbeTbr')]/a");
        elements.put("actions_b_print_proforma_e_ttoo", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'ot54'))]");
        elements.put("actions_b_print_proforma_e_fax", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'it66')]");
        elements.put("actions_b_print_proforma_e_mail", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'ot56')]");
        elements.put("actions_b_print_proforma_e_lenguage", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'soc212::content')]");
        elements.put("actions_b_print_proforma_e_view", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'sbc17::content')]");
        elements.put("actions_b_print_proforma_i_ttoo", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'c156::content')]");
        elements.put("actions_b_print_proforma_i_fax", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'c157::content')]");
        elements.put("actions_b_print_proforma_i_mail", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'c160::content')]");
        elements.put("actions_b_print_proforma_i_lenguage", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'c162::content')]");
        elements.put("actions_b_print_proforma_i_view", "//*[contains(@id, 'pc6:t15')] //*[contains(@id, 'c163::content')]");
        elements.put("actions_b_print_proforma_b_ok", "//*[contains(@id, 'd23::_fcc')] //*[contains(@id, 'cb10')]");

    }

    }

