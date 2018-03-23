package za.org.baptist.convension.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.org.baptist.convension.domain.SystemUser;
import za.org.baptist.convension.service.AuthenticationService;

/**
 * @author lawry
 */
@RestController
public class SystemLogonController {

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * Login method
     */
    @RequestMapping(value = "/api/v1/access/management/login",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object login(@RequestBody SystemUser systemUser) {
        return authenticationService.login(systemUser);
    }

    /**
     * Does System User exists method
     */
    @RequestMapping(value = "/api/v1/access/management/systemUserExists",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object systemUserExists(@RequestBody SystemUser systemUser) {
        return authenticationService.systemUserExists(systemUser);
    }


    /**
     * Unlock Account method
     */
    @RequestMapping(value = "/api/v1/access/management/unlockAccount",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object unlockAccount(@RequestBody SystemUser systemUser) {
        return authenticationService.unlockAccount(systemUser);
    }

    /**
     * Reset Password method
     */
    @RequestMapping(value = "/api/v1/access/management/resetPassword",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    public @ResponseBody Object resetPassword(@RequestBody SystemUser systemUser) {
        return authenticationService.resetPassword(systemUser);
    }
}
