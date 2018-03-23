package za.org.baptist.convension.service;

import za.org.baptist.convension.domain.SystemUser;

public interface SystemUsersService {

    /**
     * Save the SystemUser into the Database
     * @param systemUser user details
     * @return saved system user
     */
    SystemUser insertSystemUser(SystemUser systemUser);

    /**
     * Get the SystemUser from the Database
     * @param systemUser user details
     * @return saved system user
     */
    SystemUser retrieveSystemUser(SystemUser systemUser);

    /**
     * Update the SystemUser into the Database
     * @param systemUser user details
     * @return saved system user
     */
    boolean updateSystemUser(SystemUser systemUser);

    /**
     * Delete the SystemUser into the Database
     * @param systemUser user details
     * @return saved system user
     */
    boolean deleteSystemUser(SystemUser systemUser);

    /**
     * Suspend the SystemUser into the Database
     * @param systemUser user details
     * @return saved system user
     */
    boolean suspendSystemUser(SystemUser systemUser);
}
