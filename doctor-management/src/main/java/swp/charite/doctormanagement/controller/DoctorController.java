package swp.charite.doctormanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import swp.charite.doctormanagement.dto.DoctorDto;
import swp.charite.doctormanagement.model.Doctor;
import swp.charite.doctormanagement.service.DoctorService;


@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping(value = "/create")
    public String create(@RequestBody DoctorDto doctor) {
        return doctorService.addDoctor(doctor);
    }

    @PostMapping(value = "/update")
    public String update(@RequestBody DoctorDto doctor) {
        return doctorService.updateEmail(doctor);
    }

    @PostMapping(value = "/query")
    public Doctor query(@RequestBody DoctorDto doctor) {
        return doctorService.queryDoctor(doctor);
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        return doctorService.deleteDoctor(id);
    }
    
}

