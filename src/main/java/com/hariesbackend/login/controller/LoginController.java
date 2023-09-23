package com.hariesbackend.login.controller;

import com.hariesbackend.login.dto.MemberLoginRequestDTO;
import com.hariesbackend.login.dto.NaverDTO;
import com.hariesbackend.login.dto.TokenDTO;
import com.hariesbackend.login.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;

//    @PostMapping("/")
//    public TokenDTO login(@RequestBody MemberLoginRequestDTO memberLoginRequestDto) {
//        String memberId = memberLoginRequestDto.getMemberId();
//        String password = memberLoginRequestDto.getPassword();
//        TokenDTO tokenInfo = loginService.login(memberId, password);
//        return tokenInfo;
//    }


    @GetMapping("/naver")
    public String naverLogin(
            @RequestParam("code") String code,
            @RequestParam("state") String state) throws Exception {
        NaverDTO naverInfo = loginService.getNaverInfo(code, state, "naver");
//        return ResponseEntity.ok("Success");
        return "Success";
    }

}
