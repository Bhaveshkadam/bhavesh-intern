package in.pelligent.amazonbook.controller;


import in.pelligent.amazonbook.persistance.POJO.RoleRequest;
import in.pelligent.amazonbook.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/role")
public class RoleController {
    public RoleService roleService;

    public RoleController(final RoleService roleService) {
        this.roleService = roleService;
    }

    @ApiOperation("To create a role")
    @PostMapping
    public void createRole(RoleRequest roleRequest){
        roleService.createRole(roleRequest);
    }
}
