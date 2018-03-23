package za.org.baptist.convension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.org.baptist.convension.domain.SystemUser;
import za.org.baptist.convension.repo.SystemUserRepository;

/**
 * @author lawry
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    SystemUserRepository repository;

    @Override
    public boolean systemUserExists(SystemUser user) {
        return (repository.findByUsername(user.getUsername()) == null);
    }

    @Override
    public boolean resetPassword(SystemUser user) {
        repository.save(user);
        return true;
    }

    @Override
    public boolean unlockAccount(SystemUser user) {
        repository.save(user);
        return true;
    }

    @Override
    public boolean login(SystemUser user) {
        return (repository.findByUsernameAndPassword(user) == null);
    }
}
