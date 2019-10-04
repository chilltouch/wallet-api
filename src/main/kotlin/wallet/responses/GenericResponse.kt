package wallet.responses

data class GenericResponse<T, V>(var body: T, var error: V, var success: Boolean)

data class TestResponse(var text: String)