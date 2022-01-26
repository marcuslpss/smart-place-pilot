package br.com.gwcloud.smartplace.pilot.service;

import br.com.gwcloud.smartplace.pilot.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public interface UserService extends AbstractBaseService <UserEntity, UUID> {


    List<UserEntity> findAll();
}
