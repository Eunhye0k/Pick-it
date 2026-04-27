package com.github.eunhye0k.pickit.domain.order.controller;

import com.github.eunhye0k.pickit.domain.order.dto.OrderDto;
import com.github.eunhye0k.pickit.domain.order.dto.request.OrderCreateRequest;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderController {

  public ResponseEntity<OrderDto> register(OrderCreateRequest orderCreateRequest){
    return null;
  }
}
