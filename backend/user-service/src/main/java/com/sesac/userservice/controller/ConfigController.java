package com.sesac.userservice.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Tag(name="config test",description="설정값 확인")
public class ConfigController {
   private String servicename;
   private String serviceVersion;
   private String serviceDescription;
}
