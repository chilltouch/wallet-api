package wallet.repositories

import org.springframework.data.repository.CrudRepository
import wallet.entities.User

interface UserRepository : CrudRepository<User, Long> {
    fun findByUserExternalId(userExternalId: String) : User
    fun findByEmail(email: String) : User
}