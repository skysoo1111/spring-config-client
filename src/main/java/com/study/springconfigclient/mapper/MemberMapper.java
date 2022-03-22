package com.study.springconfigclient.mapper;

import com.study.springconfigclient.domain.Member;
import com.study.springconfigclient.service.CommonService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper extends CommonService<Member, Long> {
    void updateMember(Member member);
}
