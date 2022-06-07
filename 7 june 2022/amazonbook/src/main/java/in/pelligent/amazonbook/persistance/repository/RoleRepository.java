package in.pelligent.amazonbook.persistance.repository;

import in.pelligent.amazonbook.persistance.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {
    RoleEntity findByRoleName(String name);
//    List<RoleEntity> findAllByRole(RoleEntity roleEntity);
}