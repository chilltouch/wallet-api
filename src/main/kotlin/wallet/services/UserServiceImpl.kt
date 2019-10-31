package wallet.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import wallet.entities.User
import wallet.repositories.UserRepository

@Service
class UserServiceImpl @Autowired constructor(var userRepository: UserRepository, var exceptionHandler: ErrorHandler) : UserService {
    override fun getUser(userExternalId: String): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerUser(userExternalId: String, email: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun isExistingUser(userExternalId: String, email: String) {

    }
}