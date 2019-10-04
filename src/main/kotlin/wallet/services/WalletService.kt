package wallet.services

import wallet.entities.Balance
import wallet.to.be.removed.StoreService
import java.math.BigDecimal

interface WalletService {
    // this is going to be repository
    val storeService: StoreService

    fun getBalance(id: Long): Balance
    fun deposit(id: Long, amount: BigDecimal): Balance
    fun withdraw(id: Long, amount: BigDecimal): Balance
}