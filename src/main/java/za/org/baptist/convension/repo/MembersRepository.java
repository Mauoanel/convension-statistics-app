package za.org.baptist.convension.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.org.baptist.convension.domain.Member;

import java.util.Date;
import java.util.List;

@Repository
public interface MembersRepository extends MongoRepository<Member, String> {

    Member findByMemberId(String id);
    List<Member> findByJoinedDateBetweenAndRegion(Date fromDate, Date toDate, String region);

}
