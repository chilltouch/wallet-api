package wallet.controllers.responses

data class GenericResponse<T, V>(var body: T, var error: V, var success: Boolean)