package cc.k3521028.panjangserver.controller;

import cc.k3521028.panjangserver.dto.LengthRequest;
import cc.k3521028.panjangserver.dto.LengthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/temperature")
public class LengthController {
    @PostMapping("/convert")
    public ResponseEntity<?> convertLength(@RequestBody LengthRequest request) {
        double convertedValue = 0.0;
        if ("Meter".equalsIgnoreCase(request.getFrom()) && "Kilometer".equalsIgnoreCase(request.getTo())) {
            convertedValue = request.getValue() / 1000;
        }
        if ("Kilometer".equalsIgnoreCase(request.getFrom()) && "Meter".equalsIgnoreCase(request.getTo())) {
            convertedValue = request.getValue() * 1000;
        }
        return ResponseEntity.ok(new LengthResponse(convertedValue));
    }
}
