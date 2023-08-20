package com.saurabh.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
 public class CloudApiService{

    CloudVendor cloudVendor;
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID){
        return cloudVendor;
        //new CloudVendor("c1", "sa", "jjaun",
       // "82988451");
    }
 
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
  this.cloudVendor=cloudVendor;
  return "Cloud Vendor created successfully";
    }
    @PutMapping
     public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
  this.cloudVendor=cloudVendor;
  return "Cloud Vendor updated successfully";
    }
    @DeleteMapping("{vendorID}")
     public String deleteCloudVendorDetails(String vendorID){
        this.cloudVendor=null;
  return "Cloud Vendor deleted successfully";
    }
 }