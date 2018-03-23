package za.org.baptist.convension.service;


import za.org.baptist.convension.domain.Member;
import za.org.baptist.convension.form.AdhocMemberSearchForm;

import java.util.List;

/**
 * @author lawry
 */
public interface AdhocManagementService {

    /**
     * Search for Members om the Database
     * @param member details
     * @return a list of members on the database
     */
    List search(AdhocMemberSearchForm member);

    /**
     * View for Member on the Database
     * @param member details
     * @return member details
     */
    Member view(Member member);

    /**
     * Save for Member on the Database
     * @param member details
     * @return member details
     */
    Member insert(Member member);

    /**
     * Delete for Member on the Database
     * @param member details
     * @return true if member was deleted.
     */
    Boolean delete(Member member);
}
