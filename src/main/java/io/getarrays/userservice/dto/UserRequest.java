package io.getarrays.userservice.dto;

import java.util.Collection;

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
