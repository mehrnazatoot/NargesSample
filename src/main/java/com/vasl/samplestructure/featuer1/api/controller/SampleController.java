package com.vasl.samplestructure.featuer1.api.controller;

import com.vasl.samplestructure.featuer1.api.adapter.SampleAdaptor;
import com.vasl.samplestructure.featuer1.api.dto.SampleInputDto;
import com.vasl.samplestructure.featuer1.api.dto.SampleOutputDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Nargess
 * @since : 7/29/2022, Fri
 **/
@RestController
@RequestMapping("/api/v1/bi/elastic")
public class SampleController {

    private final SampleAdaptor sampleAdaptor;

    public SampleController(SampleAdaptor sampleAdaptor) {
        this.sampleAdaptor = sampleAdaptor;
    }

    @GetMapping(value = "")
    public SampleOutputDto cancelComplaint(SampleInputDto dto) {
        return sampleAdaptor.test(dto);
    }

}
