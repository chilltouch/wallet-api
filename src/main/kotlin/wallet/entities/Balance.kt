package wallet.entities

import java.math.BigDecimal

data class Balance(var balance: BigDecimal, var id: Long, var key: String)