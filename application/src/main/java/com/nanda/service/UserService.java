//package com.nanda.service;
//
//import com.nanda.dao.UserRepo;
//import com.nanda.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Iterator;
//import java.util.List;
//
//@Service
//public class UserService {
//
//    private UserRepo userRepo;
//
//    @Autowired
//    public UserService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    public Iterator<User> getUsers() {
//        return userRepo.findAll().iterator();
//    }
//}
