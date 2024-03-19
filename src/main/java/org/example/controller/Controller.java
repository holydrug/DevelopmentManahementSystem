package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.SetupClientDTO;
import org.example.controller.dto.SetupOrderDTO;
import org.example.service.SearchServise;
import org.example.service.SetupServise;
import org.example.storage.Order;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class Controller {
    private final SetupServise setupServise;

    @PostMapping("/setupOrder")
    private void setupOrder(@RequestBody SetupOrderDTO setupOrderDTO) {
        setupServise.setupOrder(setupOrderDTO);
    }
    @PostMapping("/setupClient")
    private void setupClient(@RequestBody SetupClientDTO setupClientDTO) {
        setupServise.setupClient(setupClientDTO);
    }
}