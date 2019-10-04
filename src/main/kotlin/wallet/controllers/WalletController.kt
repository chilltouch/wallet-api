package wallet.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import wallet.entities.Balance
import wallet.responses.GenericResponse
import wallet.services.WalletService
import java.math.BigDecimal

@RestController
class WalletController @Autowired constructor(private val walletService: WalletService) {


    @GetMapping("/balance/{id}")
    fun getBalance(@PathVariable id: Long): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.getBalance(id)
        return GenericResponse(result, null, true)
    }

    @PostMapping("/deposit/{id}/{amount}")
    fun deposit(@PathVariable id: Long, @PathVariable amount: BigDecimal): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.deposit(id, amount)
        return GenericResponse(result, null, true)
    }

    @PostMapping("/withdraw/{id}/{amount}")
    fun withdraw(@PathVariable id: Long, @PathVariable amount: BigDecimal): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.withdraw(id, amount)
        return GenericResponse(result, null, true)
    }


}