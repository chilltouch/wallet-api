package wallet.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import wallet.controllers.responses.GenericResponse

@RestController
class ManagerController {
    @GetMapping("/health")
    fun health(): GenericResponse<String, Nothing?> {
        return GenericResponse("Online", null, true)
    }
}