package wallet.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import wallet.entities.Balance
import wallet.services.utils.validators.BalanceValidator
import java.math.BigDecimal

@Service
class BalanceUpdateServiceImpl @Autowired constructor(val validator: BalanceValidator): BalanceUpdateService {
    override fun deposit(amount: BigDecimal, userId: String, balance: Balance): Balance {
        validator.validateBalance(balance)
        var newBalance = balance.balance.add(amount)
        balance.balance = newBalance
        return balance
    }

    override fun withdraw(amount: BigDecimal, userId: String, balance: Balance): Balance {
        validator.validateBalance(balance)
        var newBalance = balance.balance.subtract(amount)
        balance.balance = newBalance
        return balance
    }
}