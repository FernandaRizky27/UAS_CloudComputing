package cc.k3521028.orchestratorserver.controller;

import cc.k3521028.orchestratorserver.dto.RequestDto;
import cc.k3521028.orchestratorserver.dto.ResponseDto;
import cc.k3521028.orchestratorserver.dto.ErrorResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class OrchestratorController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String TEMPERATURE_SERVICE_URL = "http://localhost:2000/api/temperature/convert";
    private static final String LENGTH_SERVICE_URL = "http://localhost:4000/api/length/convert";

    private static final Set<String> VALID_TEMPERATURE_UNITS = Set.of("celsius", "fahrenheit");
    private static final Set<String> VALID_LENGTH_UNITS = Set.of("meter", "kilometer");

    @PostMapping("/convert-temperature")
    public ResponseEntity<?> convertTemperature(@RequestBody RequestDto request) {
        if (!VALID_TEMPERATURE_UNITS.contains(request.getFrom().toLowerCase()) ||
                !VALID_TEMPERATURE_UNITS.contains(request.getTo().toLowerCase())) {
            return ResponseEntity.badRequest().body(new ErrorResponseDto(
                    "Invalid temperature units", "Supported units are Celsius and Fahrenheit."));
        }

        try {
            ResponseEntity<ResponseDto> response = restTemplate.postForEntity(
                    TEMPERATURE_SERVICE_URL, request, ResponseDto.class);
            return ResponseEntity.ok(response.getBody());
        } catch (Exception ex) {
            return ResponseEntity.status(500).body(new ErrorResponseDto(
                    "Error converting temperature", ex.getMessage()));
        }
    }

    @PostMapping("/convert-length")
    public ResponseEntity<?> convertLength(@RequestBody RequestDto request) {
        if (!VALID_LENGTH_UNITS.contains(request.getFrom().toLowerCase()) ||
                !VALID_LENGTH_UNITS.contains(request.getTo().toLowerCase())) {
            return ResponseEntity.badRequest().body(new ErrorResponseDto(
                    "Invalid length units", "Supported units are Meter and Kilometer."));
        }

        try {
            ResponseEntity<ResponseDto> response = restTemplate.postForEntity(
                    LENGTH_SERVICE_URL, request, ResponseDto.class);
            return ResponseEntity.ok(response.getBody());
        } catch (Exception ex) {
            return ResponseEntity.status(500).body(new ErrorResponseDto(
                    "Error converting length", ex.getMessage()));
        }
    }
}
