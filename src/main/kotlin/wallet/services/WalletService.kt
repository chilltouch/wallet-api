package wallet.services

import wallet.entities.Balance
import wallet.to.be.removed.StoreService
import java.math.BigDecimal

interface WalletService {
    fun createBalance(balance: BigDecimal, userId: String): Balance
    fun deleteBalance(balanceId: Long, userId: String): Balance
    fun getBalance(id: Long, userId: String): Balance
    fun deposit(id: Long, amount: BigDecimal, userId: String): Balance
    fun withdraw(id: Long, amount: BigDecimal, userId: String): Balance
}