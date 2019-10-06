package wallet.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Balance(@Id @GeneratedValue(strategy= GenerationType.AUTO) var id: Long?,
                   var balance: BigDecimal,
                   var userId: String,
                   var createdDate: Date,
                   var updatedDate: Date?,
                   var deleted: Boolean)