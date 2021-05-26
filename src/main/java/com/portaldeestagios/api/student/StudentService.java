package com.portaldeestagios.api.student;

import com.portaldeestagios.api.user.ApplicationUser;
import com.portaldeestagios.api.user.ApplicationUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

  private final ApplicationUserRepository applicationUserRepository;
  private final StudentRepository studentRepository;

  public Student save(Student student) {

    ApplicationUser user = applicationUserRepository.findById(student.getApplicationUser().getId())
            .orElseThrow(() -> new IllegalStateException("Cliente não encontrado"));

    student.setApplicationUser(user);

    return studentRepository.save(student);
  }
}