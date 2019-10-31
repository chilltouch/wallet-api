package wallet.repositories

import org.springframework.data.repository.CrudRepository
import wallet.entities.Balance
import wallet.entities.BalanceType

interface BalanceRepository : CrudRepository<Balance, Long> {
    fun findBalanceByIdAndUserIdAAndType(id: Long, userId: String, type: BalanceType): Balance
}