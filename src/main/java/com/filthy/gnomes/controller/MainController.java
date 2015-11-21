package com.filthy.gnomes.controller;

import com.filthy.gnomes.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyzmo on 11/21/2015.
 */
@RestController
public class MainController {

    @RequestMapping(value = "/checkCredentials.json", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Boolean checkUserCredentials(
            @RequestParam(value = "sort", required = false) String sort) {



        return false;
    }
}
