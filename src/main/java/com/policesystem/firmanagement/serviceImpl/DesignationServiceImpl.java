package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.Designation;
import com.policesystem.firmanagement.repo.Post;
import com.policesystem.firmanagement.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationServiceImpl implements DesignationService {
    @Autowired
    private Post post;

    @Override
    public void insertDesignation(Designation designation) {
        post.save(designation);
    }

    @Override
    public List<Designation> getAll() {
        try
        {
            return post.findAll();
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
