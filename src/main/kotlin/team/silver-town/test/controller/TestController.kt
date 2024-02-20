package team.`silver-town`.test.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import team.`silver-town`.test.dto.HealthDto
import java.time.OffsetDateTime

@RestController
class TestController {

    @GetMapping("/health")
    fun healthCheck(): ResponseEntity<HealthDto> {
        return ResponseEntity.ok(HealthDto(OffsetDateTime.now()))
    }
}
