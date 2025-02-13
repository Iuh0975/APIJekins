package com.rest.api.service;

import com.rest.api.dto.request.UserDtoRequest;
import com.rest.api.dto.response.UserDtoResponse;

public interface UserMapperInterface {

    UserDtoResponse map(UserDtoRequest userDtoRequest);

}
