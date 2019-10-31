package wallet.services

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ErrorHandlerImpl : ErrorHandler {
    var logger = LoggerFactory.getLogger(this.javaClass.name)

    override fun handleErrors(exception: List<Exception>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}