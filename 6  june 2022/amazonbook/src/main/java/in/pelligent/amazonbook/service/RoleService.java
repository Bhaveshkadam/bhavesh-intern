package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.POJO.RoleRequest;
import in.pelligent.amazonbook.persistance.entity.RoleEntity;
import in.pelligent.amazonbook.persistance.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleResult;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void createRole(RoleRequest roleRequest) {
        roleRepository.save(RoleEntity.builder().roleName(roleRequest.getName()).build());
    }
}
