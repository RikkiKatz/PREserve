package com.revature.web;

import com.revature.beans.Reservation;
import com.revature.middle.Delegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class ReservationController {

    private Delegate businessDelegate;
    @Autowired
    public void setBusinessDelegate(Delegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    @RequestMapping(value = "/reservation",
            method = RequestMethod.POST,
            produces = "application/JSON",
            consumes = "application/json")
    public void submitReservation(/*@PathVariable int id, @RequestBody @Valid Reservation reservation*/){
        System.out.println("in reservation method");
         //businessDelegate.createReservation(reservation);
    }

}
