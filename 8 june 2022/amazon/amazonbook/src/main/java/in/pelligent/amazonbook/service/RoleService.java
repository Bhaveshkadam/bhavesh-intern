package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.POJO.LanguageResponse;
import in.pelligent.amazonbook.persistance.POJO.RoleRequest;
import in.pelligent.amazonbook.persistance.POJO.RoleResponse;
import in.pelligent.amazonbook.persistance.entity.LanguageEntity;
import in.pelligent.amazonbook.persistance.entity.RoleEntity;
import in.pelligent.amazonbook.persistance.repository.RoleRepository;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public RoleResponse createRole(RoleRequest roleRequest) {
       RoleEntity save = roleRepository.save(RoleEntity.builder().roleName(roleRequest.getName()).build());
       return RoleResponse.builder()
               .id(save.getRoleId())
               .name(save.getRoleName())
               .build();
    }
    public RoleResponse showRole(String roleName) {
        RoleEntity role = roleRepository.findByRoleName(roleName);
        return new RoleResponse(role.getRoleId(), role.getRoleName());
    }

}
