package in.pelligent.amazonbook.controller;


import in.pelligent.amazonbook.persistance.POJO.LanguageResponse;
import in.pelligent.amazonbook.persistance.POJO.RoleRequest;
import in.pelligent.amazonbook.persistance.POJO.RoleResponse;
import in.pelligent.amazonbook.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("To show a role")
    @GetMapping("/{Role}")
    public ResponseEntity<RoleResponse> showRole(@PathVariable String roleName ) {
        RoleResponse response = roleService.showRole(roleName);
        return ResponseEntity.ok(response);
    }

}
