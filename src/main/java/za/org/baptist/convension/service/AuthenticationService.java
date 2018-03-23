package za.org.baptist.convension.service;

import za.org.baptist.convension.domain.SystemUser;
/**
 * @author lawry
 */
public interface AuthenticationService {

    /**
     * Check if a System user exists
     * @param user details
     * @return true if user exists
     */
    boolean systemUserExists(SystemUser user);

    /**
     * Reset System User Password
     * @param user details
     * @return true if password reset was successful
     */
    boolean resetPassword(SystemUser user);

    /**
     * Unlock a System User Account
     * @param user
     * @return
     */
    boolean unlockAccount(SystemUser user);

    /**
     * Login using System User Details
     * @param user
     * @return
     */
    boolean login(SystemUser user);
}
