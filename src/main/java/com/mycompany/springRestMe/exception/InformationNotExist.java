/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springRestMe.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 *
 * @author ismail
 */
@ControllerAdvice
public class InformationNotExist extends RuntimeException {

    public InformationNotExist(Throwable cause) {
        super(cause);
    }

    public InformationNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public InformationNotExist(String message) {
        super(message);
    }

    public InformationNotExist() {
        super("Pesron Not Exist");
    }

}
