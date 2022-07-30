package com.vasl.samplestructure.featuer1.api.adapter;

import com.vasl.samplestructure.featuer1.api.dto.SampleInputDto;
import com.vasl.samplestructure.featuer1.api.dto.SampleOutputDto;
import com.vasl.samplestructure.featuer1.api.mapper.SampleMapper;
import com.vasl.samplestructure.featuer1.service.Service;
import org.springframework.stereotype.Component;

/**
 * @author : Nargess
 * @since : 7/29/2022, Fri
 **/
@Component
public class SampleAdaptor {

    private final SampleMapper sampleMapper;
    private final Service sampleService;

    public SampleAdaptor(SampleMapper sampleMapper, Service sampleService) {
        this.sampleMapper = sampleMapper;
        this.sampleService = sampleService;
    }

    //
    public SampleOutputDto test(SampleInputDto dto) {
        return sampleMapper.map(sampleService.test(sampleMapper.map(dto)));
    }
}
