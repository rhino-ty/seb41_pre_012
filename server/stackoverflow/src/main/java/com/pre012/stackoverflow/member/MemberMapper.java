package com.pre012.stackoverflow.member;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);

    MemberResponseDto memberToMemberResponseDto(Member member);
}
