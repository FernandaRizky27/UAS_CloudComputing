package cc.k3521028.suhuserver.controller;

import cc.k3521028.suhuserver.dto.TemperatureRequest;
import cc.k3521028.suhuserver.dto.TemperatureResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperature")
public class TemperatureController {
    @PostMapping("/convert")
    public ResponseEntity<?> convertTemperature(@RequestBody TemperatureRequest request) {
        double convertedValue = 0.0;
        if ("Celsius".equalsIgnoreCase(request.getFrom()) && "Fahrenheit".equalsIgnoreCase(request.getTo())) {
            convertedValue = (request.getValue() * 9/5) + 32;
        }
        if ("Fahrenheit".equalsIgnoreCase(request.getFrom()) && "Celsius".equalsIgnoreCase(request.getTo())) {
            convertedValue = (request.getValue() * 5/9) - 32;
        }
        return ResponseEntity.ok(new TemperatureResponse(convertedValue));
    }
}

