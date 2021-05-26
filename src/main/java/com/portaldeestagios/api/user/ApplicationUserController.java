package com.portaldeestagios.api.user;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/application-user/")
@AllArgsConstructor
@Api(tags = "Users")
public class ApplicationUserController {

  private final ApplicationUserRepository applicationUserRepository;

  @GetMapping
  public List<ApplicationUser> listUser() {
    return applicationUserRepository.findAll();
  }

}
