package za.org.baptist.convension.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.org.baptist.convension.domain.SystemUser;
/**
 * @author lawry
 */
@Repository
public interface SystemUserRepository extends MongoRepository<SystemUser, String> {

    SystemUser findByUsername(String username);

    SystemUser findByUsernameAndPassword(SystemUser user);
}
