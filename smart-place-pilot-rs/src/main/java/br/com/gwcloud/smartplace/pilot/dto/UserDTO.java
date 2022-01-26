package br.com.gwcloud.smartplace.pilot.dto;

import org.apache.catalina.User;

import java.io.Serializable;
import java.util.UUID;

public class UserDTO implements Serializable {


    private UUID id;
    private String firstName;
    private String lastName;

    public UserDTO(User user) {

    }
}
