package za.org.baptist.convension.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.org.baptist.convension.domain.SystemUser;
import za.org.baptist.convension.service.SystemUsersService;

@RestController
public class SystemAdminController {

    @Autowired
    private SystemUsersService systemUsersService;

    /**
     * Insert User Account
     */
    @RequestMapping(value = "/api/v1/system/management/insert",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object insertSystemUser(@RequestBody SystemUser systemUser) {
        return systemUsersService.insertSystemUser(systemUser);
    }

    /**
     * Retrieve User Account
     */
    @RequestMapping(value = "/api/v1/system/management/retrieve",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object retrieveSystemUser(@RequestBody SystemUser systemUser) {
        return systemUsersService.retrieveSystemUser(systemUser);
    }

    /**
     * Update User Account
     */
    @RequestMapping(value = "/api/v1/system/management/update",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object updateSystemUser(@RequestBody SystemUser systemUser) {
        return systemUsersService.updateSystemUser(systemUser);
    }

    /**
     * Delete User Account
     */
    @RequestMapping(value = "/api/v1/system/management/delete",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object deleteSystemUser(@RequestBody SystemUser systemUser) {
        return systemUsersService.deleteSystemUser(systemUser);
    }

    /**
     * Suspend User Account
     */
    @RequestMapping(value = "/api/v1/system/management/suspend",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object suspendSystemUser(@RequestBody SystemUser systemUser) {
        return systemUsersService.suspendSystemUser(systemUser);
    }
}
