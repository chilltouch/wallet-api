package wallet.services

import wallet.entities.Balance
import wallet.entities.BalanceType
import java.math.BigDecimal

interface WalletService {
    fun createBalance(balance: BigDecimal, userId: String, type: BalanceType): Balance
    fun deleteBalance(balanceId: Long, userId: String, type: BalanceType): Balance
    fun getBalance(id: Long, userId: String, type: BalanceType): Balance
    fun deposit(id: Long, amount: BigDecimal, userId: String, type: BalanceType): Balance
    fun withdraw(id: Long, amount: BigDecimal, userId: String, type: BalanceType): Balance
}