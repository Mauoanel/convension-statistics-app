package za.org.baptist.convension.service;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import za.org.baptist.convension.domain.Member;
import za.org.baptist.convension.form.AdhocMemberSearchForm;
import za.org.baptist.convension.repo.MembersRepository;

import java.util.List;
@Service
public class AdhocManagementServiceImpl implements AdhocManagementService {

    @Autowired
    private MembersRepository membersRepository;

    @Override
    public List search(AdhocMemberSearchForm memberCriteria) {

        if(StringUtils.isEmpty(memberCriteria.getFirstName()) &&
                StringUtils.isEmpty(memberCriteria.getLastName()) &&
                StringUtils.isEmpty(memberCriteria.getChurchName()) &&
                memberCriteria.getFromDate()!= null &&
                memberCriteria.getToDate()!= null &&
                memberCriteria.getRegion()!=null){

            // Add a day to the toDate if the fromDate and toDate are the same.
            if(DateUtils.isSameDay(memberCriteria.getFromDate(), memberCriteria.getToDate())){
                memberCriteria.setToDate(DateUtils.addDays(memberCriteria.getToDate(),1));
            }

            return membersRepository.findByJoinedDateBetweenAndRegion(memberCriteria.getFromDate(),memberCriteria.getToDate(),memberCriteria.getRegion());
        }
        return null;
    }

    @Override
    public Member view(Member member) {
        return membersRepository.findByMemberId(member.getMemberId());
    }

    @Override
    public Member insert(Member member) {
        return membersRepository.save(member);
    }

    @Override
    public Boolean delete(Member member) {
        membersRepository.delete(member);
        return true;
    }
}
