package com.sapient.authservice.service;


import com.sapient.authservice.dao.UsersDAO;
import com.sapient.authservice.entities.ImmutableUsersDBModel;
import com.sapient.authservice.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {



    @Autowired
    UsersDAO dao;

    public ImmutableUsersDBModel findByUsername(String username){
        return dao.getUserByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // hard coding the users. All passwords must be encoded.
//        final List<AppUser> users = Arrays.asList(
//                new AppUser(1, "omar", encoder.encode("12345"), "USER"),
//                new AppUser(2, "admin", encoder.encode("12345"), "ADMIN")
//        );


        ImmutableUsersDBModel user = findByUsername(username);

            String name = user.username();
        if(name == null){
            throw new UsernameNotFoundException("User not authorized.");
        }

            if (name.equals(username)) {

                // Spring needs roles to be in this format: "ROLE_" + userRole (i.e. "ROLE_ADMIN")
                // So, we need to set it to that format, so we can verify and compare roles (i.e. hasRole("ADMIN")).
                List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList(user.role());
                System.out.println(user.role());
                // The "User" class is provided by Spring and represents a model class for user to be returned by UserDetailsService
                // And used by auth manager to verify and check user authentication.
                return new User(user.username(), user.password(), grantedAuthorities);
            }


        // If user not found. Throw this exception.
        throw new UsernameNotFoundException("Username: " + username + " not found");
    }


}
