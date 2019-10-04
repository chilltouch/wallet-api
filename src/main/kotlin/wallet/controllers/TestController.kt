package wallet.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import wallet.responses.GenericResponse
import wallet.responses.TestResponse

@RestController("/")
class TestController {

    @GetMapping("/test")
    fun test(): GenericResponse<String, Nothing?> {
        var response = GenericResponse("test", null, true)
        println(response)
        return response;
    }

    @GetMapping("/t1")
    fun test1(): TestResponse = TestResponse("some-text-here")
}
