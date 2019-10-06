package wallet.services.utils.validators

import org.springframework.stereotype.Component
import wallet.entities.Balance
import java.math.BigDecimal
import javax.validation.ValidationException

@Component
class BalanceValidator {

    fun validateBalance(balance: Balance) {
        if (balance == null) {
            throw ValidationException()
        }

        if (balance.id == null || balance.id!! <= 0) {
            throw ValidationException()
        }
    }

    fun validate(userId: String, id: Long) {
        validate(userId)

        if (id == null || id <= 0) {
            throw ValidationException()
        }
    }

    fun validate(balance: BigDecimal, userId: String) {
        validate(balance)
        validate(userId)
    }

    fun validate(balance: BigDecimal) {
        if (balance == null) {
            throw ValidationException()
        }
    }

    fun validate(balance: Balance) {
        if (balance == null) {
            throw ValidationException()
        }
    }

    fun validate(userId: String) {
        if (userId == null || userId.isEmpty()) {
            throw ValidationException()
        }
    }
}