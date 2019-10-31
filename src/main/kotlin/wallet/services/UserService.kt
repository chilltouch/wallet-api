package wallet.services

import wallet.entities.User

interface UserService {
    fun getUser(userExternalId: String) : User
    fun registerUser(userExternalId: String, email: String)
}