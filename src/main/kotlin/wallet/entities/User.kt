package wallet.entities

import wallet.entities.Balance
import javax.persistence.*

@Entity
data class User (@Id @GeneratedValue(strategy= GenerationType.AUTO) var id: Long?,
                 var userExternalId: String,
                 var email: String,
                 @OneToMany(mappedBy = "balances") var balances: List<Balance>) {

}