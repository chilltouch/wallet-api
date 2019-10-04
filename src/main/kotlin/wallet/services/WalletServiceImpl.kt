package wallet.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import wallet.entities.Balance
import wallet.to.be.removed.StoreService
import java.math.BigDecimal

@Service
class WalletServiceImpl @Autowired constructor(override val storeService: StoreService) : WalletService {
    override fun deposit(id: Long, amount: BigDecimal): Balance {
        var oldAmount = this.storeService.getBalance()
        var newAmout = oldAmount.add(amount)
        this.storeService.updateBalance(newAmout)
        val response = Balance(newAmout, id, id.toString())
        return response
    }

    override fun withdraw(id: Long, amount: BigDecimal): Balance {
        var oldAmount = this.storeService.getBalance()
        var newAmout = oldAmount.subtract(amount)
        this.storeService.updateBalance(newAmout)
        val response = Balance(newAmout, id, id.toString())
        return response
    }

    override fun getBalance(id: Long): Balance {
        var amount = this.storeService.getBalance()
        return Balance(amount, id, id.toString())
    }

}