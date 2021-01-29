/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

import java.io.IOException;

/**
 *
 * @author Jerry Pangaribuan
 */
public interface Auth {
    boolean login() throws IOException;
    
    void register() throws IOException;
    
    boolean logout();
}
