package org.fobidb.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Service LAYER *******************************************************

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public void addNewDepartment(Department department
    ) {
        /*
        Optional<Department> departmentOptional = departmentRepository.findByEmail(department.getEmail());
        if (departmentOptional.isPresent()) {
            throw new IllegalStateException("email already in use");
        }
         */
        departmentRepository.save(department);
    }

    public void deleteDepartment(Long departmentId) {
        boolean exists = departmentRepository.existsById(departmentId);
        if (!exists) {
            throw new IllegalStateException("department with Id "+ departmentId + " does not exist");
        }
        departmentRepository.deleteById(departmentId);
    }
}
