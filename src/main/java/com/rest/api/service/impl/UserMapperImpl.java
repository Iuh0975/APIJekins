package com.rest.api.service.impl;

import com.rest.api.dto.request.UserDtoRequest;
import com.rest.api.dto.response.HobbiesDtoResponse;
import com.rest.api.dto.response.MemberDtoResponse;
import com.rest.api.dto.response.ProjectDtoResponse;
import com.rest.api.dto.response.UserDtoResponse;
import com.rest.api.service.UserMapperInterface;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class UserMapperImpl implements UserMapperInterface {

    @Override
    public UserDtoResponse map(UserDtoRequest userDtoRequest) {

        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setNumberIdentify(userDtoRequest.getId());
        userDtoResponse.setYearBorn(userDtoRequest.getAge());
        // Process List father and list child
        List<HobbiesDtoResponse> userDtoResponseList = userDtoRequest.getHobbiesDtoList().stream().map(e -> new HobbiesDtoResponse(e.getId(),e.getName())).collect(Collectors.toList());
        userDtoResponse.setHobbiesDtoList(userDtoResponseList);

        // Process List father and list child
        List<ProjectDtoResponse> projectDtoResponses = userDtoRequest.getProjectDtoList()
                .stream()
                .map(project -> new ProjectDtoResponse(project.getId(),
                        project.getName(),
                        project.getYear(),
                        project.getMemberList().stream()
                                .map(member -> new MemberDtoResponse(
                                        member.getId(),
                                        member.getRole(),
                                        member.getRank()
                                ))
                                .collect(Collectors.toList())))
                .collect(Collectors.toList());
        userDtoResponse.setProjectDtoList(projectDtoResponses);
        return userDtoResponse;
    }

}
