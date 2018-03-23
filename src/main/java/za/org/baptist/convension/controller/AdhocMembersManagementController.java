package za.org.baptist.convension.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.org.baptist.convension.domain.Member;
import za.org.baptist.convension.domain.SystemUser;
import za.org.baptist.convension.form.AdhocMemberSearchForm;
import za.org.baptist.convension.service.AdhocManagementService;

@RestController
public class AdhocMembersManagementController {

    @Autowired
    private AdhocManagementService adhocManagementService;
    
    /**
     * Adhoc Search for Members method
     */
    @RequestMapping(value = "/api/v1/adhoc/management/search",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object search(@RequestBody AdhocMemberSearchForm adhocMemberSearchForm) {
        return adhocManagementService.search(adhocMemberSearchForm);
    }

    /**
     * Adhoc Save Member method
     */
    @RequestMapping(value = "/api/v1/adhoc/management/insert",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object insert(@RequestBody Member member) {
        return adhocManagementService.insert(member);
    }


    /**
     * Adhoc View Member method
     */
    @RequestMapping(value = "/api/v1/adhoc/management/view",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object view(@RequestBody Member member) {
        return adhocManagementService.view(member);
    }



    /**
     * Adhoc Delete Member method
     */
    @RequestMapping(value = "/api/v1/adhoc/management/delete",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object delete(@RequestBody Member member) {
        return adhocManagementService.delete(member);
    }
}
