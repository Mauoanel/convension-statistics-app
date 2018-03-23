package za.org.baptist.convension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.org.baptist.convension.domain.SystemUser;
import za.org.baptist.convension.repo.SystemUserRepository;

@Service
public class SystemUsersServiceImpl implements SystemUsersService {

    @Autowired
    private SystemUserRepository repository;

    @Override
    public SystemUser insertSystemUser(SystemUser systemUser) {
        repository.save(systemUser);
        return systemUser;
    }

    @Override
    public SystemUser retrieveSystemUser(SystemUser systemUser) {
        return repository.findByUsername(systemUser.getUsername());
    }

    @Override
    public boolean updateSystemUser(SystemUser systemUser) {
        repository.save(systemUser);
        return true;
    }

    @Override
    public boolean deleteSystemUser(SystemUser systemUser) {
        repository.delete(systemUser);
        return true;
    }

    @Override
    public boolean suspendSystemUser(SystemUser systemUser) {
        repository.save(systemUser);
        return true;
    }
}
