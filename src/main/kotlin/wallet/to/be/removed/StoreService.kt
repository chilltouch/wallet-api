package wallet.to.be.removed

import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class StoreService constructor(val store: Store = Store("1", BigDecimal(500))) {
    fun getBalance(): BigDecimal {
        return store.value
    }

    fun updateBalance(amount: BigDecimal): BigDecimal {
        store.value = amount
        return store.value
    }

}