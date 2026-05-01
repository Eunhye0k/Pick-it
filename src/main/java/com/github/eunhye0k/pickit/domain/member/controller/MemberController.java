package com.github.eunhye0k.pickit.domain.member.controller;

import com.github.eunhye0k.pickit.domain.member.dto.MemberDto;
import com.github.eunhye0k.pickit.domain.member.dto.request.MemberCreateRequest;
import com.github.eunhye0k.pickit.domain.order.dto.OrderDto;
import com.github.eunhye0k.pickit.domain.order.dto.request.OrderCreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

  public ResponseEntity<MemberDto> register(MemberCreateRequest memberCreateRequest){
    return null;
  }

}
