package wallet.controllers.requests

import java.math.BigDecimal


data class BalanceRequest(val id: Long, val amount: BigDecimal, val deleted: Boolean, val userId: String)