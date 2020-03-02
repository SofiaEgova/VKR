package vkr.VKR.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vkr.VKR.repo.UsrRepo;

import java.util.*;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private UsrRepo usrRepo;

    @GetMapping
    public String main(){
        return "login";
    }

//    @GetMapping("{id}")
//    public String getOne(@PathVariable Integer id){
//        return methods.get(id);
//    }
//
//    @PostMapping
//    public String add(@RequestBody String method){
//        methods.add(method);
//        n++;
//        return method;
//    }
//
//    @PutMapping("{id}")
//    public String update(@PathVariable Integer id, @RequestBody String method){
//        methods.set(id, method);
//        return method;
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable Integer id){
//        methods.remove(id);
//    }
}
