package com.portaldeestagios.api.student;

import com.portaldeestagios.api.selectionprocess.SelectionProcessEntity;
import com.portaldeestagios.api.user.ApplicationUser;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Student implements Serializable {

  @Id
  @EqualsAndHashCode.Include
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstName;

  private String lastName;

  private Byte age;

  @OneToOne
  @JoinColumn(unique = true)
  private ApplicationUser applicationUser;

  @ManyToMany(mappedBy = "studentList")
  private Set<SelectionProcessEntity> selectionProcessEntityList = new HashSet<>();

}
