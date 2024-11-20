package org.example.spring_project.service;

import org.example.spring_project.model.Owner;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    public Owner getOwner(){
        return new Owner("Bob");
    }
}
