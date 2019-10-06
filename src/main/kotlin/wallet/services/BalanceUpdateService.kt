package wallet.services

import wallet.entities.Balance
import java.math.BigDecimal

interface BalanceUpdateService {
    fun deposit(amount: BigDecimal, userId: String, balance: Balance): Balance
    fun withdraw(amount: BigDecimal, userId: String, balance: Balance): Balance
}