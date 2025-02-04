package vttp5_paf_day22w_chuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vttp5_paf_day22w_chuk.model.Rsvp;
import vttp5_paf_day22w_chuk.service.RsvpService;

@RestController
public class RsvpController {

    @Autowired
    private RsvpService rsvpService; 

    @PostMapping("/api/rsvp")
    public void postRsvp(@RequestBody Rsvp rsvp) {

        rsvpService.insertRsvp(rsvp);

    }

    @GetMapping("/api/rsvps")
    public ResponseEntity<Object> getAllRsvps() {

        return ResponseEntity.ok()
            .body(rsvpService.getAllRsvps());

    }
    
}
