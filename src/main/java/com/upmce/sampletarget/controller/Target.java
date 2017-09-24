package com.upmce.sampletarget.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/target")
public class Target {
  @RequestMapping(value="/hello", method=RequestMethod.GET)
  public String hello () {
    return getHostName();
  }

  private String getHostName() {
    String output = "";
    try {
      InetAddress myHost = InetAddress.getLocalHost();
      output = myHost.getHostName();
    } catch (UnknownHostException ex) {
      ex.printStackTrace();
    }
    return output;
  }
}
