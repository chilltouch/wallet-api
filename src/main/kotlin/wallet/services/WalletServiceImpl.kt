package wallet.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import wallet.entities.Balance
import wallet.entities.BalanceType
import wallet.repositories.BalanceRepository
import wallet.services.utils.validators.BalanceValidator
import java.math.BigDecimal
import java.util.*

@Service
class WalletServiceImpl @Autowired constructor(val balanceUpdateService: BalanceUpdateService,
                                               val balanceRepository: BalanceRepository,
                                               val validator: BalanceValidator,
                                               var exceptionHandler: ErrorHandler) : WalletService {

    override fun createBalance(balance: BigDecimal, userId: String, type: BalanceType): Balance {
        validator.validate(balance, userId)
        var newBalance = Balance(id = null,
                                 balance = balance,
                                 userId = userId,
                                 type = type,
                                 createdDate = Date(),
                                 deleted = false,
                                 updatedDate = null)

        newBalance = balanceRepository.save(newBalance)
        return newBalance
    }

    override fun deleteBalance(balanceId: Long, userId: String, type: BalanceType): Balance {
        validator.validate(userId, balanceId)
        var balance: Balance = balanceRepository.findBalanceByIdAndUserIdAAndType(balanceId, userId, type)
        balance.deleted = true
        balance.updatedDate = Date()
        balance = balanceRepository.save(balance)
        return balance
    }

    override fun getBalance(id: Long, userId: String, type: BalanceType): Balance {
        validator.validate(userId, id)
        var balance: Balance = balanceRepository.findBalanceByIdAndUserIdAAndType(id, userId, type)
        return balance
    }

    override fun deposit(id: Long, amount: BigDecimal, userId: String, type: BalanceType): Balance {
        validator.validate(userId, id)
        var balance: Balance = balanceRepository.findBalanceByIdAndUserIdAAndType(id, userId, type)
        balance = balanceUpdateService.deposit(amount, userId, balance)
        balance.updatedDate = Date()
        balance = balanceRepository.save(balance)
        return balance
    }

    override fun withdraw(id: Long, amount: BigDecimal, userId: String, type: BalanceType): Balance {
        validator.validate(userId, id)
        var balance: Balance = balanceRepository.findBalanceByIdAndUserIdAAndType(id, userId, type)
        balance = balanceUpdateService.withdraw(amount, userId, balance)
        balance.updatedDate = Date()
        balance = balanceRepository.save(balance)
        return balance
    }

}