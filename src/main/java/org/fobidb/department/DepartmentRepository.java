package org.fobidb.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> { // unser TeacherRepository erbt von JpaRepository, daher stehen viele Befehle zum manipulieren der Datenbank zur Verfügung

    //SELECT * FROM teacher WHERE email = ?
    /*@Query("SELECT t FROM Department t WHERE t.email = ?1")
    Optional<Department> findByEmail(String email); */
}
