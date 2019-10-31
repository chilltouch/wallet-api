package wallet.controllers.requests

import wallet.entities.BalanceType
import java.math.BigDecimal


data class BalanceRequest(val id: Long, val amount: BigDecimal, val deleted: Boolean, val userId: String, val type: BalanceType)