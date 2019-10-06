package wallet.repositories

import org.springframework.data.repository.CrudRepository
import wallet.entities.Balance

interface BalanceRepository : CrudRepository<Balance, Long> {
    fun findBalanceByIdAndUserId(id: Long, userId: String): Balance
}