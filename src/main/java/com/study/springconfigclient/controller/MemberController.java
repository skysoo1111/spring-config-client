package com.study.springconfigclient.controller;//package com.tving.manager.controller;
//
//import com.tving.manager.domain.Member;
//import com.tving.manager.mapper.MemberMapper;
//import com.tving.manager.service.MemberService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import net.tving.common.dto.CommonResponse;
//import net.tving.common.dto.Response;
//import net.tving.common.exception.TvingException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Api(tags = {"2. Member"})
//@Slf4j
//@RestController
//@RequestMapping("/v1")
//@RequiredArgsConstructor
//public class MemberController {
//
//    private final MemberService memberService;
//    private final MemberMapper memberMapper;
//    private final PasswordEncoder passwordEncoder;
//
//    @ApiOperation(value = "로그인", notes = "이메일로 회원 로그인을 수행한다.")
//    @PostMapping("/signin")
//    public Member signin(@ApiParam(value = "회원ID: 이메일", required = true) @RequestParam String uid,
//                                          @ApiParam(value = "비밀번호", required = true) @RequestParam String password,
//                                          HttpServletRequest request) {
//        Member member = memberMapper.findByUid(uid);
//        if (!passwordEncoder.matches(password, member.getPassword()))
//            throw new TvingException("PASSWORD NOT MATCHES");
//
//        log.info("##### user.getId() : {}",member.getId());
//        return member;
//    }
//
//    @ApiOperation(value = "회원가입", notes = "회원가입을 수행한다.")
//    @PostMapping("/signup")
//    public Member signup(@ApiParam(value = "회원ID: 이메일", required = true) @RequestParam String uid,
//                                          @ApiParam(value = "비밀번호", required = true) @RequestParam String password,
//                                          @ApiParam(value = "이름", required = true) @RequestParam String name,
//                                          @ApiParam(value = "전화번호", required = false) @RequestParam(required = false) String number,
//                                          HttpServletRequest request) {
//
//        Member singupUser = Member.builder()
//                .uid(uid)
//                .password(passwordEncoder.encode(password))
//                .name(name)
//                .build();
//
//        // TODO: 2022/03/11 이미 가입 되어있는 회원은 save 아닌 info로 알려주는 로직 필요
//        memberMapper.save(singupUser);
//
//        return singupUser;
//    }
//
//    @ApiOperation(value = "회원조회", notes = "이메일로 회원을 조회한다.")
//    @GetMapping("/member/{email}")
//    public CommonResponse getMemberByUid(@PathVariable String email) {
//        Member byUid = memberMapper.findByUid(email);
////        return byUid;
//        return CommonResponse.builder()
//                .body(byUid)
//                .header(Response.builder().status("0000").message("Success").build())
//                .build();
//    }
//}
