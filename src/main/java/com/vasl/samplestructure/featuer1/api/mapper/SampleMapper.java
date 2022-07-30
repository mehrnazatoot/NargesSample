package com.vasl.samplestructure.featuer1.api.mapper;

import com.vasl.samplestructure.featuer1.api.dto.SampleInputDto;
import com.vasl.samplestructure.featuer1.api.dto.SampleOutputDto;
import com.vasl.samplestructure.featuer1.service.model.SampleModel;
import org.mapstruct.Mapper;

/**
 * @author : Nargess
 * @since : 7/29/2022, Fri
 **/
@Mapper(componentModel = "spring")
public interface SampleMapper {
    SampleModel map(SampleInputDto dto);
    SampleOutputDto map(SampleModel model);
}
