package com.example.springbootwithmongodb.contoller;

import com.example.springbootwithmongodb.model.Pojo;
import com.example.springbootwithmongodb.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/map")
public class contoller {

    @Autowired
    private Repository rpo;
    @GetMapping("/get")
    public String p1(@RequestBody Pojo p2)
    {
        String name = p2.getName();
        return name;
    }
    @GetMapping("/findall")
    public List<Pojo> pj(Pojo p)
    {
        return rpo.findAll();
    }

    @PostMapping("/post")
    public Pojo pjj(@RequestBody Pojo p1)
    {
        return rpo.save(p1);
    }

    @GetMapping("getalldocuments")
    public List<Pojo> pt(){
        return rpo.findAll();
    }
}
