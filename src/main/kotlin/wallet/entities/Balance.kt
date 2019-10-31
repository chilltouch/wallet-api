package wallet.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@Entity
data class Balance(@Id @GeneratedValue(strategy= GenerationType.AUTO) var id: Long?,
                   var balance: BigDecimal,
                   @ManyToOne var userId: String,
                   var type: BalanceType,
                   var createdDate: Date,
                   var updatedDate: Date?,
                   var deleted: Boolean)