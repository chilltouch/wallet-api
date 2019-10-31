package wallet.services

interface ErrorHandler {
    fun handleErrors(exception: List<Exception>)
}