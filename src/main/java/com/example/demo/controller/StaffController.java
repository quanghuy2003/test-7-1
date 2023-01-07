package com.example.demo.controller;

import com.example.demo.model.Room;
import com.example.demo.model.Staff;
import com.example.demo.service.IRoomService;
import com.example.demo.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
//@RequestMapping
public class StaffController {
    @Autowired
    private IStaffService staffService;
    @Autowired
    private IRoomService roomService;
    @GetMapping("/findAllStaff")
    public ResponseEntity<Iterable<Staff>> showAllUser() {
        Iterable<Staff> staff = staffService.findAll();
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Iterable<Staff>> addUser(@RequestBody Staff staff){
        staffService.save(staff);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/users/changeRoom/{id}/{idRoom}")
    public ResponseEntity<Staff> changeStaff(@PathVariable("id") Long id, @PathVariable("idRoom") Long idRoom) {
        Staff staff = staffService.findById(id).get();
        Room room = roomService.findById(idRoom).get();
        staff.setRoom(room);
        staffService.save(staff);
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }


}
