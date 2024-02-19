package io.getarrays.userservice.dto;

import static javax.persistence.FetchType.EAGER;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

import io.getarrays.userservice.domain.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    
    private String name;
    private String username;
    private String password;
    private Collection<Role> roles;

}
