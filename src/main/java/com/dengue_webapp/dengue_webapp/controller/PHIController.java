package com.dengue_webapp.dengue_webapp.controller;


import com.dengue_webapp.dengue_webapp.dto.request.RequestPHIDto;
import com.dengue_webapp.dengue_webapp.dto.response.ResponsePHIDto;
import com.dengue_webapp.dengue_webapp.service.PHIService;
import com.dengue_webapp.dengue_webapp.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phi")
public class PHIController {

    private final PHIService phiService;

    public PHIController(PHIService phiService) {
        this.phiService = phiService;
    }


    @PostMapping
    public ResponseEntity<StandardResponse> createPHIOfficerInfo(@RequestBody RequestPHIDto dto){
       phiService.createPHI(dto);
       return new ResponseEntity<>(
               new StandardResponse(201, "Successfully created a PHI Officer", dto),
               HttpStatus.CREATED
       );
    }

//    @PostMapping
//    public String createPHIOfficerInfo(){
//        return "Create PHI Officer Info";
//    }

//    @GetMapping
//    public String getPHIOfficerInfo(){
//        return "PHI Officer Info";
//    }


    @GetMapping("/{id}")
    public ResponseEntity<StandardResponse> getPHIOfficerInfo(@PathVariable String id){
        ResponsePHIDto dto = phiService.getPHI(id);
        return new ResponseEntity<>(
                new StandardResponse(200, "Successfully get PHI Officer Info", dto),
                HttpStatus.OK
        );
    }


    @GetMapping(path = "/list", params = {"searchText", "page", "size"})
    public ResponseEntity<StandardResponse> getAllPHIOfficerInfo(@RequestParam String searchText, @RequestParam int page, @RequestParam int size){
        List<ResponsePHIDto> dtos = phiService.getAllPHI(searchText, page, size);
        return new ResponseEntity<>(
                new StandardResponse(200, "Successfully get PHI Officer Info", dtos),
                HttpStatus.OK
        );
    }

    @PutMapping( "/{id}")
    public ResponseEntity<StandardResponse> updatePHIOfficerInfo(@PathVariable String id, @RequestBody RequestPHIDto dto){
        phiService.updatePHI(id, dto);
        return new ResponseEntity<>(
                new StandardResponse(200, "Successfully update PHI Officer Info", dto),
                HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<StandardResponse> deletePHIOfficerInfo(@PathVariable String id){
       phiService.deletePHI(id);
       return new ResponseEntity<>(
               new StandardResponse(200, "Successfully delete PHI Officer Info", null),
               HttpStatus.NO_CONTENT
       );
    }


}
