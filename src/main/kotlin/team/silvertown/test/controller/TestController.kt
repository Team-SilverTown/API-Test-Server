package team.silvertown.test.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import team.silvertown.test.dto.DataDto
import team.silvertown.test.dto.ErrorResponse
import team.silvertown.test.dto.HealthDto
import java.net.URI
import java.time.OffsetDateTime

@RestController
class TestController {

    @GetMapping("/health")
    fun healthCheck(): ResponseEntity<HealthDto> {
        return ResponseEntity.ok(HealthDto(OffsetDateTime.now()))
    }

    @GetMapping("/data")
    fun getData(): ResponseEntity<DataDto> {
        return ResponseEntity.ok(DataDto("testData"))
    }

    @PostMapping("/data")
    fun save(dataDto: DataDto): ResponseEntity<DataDto> {
        return ResponseEntity
            .created(URI("/data"))
            .body(dataDto)
    }

    @PostMapping("/error")
    fun error(dataDto: DataDto): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .badRequest()
            .body(ErrorResponse(-222022201, "error message"))
    }

}
