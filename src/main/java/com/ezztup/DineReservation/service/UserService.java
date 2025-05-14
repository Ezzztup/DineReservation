package com.ezztup.DineReservation.service;

import com.ezztup.DineReservation.dto.UserDTO;
import com.ezztup.DineReservation.dto.UserRequest;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserRequest request);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO updateUser(Long id, UserRequest request);
    void deleteUser(Long id);
}
