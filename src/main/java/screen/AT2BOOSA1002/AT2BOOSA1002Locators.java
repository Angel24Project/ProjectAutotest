package screen.AT2BOOSA1002;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acarrillo on 18/05/2016.
 */
@SuppressWarnings("UnusedParameters")
public class AT2BOOSA1002Locators {
    Map<String, String> elements = new HashMap<>();

    public AT2BOOSA1002Locators(String enviroment) {
        setElements();
    }

    public Map<String, String> getElements() {
        return elements;
    }

    public void setElements() {
        //Header
        elements.put("header_add", "//*[contains(@id, 'pcgt1:boton_add')]");
        elements.put("header_add_i_interface", "//*[contains(@id, 'fintCodInterfaceId::content')]");
        elements.put("header_add_lov_interface", "//*[contains(@id, 'fintCodInterfaceId::lovIconId')]");
        elements.put("header_add_lov_i_interface", "//*[contains(@id, 'fintCodInterfaceId::_afrLovInternalQueryId:value00::content')]");
        elements.put("header_add_i_to", "//*[contains(@id, 'nomTtooId::content')]");
        elements.put("header_add_lov_to", "//*[contains(@id, 'nomTtooId::lovIconId')]");
        elements.put("header_add_lov_i_to", "//*[contains(@id, 'nomTtooId::_afrLovInternalQueryId:value00::content')]");
        elements.put("header_add_i_branch", "//*[contains(@id, 'gsucCodSucId::content')]");
        elements.put("header_add_lov_branch", "//*[contains(@id, 'gsucCodSucId::lovIconId')]");
        elements.put("header_add_i_user", "//*[contains(@id, 'nomAgenteId::content')]");
        elements.put("header_add_lov_user", "//*[contains(@id, 'ilov1::lovIconId')]");
        elements.put("header_add_i_booking_type", "//*[contains(@id, 'rtreCodTipoRes::content')]");
        elements.put("header_add_lov_booking_type", "//*[contains(@id, 'rtreCodTipoRes::lovIconId')]");
        elements.put("header_add_lov_booking_type_i_desc", "//*[contains(@id, 'r2:0:rtreCodTipoRes::_afrLovInternalQueryId:value10::content')]");
        elements.put("header_add_i_ag_ref", "//*[contains(@id, 'it23::content')]");
        elements.put("header_add_i_despt", "//*[contains(@id, 'soc11::content')]");
        elements.put("header_add_i_adults", "//*[contains(@id, 'it19::content')]");
        elements.put("header_add_i_child", "//*[contains(@id, 'it20::content')]");
        elements.put("header_add_i_baby", "//*[contains(@id, 'it21::content')]");
        elements.put("header_add_i_pax_mane", "//*[contains(@id, 'it22::content')]");
        elements.put("header_add_i_transfers_valuation", "//*[contains(@id, 'soc3::content')]");
        elements.put("header_add_b_save", "//*[contains(@id, 'pcgt1:boton_commit')]");

        elements.put("header_edit_booking_tab", "//*[contains(@id, ':2:tabIndex::disclosureAnchor')]");

        //search
        elements.put("search_b_icon", "//*[contains(@id, 'cb2::icon')]");
        elements.put("search_i_booking", "//*[contains(@id, 'it55::content')]");
        elements.put("search_b_search", "//*[contains(@id, '0:cb1header')]");
        elements.put("search_b_cancel_booking", "//*[contains(@id, 'r2:1:r2:0:ctb3::icon')]");

        elements.put("search_e_result", "//*[contains(@id, 'pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("search_result_b_actions", "//*[contains(@id, 'pc1:pdm12:dc_m1')]");
        elements.put("search_result_actions_b_graphic", "//*[contains(@id, 'pc1:pdm12:dc_cmi9')]/td[2]");

        //Remarks\\
        elements.put("remmarks_tab_booking", "//*[contains(@id, '0:sdi1::disAcr')]");
        //Booking observations
        elements.put("remmarks_booking_i_bookingadd", "//*[contains(@id, '1:r2:0:r2:0:inputText1::content')]");
        elements.put("remmarks_booking_b_bookingadd", "//*[contains(@id, '1:r2:0:r2:0:ctb1::icon')]");
        elements.put("remmarks_booking_i_adminadd", "//*[contains(@id, '1:r2:0:r2:0:inputText2::content')]");
        elements.put("remmarks_booking_b_adminadd", "//*[contains(@id, '1:r2:0:r2:0:ctb2::icon')]");
        //TO tab
        elements.put("remmarks_to_tab", "//*[contains(@id, '0:sdi3::disAcr')]");
        elements.put("remmarks_to_i_commentsadd", "//*[contains(@id, '1:r2:0:r2:0:inputText3::content')]");
        elements.put("remmarks_to_b_commentsadd", "//*[contains(@id, '1:r2:0:r2:0:ctb3::icon')]");

        //ACTIONS\\
        elements.put("header_b_actions", "//*[contains(@id, '0:pcgm1:dc_m1')]/div/table/tbody/tr/td[3]/div");
        //TO_BOOKING
        elements.put("header_b_actions_b_tobooking", "//*[contains(@id, '0:pcgm1:dc_cmi2')]/td[2]");
        elements.put("header_b_actions_b_tobooking_b_accept", "//*[contains(@id, '0:cb10')]");
        //PAXES
        elements.put("header_b_actions_b_paxes", "//*[contains(@id, 'r2:1:r2:0:pcgm1:dc_cmi3')]/td[2]");

        elements.put("header_b_actions_b_paxes_e_record", "//*[contains(@id, 'pc1:tPaxes::db')]/table/tbody/tr[1]/td[1]");

        elements.put("header_b_actions_b_paxes_b_add", "//*[contains(@id, 'pc1:pcgt1:boton_add')]");
        elements.put("header_b_actions_b_paxes_b_add_i_name", "//*[contains(@id, 'pc1:pcgt1:it1::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_type", "//*[contains(@id, 'pc1:pcgt1:descIndTipoPasId::content')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_type", "//*[contains(@id, 'pc1:pcgt1:descIndTipoPasId::lovIconId')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_type_i", "//*[contains(@id, 'pc1:pcgt1:descIndTipoPasId::_afrLovInternalQueryId:value00::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_type2", "//*[contains(@id, 'pc1:pcgt1:descTipoPaxId::content')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_type2", "//*[contains(@id, 'pc1:pcgt1:descTipoPaxId::lovIconId')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_type2_i", "//*[contains(@id, 'pc1:pcgt1:descTipoPaxId::_afrLovInternalQueryId:value00::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_surnames", "//*[contains(@id, 'pc1:pcgt1:it2::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_birth_date", "//*[contains(@id, 'pc1:pcgt1:id3::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_country", "//*[contains(@id, 'pc1:pcgt1:gpaiCodPais1Id::content')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_country", "//*[contains(@id, 'pc1:pcgt1:gpaiCodPais1Id::lovIconId')]");
        elements.put("header_b_actions_b_paxes_b_add_lov_country_i", "//*[contains(@id, 'pc1:pcgt1:gpaiCodPais1Id::_afrLovInternalQueryId:value00::content')]");
        elements.put("header_b_actions_b_paxes_b_add_e_country_desc", "//*[contains(@id, 'pc1:pcgt1:it12::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_age", "//*[contains(@id, 'pc1:pcgt1:it10::content')]");
        elements.put("header_b_actions_b_paxes_b_add_i_passport", "//*[contains(@id, 'pc1:pcgt1:it11::content')]");
        elements.put("header_b_actions_b_paxes_b_add_b_ok_alert", "//*[contains(@id, 'doc0::msgDlg::_hce')]/table/tbody/tr/td[3]/div");
        elements.put("header_b_actions_b_paxes_b_add_e_bar_alert", "//*[contains(@id, 'doc0::msgDlg::_ttxt')]");
        elements.put("header_b_actions_b_paxes_b_add_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

        elements.put("header_b_actions_b_paxes_b_delete", "//*[contains(@id, 'pc1:pcgt1:boton_remove')]");
        elements.put("header_b_actions_b_paxes_b_delete_b_ok", "//*[contains(@id, 'pc1:pcgt1:cbt1')]");
        elements.put("header_b_actions_b_paxes_b_edit", "//*[contains(@id, 'pc1:pcgt1:boton_edit')]");
        elements.put("header_b_actions_b_paxes_b_save", "//*[contains(@id, 'r2:0:r9:0:pc1:pcgt1:boton_commit')]");

        elements.put("header_b_actions_b_paxes_b_qbe", "//*[contains(@id, 'r2:0:r9:0:pc1:_tbr::oc')]//*[contains(@id, 'r2:0:r9:0:pc1:_qbeTbr')]/a");
        elements.put("header_b_actions_b_paxes_b_qbe_i_order", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c7::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_name", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c4::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_surnames", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c5::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_age", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c9::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_type", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c8::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_type2", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c11::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_birth_date", "//*[contains(@id, 'pc1:tPaxes:id5::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_passport", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c6::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_country", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c2::content')]");
        elements.put("header_b_actions_b_paxes_b_qbe_i_country_description", "//*[contains(@id, 'pc1_afr_tPaxes_afr_c3::content')]");

        elements.put("header_b_actions_b_paxes_b_detach", "//*[contains(@id, 'r2:1:r2:0:r9:0:pc1:_dchTbr')]/a");
        elements.put("header_b_actions_b_paxes_b_detach_b_close", "//*[contains(@id, 'r2:1:r2:0:r9:0:pc1::_afrDetachDialogId::close')]");

        elements.put("header_b_actions_b_paxes_b_close", "//*[contains(@id, 'r2:0:d20::_hce')]//*[contains(@id, 'r2:0:d20::close')]");
        //COLLECTIONDATA
        elements.put("header_b_actions_b_collectiondata", "//*[contains(@id, '0:pcgm1:dc_cmi5')]/td[2]");
        elements.put("header_b_actions_b_collectiondata_b_close", "//*[contains(@id, 'r2:0:d19::close')]");
        //HOTELOPIACLIENT
        elements.put("header_b_actions_b_hotelopiaclient", "//*[contains(@id, '0:pcgm1:dc_cmi7')]/td[2]");
        elements.put("header_b_actions_b_hotelopiaclient_b_chargecps", "//*[contains(@id, '0:cb4')]");
        elements.put("header_b_actions_b_hotelopiaclient_b_chargecps_b_close", "//*[contains(@id, 'd10::close')]");
        elements.put("header_b_actions_b_hotelopiaclient_b_close", "//*[contains(@id, 'd11::close')]");

        //Consults & History
        elements.put("header_b_consult", "//*[contains(@id, 'pcgm2:dc_m1')]/div/table/tbody/tr/td[3]/div");
        //CASES
        elements.put("header_b_consult_b_cases", "//*[contains(@id, '0:pcgm2:dc_cmi3')]/td[2]");
        elements.put("header_b_consult_b_cases_b_close", "//*[contains(@id, ':0:d12::close')]");
        //CANCELLATION
        elements.put("header_b_consult_b_cancelation", "//*[contains(@id, '0:pcgm2:dc_cmi4')]/td[2]");
        elements.put("header_b_consult_b_cancelation_b_close", "//*[contains(@id, ':0:d29::close')]");
        //HEADER HISTORIC
        elements.put("header_b_consult_b_headerhistoric", "//*[contains(@id, '0:pcgm2:dc_cmi5')]/td[2]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab", "//*[contains(@id, 'sdi1::disAcr')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe", "//*[contains(@id, 'r2:0:r3:0:pc1:_qbeTbr')]/a");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_date", "//*[contains(@id, 'pc1:t1:id3::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_refTTOO", "//*[contains(@id, 'pc1_afr_t1_afr_c5::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOCompany", "//*[contains(@id, 'pc1_afr_t1_afr_c7::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TTOOName", "//*[contains(@id, 'pc1_afr_t1_afr_c12::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_TOdesc", "//*[contains(@id, 'pc1_afr_t1_afr_c4::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_branchoffice", "//*[contains(@id, 'pc1_afr_t1_afr_c6::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_description", "//*[contains(@id, 'pc1_afr_t1_afr_c11::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_main_passenger_name", "//*[contains(@id, 'pc1_afr_t1_afr_c10::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_adults", "//*[contains(@id, 'pc1_afr_t1_afr_c1::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_children", "//*[contains(@id, 'pc1_afr_t1_afr_c13::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_babies", "//*[contains(@id, 'pc1_afr_t1_afr_c14::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_credit_type", "//*[contains(@id, 'pc1_afr_t1_afr_c22::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_interface", "//*[contains(@id, 'pc1_afr_t1_afr_c8::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_company", "//*[contains(@id, 'pc1_afr_t1_afr_c9::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_user", "//*[contains(@id, 'pc1_afr_t1_afr_c2::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_agent", "//*[contains(@id, 'pc1_afr_t1_afr_c23::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_user", "//*[contains(@id, 'pc1:t1:it4::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_qbe_i_cancel_date", "//*[contains(@id, 'pc1:t1:id4::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_booking_tab_b_detach", "//*[contains(@id, 'r3:0:pc1:_dchTbr')]/a");

        elements.put("header_b_consult_b_headerhistoric_e_supp_tab", "//*[contains(@id, 'sdi2::disAcr')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_action", "//*[contains(@id, 'pc2:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_action_b_query_sendings", "//*[contains(@id, 'pc2:pcgm1:dc_cmi1')]/td[2]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_detach", "//*[contains(@id, 'r2:0:r3:0:pc2:_dchTbr')]/a");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe", "//*[contains(@id, 'r2:0:r3:0:pc2:_qbeTbr')]/a");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_code", "//*[contains(@id, 'pc2_afr_t2_afr_c17::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_supplier", "//*[contains(@id, 'pc2_afr_t2_afr_c18::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_hotel", "//*[contains(@id, 'pc2_afr_t2_afr_c19::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_date", "//*[contains(@id, 'pc2:t2:id1::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_sending_type", "//*[contains(@id, 'pc2_afr_t2_afr_c16::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_status", "//*[contains(@id, 'pc2_afr_t2_afr_c15::content')]");
        elements.put("header_b_consult_b_headerhistoric_e_supp_tab_b_qbe_i_address", "//*[contains(@id, 'pc2_afr_t2_afr_c26::content')]");

        elements.put("header_b_consult_b_headerhistoric_b_close", "//*[contains(@id, ':0:d4::close')]");
        //HEADER OPERATION HISTORIC
        elements.put("header_b_consult_b_headeroperationhistoric", "//*[contains(@id, '0:pcgm2:dc_cmi6')]/td[2]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_detach", "//*[contains(@id, r2:0:r4:0:pc1:_dchTbr')]/a");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe", "//*[contains(@id, 'r2:0:r4:0:pc1:_qbeTbr')]/a");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_ord", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c4::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_op", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c8::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_app", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c1::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_server", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c9::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_credential", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c3::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_user_atlas", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c6::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_user_web", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c10::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_id_web", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c7::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_ip", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c5::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_i_domain", "//*[contains(@id, 'r4_afr_0_afr_pc1_afr_t2_afr_c2::content')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_ord", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it47')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_op", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it3')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_app", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it4')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_server", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it5')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_credential", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it7')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_user_atlas", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it6')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_user_web", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it8')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_id_web", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it10')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_ip", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it9')]");
        elements.put("header_b_consult_b_headeroperationhistoric_b_qbe_e_domain", "//*[contains(@id, 'r2:0:r4:0:pc1:t2:0:it11')]");
        elements.put("header_b_consult_b_headeroperationhistoric_e_result", "//*[contains(@id, 'r2:0:r4:0:pc1:t2::db')]/table/tbody/tr/td[1]");

        elements.put("header_b_consult_b_headeroperationhistoric_b_close", "//*[contains(@id, '0:d15::close')]");
        //GENERAL HISTORIC
        elements.put("header_b_consult_b_generalhistoric", "//*[contains(@id, '0:pcgm2:dc_cmi7')]/td[2]");
        elements.put("header_b_consult_b_generalhistoric_b_close", "//*[contains(@id, '0:d17::close')]");
        //GENERAL REMMARKS
        elements.put("header_b_consult_b_generalremarks", "//*[contains(@id, '0:pcgm2:dc_cmi8')]/td[2]");
        elements.put("header_b_consult_b_generalremarks_b_close", "//*[contains(@id, '0:d16::close')]");
        //AUDIT DATA
        elements.put("header_b_consult_b_audit", "//*[contains(@id, '0:pcgm2:dc_cmi9')]/td[2]");
        elements.put("header_b_consult_b_audit_b_close", "//*[contains(@id, '0:d13::close')]");
        //CANCO
        elements.put("header_b_consult_b_canco", "//*[contains(@id, 'r2:1:r2:0:pcgm2:dc_cmi10']/td[2]')]");
        elements.put("header_b_consult_b_canco_b_exit", "//*[contains(@id, 'r2:1:r2:0:d23::close')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe", "//*[contains(@id, 'r2:0:r10:0:pc1:_qbeTbr')]/a");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_tip", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c5::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_ord", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c8::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_service", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c3::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_canco_cost", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c10::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_canco_sale", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c9::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_canco_cpa", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c5::content7')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_taxC_vta", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c4::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_taxC_margin", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c13::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_ch_cost", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c2::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_ch_sale", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c6::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_ch_cpa", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c11::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_taxB_vta", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c12::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_qbe_i_taxB_margin", "//*[contains(@id, 'afr_r10_afr_0_afr_pc1_afr_t2_afr_c1::content')]");
        elements.put("header_b_consult_b_canco_t_currency_b_detach", "//*[contains(@id, 'r2:0:r10:0:pc1:_dchTbr')]/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe", "//*[contains(@id, 'r2:0:r10:0:pc2:_qbeTbr']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_from", "//*[contains(@id, 'r2:0:r10:0:pc2:t6:id1::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_to", "//*[contains(@id, 'r2:0:r10:0:pc2:t6:id2::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_description", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c19::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_total_cost", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c25::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_currency", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c22::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_trp", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c14::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_rv", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c2::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_qbe_i_mod", "//*[contains(@id, 'afr_r10_afr_0_afr_pc2_afr_t6_afr_c1::content']/a");
        elements.put("header_b_consult_b_canco_t_endowments_b_detach", "//*[contains(@id, 'r2:0:r10:0:pc2:_dchTbr']/a");
        //HOTEL TAB
        elements.put("hotel_tab", "//*[contains(@id, 'r2:1:i1::icon')]");
        elements.put("hotel_b_save", "//*[contains(@id, '1:r1:0:r2:0:pc1:pcgt12:boton_commit')]");
        elements.put("hotel_b_save_b_book", "//*[contains(@id, 'r2:0:cb22')]/a");
        elements.put("hotel_b_save_b_book_i_autor", "//*[contains(@id, 'r2:0:msgObsFromBook::content')]");
        elements.put("hotel_b_save_b_book_b_ok", "//*[contains(@id, 'r2:0:p7::content')]//*[contains(@id, 'r2:0:cb6')]");
        elements.put("hotel_b_save_b_save", "//*[contains(@id, 'r2:0:dialogRequestDistribucion::contentContainer')]//*[contains(@id, 'pc1:pcgt12:boton_commit')]");
        elements.put("hotel_b_save_b_actions", "//*[contains(@id, 'r2:0:pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[2]/a");
        elements.put("hotel_b_save_b_actions_auto", "//*[contains(@id, 'r2:0:pc1:pcgm1:dc_cmi1')]/td[2]");
        elements.put("hotel_b_add", "//*[contains(@id, '1:r1:0:r2:0:pc1:pcgt12:boton_add')]");
        elements.put("hotel_b_remove", "//*[contains(@id, '1:r1:0:r2:0:pc1:pcgt12:boton_remove')]");
        elements.put("hotel_b_edit", "//*[contains(@id, '1:r1:0:r2:0:pc1:pcgt12:boton_edit')]");
        elements.put("hotel_e_result", "//*[contains(@id, 'r1:0:r2:0:pc1:tSales::db')]/table/tbody/tr/td[1]");
        elements.put("hotel_e_result_i_startdate", "//*[contains(@id, 'pc1:tSales:1:idFecDes::content')]");
        elements.put("hotel_e_result_i_night", "//*[contains(@id, 'pc1:tSales:1:itNights::content')]");
        elements.put("hotel_e_result_i_enddate", "//*[contains(@id, 'pc1:tSales:1:idFecHas::content')]");
        elements.put("hotel_e_result_i_hotel", "//*[contains(@id, 'pc1:tSales:1:transNomHotelId::content')]");
        elements.put("hotel_e_result_lov_hotel", "//*[contains(@id, 'pc1:tSales:1:transNomHotelId::lovIconId')]");
        elements.put("hotel_e_result_i_contract", "//*[contains(@id, 'pc1:tSales:1:nomContrato::content')]");
        elements.put("hotel_e_result_b_contract", "//*[contains(@id, 'r2:0:pc1:tSales:1:cb11')]");
        elements.put("hotel_e_result_b_contract_i_room", "//*[contains(@id, 'r2:0:r3:0:roomId::content')]");
        elements.put("hotel_e_result_b_contract_lov_room", "//*[contains(@id, 'r2:0:r3:0:roomId::lovIconId')]");
        elements.put("hotel_e_result_b_contract_i_characteristics", "//*[contains(@id, 'r2:0:r3:0:characteristicsId::content')]");
        elements.put("hotel_e_result_b_contract_lov_characteristics", "//*[contains(@id, 'r2:0:r3:0:characteristicsId::lovIconId')]");
        elements.put("hotel_e_result_b_contract_e_result", "//*[contains(@id, 'r1:0:r2:0:r3:0:pc1:t2::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hotel_e_result_b_contract_e_result_e_hotel", "//*[contains(@id, 'pc1:t2::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[2]/span");
        elements.put("hotel_e_result_b_contract_b_book", "//*[contains(@id, 'r1:0:r2:0:r3:0:pfl5')]//*[contains(@id, 'r1:0:r2:0:r3:0:cb1')]");
        elements.put("hotel_e_result_b_contract_b_book_e_regim", "//*[contains(@id, 'r3:0:t1::db')]/table/tbody/tr[1]/td[1]");
        elements.put("hotel_e_result_b_contract_b_book_b_ok", "//*[contains(@id, 'r2:0:r3:0:d2::_fcc')]//*[contains(@id, 'r2:0:r3:0:cb3')]");
        elements.put("hotel_e_result_b_contract_b_exit", "//*[contains(@id, 'r1:0:r2:0:r3:0:pfl5')]//*[contains(@id, 'r1:0:r2:0:r3:0:cb2')]");
        elements.put("hotel_e_result_i_uni", "//*[contains(@id, 'pc1:tSales:1:nroHabit::content')]");
        elements.put("hotel_e_result_b_uni", "//*[contains(@id, 'pc1:tSales:1:cb8')]");
        elements.put("hotel_e_result_i_room", "//*[contains(@id, 'pc1:tSales:1:transRoomId')]//*[contains(@id, 'pc1:tSales:1:transRoomId::content')]");
        elements.put("hotel_e_result_lov_room", "//*[contains(@id, 'pc1:tSales:1:transRoomId')]//*[contains(@id, 'pc1:tSales:1:transRoomId::lovIconId')]");
        elements.put("hotel_e_result_lov_room_i_room_code", "//*[contains(@id, 'pc1:tSales:1:transRoomId::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_e_result_i_char", "//*[contains(@id, 'pc1:tSales:1:transCharacId::content')]");
        elements.put("hotel_e_result_lov_char", "//*[contains(@id, 'pc1:tSales:1:transCharacId::lovIconId')]");
        elements.put("hotel_e_result_lov_char_i_code", "//*[contains(@id, 'pc1:tSales:1:transCharacId::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_e_result_i_board", "//*[contains(@id, 'pc1:tSales:1:transBoardId')]//*[contains(@id, 'pc1:tSales:1:transBoardId::content')]");
        elements.put("hotel_e_result_lov_board", "//*[contains(@id, 'pc1:tSales:1:transBoardId')]//*[contains(@id, 'pc1:tSales:1:transBoardId::lovIconId')]");
        elements.put("hotel_e_result_lov_board_i_code", "//*[contains(@id, 'pc1:tSales:1:transBoardId::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_e_result_i_adults", "//*[contains(@id, 'pc1:tSales:1:nroAdults::content')]");
        elements.put("hotel_e_result_i_childs", "//*[contains(@id, 'pc1:tSales:1:nroNins::content')]");
        elements.put("hotel_e_result_i_infants", "//*[contains(@id, 'pc1:tSales:1:nroBebes::content')]");
        elements.put("hotel_e_result_ch_SI", "//*[contains(@id, 'pc1:tSales:1:incVenta::content')]");
        elements.put("hotel_e_result_ch_PU", "//*[contains(@id, 'pc1:tSales:1:incPurchase::content')]");
        elements.put("hotel_e_result_ch_Blo", "//*[contains(@id, 'pc1:tSales:1:indBloqueo::content')]");
        elements.put("hotel_e_result_ch_MC", "//*[contains(@id, pc1:tSales:1:indCompra::content')]");
        elements.put("hotel_e_result_sl_tranfers", "//*[contains(@id, 'pc1:tSales:1:indTrasl::content')]");
        elements.put("hotel_e_result_i_prod_ofi", "//*[contains(@id, 'pc1:tSales:1:codTipoProdOfi::content')]");
        elements.put("hotel_e_result_lov_prod_ofi", "//*[contains(@id, 'pc1:tSales:1:codTipoProdOfi::lovIconId')]");
        elements.put("hotel_e_result_lov_prod_ofi_i_code", "//*[contains(@id, 'pc1:tSales:1:codTipoProdOfi::_afrLovInternalQueryId:value00::content')]");
        elements.put("hotel_e_scroller", "//*[contains(@id, 'r1:0:r2:0:pc1:tSales::scroller')]");

        //Hotel query
        elements.put("hotel_b_query", "//*[contains(@id, '1:r1:0:r2:0:pc1:_qbeTbr')]");
        elements.put("hotel_b_query_i_startdate", "//*[contains(@id, 'pc1:tSales:id3::content')]");
        elements.put("hotel_b_query_i_night", "//*[contains(@id, 'pc1_afr_tSales_afr_c40::content')]");
        elements.put("hotel_b_query_i_enddate", "//*[contains(@id, 'pc1:tSales:id1::content')]");
        elements.put("hotel_b_query_i_hotel", "//*[contains(@id, 'pc1_afr_tSales_afr_c48::content')]");
        elements.put("hotel_b_query_i_contract", "//*[contains(@id, 'pc1_afr_tSales_afr_c3::content')]");
        elements.put("hotel_b_query_i_uni", "//*[contains(@id, 'pc1_afr_tSales_afr_c31::content')]");
        elements.put("hotel_b_query_i_room", "//*[contains(@id, 'pc1_afr_tSales_afr_c27::content')]");
        elements.put("hotel_b_query_i_char", "//*[contains(@id, 'pc1_afr_tSales_afr_c25::content')]");
        elements.put("hotel_b_query_i_rate", "//*[contains(@id, 'pc1_afr_tSales_afr_c10::content')]");
        elements.put("hotel_b_query_i_board", "//*[contains(@id, 'pc1_afr_tSales_afr_c5::content')]");
        elements.put("hotel_b_query_i_adult", "//*[contains(@id, 'pc1_afr_tSales_afr_c41::content')]");
        elements.put("hotel_b_query_i_child", "//*[contains(@id, 'pc1_afr_tSales_afr_c24::content')]");
        elements.put("hotel_b_query_i_infant", "//*[contains(@id, 'pc1_afr_tSales_afr_c22::content')]");
        elements.put("hotel_b_query_i_prod", "//*[contains(@id, 'pc1_afr_tSales_afr_c14::content')]");
        elements.put("hotel_b_query_i_prod_ofi", "//*[contains(@id, 'pc1_afr_tSales_afr_c19::content')]");

        //hotel actions
        elements.put("hotel_b_actions", "//*[contains(@id, '1:r1:0:r2:0:pc1:pdm12:dc_m1')]/div/table/tbody/tr/td[3]/div");
        elements.put("hotel_b_actions_b_audit", "//*[contains(@id, 'r1:0:r2:0:pc1:pdm12:dc_cmi1')]/td[2]");
        elements.put("hotel_b_actions_b_audit_b_ok", "//*[contains(@id, 'd13::ok')]");
        //hotel actions supplier info
        elements.put("hotel_b_actions_b_supplierinfo", "//*[contains(@id, 'r1:0:r2:0:pc1:pdm12:dc_cmi7')]/td[2]");

        elements.put("hotel_b_actions_b_supplierinfo_b_edit", "//*[contains(@id, 'r2:0:pc4:pcgt2:boton_edit')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_edit_i_supl_ref", "//*[contains(@id, 'r2:0:pc4:pcgt2:it19::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_edit_i_cancel_ref", "//*[contains(@id, 'r2:0:pc4:pcgt2:it21::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_edit_i_denied", "//*[contains(@id, 'r2:0:pc4:pcgt2:sbc21::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_edit_i_den_comments", "//*[contains(@id, 'r2:0:pc4:pcgt2:it22::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_edit_b_save", "//*[contains(@id, 'r2:0:pc4:pcgt2:btn_commitExit')]");

        elements.put("hotel_b_actions_b_supplierinfo_b_qbe", "//*[contains(@id, 'r1:0:r2:0:pc4:_qbeTbr')]/a");
        elements.put("hotel_b_actions_b_supplierinfo_b_detach", "//*[contains(@id, 'r1:0:r2:0:pc4:_dchTbr')]/a");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe", "//*[contains(@id, 'r1:0:r2:0:pc5:_qbeTbr')]/a");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_detach", "//*[contains(@id, 'r1:0:r2:0:pc5:_dchTbr')]/a");
        elements.put("hotel_b_actions_b_supplierinfo_e_result", "//*[contains(@id, 'r2:0:pc4:t8::db')]/table/tbody/tr/td[1]");
        elements.put("hotel_b_actions_b_supplierinfo_b_ok", "//*[contains(@id, '0:d9::close')]");
        // elements
        elements.put("hotel_b_actions_b_supplierinfo_i_hc", "//*[contains(@id, 'r2:0:pc4:t8:0:it24::content')]");//value
        elements.put("hotel_b_actions_b_supplierinfo_i_supl_ref", "//*[contains(@id, 'r2:0:pc4:t8:0:it32::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_i_cancel_ref", "//*[contains(@id, 'r2:0:pc4:t8:0:it30::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_ch_denied", "//*[contains(@id, 'r2:0:pc4:t8:0:sbc19::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_i_den_comments", "//*[contains(@id, 'r2:0:pc4:t8:0:it20::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_i_creation_user", "//*[contains(@id, 'r2:0:pc4:t8::db')]/table/tbody/tr/td[2]/div/table/tbody/tr/td[6]/input");//value
        elements.put("hotel_b_actions_b_supplierinfo_i_creation_date", "//*[contains(@id, 'r1:0:r2:0:pc4:t8:0:it50')]");//value
        elements.put("hotel_b_actions_b_supplierinfo_i_mod_user", "//*[contains(@id, 'r1:0:r2:0:pc4:t8:0:ot50')]");
        elements.put("hotel_b_actions_b_supplierinfo_i_mod_date", "//*[contains(@id, 'r1:0:r2:0:pc4:t8:0:ot63')]");
        //qbe inputs
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_hc", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c50::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_supl_ref", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c76::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_cancel_ref", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c45::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_sl_denied", "//*[contains(@id, 'r2:0:pc4:t8:soc14::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_den_comments", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c71::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_user", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c70::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_creation_date", "//*[contains(@id, 'r2:0:pc4:t8:id10::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_user", "//*[contains(@id, 'r2_afr_0_afr_pc4_afr_t8_afr_c65::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_b_qbe_i_mod_date", "//*[contains(@id, 'r2:0:pc4:t8:id2::content')]");
        // qbe history inputs
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_i_hist_ord", "//*[contains(@id, 'r2_afr_0_afr_pc5_afr_t11_afr_c84::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_i_supl_ref", "//*[contains(@id, 'r2_afr_0_afr_pc5_afr_t11_afr_c86::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_i_cancel_ref", "//*[contains(@id, 'r2_afr_0_afr_pc5_afr_t11_afr_c85::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_sl_denied", "//*[contains(@id, 'r2:0:pc5:t11:soc5::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_i_den_comments", "//*[contains(@id, 'r2_afr_0_afr_pc5_afr_t11_afr_c78::content')]");
        elements.put("hotel_b_actions_b_supplierinfo_history_b_qbe_i_mod_user", "//*[contains(@id, 'r2_afr_0_afr_pc5_afr_t11_afr_c81::content')]");
        //Arrow hiding more actions
        elements.put("hotel_b_arrow", "//*[contains@id, 'r1:0:r2:0:pc1:t2::eoi')]");
        //Hotel fixinfo
        elements.put("hotel_b_fixinfo", "//*[contains(@id, '1:r1:0:r2:0:pc1:ctb1::icon')]");
        elements.put("hotel_b_fixinfo_i_telephone", "//*[contains(@id, 'r1:0:r2:0:r1:0:it1::content')]");
        elements.put("hotel_b_fixinfo_i_email", "//*[contains(@id, 'r1:0:r2:0:r1:0:it2::content')]");
        elements.put("hotel_b_fixinfo_i_comments", "//*[contains(@id, 'r1:0:r2:0:r1:0:it3::content')]");
        elements.put("hotel_b_fixinfo_b_ok", "//*[contains(@id, '1:r1:0:r2:0:pc1:ctb1::icon')]");
        elements.put("hotel_b_fixinfo_b_send", "//*[contains(@id, 'r1:0:r2:0:r1:0:cb1sendmain')]");
        //Hotel Notifications
        elements.put("hotel_b_notification", "//*[contains(@id, '1:r2:1:pc1:ctb3::icon')]");
        elements.put("hotel_b_notification_b_close", "//*[contains(@id, 'r1:0:r2:0:d23::close')]");
        elements.put("hotel_b_notification_b_accept", "//*[contains(@id, 'r1:0:r2:0:cb10')]");
        elements.put("hotel_b_notification_b_qbe", "//*[contains(@id, 'r1:0:r2:0:pc3:_qbeTbr')]/a");
        elements.put("hotel_b_notification_b_detach", "//*[contains(@id, 'r1:0:r2:0:pc3:_dchTbr')]/a");
        elements.put("hotel_b_notification_b_qbe_i_hotel_name", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c61::content')]");
        elements.put("hotel_b_notification_b_qbe_i_supplier_name", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c56::content')]");
        elements.put("hotel_b_notification_b_qbe_i_fax", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c57::content')]");
        elements.put("hotel_b_notification_b_qbe_i_mail", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c60::content')]");
        elements.put("hotel_b_notification_b_qbe_i_language", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c62::content')]");
        elements.put("hotel_b_notification_b_qbe_i_view", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c63::content')]");
        elements.put("hotel_b_notification_b_qbe_i_update_date", "//*[contains(@id, 'r2_afr_0_afr_pc3_afr_t15_afr_c58::content')]");
        //TODO Encontrar una booking con un registro o averiguar ande coño se crean
        //TRANSFER TAB
        elements.put("transfer_tab_tab", "//*[contains(@id, 'pt1:dyntdc:r1:1:i2')]/a");
        //toolbar
        elements.put("transfer_b_save", "//*[contains(@id, '1:pc1:pcgt2:boton_commit')]");
        elements.put("transfer_b_add", "//*[contains(@id, '1:pc1:pcgt2:boton_add')]");
        elements.put("transfer_b_remove", "//*[contains(@id, '1:pc1:pcgt2:boton_remove')]");
        elements.put("transfer_b_edit", "//*[contains(@id, '1:pc1:pcgt2:boton_edit')]");
        elements.put("transfer_b_actions", "//*[contains(@id, '1:pc1:pcgm3:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("transfer_b_fixinfo", "//*[contains(@id, '1:pc1:ctb1::icon')]");
        elements.put("transfer_b_notification", "//*[contains(@id, '1:pc1:ctb3::icon')]");
        elements.put("transfer_b_query", "//*[contains(@id, '1:pc1:_qbeTbr')]");
        elements.put("transfer_error_b_ok", "//*[contains(@id, 'msgDlg::cancel')]");
        //result
        elements.put("transfer_e_result", "//*[contains(@id, '1:pc1:t1::db')]/table/tbody/tr/td[1]/span");
        elements.put("transfer_e_result_i_date", "//*[contains(@id, '1:pc1:t1:1:id1::content')]");
        elements.put("transfer_e_result_i_fromzone", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesZonOri::content')]");
        elements.put("transfer_e_result_lov_fromzone", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesZonOri::lovIconId')]");
        elements.put("transfer_e_result_lov_fromzone_i_code", "//*[contains(@id, 'pc1:t1:1:inputListOfValuesZonOri::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfer_e_result_i_fromhotel", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues9::content')]");
        elements.put("transfer_e_result_lov_fromhotel", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues9::lovIconId')]");
        elements.put("transfer_e_result_i_tozone", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesZonDes::content')]");
        elements.put("transfer_e_result_lov_tozone", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesZonDes::content')]");
        elements.put("transfer_e_result_lov_tozone_i_code", "//*[contains(@id, 'pc1:t1:1:inputListOfValuesZonDes::_afrLovInternalQueryId:value00::content')]");
        elements.put("transfer_e_result_i_tohotel", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues8::content')]");
        elements.put("transfer_e_result_lov_tohotel", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues8::lovIconId')]");
        elements.put("transfer_e_result_i_salecontract", "//*[contains(@id, '1:pc1:t1:1:transNomContrVtaId::content')]");
        elements.put("transfer_e_result_lov_salecontract", "//*[contains(@id, '1:pc1:t1:1:transNomContrVtaId::lovIconId')]");
        elements.put("transfer_e_result_i_purchasecontract", "//*[contains(@id, '1:pc1:t1:1:transNomContrComId::content')]");
        elements.put("transfer_e_result_lov_purchasecontract", "//*[contains(@id, '1:pc1:t1:1:transNomContrComId::lovIconId')]");
        elements.put("transfer_e_result_i_mastertype", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues7::content')]");
        elements.put("transfer_e_result_lov_mastertype", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues7::lovIconId')]");
        elements.put("transfer_e_result_i_vehicle", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesTipVeh::content')]");
        elements.put("transfer_e_result_lov_vehicle", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesTipVeh::lovIconId')]");
        elements.put("transfer_e_result_i_flight", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesNumVuelo::content')]");
        elements.put("transfer_e_result_lov_flight", "//*[contains(@id, '1:pc1:t1:1:inputListOfValuesNumVuelo::lovIconId')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight", "//*[contains(@id, '1481276943390')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_i_flight_name", "//*[contains(@id, 'r3:1:r15:0:it6::content')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_i_arrival", "//*[contains(@id, 'r3:1:r15:0:transAerOriId::content')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_lov_arrival", "//*[contains(@id, 'r3:1:r15:0:transAerOriId::lovIconId')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_lov_arrival_i_description", "//*[contains(@id, '3:1:r15:0:transAerOriId::_afrLovInternalQueryId:value10::content')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_lov_arrival_b_search", "//*[contains(@id, 'r3:1:r15:0:transAerOriId::_afrLovInternalQueryId::search')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_i_hour", "//*[contains(@id, 'r3:1:r15:0:it4::content')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_b_acept", "//*[contains(@id, 'msgDlg::cancel')]");
        elements.put("transfer_e_result_lov_flight_b_create_flight_e_result", "//*[contains(@id, 'r3:1:pc1:t1:1:inputListOfValuesNumVuelo_afrLovInternalTableId::db')]/table/tbody/tr[1]/td[1]");
        elements.put("transfer_e_result_lov_flight_b_search", "//*[contains(@id, 'pc1:t1:1:inputListOfValuesNumVuelo::_afrLovInternalQueryId::search')]");
        elements.put("transfer_e_result_lov_flight_b_ok", "//*[contains(@id, 'pc1:t1:1:inputListOfValuesNumVuelo::lovDialogId::ok')]");
        elements.put("transfer_e_result_i_flighthour", "//*[contains(@id, '1:pc1:t1:1:it20::content')]");
        elements.put("transfer_e_result_i_depart", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues5::content')]");
        elements.put("transfer_e_result_lov_depart", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues5::lovIconId')]");
        elements.put("transfer_e_result_i_arrival", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues6::content')]");
        elements.put("transfer_e_result_lov_arrival", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues6::lovIconId')]");
        elements.put("transfer_e_result_i_pickupdate", "//*[contains(@id, '1:pc1:t1:1:it4112::content')]");
        elements.put("transfer_e_result_i_pickuppoint", "//*[contains(@id, '1:pc1:t1:1:transPickUpNameId2::content')]");
        elements.put("transfer_e_result_lov_pickuppoint", "//*[contains(@id, '1:pc1:t1:1:transPickUpNameId2::content')]");
        elements.put("transfer_e_result_i_ticketn", "//*[contains(@id, '1:pc1:t1:1:it2::content')]");
        elements.put("transfer_e_result_lov_rep", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues12::content')]");
        elements.put("transfer_e_result_i_rep", "//*[contains(@id, '1:pc1:t1:1:inputListOfValues12::lovIconId')]");

        //Actions
        //TODO
        //FixInfo
        //TODO
        //Notifications
        //query
        elements.put("transfer_b_query_i_date", "//*[contains(@id, '1:pc1:t1:id23::content')]");
        elements.put("transfer_b_query_i_fromzone", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c59::content')]");
        elements.put("transfer_b_query_i_fromhotel", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c9::content')]");
        elements.put("transfer_b_query_i_tozone", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c4::content')]");
        elements.put("transfer_b_query_i_tohotel", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c12::content')]");
        elements.put("transfer_b_query_i_salecontract", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c3::content')]");
        elements.put("transfer_b_query_i_purchasecontract", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c15::content')]");
        elements.put("transfer_b_query_i_mastertype", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c612::content')]");
        elements.put("transfer_b_query_i_vehicle", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c6::content')]");
        elements.put("transfer_b_query_i_flight", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c7::content')]");
        elements.put("transfer_b_query_i_flighthour", "//*[contains(@id, ':1:pc1:t1:id24::content')]");
        elements.put("transfer_b_query_i_depart", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c20::content')]");
        elements.put("transfer_b_query_i_arrival", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_ct14::content')]");
        elements.put("transfer_b_query_i_pickupdate", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c512::content')]");
        elements.put("transfer_b_query_i_pickuppoint", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c1467::content')]");
        elements.put("transfer_b_query_i_tikcetn", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c17::content')]");
        elements.put("transfer_b_query_i_rep", "//*[contains(@id, '_afr_1_afr_pc1_afr_t1_afr_c18::content')]");


        //ACTIVITIES TAB

        elements.put("activities_tab_tab", "//*[contains(@id, 'pt1:dyntdc:r1:1:image1')]/a");
        //toolbar
        elements.put("activities_b_save", "//*[contains(@id, '1:pc1:pcgt1:boton_commit')]");
        elements.put("activities_b_add", "//*[contains(@id, '1:pc1:pcgt1:boton_add')]");
        elements.put("activities_b_remove", "//*[contains(@id, '1:pc1:pcgt1:boton_remove')]");
        elements.put("activities_b_edit", "//*[contains(@id, '1:pc1:pcgt1:boton_edit')]");
        elements.put("activities_b_actions", "//*[contains(@id, '1:pc1:pcgm12:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("activities_b_fixinfo", "//*[contains(@id, '1:pc1:ctb1::icon')]");
        elements.put("activities_b_notification", "//*[contains(@id, '1:pc1:ctb1::icon')]");
        elements.put("activities_b_query", "//*[contains(@id, '1:pc1:_qbeTbr')]");

        //ADD
        elements.put("activities_b_add_select_activity", "//*[contains(@id, 'pc1:pcgt1:soc4::content')]");
        elements.put("activities_b_add_b_save", "//*[contains(@id, 'pc1:pcgt1:soc4::content')]");

        //Creation
        elements.put("activities_b_add_select_i_activity2", "//*[contains(@id, 'pc1:pcgt1:soc4::content')]");
        elements.put("activities_b_add_select_i_startdate", "//*[contains(@id, '1:pc1:pcgt1:id38::content')]");
        elements.put("activities_b_add_select_i_enddate", "//*[contains(@id, 'pc1:pcgt1:id27::content')]");
        elements.put("activities_b_add_select_i_service", "//*[contains(@id, 'pc1:pcgt1:iLOV4::content')]");
        elements.put("activities_b_add_select_lov_service", "//*[contains(@id, 'pc1:pcgt1:iLOV4::lovIconId')]");
        elements.put("activities_b_add_select_i_modality", "//*[contains(@id, 'pc1:pcgt1:iLOV3::content')]");
        elements.put("activities_b_add_select_lov_modality", "//*[contains(@id, 'pc1:pcgt1:iLOV3::lovIconId')]");
        elements.put("activities_b_add_select_i_contract", "//*[contains(@id, 'pc1:pcgt1:iLOV10::content')]");
        elements.put("activities_b_add_select_lov_contract", "//*[contains(@id, 'pc1:pcgt1:iLOV10::lovIconId')]");
        elements.put("activities_b_add_select_i_supplier", "//*[contains(@id, 'pc1:pcgt1:iLOV14::content')]");
        elements.put("activities_b_add_select_lov_supplier", "//*[contains(@id, 'pc1:pcgt1:iLOV14::lovIconId')]");
        elements.put("activities_b_add_select_i_origin", "//*[contains(@id, 'pc1:pcgt1:iLOV12::content')]");
        elements.put("activities_b_add_select_lov_origin", "//*[contains(@id, 'pc1:pcgt1:iLOV12::lovIconId')]");
        elements.put("activities_b_add_select_i_destination", "//*[contains(@id, 'pc1:pcgt1:ilov1::content')]");
        elements.put("activities_b_add_select_lov_destination", "//*[contains(@id, 'pc1:pcgt1:ilov1::lovIconId')]");
        elements.put("activities_b_add_select_i_destination", "//*[contains(@id, 'pc1:pcgt1:iLOV1::content')]");
        elements.put("activities_b_add_select_lov_destination", "//*[contains(@id, 'pc1:pcgt1:iLOV1::lovIconId')]");
        elements.put("activities_b_add_select_i_adults", "//*[contains(@id, 'pc1:pcgt1:it72::content')]");
        elements.put("activities_b_add_select_i_children", "//*[contains(@id, 'pc1:pcgt1:it113::content')]");
        elements.put("activities_b_add_select_b_save", "//*[contains(@id, 'pc1:pcgt1:btn_commitExit')]");

        //query
        elements.put("activities_b_query_i_service", "//*[contains(@id, '1_afr_pc1_afr_tAct1_afr_c10::content')]");
        elements.put("activities_b_query_i_startdate", "//*[contains(@id, 'pc1:tAct1:id23::content')]");
        elements.put("activities_b_query_i_enddate", "//*[contains(@id, 'pc1:tAct1:id2::content')]");
        elements.put("activities_b_query_i_service", "//*[contains(@id, '_pc1_afr_tAct1_afr_c24::content')]");
        elements.put("activities_b_query_i_modality", "//*[contains(@id, '_pc1_afr_tAct1_afr_c23::content')]");
        elements.put("activities_b_query_i_contract", "//*[contains(@id, '_1_afr_pc1_afr_tAct1_afr_c25::content')]");
        elements.put("activities_b_query_i_supplier", "//*[contains(@id, '1_afr_pc1_afr_tAct1_afr_c41::content')]");
        elements.put("activities_b_query_i_origin", "//*[contains(@id, '_1_afr_pc1_afr_tAct1_afr_c64::content')]");
        elements.put("activities_b_query_i_destination", "//*[contains(@id, '_afr_1_afr_pc1_afr_tAct1_afr_c7::content')]");
        elements.put("activities_b_query_i_adults", "//*[contains(@id, '_1_afr_pc1_afr_tAct1_afr_c34::content')]");
        elements.put("activities_b_query_i_children", "//*[contains(@id, '_afr_1_afr_pc1_afr_tAct1_afr_c17::content')]");

        //result
        elements.put("activities_e_result", "//*[contains(@id, '---')]");

        //Actions
        elements.put("activities_b_actions", "//*[contains(@id, '1:pc1:pcgm12:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("activities_b_actions_b_audit", "//*[contains(@id, '1:pc1:pdm12:dc_cmi3')]/td[2]");


        //Extra
        elements.put("extra_tab_tab", "//*[contains(@id, 'pt1:dyntdc:r1:1:image2']/a");

        //toolbar
        elements.put("extra_b_save", "//*[contains(@id, '1:pc1:pcgt12:boton_commit')]");
        elements.put("extra_b_add", "//*[contains(@id, '1:pc1:pcgt12:boton_add')]");
        elements.put("extra_b_remove", "//*[contains(@id, '1:pc1:pcgt12:boton_remove')]");
        elements.put("extra_b_edit", "//*[contains(@id, '1:pc1:pcgt12:boton_edit')]");
        elements.put("extra_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("extra_b_fixinfo", "//*[contains(@id, '1:pc1:ctb1::icon')]");
        elements.put("extra_b_query", "//*[contains(@id, '1:pc1:_qbeTbr')]");

        //ADD
        elements.put("extra_b_add_i_startdate", "//*[contains(@id, 'pc1:pcgt12:id4::content')]");
        elements.put("extra_b_add_lov_extra", "//*[contains(@id, '1:pc1:pcgt12:ilov1::lovIconId')]");
        elements.put("extra_b_add_i_extra", "//*[contains(@id, '1:pc1:pcgt12:ilov1::content')]");
        elements.put("extra_b_add_lov_supplier", "//*[contains(@id, '1:pc1:pcgt12:ilov3::content')]");
        elements.put("extra_b_add_i_supplier", "//*[contains(@id, 'pc1:pcgt12:ilov3::lovIconId')]");
        elements.put("extra_b_add_i_units", "//*[contains(@id, '1:pc1:pcgt12:it16::content')]");
        elements.put("extra_b_add_i_adults", "//*[contains(@id, '1:pc1:pcgt12:it17::content')]");
        elements.put("extra_b_add_i_childs", "//*[contains(@id, '1:pc1:pcgt12:it18::content')]");
        elements.put("extra_b_add_select_pax", "//*[contains(@id, '1:pc1:pcgt12:soc3::content')]");
        elements.put("extra_b_add_select_type", "//*[contains(@id, '1:pc1:pcgt12:soc4::content')]");
        elements.put("extra_b_add_i_costperunit", "//*[contains(@id, '1:pc1:pcgt12:it21::content')]");
        elements.put("extra_b_add_lov_currency", "//*[contains(@id, '1:pc1:pcgt12:ilov11::content')]");
        elements.put("extra_b_add_i_currency", "//*[contains(@id, '1:pc1:pcgt12:ilov11::lovIconId')]");
        elements.put("extra_b_add_i_saleperunit", "//*[contains(@id, '1:pc1:pcgt12:it25::content')]");
        elements.put("extra_b_add_lov_officeproduct", "//*[contains(@id, '1:pc1:pcgt12:ilov4::lovIconId')]");
        elements.put("extra_b_add_i_officeproduct", "//*[contains(@id, '1:pc1:pcgt12:ilov4::content')]");
        elements.put("extra_b_add_lov_product", "//*[contains(@id, '1:pc1:pcgt12:ilov5::lovIconId')]");
        elements.put("extra_b_add_i_product", "//*[contains(@id, '1:pc1:pcgt12:ilov5::content')]");
        elements.put("extra_b_add_b_save", "//*[contains(@id, '1:pc1:pcgt12:btn_commitExit')]");

        //QUERY
        elements.put("extra_b_query_i_startdate", "//*[contains(@id, '1:pc1:tExtras:id9::content')]");
        elements.put("extra_b_query_i_extra", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c4::content')]");
        elements.put("extra_b_query_i_supplier", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c20::content')]");
        elements.put("extra_b_query_i_units", "//*[contains(@id, '_afr_pc1_afr_tExtras_afr_c7::content')]");
        elements.put("extra_b_query_i_adults", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c8::content')]");
        elements.put("extra_b_query_i_childs", "//*[contains(@id, 'afr_1_afr_pc1_afr_tExtras_afr_c9::content')]");
        elements.put("extra_b_query_select_pax", "//*[contains(@id, '1:pc1:tExtras:soc1::content')]");
        elements.put("extra_b_query_select_type", "//*[contains(@id, 'pc1:tExtras:soc6::content')]");
        elements.put("extra_b_query_i_costperunit", "//*[contains(@id, '_afr_1_afr_pc1_afr_tExtras_afr_c15::content')]");
        elements.put("extra_b_query_i_currency", "//*[contains(@id, 'afr_1_afr_pc1_afr_tExtras_afr_c17::content')]");
        elements.put("extra_b_query_i_saleperunit", "//*[contains(@id, '_afr_1_afr_pc1_afr_tExtras_afr_c16::content')]");

        //ACTIONS
        elements.put("extra_b_actions_b_audit", "//*[contains(@id, '1:pc1:pcgm1:dc_cmi1')]/td[2]");

        //REMARKS
        elements.put("extra_remmarks_internal_b_edit", "//*[contains(@id, '0:pcgt1:boton_edit')]");
        elements.put("extra_remmarks_internal_b_save", "//*[contains(@id, '0:pcgt1:boton_commit')]");
        elements.put("extra_remmarks_internal_b_edit_i_internal", "//*[contains(@id, '0:it3::content')]");
        elements.put("extra_remmarks_internal_b_edit_b_save", "//*[contains(@id, '0:pcgt3:boton_commit')]");

        elements.put("extra_remmarks_voucher_b_edit", "//*[contains(@id, '0:pcgt2:boton_edit')]");
        elements.put("extra_remmarks_voucher_b_save", "//*[contains(@id, '0:pcgt2:boton_commit')]");
        elements.put("extra_remmarks_voucher_b_edit_i_internal", "//*[contains(@id, '0:it5::content')]");
        elements.put("extra_remmarks_voucher_b_edit_b_save", "//*[contains(@id, '0:pcgt3:boton_commit')]");
        //FEES AND DISCOUNTS TABLE
        elements.put("extra_tab_tab", "//*[contains(@id, 'pt1:dyntdc:r1:1:image2']/a");
        //toolbar
        elements.put("fees_b_save", "//*[contains(@id, '1:pc1:pcgt12:boton_commit')]");
        elements.put("fees_b_add", "//*[contains(@id, '1:pc1:pcgt12:boton_add')]");
        elements.put("fees_b_remove", "//*[contains(@id, '1:pc1:pcgt12:boton_remove')]");
        elements.put("fees_b_edit", "//*[contains(@id, '1:pc1:pcgt12:boton_edit')]");
        elements.put("fees_b_actions", "//*[contains(@id, 'pc1:pcgm1:dc_m1')]/div/table/tbody/tr/td[3]");
        elements.put("fees_b_fixinfo", "//*[contains(@id, '1:pc1:ctb1::icon')]");
        elements.put("fees_b_query", "//*[contains(@id, '1:pc1:_qbeTbr')]");
        //ADD
        elements.put("fees_b_add_i_startdate", "//*[contains(@id, 'pc1:pcgt12:id4::content')]");
        elements.put("fees_b_add_lov_extra", "//*[contains(@id, '1:pc1:pcgt12:ilov1::lovIconId')]");
        elements.put("fees_b_add_i_extra", "//*[contains(@id, '1:pc1:pcgt12:ilov1::content')]");
        elements.put("fees_b_add_lov_supplier", "//*[contains(@id, '1:pc1:pcgt12:ilov3::content')]");
        elements.put("fees_b_add_i_supplier", "//*[contains(@id, 'pc1:pcgt12:ilov3::lovIconId')]");
        elements.put("fees_b_add_i_units", "//*[contains(@id, '1:pc1:pcgt12:it16::content')]");
        elements.put("fees_b_add_i_adults", "//*[contains(@id, '1:pc1:pcgt12:it17::content')]");
        elements.put("fees_b_add_i_childs", "//*[contains(@id, '1:pc1:pcgt12:it18::content')]");
        elements.put("fees_b_add_select_pax", "//*[contains(@id, '1:pc1:pcgt12:soc3::content')]");
        elements.put("fees_b_add_select_type", "//*[contains(@id, '1:pc1:pcgt12:soc4::content')]");
        elements.put("fees_b_add_i_costperunit", "//*[contains(@id, '1:pc1:pcgt12:it21::content')]");
        elements.put("fees_b_add_lov_currency", "//*[contains(@id, '1:pc1:pcgt12:ilov11::content')]");
        elements.put("fees_b_add_i_currency", "//*[contains(@id, '1:pc1:pcgt12:ilov11::lovIconId')]");
        elements.put("fees_b_add_i_saleperunit", "//*[contains(@id, '1:pc1:pcgt12:it25::content')]");
        elements.put("fees_b_add_lov_officeproduct", "//*[contains(@id, '1:pc1:pcgt12:ilov4::lovIconId')]");
        elements.put("fees_b_add_i_officeproduct", "//*[contains(@id, '1:pc1:pcgt12:ilov4::content')]");
        elements.put("fees_b_add_lov_product", "//*[contains(@id, '1:pc1:pcgt12:ilov5::lovIconId')]");
        elements.put("fees_b_add_i_product", "//*[contains(@id, '1:pc1:pcgt12:ilov5::content')]");
        elements.put("fees_b_add_b_save", "//*[contains(@id, '1:pc1:pcgt12:btn_commitExit')]");
        //QUERY
        elements.put("fees_b_query_i_startdate", "//*[contains(@id, '1:pc1:tExtras:id9::content')]");
        elements.put("fees_b_query_i_extra", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c4::content')]");
        elements.put("fees_b_query_i_supplier", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c20::content')]");
        elements.put("fees_b_query_i_units", "//*[contains(@id, '_afr_pc1_afr_tExtras_afr_c7::content')]");
        elements.put("fees_b_query_i_adults", "//*[contains(@id, '1_afr_pc1_afr_tExtras_afr_c8::content')]");
        elements.put("fees_b_query_i_childs", "//*[contains(@id, 'afr_1_afr_pc1_afr_tExtras_afr_c9::content')]");
        elements.put("fees_b_query_select_pax", "//*[contains(@id, '1:pc1:tExtras:soc1::content')]");
        elements.put("fees_b_query_select_type", "//*[contains(@id, 'pc1:tExtras:soc6::content')]");
        elements.put("fees_b_query_i_costperunit", "//*[contains(@id, '_afr_1_afr_pc1_afr_tExtras_afr_c15::content')]");
        elements.put("fees_b_query_i_currency", "//*[contains(@id, 'afr_1_afr_pc1_afr_tExtras_afr_c17::content')]");
        elements.put("fees_b_query_i_saleperunit", "//*[contains(@id, '_afr_1_afr_pc1_afr_tExtras_afr_c16::content')]");
        //ACTIONS
        elements.put("fees_b_actions_b_audit", "//*[contains(@id, '1:pc1:pcgm1:dc_cmi1')]/td[2]");
        //REMARKS
        elements.put("fees_remmarks_internal_b_edit", "//*[contains(@id, '0:pcgt1:boton_edit')]");
        elements.put("fees_remmarks_internal_b_save", "//*[contains(@id, '0:pcgt1:boton_commit')]");
        elements.put("fees_remmarks_internal_b_edit_i_internal", "//*[contains(@id, '0:it3::content')]");
        elements.put("fees_remmarks_internal_b_edit_b_save", "//*[contains(@id, '0:pcgt3:boton_commit')]");

        elements.put("fees_remmarks_voucher_b_edit", "//*[contains(@id, '0:pcgt2:boton_edit')]");
        elements.put("fees_remmarks_voucher_b_save", "//*[contains(@id, '0:pcgt2:boton_commit')]");
        elements.put("fees_remmarks_voucher_b_edit_i_internal", "//*[contains(@id, '0:it5::content')]");
        elements.put("fees_remmarks_voucher_b_edit_b_save", "//*[contains(@id, '0:pcgt3:boton_commit')]");
    }
}
