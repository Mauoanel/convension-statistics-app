package za.org.baptist.convension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.org.baptist.convension.domain.Member;
import za.org.baptist.convension.form.AdhocMemberSearchForm;
import za.org.baptist.convension.service.AdhocManagementService;

@RestController
public class BasicMembersController {

    @Autowired
    private AdhocManagementService adhocManagementService;

    /**
     * Basic Search method
     */
    @RequestMapping(value = "/api/v1/adhoc/basic/search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object search(@RequestBody AdhocMemberSearchForm adhocMemberSearchForm) {
        return adhocManagementService.search(adhocMemberSearchForm);
    }

    /**
     * Basic View method
     */
    @RequestMapping(value = "/api/v1/adhoc/basic/view",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object view(@RequestBody Member member) {
        return adhocManagementService.view(member);
    }

}
